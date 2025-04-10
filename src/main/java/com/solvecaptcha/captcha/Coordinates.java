package com.solvecaptcha.captcha;

import java.io.File;

public class Coordinates extends Captcha {

    public Coordinates() {
        super();
        params.put("coordinatescaptcha", "1");
    }

    public Coordinates(String filePath) {
        this(new File(filePath));
    }

    public Coordinates(File file) {
        this();
        setFile(file);
    }

    public void setFile(String filePath) {
        setFile(new File(filePath));
    }

    public void setFile(File file) {
        files.put("file", file);
    }

    public void setBase64(String base64) {
        params.put("body", base64);
    }

    public void setLang(String lang) {
        params.put("lang", lang);
    }

    public void setHintText(String hintText) {
        params.put("textinstructions", hintText);
    }

    public void setHintImg(String base64) {
        params.put("imginstructions", base64);
    }

    public void setHintImg(File hintImg) {
        files.put("imginstructions", hintImg);
    }

}
