package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.Grid;

public class GridExample {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);

        Grid captcha = new Grid("src/main/resources/grid.jpg");

        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
