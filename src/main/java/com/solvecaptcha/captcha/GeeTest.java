package com.solvecaptcha.captcha;

public class GeeTest extends Captcha {

    public GeeTest() {
        super();
        params.put("method", "geetest");
    }

    public void setGt(String gt) {
        params.put("gt", gt);
    }

    public void setChallenge(String challenge) {
        params.put("challenge", challenge);
    }

    public void setUrl(String url) {
        params.put("pageurl", url);
    }

    public void setApiServer(String apiServer) {
        params.put("api_server", apiServer);
    }

}
