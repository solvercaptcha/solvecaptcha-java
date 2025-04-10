package com.solvecaptcha.captcha;

import java.io.File;

public class Normal extends Captcha {

    public Normal() {
        super();
    }

    public Normal(String filePath) {
        this(new File(filePath));
    }

    public Normal(File file) {
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

    public void setPhrase(boolean phrase) {
        params.put("phrase", phrase ? "1" : "0");
    }

    public void setCaseSensitive(boolean caseSensitive) {
        params.put("regsense", caseSensitive ? "1" : "0");
    }

    public void setCalc(boolean calc) {
        params.put("calc", calc ? "1" : "0");
    }

    public void setNumeric(int numeric) {
        params.put("numeric", String.valueOf(numeric));
    }

    public void setMinLen(int length) {
        params.put("min_len", String.valueOf(length));
    }

    public void setMaxLen(int length) {
        params.put("max_len", String.valueOf(length));
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
