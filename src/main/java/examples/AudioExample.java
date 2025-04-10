package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.Audio;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class AudioExample {

    public static void main(String[] args) throws Exception {
        Solvecaptcha solver = new Solvecaptcha(args[0]);

        byte[] bytes = Files.readAllBytes(Paths.get("src/main/resources/audio-en.mp3"));
        String base64EncodedImage = Base64.getEncoder().encodeToString(bytes);

        Audio captcha = new Audio();
        captcha.setBase64(base64EncodedImage);

        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
