package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.GeeTest;

public class GeeTestExample {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);

        GeeTest captcha = new GeeTest();
        captcha.setGt("f2ae6cadcf7886856696502e1d55e00c");
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
