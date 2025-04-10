package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.Lemin;

public class LeminOptionsExample {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);
        solver.setSoftId(0);
        solver.setDefaultTimeout(120);
        solver.setRecaptchaTimeout(600);
        solver.setPollingInterval(10);

        Lemin captcha = new Lemin();      
        captcha.setСaptchaId("CROPPED_d3d4d56_73ca4008925b4f83a8bed59c2dd0df6d");
        captcha.setUrl("http://sat2.aksigorta.com.tr");
        captcha.setApiServer("api.leminnow.com");
        captcha.setProxy("HTTPS", "login:password@IP_address:PORT");
        
        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
