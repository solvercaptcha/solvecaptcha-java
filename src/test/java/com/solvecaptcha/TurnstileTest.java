package com.solvecaptcha;

import com.solvecaptcha.captcha.Turnstile;

import java.util.HashMap;
import java.util.Map;

public class TurnstileTest extends AbstractWrapperTestCase {

    public void testAllOptions() throws Exception {
        Turnstile captcha = new Turnstile();
        captcha.setSiteKey("0x4AAAAAAAChNiVJM_WtShFf");
        captcha.setUrl("https://ace.fusionist.io");

        Map<String, String> params = new HashMap<>();
        params.put("method", "turnstile");
        params.put("sitekey", "0x4AAAAAAAChNiVJM_WtShFf");
        params.put("pageurl", "https://ace.fusionist.io");
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

}