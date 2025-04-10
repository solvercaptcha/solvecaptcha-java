package com.solvecaptcha.captcha;

public class KeyCaptcha extends Captcha {

    public KeyCaptcha() {
        super();
        params.put("method", "keycaptcha");
    }

    public void setUserId(int userId) {
        setUserId(String.valueOf(userId));
    }

    public void setUserId(String userId) {
        params.put("s_s_c_user_id", userId);
    }

    public void setSessionId(String sessionId) {
        params.put("s_s_c_session_id", sessionId);
    }

    public void setWebServerSign(String sign) {
        params.put("s_s_c_web_server_sign", sign);
    }

    public void setWebServerSign2(String sign) {
        params.put("s_s_c_web_server_sign2", sign);
    }

    public void setUrl(String url) {
        params.put("pageurl", url);
    }

}
