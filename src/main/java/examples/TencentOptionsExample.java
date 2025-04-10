package examples;

import com.solvecaptcha.Solvecaptcha;
import com.solvecaptcha.captcha.Tencent;

public class TencentOptionsExample {

    public static void main(String[] args) {
        Solvecaptcha solver = new Solvecaptcha(args[0]);
        solver.setHost("rucaptcha.com");
        solver.setSoftId(0);
        solver.setDefaultTimeout(120);
        solver.setRecaptchaTimeout(600);
        solver.setPollingInterval(10);

        Tencent tencent = new Tencent();
        tencent.setAppId("2092215077");
        tencent.setPageUrl("https://mysite.com/page/with/tencent");
        tencent.setProxy("HTTPS", "login:password@IP_address:PORT");

        try {
            solver.solve(tencent);
            System.out.println("Captcha solved: " + tencent.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}