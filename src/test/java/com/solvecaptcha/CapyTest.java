package com.solvecaptcha;

import com.solvecaptcha.captcha.Capy;

import java.util.HashMap;
import java.util.Map;

public class CapyTest extends AbstractWrapperTestCase {

    public void testAllOptions() throws Exception {
        Capy captcha = new Capy();
        captcha.setSiteKey("PUZZLE_Abc1dEFghIJKLM2no34P56q7rStu8v");
        captcha.setUrl("http://mysite.com/");
        captcha.setApiServer("https://myapiserver.com/");

        Map<String, String> params = new HashMap<>();
        params.put("method", "capy");
        params.put("captchakey", "PUZZLE_Abc1dEFghIJKLM2no34P56q7rStu8v");
        params.put("pageurl", "http://mysite.com/");
        params.put("api_server","https://myapiserver.com/");
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

}