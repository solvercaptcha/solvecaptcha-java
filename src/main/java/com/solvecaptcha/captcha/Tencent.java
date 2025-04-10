package com.solvecaptcha.captcha;

public class Tencent extends Captcha {

    public Tencent() {
        super();
        params.put("method", "tencent");
    }

    public void setAppId(String appId) {
        params.put("app_id", appId);
    }

    public void setPageUrl(String url) {
        params.put("pageurl", url);
    }
}