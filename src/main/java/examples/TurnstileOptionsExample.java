package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.Turnstile;

public class TurnstileOptionsExample {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);
        solver.setHost("rucaptcha.com");
        solver.setSoftId(0);
        solver.setDefaultTimeout(120);
        solver.setRecaptchaTimeout(600);
        solver.setPollingInterval(10);
        
        Turnstile captcha = new Turnstile();
        captcha.setSiteKey("0x4AAAAAAAChNiVJM_WtShFf");
        captcha.setUrl("https://ace.fusionist.io");
        captcha.setProxy("HTTPS", "login:password@IP_address:PORT");

        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
