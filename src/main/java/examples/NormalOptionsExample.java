package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.Normal;

import java.io.File;

public class NormalOptionsExample {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);
        solver.setHost("rucaptcha.com");
        solver.setSoftId(0);
        solver.setDefaultTimeout(120);
        solver.setRecaptchaTimeout(600);
        solver.setPollingInterval(10);
        
        Normal captcha = new Normal();
        captcha.setFile("src/main/resources/normal_2.jpg");
        captcha.setNumeric(4);
        captcha.setMinLen(4);
        captcha.setMaxLen(20);
        captcha.setPhrase(true);
        captcha.setCaseSensitive(true);
        captcha.setCalc(false);
        captcha.setLang("en");
        captcha.setHintImg(new File("src/main/resources/normal_hint.jpg"));
        captcha.setHintText("Type red symbols only");

        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
