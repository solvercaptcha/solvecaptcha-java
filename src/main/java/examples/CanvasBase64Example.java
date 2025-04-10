package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.Canvas;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class CanvasBase64Example {

    public static void main(String[] args) throws Exception {
        Solvecaptcha solver = new Solvecaptcha(args[0]);

        byte[] bytes = Files.readAllBytes(Paths.get("src/main/resources/canvas.jpg"));
        String base64EncodedImage = Base64.getEncoder().encodeToString(bytes);

        Canvas captcha = new Canvas();
        captcha.setBase64(base64EncodedImage);
        captcha.setHintText("Draw around apple");

        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
