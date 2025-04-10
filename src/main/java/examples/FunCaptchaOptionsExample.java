package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.FunCaptcha;

public class FunCaptchaOptionsExample {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);
        solver.setHost("rucaptcha.com");
        solver.setSoftId(0);
        solver.setDefaultTimeout(120);
        solver.setRecaptchaTimeout(600);
        solver.setPollingInterval(10);
        
        FunCaptcha captcha = new FunCaptcha();
        captcha.setSiteKey("69A21A01-CC7B-B9C6-0F9A-E7FA06677FFC");
        captcha.setUrl("https://mysite.com/page/with/funcaptcha");
        captcha.setSUrl("https://client-api.arkoselabs.com");
        captcha.setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36");
        captcha.setData("anyKey", "anyValue");
        captcha.setProxy("HTTPS", "login:password@IP_address:PORT");

        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
