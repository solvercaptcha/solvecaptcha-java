package com.solvecaptcha;

import com.solvecaptcha.captcha.Rotate;

import java.util.HashMap;
import java.util.Map;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class RotateTest extends AbstractWrapperTestCase {

    public void testAllParameters() throws Exception {

        byte[] bytes = Files.readAllBytes(Paths.get("src/main/resources/rotate.jpg"));        
        String base64EncodedImage = Base64.getEncoder().encodeToString(bytes);


        Rotate captcha = new Rotate();
        captcha.setBase64(base64EncodedImage);
        captcha.setAngle(40);
        captcha.setLang("en");
        captcha.setHintText("Put the images in the correct way up");

        Map<String, String> params = new HashMap<>();
        params.put("method", "rotatecaptcha");
        params.put("angle", "40.0");
        params.put("lang", "en");
        params.put("textinstructions", "Put the images in the correct way up");
        params.put("body", base64EncodedImage);
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

}