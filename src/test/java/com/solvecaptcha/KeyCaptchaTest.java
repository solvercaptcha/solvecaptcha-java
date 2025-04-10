package com.solvecaptcha;

import com.solvecaptcha.captcha.KeyCaptcha;

import java.util.HashMap;
import java.util.Map;

public class KeyCaptchaTest extends AbstractWrapperTestCase {

    public void testAllOptions() throws Exception {
        KeyCaptcha captcha = new KeyCaptcha();
        captcha.setUserId(10);
        captcha.setSessionId("493e52c37c10c2bcdf4a00cbc9ccd1e8");
        captcha.setWebServerSign("9006dc725760858e4c0715b835472f22-pz-");
        captcha.setWebServerSign2("2ca3abe86d90c6142d5571db98af6714");
        captcha.setUrl("https://www.keycaptcha.ru/demo-magnetic/");

        Map<String, String> params = new HashMap<>();
        params.put("method", "keycaptcha");
        params.put("s_s_c_user_id", "10");
        params.put("s_s_c_session_id", "493e52c37c10c2bcdf4a00cbc9ccd1e8");
        params.put("s_s_c_web_server_sign", "9006dc725760858e4c0715b835472f22-pz-");
        params.put("s_s_c_web_server_sign2", "2ca3abe86d90c6142d5571db98af6714");
        params.put("pageurl", "https://www.keycaptcha.ru/demo-magnetic/");
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

}