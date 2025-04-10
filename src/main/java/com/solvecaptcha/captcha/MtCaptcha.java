package com.solvecaptcha.captcha;

public class MtCaptcha extends Captcha {

    public MtCaptcha() {
        super();
        params.put("method", "mt_captcha");
    }

    public void setSiteKey(String siteKey) {
        params.put("sitekey", siteKey);
    }

    public void setPageUrl(String url) {
        params.put("pageurl", url);
    }
}