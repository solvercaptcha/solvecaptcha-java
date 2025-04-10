package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.HCaptcha;

public class HCaptchaExample {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);

        HCaptcha captcha = new HCaptcha();
        captcha.setSiteKey("c0421d06-b92e-47fc-ab9a-5caa43c04538");
        captcha.setUrl("https://api.solvecaptcha.com/demo/hcaptcha");

        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
