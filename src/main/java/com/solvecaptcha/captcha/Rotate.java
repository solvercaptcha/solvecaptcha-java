package com.solvecaptcha.captcha;

import java.io.File;
import java.util.List;

public class Rotate extends Captcha {

    public Rotate() {
        super();
        params.put("method", "rotatecaptcha");
    }

    public Rotate(File file) {
        this();
    }

    public Rotate(List<File> files) {
        this();
    }

    public void setBase64(String base64) {
        params.put("body", base64);
    }

    public void setFiles(List<File> files) {
        int n = 1;

        for (File file : files) {
            this.files.put("file_" + n++, file);
        }
    }

    public void setAngle(double angle) {
        params.put("angle", String.valueOf(angle));
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
