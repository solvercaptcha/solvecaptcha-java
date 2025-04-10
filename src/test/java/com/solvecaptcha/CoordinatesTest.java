package com.solvecaptcha;

import com.solvecaptcha.captcha.Coordinates;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class CoordinatesTest extends AbstractWrapperTestCase {

    private final String captchaImgPath = "src/main/resources/grid.jpg";
    private final String hintImgPath = "src/main/resources/grid_hint.jpg";
    private final String hintText = "Select all images with an Orange";

    public void testSingleFile() throws Exception {
        File image = new File(captchaImgPath);

        Coordinates captcha = new Coordinates(image);

        Map<String, String> params = new HashMap<>();
        params.put("method", "post");
        params.put("coordinatescaptcha", "1");
        params.put("soft_id", "4847");
        params.put("json", "0");

        Map<String, File> files = new HashMap<>();
        files.put("file", image);

        checkIfCorrectParamsSendAndResultReturned(captcha, params, files);
    }

    public void testSingleFileParameter() throws Exception {
        File image = new File(captchaImgPath);

        Coordinates captcha = new Coordinates();
        captcha.setFile(image);

        Map<String, String> params = new HashMap<>();
        params.put("method", "post");
        params.put("coordinatescaptcha", "1");
        params.put("soft_id", "4847");
        params.put("json", "0");

        Map<String, File> files = new HashMap<>();
        files.put("file", image);

        checkIfCorrectParamsSendAndResultReturned(captcha, params, files);
    }

    public void testBase64() throws Exception {
        Coordinates captcha = new Coordinates();
        captcha.setBase64("...");

        Map<String, String> params = new HashMap<>();
        params.put("method", "base64");
        params.put("coordinatescaptcha", "1");
        params.put("body", "...");
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

    public void testAllParameters() throws Exception {
        File image = new File(captchaImgPath);
        File hintImg = new File(hintImgPath);

        Coordinates captcha = new Coordinates();
        captcha.setFile(image);
        captcha.setLang("en");
        captcha.setHintImg(hintImg);
        captcha.setHintText(hintText);

        Map<String, String> params = new HashMap<>();
        params.put("method", "post");
        params.put("coordinatescaptcha", "1");
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