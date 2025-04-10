package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.Turnstile;

public class TurnstileExample {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);

        Turnstile captcha = new Turnstile();
        captcha.setSiteKey("0x4AAAAAAAChNiVJM_WtShFf");
        captcha.setUrl("https://ace.fusionist.io");

        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
