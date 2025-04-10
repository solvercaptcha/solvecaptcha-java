package com.solvecaptcha.captcha;

public class ReCaptcha extends Captcha {

    public ReCaptcha() {
        super();
        params.put("method", "userrecaptcha");
    }

    public void setSiteKey(String siteKey) {
        params.put("googlekey", siteKey);
    }

    public void setUrl(String url) {
        params.put("pageurl", url);
    }

    public void setInvisible(boolean invisible) {
        params.put("invisible", invisible ? "1" : "0");
    }

    public void setEnterprise(boolean enterprise) {
        params.put("enterprise", enterprise ? "1" : "0");
    }

    public void setVersion(String version) {
        params.put("version", version);
    }

    public void setAction(String action) {
        params.put("action", action);
    }

    public void setScore(Double score) {
        params.put("min_score", String.valueOf(score));
    }

    public void setData(String data) {
        params.put("data-s", data);
    }

}
