package com.solvecaptcha.captcha;

public class Text extends Captcha {

    public Text() {
        super();
        params.put("method", "post");
    }

    public Text(String text) {
        this();
        setText(text);
    }

    public void setText(String text) {
        params.put("textcaptcha", text);
    }

    public void setLang(String lang) {
        params.put("lang", lang);
    }

}
