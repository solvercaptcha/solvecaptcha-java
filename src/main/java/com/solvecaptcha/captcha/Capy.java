package com.solvecaptcha.captcha;

public class Capy extends Captcha {

    public Capy() {
        super();
        params.put("method", "capy");
    }

    public void setSiteKey(String siteKey) {
        params.put("captchakey", siteKey);
    }

    public void setUrl(String url) {
        params.put("pageurl", url);
    }

    public void setApiServer(String apiServer) {
        params.put("api_server", apiServer);
    }

}
