package com.solvecaptcha;

import com.solvecaptcha.captcha.Canvas;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class CanvasTest extends AbstractWrapperTestCase {

    private final String captchaImgPath = "src/main/resources/canvas.jpg";
    private final String hintImgPath = "src/main/resources/canvas_hint.jpg";
    private final String hintText = "Draw around apple";

    public void testSingleFile() throws Exception {
        File image = new File(captchaImgPath);

        Canvas captcha = new Canvas();
        captcha.setFile(image);
        captcha.setHintText(hintText);

        Map<String, String> params = new HashMap<>();
        params.put("method", "post");
        params.put("recaptcha", "1");
        params.put("canvas", "1");
        params.put("textinstructions", hintText);
        params.put("soft_id", "4847");
        params.put("json", "0");

        Map<String, File> files = new HashMap<>();
        files.put("file", image);

        checkIfCorrectParamsSendAndResultReturned(captcha, params, files);
    }

    public void testBase64() throws Exception {
        Canvas captcha = new Canvas();
        captcha.setBase64("...");
        captcha.setHintText(hintText);

        Map<String, String> params = new HashMap<>();
        params.put("method", "base64");
        params.put("recaptcha", "1");
        params.put("canvas", "1");
        params.put("body", "...");
        params.put("textinstructions", hintText);
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

    public void testAllParameters() throws Exception {
        File image = new File(captchaImgPath);
        File hintImg = new File(hintImgPath);

        Canvas captcha = new Canvas();
        captcha.setFile(image);
        captcha.setPreviousId(0);
        captcha.setCanSkip(false);
        captcha.setLang("en");
        captcha.setHintImg(hintImg);
        captcha.setHintText(hintText);

        Map<String, String> params = new HashMap<>();
        params.put("method", "post");
        params.put("recaptcha", "1");
        params.put("canvas", "1");
        params.put("previousID", "0");
        params.put("can_no_answer", "0");
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