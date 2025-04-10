package com.solvecaptcha;

import com.solvecaptcha.exceptions.ApiException;
import com.solvecaptcha.exceptions.NetworkException;
import okhttp3.*;

import java.io.File;
import java.nio.file.Files;
import java.util.Map;

public class ApiClient {

    /**
     * API server
     */
    public String host = "api.solvecaptcha.com";

    /**
     * Network client
     */
    private final OkHttpClient client = new OkHttpClient();

    /**
     * Sends captcha to /in.php
     *
     * @param params
     * @param files
     * @return
     * @throws Exception
     */
    public String in(Map<String, String> params, Map<String, File> files) throws Exception {
        HttpUrl.Builder url = new HttpUrl.Builder()
                .scheme("https")
                .host(host)
                .addPathSegment("in.php");

        RequestBody body;

        if (files.size() == 0) {
            FormBody.Builder form = new FormBody.Builder();
            params.forEach(form::add);
            body = form.build();
        } else {
            MultipartBody.Builder form = new MultipartBody.Builder();
            form.setType(MultipartBody.FORM);
            params.forEach(form::addFormDataPart);
            for (Map.Entry<String, File> entry : files.entrySet()) {
                byte[] fileBytes = Files.readAllBytes(entry.getValue().toPath());
                form.addFormDataPart(entry.getKey(), entry.getValue().getName(), RequestBody.create(fileBytes));
            }
            body = form.build();
        }

        Request request = new Request.Builder()
                .url(url.build())
                .post(body)
                .build();

        return execute(request);
    }

    /**
     * Does request to /res.php
     *
     * @param params
     * @return
     * @throws Exception
     */
    public String res(Map<String, String> params) throws Exception {
        HttpUrl.Builder url = new HttpUrl.Builder()
                .scheme("https")
                .host(host)
                .addPathSegment("res.php");

        params.forEach(url::addQueryParameter);

        Request request = new Request.Builder()
                .url(url.build())
                .build();

        return execute(request);
    }

    /**
     * Executes http request to api
     *
     * @param request
     * @return
     * @throws Exception
     */
    private String execute(Request request) throws Exception {
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new NetworkException("Unexpected code " + response);
            }

            String body = response.body().string();

            if (body.startsWith("ERROR_")) {
                throw new ApiException(body);
            }

            return body;
        }
    }

    /**
     * @param domain
     */
    public void setHost(String domain) {
        this.host = domain;
    }
}
