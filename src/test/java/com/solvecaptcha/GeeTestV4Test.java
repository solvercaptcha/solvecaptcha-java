package com.solvecaptcha;

import com.solvecaptcha.captcha.GeeTestV4;

import java.util.HashMap;
import java.util.Map;

public class GeeTestV4Test extends AbstractWrapperTestCase {

    public void testAllOptions() throws Exception {
        GeeTestV4 captcha = new GeeTestV4();
        captcha.setCaptchaId("72bf15796d0b69c43867452fea615052");
        captcha.setApiServer("api-na.geetest.com");
        captcha.setChallenge("12345678abc90123d45678ef90123a456b");
        captcha.setUrl("https://mysite.com/captcha.html");

        Map<String, String> params = new HashMap<>();
        params.put("method", "geetest_v4");
        params.put("captcha_id", "72bf15796d0b69c43867452fea615052");
        params.put("api_server", "api-na.geetest.com");
        params.put("challenge", "12345678abc90123d45678ef90123a456b");
        params.put("pageurl", "https://mysite.com/captcha.html");
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

}