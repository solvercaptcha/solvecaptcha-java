package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.Canvas;

public class CanvasExample {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);

        Canvas captcha = new Canvas();
        captcha.setFile("src/main/resources/canvas.jpg");
        captcha.setHintText("Draw around apple");

        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
