package com.solvecaptcha;

import com.solvecaptcha.captcha.GeeTest;

import java.util.HashMap;
import java.util.Map;

public class GeeTestTest extends AbstractWrapperTestCase {

    public void testAllOptions() throws Exception {
        GeeTest captcha = new GeeTest();
        captcha.setGt("f2ae6cadcf7886856696502e1d55e00c");
        captcha.setApiServer("api-na.geetest.com");
        captcha.setChallenge("69A21A01-CC7B-B9C6-0F9A-E7FA06677FFC");
        captcha.setUrl("https://launches.endclothing.com/distil_r_captcha.html");

        Map<String, String> params = new HashMap<>();
        params.put("method", "geetest");
        params.put("gt", "f2ae6cadcf7886856696502e1d55e00c");
        params.put("api_server", "api-na.geetest.com");
        params.put("challenge", "69A21A01-CC7B-B9C6-0F9A-E7FA06677FFC");
        params.put("pageurl", "https://launches.endclothing.com/distil_r_captcha.html");
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

}