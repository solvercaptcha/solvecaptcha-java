package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.MtCaptcha;

public class MtCaptchaExample {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);

        MtCaptcha mtCaptcha = new MtCaptcha();
        mtCaptcha.setSiteKey("MTPublic-KzqLY1cKH");
        mtCaptcha.setPageUrl("https://api.solvecaptcha.com/demo/mtcaptcha");

        try {
            solver.solve(mtCaptcha);
            System.out.println("Captcha solved: " + mtCaptcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
