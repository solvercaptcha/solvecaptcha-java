package com.solvecaptcha;

import com.solvecaptcha.captcha.AmazonWaf;

import java.util.HashMap;
import java.util.Map;

public class AmazonWafTest extends AbstractWrapperTestCase {

    public void testAllOptions() throws Exception {
        AmazonWaf captcha = new AmazonWaf();
        captcha.setSiteKey("AQIDAHjcYu/GjX+QlghicBgQ/7bFaQZ+m5FKCMDnO+vTbNg96AF5H1K/siwSLK7RfstKtN5bAAAAfjB8BgkqhkiG9w0BBwagbzBtAgEAMGgGCSqGSIb3DQEHATAeBglg");
        captcha.setUrl("https://non-existent-example.execute-api.us-east-1.amazonaws.com");
        captcha.setIV("test_iv");
        captcha.setContext("test_context");

        Map<String, String> params = new HashMap<>();
        params.put("method", "amazon_waf");
        params.put("sitekey", "AQIDAHjcYu/GjX+QlghicBgQ/7bFaQZ+m5FKCMDnO+vTbNg96AF5H1K/siwSLK7RfstKtN5bAAAAfjB8BgkqhkiG9w0BBwagbzBtAgEAMGgGCSqGSIb3DQEHATAeBglg");
        params.put("pageurl", "https://non-existent-example.execute-api.us-east-1.amazonaws.com");
        params.put("iv", "test_iv");
        params.put("context", "test_context");
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

}