package com.solvecaptcha.captcha;

public class FunCaptcha extends Captcha {

    public FunCaptcha() {
        super();
        params.put("method", "funcaptcha");
    }

    public void setSiteKey(String siteKey) {
        params.put("publickey", siteKey);
    }

    public void setUrl(String url) {
        params.put("pageurl", url);
    }

    public void setSUrl(String sUrl) {
        params.put("surl", sUrl);
    }

    public void setUserAgent(String userAgent) {
        params.put("userAgent", userAgent);
    }

    public void setData(String key, String value) {
        params.put("data[" + key + "]", value);
    }

}
