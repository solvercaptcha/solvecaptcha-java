package com.solvecaptcha;

import com.solvecaptcha.captcha.FriendlyCaptcha;
import com.solvecaptcha.captcha.Lemin;

import java.util.HashMap;
import java.util.Map;

public class FriendlyCaptchaTest extends AbstractWrapperTestCase {

    public void testAllOptions() throws Exception {
        FriendlyCaptcha friendlyCaptcha = new FriendlyCaptcha();
        friendlyCaptcha.setSiteKey("FCMST5VUMCBOCGQ9");
        friendlyCaptcha.setPageUrl("https://mysite.com/page/with/FriendlyCaptcha");

        Map<String, String> params = new HashMap<>();
        params.put("method", "friendly_captcha");
        params.put("sitekey", "FCMST5VUMCBOCGQ9");
        params.put("pageurl", "https://mysite.com/page/with/FriendlyCaptcha");
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(friendlyCaptcha, params);
    }

}