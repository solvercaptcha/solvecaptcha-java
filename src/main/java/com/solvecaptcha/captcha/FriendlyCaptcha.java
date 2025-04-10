package com.solvecaptcha.captcha;

public class FriendlyCaptcha extends Captcha {

    public FriendlyCaptcha() {
        super();
        params.put("method", "friendly_captcha");
    }

    public void setSiteKey(String siteKey) {
        params.put("sitekey", siteKey);
    }

    public void setPageUrl(String url) {
        params.put("pageurl", url);
    }
}