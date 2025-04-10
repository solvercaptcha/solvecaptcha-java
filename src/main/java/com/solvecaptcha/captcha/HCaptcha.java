package com.solvecaptcha.captcha;

public class HCaptcha extends Captcha {

    public HCaptcha() {
        super();
        params.put("method", "hcaptcha");
    }

    public void setSiteKey(String siteKey) {
        params.put("sitekey", siteKey);
    }

    public void setUrl(String url) {
        params.put("pageurl", url);
    }
    
    public void setInvisible(boolean invisible) {
        params.put("invisible", invisible ? "1" : "0");
    }
}
