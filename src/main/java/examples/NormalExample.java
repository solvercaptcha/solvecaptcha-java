package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.Normal;

public class NormalExample {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);

        Normal captcha = new Normal("src/main/resources/normal.jpg");

        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
