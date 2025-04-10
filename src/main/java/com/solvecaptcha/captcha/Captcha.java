package com.solvecaptcha.captcha;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public abstract class Captcha {

    protected String id;
    protected String code;

    protected Map<String, String> params;
    protected Map<String, File> files;

    public Captcha() {
        params = new HashMap<>();
        files = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setProxy(String type, String uri) {
        params.put("proxy", uri);
        params.put("proxytype", type);
    }

    public void setSoftId(int softId) {
        params.put("soft_id", String.valueOf(softId));
    }

    public void setCallback(String callback) {
        params.put("pingback", callback);
    }

    public Map<String, String> getParams() {
        Map<String, String> params = new HashMap<String, String>(this.params);

        if (!params.containsKey("method")) {
            if (params.containsKey("body")) {
                params.put("method", "base64");
            } else {
                params.put("method", "post");
            }
        }

        return params;
    }

    public Map<String, File> getFiles() {
        return new HashMap<>(files);
    }

}
