package com.solvecaptcha;

import com.solvecaptcha.captcha.Text;

import java.util.HashMap;
import java.util.Map;

public class TextTest extends AbstractWrapperTestCase {

    private final String question = "Today is monday?";

    public void testSimpleText() throws Exception {
        Text captcha = new Text(question);

        Map<String, String> params = new HashMap<>();
        params.put("method", "post");
        params.put("textcaptcha", question);
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

    public void testTextParameter() throws Exception {
        Text captcha = new Text();
        captcha.setText(question);

        Map<String, String> params = new HashMap<>();
        params.put("method", "post");
        params.put("textcaptcha", question);
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

    public void testAllParameters() throws Exception {
        Text captcha = new Text();
        captcha.setText(question);
        captcha.setLang("en");

        Map<String, String> params = new HashMap<>();
        params.put("method", "post");
        params.put("textcaptcha", question);
        params.put("lang", "en");
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }
}