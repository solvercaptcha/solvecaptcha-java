package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.GeeTestV4;

public class GeeTestV4Example {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);

        GeeTestV4 captcha = new GeeTestV4();
        captcha.setCaptchaId("72bf15796d0b69c43867452fea615052");
        captcha.setApiServer("api-na.geetest.com");
        captcha.setChallenge("12345678abc90123d45678ef90123a456b");
        captcha.setUrl("https://mysite.com/captcha.html");


        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
