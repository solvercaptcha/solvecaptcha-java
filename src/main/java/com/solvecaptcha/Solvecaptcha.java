package com.solvecaptcha;

import com.solvecaptcha.captcha.Captcha;
import com.solvecaptcha.captcha.ReCaptcha;
import com.solvecaptcha.exceptions.ApiException;
import com.solvecaptcha.exceptions.NetworkException;
import com.solvecaptcha.exceptions.TimeoutException;
import com.solvecaptcha.exceptions.ValidationException;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Class solvecaptcha
 */
public class Solvecaptcha {

    /**
     * API KEY
     */
    private String apiKey;

    /**
     * ID of software developer. Developers who integrated their software
     * with our service get reward: 10% of spendings of their software users.
     */
    private int softId = 4847;

    /**
     * URL to which the result will be sent
     */
    private String callback;

    /**
     * How long should wait for captcha result (in seconds)
     */
    private int defaultTimeout = 120;

    /**
     * How long should wait for recaptcha result (in seconds)
     */
    private int recaptchaTimeout = 600;

    /**
     * How often do requests to `/res.php` should be made
     * in order to check if a result is ready (in seconds)
     */
    private int pollingInterval = 10;

    /**
     * Helps to understand if there is need of waiting
     * for result or not (because callback was used)
     */
    private boolean lastCaptchaHasCallback;

    private int extendedResponse = 0;

    /**
     * Network client
     */
    private ApiClient apiClient;

    /**
     * solvecaptcha constructor
     */
    public Solvecaptcha() {
        this.apiClient = new ApiClient();
    }

    /**
     * solvecaptcha constructor
     *
     * @param apiKey
     */
    public Solvecaptcha(String apiKey) {
        this();
        setApiKey(apiKey);
    }

    public Solvecaptcha(String apiKey, int extendedResponse) {
        this();
        setApiKey(apiKey);
        this.extendedResponse = extendedResponse;
    }

    /**
     * @param apiKey
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * @param domain
     */
    public void setHost(String domain) {
        this.apiClient.setHost(domain);
    }


    /**
     * @param softId
     */
    public void setSoftId(int softId) {
        this.softId = softId;
    }

    /**
     * @param callback
     */
    public void setCallback(String callback) {
        this.callback = callback;
    }

    /**
     * @param timeout
     */
    public void setDefaultTimeout(int timeout) {
        this.defaultTimeout = timeout;
    }

    /**
     * @param timeout
     */
    public void setRecaptchaTimeout(int timeout) {
        this.recaptchaTimeout = timeout;
    }

    /**
     * @param interval
     */
    public void setPollingInterval(int interval) {
        this.pollingInterval = interval;
    }

    /**
     * @param apiClient
     */
    public void setHttpClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Sends captcha to `/in.php` and waits for it's result.
     * This helper can be used instead of manual using of `send` and `getResult` functions.
     *
     * @param captcha
     * @throws Exception
     */
    public void solve(Captcha captcha) throws Exception {
        Map<String, Integer> waitOptions = new HashMap<>();

        if (captcha instanceof ReCaptcha) {
            waitOptions.put("timeout", recaptchaTimeout);
        }

        solve(captcha, waitOptions);
    }

    /**
     * Sends captcha to `/in.php` and waits for it's result.
     * This helper can be used instead of manual using of `send` and `getResult` functions.
     *
     * @param captcha
     * @param waitOptions
     * @throws Exception
     */
    public void solve(Captcha captcha, Map<String, Integer> waitOptions) throws Exception {
        captcha.setId(send(captcha));

        if (!lastCaptchaHasCallback) {
            waitForResult(captcha, waitOptions);
        }
    }

    /**
     * This helper waits for captcha result, and when result is ready, returns it
     *
     * @param captcha
     * @param waitOptions
     * @throws Exception
     */
    public void waitForResult(Captcha captcha, Map<String, Integer> waitOptions) throws Exception {
        long startedAt = (long)(System.currentTimeMillis() / 1000);

        int timeout = waitOptions.getOrDefault("timeout", this.defaultTimeout);
        int pollingInterval = waitOptions.getOrDefault("pollingInterval", this.pollingInterval);

        while (true) {
            long now = (long)(System.currentTimeMillis() / 1000);

            if (now - startedAt < timeout) {
                Thread.sleep(pollingInterval * 1000);
            } else {
                break;
            }

            try {
                Object result = getResult(captcha.getId());

                if (result != null) {
                    captcha.setCode(String.valueOf(result));
                    return;
                }
            } catch (NetworkException e) {
                // ignore network errors
            }
        }

        throw new TimeoutException("Timeout " + timeout + " seconds reached");
    }

