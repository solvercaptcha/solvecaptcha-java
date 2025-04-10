package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.Rotate;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class RotateExample {

    public static void main(String[] args) throws Exception {
        Solvecaptcha solver = new Solvecaptcha(args[0]);

        byte[] bytes = Files.readAllBytes(Paths.get("src/main/resources/rotate.jpg"));
        String base64EncodedImage = Base64.getEncoder().encodeToString(bytes);


        Rotate captcha = new Rotate();        
        captcha.setBase64(base64EncodedImage);

        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
