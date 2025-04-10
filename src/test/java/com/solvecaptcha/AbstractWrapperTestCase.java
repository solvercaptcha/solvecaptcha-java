package com.solvecaptcha;

import com.solvecaptcha.captcha.Captcha;
import junit.framework.TestCase;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractWrapperTestCase extends TestCase {

    protected void checkIfCorrectParamsSendAndResultReturned(
            Captcha captcha,
            Map<String, String> params
    ) throws Exception {
        Map<String, File> files = new HashMap<>();
        checkIfCorrectParamsSendAndResultReturned(captcha, params, files);
    }

    protected void checkIfCorrectParamsSendAndResultReturned(
            Captcha captcha,
            Map<String, String> params,
            Map<String, File> files
    ) throws Exception {
        String apiKey    = "API_KEY";
        String captchaId = "123";
        String code      = "2763";

        params.put("key", apiKey);

        Map<String, String> resParams = new HashMap<>();
        resParams.put("action", "get");
        resParams.put("id", captchaId);
        resParams.put("key", apiKey);
        resParams.put("json", "0");

        ApiClient apiClient = mock(ApiClient.class);
        when(apiClient.in(any(), any())).thenReturn("OK|" + captchaId);
        when(apiClient.res(any())).thenReturn("OK|" + code);

        Solvecaptcha solver = new Solvecaptcha(apiKey);
        solver.setPollingInterval(1);
        solver.setHttpClient(apiClient);

        solver.solve(captcha);

        verify(apiClient, times(1)).in(params, files);
        verify(apiClient, times(1)).res(resParams);

        Assert.assertEquals(captchaId, captcha.getId());
        Assert.assertEquals(code, captcha.getCode());
    }

}
