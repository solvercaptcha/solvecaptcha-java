package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.Text;

public class TextOptionsExample {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);
        solver.setHost("rucaptcha.com");
        solver.setSoftId(0);
        solver.setDefaultTimeout(120);
        solver.setRecaptchaTimeout(600);
        solver.setPollingInterval(10);
        
        Text captcha = new Text();
        captcha.setText("If tomorrow is Saturday, what day is today?");
        captcha.setLang("en");

        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