    /**
     * Sends captcha to '/in.php', and returns its `id`
     *
     * @param captcha
     * @return
     * @throws Exception
     */
    public String send(Captcha captcha) throws Exception {
        Map<String, String> params = captcha.getParams();
        Map<String, File> files = captcha.getFiles();

        sendAttachDefaultParams(params);

        validateFiles(files);

        String response = apiClient.in(params, files);

        return getCaptchaId(response);
    }

    String getCaptchaId(String response) throws ApiException {
        try {
            JSONObject jsonObject = new JSONObject(response);
            String request = jsonObject.getString("request");

            if (request.equals("CAPCHA_NOT_READY")) {
                return null;
            }

            return jsonObject.getString("request");

        } catch (JSONException exception) {
            if (response.equals("CAPCHA_NOT_READY")) {
                return null;
            }

            if (!response.startsWith("OK|")) {
                throw new ApiException("Cannot recognise api response (" + response + ")");
            }

            return response.substring(3);
        }
    }

    String handleResponse(String response) throws ApiException {
        try {
            JSONObject jsonObject = new JSONObject(response);
            Object requestVal = jsonObject.get("request");

            if (requestVal.equals("CAPCHA_NOT_READY")) {
                return null;
            }

            return jsonObject.toString();

        } catch (JSONException exception) {
            if (response.equals("CAPCHA_NOT_READY")) {
                return null;
            }

            if (!response.startsWith("OK|")) {
                throw new ApiException("Cannot recognise api response (" + response + ")");
            }

            return response.substring(3);
        }
    }

    /**
     * Returns result of captcha if it was solved or `null`, if result is not ready
     *
     * @param id
     * @return
     * @throws Exception
     */
    public String getResult(String id) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("action", "get");
        params.put("id", id);
        params.put("json", String.valueOf(this.extendedResponse));

        String response = res(params);

        return handleResponse(response);
    }

    /**
     * Gets account's balance
     *
     * @return
     * @throws Exception
     */
    public double balance() throws Exception {
        String response = res("getbalance");
        return Double.parseDouble(response);
    }

    /**
     * Reports if captcha was solved correctly (sends `reportbad` or `reportgood` to `/res.php`)
     *
     * @param id
     * @param correct
     * @throws Exception
     */
    public void report(String id, boolean correct) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("id", id);

        if (correct) {
            params.put("action", "reportgood");
        } else {
            params.put("action", "reportbad");
        }

        res(params);
    }

    /**
     * Makes request to `/res.php`
     *
     * @param action
     * @return
     * @throws Exception
     */
    private String res(String action) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("action", action);
        return res(params);
    }

    /**
     * Makes request to `/res.php`
     *
     * @param params
     * @return
     * @throws Exception
     */
    private String res(Map<String, String> params) throws Exception {
        params.put("key", apiKey);
        return apiClient.res(params);
    }

    /**
     * Attaches default parameters to request
     *
     * @param params
     */
    private void sendAttachDefaultParams(Map<String, String> params) {
        params.put("key", apiKey);
        params.put("json", String.valueOf(this.extendedResponse));

        if (callback != null) {
            if (!params.containsKey("pingback")) {
                params.put("pingback", callback);
            } else if (params.get("pingback").length() == 0) {
                params.remove("pingback");
            }
        }

        lastCaptchaHasCallback = params.containsKey("pingback");

        if (softId != 0 && !params.containsKey("soft_id")) {
            params.put("soft_id", String.valueOf(softId));
        }
    }

    /**
     * Validates if files parameters are correct
     *
     * @param files
     * @throws ValidationException
     */
    private void validateFiles(Map<String, File> files) throws ValidationException {
        for (Map.Entry<String, File> entry : files.entrySet()) {
            File file = entry.getValue();

            if (!file.exists()) {
                throw new ValidationException("File not found: " + file.getAbsolutePath());
            }

            if (!file.isFile()) {
                throw new ValidationException("Resource is not a file: " + file.getAbsolutePath());
            }
        }
    }

    public void setExtendedResponse(int extendedResponse) {
        this.extendedResponse = extendedResponse;
    }
}
