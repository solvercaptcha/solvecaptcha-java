package com.solvecaptcha;

import com.solvecaptcha.captcha.Audio;

import java.util.HashMap;
import java.util.Map;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class AudioTest extends AbstractWrapperTestCase {

    public void testAllParameters() throws Exception {
        byte[] bytes = Files.readAllBytes(Paths.get("src/main/resources/audio-ru.mp3"));
        String base64EncodedImage = Base64.getEncoder().encodeToString(bytes);

        Audio captcha = new Audio();
        captcha.setBase64(base64EncodedImage);
        captcha.setLang("ru");

        Map<String, String> params = new HashMap<>();
        params.put("method", "audio");
        params.put("lang", "ru");
        params.put("body", base64EncodedImage);
        params.put("soft_id", "4847");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

}