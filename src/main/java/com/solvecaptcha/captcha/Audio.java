package com.solvecaptcha.captcha;

public class Audio extends Captcha {

    public Audio() {
        super();
        params.put("method", "audio");
    }

    public void setBase64(String base64) {
        params.put("body", base64);
    }
    
    public void setLang(String lang) {
        params.put("lang", lang);
    }

}
