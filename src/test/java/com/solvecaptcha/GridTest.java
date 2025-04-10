package com.solvecaptcha;

import com.solvecaptcha.captcha.Grid;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GridTest extends AbstractWrapperTestCase {

    private final String captchaImgPath = "src/main/resources/grid.jpg";
    private final String hintImgPath = "src/main/resources/grid_hint.jpg";
    private final String hintText = "Select all images with an Orange";

    public void testSingleFile() throws Exception {
        File image = new File(captchaImgPath);

        Grid captcha = new Grid(image);

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

        Grid captcha = new Grid();
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
        Grid captcha = new Grid();
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

        Grid captcha = new Grid();
        captcha.setFile(image);
        captcha.setRows(3);
        captcha.setCols(3);
        captcha.setPreviousId(0);
        captcha.setCanSkip(false);
        captcha.setLang("en");
        captcha.setHintImg(hintImg);
        captcha.setHintText(hintText);

        Map<String, String> params = new HashMap<>();
        params.put("method", "post");
        params.put("recaptcharows", "3");
        params.put("recaptchacols", "3");
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