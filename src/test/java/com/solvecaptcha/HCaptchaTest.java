package com.solvecaptcha;

import com.solvecaptcha.captcha.HCaptcha;

import java.util.HashMap;
import java.util.Map;

public class HCaptchaTest extends AbstractWrapperTestCase {

    public void testAllOptions() throws Exception {
        HCaptcha captcha = new HCaptcha();
        captcha.setSiteKey("f1ab2cdefa3456789012345b6c78d90e");
        captcha.setUrl("https://www.site.com/page/");

        Map<String, String> params = new HashMap<>();
        params.put("method", "hcaptcha");
        params.put("sitekey", "f1ab2cdefa3456789012345b6c78d90e");
        params.put("pageurl", "https://www.site.com/page/");
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

}