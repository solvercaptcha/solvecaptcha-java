package com.solvecaptcha;

import com.solvecaptcha.captcha.Tencent;

import java.util.HashMap;
import java.util.Map;

public class TencentTest extends AbstractWrapperTestCase {

    public void testAllOptions() throws Exception {
        Tencent tencent = new Tencent();
        tencent.setAppId("2092215077");
        tencent.setPageUrl("https://mysite.com/page/with/tencent");

        Map<String, String> params = new HashMap<>();
        params.put("method", "tencent");
        params.put("app_id", "2092215077");
        params.put("pageurl", "https://mysite.com/page/with/tencent");
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(tencent, params);
    }

}