package com.solvecaptcha;

import com.solvecaptcha.captcha.MtCaptcha;

import java.util.HashMap;
import java.util.Map;

public class MtCaptchaTest extends AbstractWrapperTestCase {

    public void testAllOptions() throws Exception {
        MtCaptcha mtCaptcha = new MtCaptcha();
        mtCaptcha.setSiteKey("MTPublic-KzqLY1cKH");
        mtCaptcha.setPageUrl("https://mysite.com/page/with/mtcaptcha");

        Map<String, String> params = new HashMap<>();
        params.put("method", "mt_captcha");
        params.put("sitekey", "MTPublic-KzqLY1cKH");
        params.put("pageurl", "https://mysite.com/page/with/mtcaptcha");
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(mtCaptcha, params);
    }

}