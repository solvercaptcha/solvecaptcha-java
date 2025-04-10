package com.solvecaptcha;

import com.solvecaptcha.captcha.FunCaptcha;

import java.util.HashMap;
import java.util.Map;

public class FunCaptchaTest extends AbstractWrapperTestCase {

    public void testAllOptions() throws Exception {
        FunCaptcha captcha = new FunCaptcha();
        captcha.setSiteKey("69A21A01-CC7B-B9C6-0F9A-E7FA06677FFC");
        captcha.setUrl("https://mysite.com/page/with/funcaptcha");
        captcha.setSUrl("https://client-api.arkoselabs.com");
        captcha.setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36");
        captcha.setData("anyKey", "anyStringValue");

        Map<String, String> params = new HashMap<>();
        params.put("method", "funcaptcha");
        params.put("publickey", "69A21A01-CC7B-B9C6-0F9A-E7FA06677FFC");
        params.put("pageurl", "https://mysite.com/page/with/funcaptcha");
        params.put("surl", "https://client-api.arkoselabs.com");
        params.put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36");
        params.put("data[anyKey]", "anyStringValue");
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

}