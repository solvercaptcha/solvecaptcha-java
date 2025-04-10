package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.Grid;

import java.io.File;

public class GridOptionsExample {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);
        solver.setHost("rucaptcha.com");
        solver.setSoftId(0);
        solver.setDefaultTimeout(120);
        solver.setRecaptchaTimeout(600);
        solver.setPollingInterval(10);
        
        Grid captcha = new Grid();
        captcha.setFile("src/main/resources/grid_2.jpg");
        captcha.setRows(3);
        captcha.setCols(3);
        captcha.setPreviousId(0);
        captcha.setCanSkip(false);
        captcha.setLang("en");
        captcha.setHintImg(new File("src/main/resources/grid_hint.jpg"));
        captcha.setHintText("Select all images with an Orange");

        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
