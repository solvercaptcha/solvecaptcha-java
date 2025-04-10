package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.KeyCaptcha;

public class KeyCaptchaExample {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);

        KeyCaptcha captcha = new KeyCaptcha();
        captcha.setUserId(10);
        captcha.setSessionId("493e52c37c10c2bcdf4a00cbc9ccd1e8");
        captcha.setWebServerSign("9006dc725760858e4c0715b835472f22");
        captcha.setWebServerSign2("2ca3abe86d90c6142d5571db98af6714");
        captcha.setUrl("https://www.keycaptcha.ru/demo-magnetic/");

        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
