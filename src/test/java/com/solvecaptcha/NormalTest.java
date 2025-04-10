package com.solvecaptcha;

import com.solvecaptcha.captcha.Normal;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class NormalTest extends AbstractWrapperTestCase {

    private final String captchaImgPath = "src/main/resources/normal.jpg";
    private final String hintImgPath = "src/main/resources/grid_hint.jpg";
    private final String hintText = "Type red symbols only";

    public void testSingleFile() throws Exception {
        File image = new File(captchaImgPath);

        Normal captcha = new Normal(captchaImgPath);

        Map<String, String> params = new HashMap<>();
        params.put("method", "post");
        params.put("soft_id", "4847");
        params.put("json", "0");

        Map<String, File> files = new HashMap<>();
        files.put("file", image);

        checkIfCorrectParamsSendAndResultReturned(captcha, params, files);
    }


    public void testSingleFileParameter() throws Exception {
        File image = new File(captchaImgPath);

        Normal captcha = new Normal();
        captcha.setFile(image);

        Map<String, String> params = new HashMap<>();
        params.put("method", "post");
        params.put("soft_id", "4847");
        params.put("json", "0");

        Map<String, File> files = new HashMap<>();
        files.put("file", image);

        checkIfCorrectParamsSendAndResultReturned(captcha, params, files);
    }

    public void testBase64() throws Exception {
        Normal captcha = new Normal();
        captcha.setBase64("...");

        Map<String, String> params = new HashMap<>();
        params.put("method", "base64");
        params.put("body", "...");
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

    public void testAllParameters() throws Exception {
        File image = new File(captchaImgPath);
        File hintImg = new File(hintImgPath);

        Normal captcha = new Normal();
        captcha.setFile(image);
        captcha.setNumeric(4);
        captcha.setMinLen(5);
        captcha.setMaxLen(20);
        captcha.setPhrase(true);
        captcha.setCaseSensitive(true);
        captcha.setCalc(false);
        captcha.setLang("en");
        captcha.setHintImg(hintImg);
        captcha.setHintText(hintText);

        Map<String, String> params = new HashMap<>();
        params.put("method", "post");
        params.put("numeric", "4");
        params.put("min_len", "5");
        params.put("max_len", "20");
        params.put("phrase", "1");
        params.put("regsense", "1");
        params.put("calc", "0");
        params.put("lang", "en");
        params.put("textinstructions", hintText);
        params.put("soft_id", "4847");
        params.put("json", "0");

        Map<String, File> files = new HashMap<>();
        files.put("file", image);
        files.put("imginstructions", hintImg);

        checkIfCorrectParamsSendAndResultReturned(captcha, params, files);
    }

}