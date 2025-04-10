
<a href="https://github.![java](https://github.com/user-attachments/assets/cb9407ea-72b7-48b2-8776-01e8ec03c954)
com/solvercaptcha/solvecaptcha-python"><img src="https://github.com/user-attachments/assets/37e1d860-033b-4cf3-a158-468fc6b4debc" width="82" height="30"></a>
<a href="https://github.com/solvercaptcha/solvecaptcha-javascript"><img src="https://github.com/user-attachments/assets/4d3b4541-34b2-4ed2-a687-d694ce67e5a6" width="36" height="30"></a>
<a href="https://github.com/solvercaptcha/solvecaptcha-go"><img src="https://github.com/user-attachments/assets/ab22182e-6cb2-41fa-91f4-d5e89c6d7c6f" width="63" height="30"></a>
<a href="https://github.com/solvercaptcha/solvecaptcha-ruby"><img src="https://github.com/user-attachments/assets/0270d56f-79b0-4c95-9b09-4de89579914b" width="75" height="30"></a>
<a href="https://github.com/solvercaptcha/solvecaptcha-cpp"><img src="https://github.com/user-attachments/assets/36de8512-acfd-44fb-bb1f-b7c793a3f926" width="45" height="30"></a>
<a href="https://github.com/solvercaptcha/solvecaptcha-php"><img src="https://github.com/user-attachments/assets/e8797843-3f61-4fa9-a155-ab0b21fb3858" width="52" height="30"></a>
<a href="https://github.com/solvercaptcha/solvecaptcha-java"><img src="https://github.com/user-attachments/assets/1c576ba8-aa8d-4d6f-b1a4-b346473a4e1b" width="50" height="30"></a>
<a href="https://github.com/solvercaptcha/solvecaptcha-csharp"><img src="https://github.com/user-attachments/assets/f4d449de-780b-49ed-bb0a-b70c82ec4b32" width="38" height="30"></a>


# Java captcha solver: Bypass reCAPTCHA, Cloudflare, hCaptcha, Amazon and More

Use the [Java captcha solver](https://solvecaptcha.com/captcha-solver/java-captcha-solver-bypass) to automatically bypass any captcha — including reCAPTCHA v2, Invisible, v3, Enterprise, hCaptcha, Cloudflare Turnstile, GeeTest sliders, Amazon AWS WAF, FunCaptcha, and both image and text-based captchas.

## ✅ Supported captcha solvers

To get started quickly, check out the [captcha solver API](https://solvecaptcha.com/captcha-solver-api) documentation.

Helpful links:

- [reCAPTCHA v2 solver](https://solvecaptcha.com/captcha-solver/recaptcha-v2-solver-bypass)
- [reCAPTCHA v3 solver](https://solvecaptcha.com/captcha-solver/recaptcha-v3-solver-bypass)
- [hCaptcha solver](https://solvecaptcha.com/captcha-solver/hcaptcha-solver-bypass)
- [Text and image captcha solver](https://solvecaptcha.com/captcha-solver/image-captcha-solver-bypass)
- [Cloudflare captcha solver (Turnstile)](https://solvecaptcha.com/captcha-solver/cloudflare-captcha-solver-bypass)
- [Amazon captcha solver (AWS WAF)](https://solvecaptcha.com/captcha-solver/amazon-captcha-solver-bypass)
- [GeeTest solver](https://solvecaptcha.com/captcha-solver/slider-captcha-solver-bypass)
- [FunCaptcha (Arkose Labs) solver](https://solvecaptcha.com/captcha-solver/funcaptcha-solver-bypass)
- Other types

### 🛠️ Features 

- Fast and fully automated captcha solving
- Native support for **Java 8+**
- Works with **HttpURLConnection**, **Apache HttpClient**, **OkHttp**, or - **Spring WebClient**
- Easily integrates into **Spring Boot**, **Jakarta EE**, or standalone - Java apps
- Async-friendly architecture using Futures, - CompletableFutures, or reactive streams
- Pay only for successful solves
- 99.9% uptime
- 24/7 developer support

### 📦 Use cases

- Accessibility
- Web scraping behind protected pages
- Automating form submissions in enterprise Java applications
- Background captcha solving in scheduled jobs or microservices
- QA pipelines with captcha bypass
- Security testing and anti-bot evaluation

Need help integrating with your Go project? [Open an issue](https://github.com/solvercaptcha/solvecaptcha-java/issues) or fork this repo to contribute.

- [Java captcha solver: Bypass reCAPTCHA, Cloudflare, hCaptcha, Amazon and More](#java-captcha-solver-bypass-recaptcha-cloudflare-hcaptcha-amazon-and-more)
  - [Installation](#installation)
  - [Configuration](#configuration)
    - [solvecaptcha instance options](#solvecaptcha-instance-options)
  - [Solve captcha](#solve-captcha)
    - [Captcha options](#captcha-options)
    - [Basic example](#basic-example)
    - [Normal Captcha](#normal-captcha)
    - [Text Captcha](#text-captcha)
    - [ReCaptcha v2](#recaptcha-v2)
    - [ReCaptcha v3](#recaptcha-v3)
    - [FunCaptcha](#funcaptcha)
    - [GeeTest](#geetest)
    - [GeeTestV4](#geetestv4)
    - [hCaptcha](#hcaptcha)
    - [KeyCaptcha](#keycaptcha)
    - [Capy](#capy)
    - [Grid](#grid)
    - [Canvas](#canvas)
    - [ClickCaptcha](#clickcaptcha)
    - [Rotate](#rotate)
    - [Audio](#audio)
    - [Yandex](#yandex)
    - [Lemin](#lemin)
    - [Turnstile](#turnstile)
    - [AmazonWaf](#amazonwaf)
    - [Friendly Captcha](#friendly-captcha)
    - [MTCaptcha](#mtcaptcha)
    - [Tencent](#tencent)
  - [Other methods](#other-methods)
    - [send / getResult](#send--getresult)
    - [balance](#balance)
    - [report](#report)
  - [Proxies](#proxies)
  - [Error handling](#error-handling)
- [Get in touch](#get-in-touch)
- [License](#license)

## Installation
(Coming soon) solveaptcha-java artifact is available in [Maven Central]

You can install the library directly from GitHub using [JitPack](https://jitpack.io):

### Step 1: Add the JitPack repository to your `build.gradle`:

```groovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

### Step 2: Add the dependency:
```
dependencies {
    implementation 'com.github.solvercaptcha:solvecaptcha-java:1.0.0'
}
```
Replace `1.0.0` with the latest version tag from [the releases](https://github.com/solvercaptcha/solvecaptcha-java/releases).

## Configuration
`solvecaptcha` instance can be created like this:
```java
solvecaptcha solver = new solvecaptcha('YOUR_API_KEY');
```
Also there are few options that can be configured:
```java
solver.setHost("solvecaptcha.com");
solver.setDefaultTimeout(120);
solver.setRecaptchaTimeout(600);
solver.setPollingInterval(10);
solver.setExtendedResponse(1);
```

### solvecaptcha instance options

| Option           | Default value| Description                                                                                                                                        |
|------------------| ------------ |----------------------------------------------------------------------------------------------------------------------------------------------------|
| host             |`solvecaptcha.com`| API server. You can set it to `solvecaptcha.com` if your account is registered there                                                                  |
| defaultTimeout   | 120          | Polling timeout in seconds for all captcha types except ReCaptcha. Defines how long the module tries to get the answer from `res.php` API endpoint |
| recaptchaTimeout | 600          | Polling timeout for ReCaptcha in seconds. Defines how long the module tries to get the answer from `res.php` API endpoint                          |
| pollingInterval  | 10           | Interval in seconds between requests to `res.php` API endpoint, setting values less than 5 seconds is not recommended                              |
| extendedResponse | 0            | Json or String format response from `res.php` API endpoint, extendedResponse = 1 returns JSON format response                                      |

To get the answer manually use [getResult method](#send--getresult)

> [!TIP]
> Use the `extendedResponse(1)` setting to obtain an extended response for the captcha. When using `extendedResponse(1)`, the response will be presented as a `JSON` string. Utilizing the extended response `extendedResponse(1)` will be helpful when solving captchas such as [hCaptcha](#hcaptcha) and [ClickCaptcha](#clickcaptcha). When using `extendedResponse(1)` for hCaptcha, the response will include additional fields, such as `respKe`y and `useragent`.<br>
> Default answer for hCaptcha answer looks like this: `P1_eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9...`<br>
> An extended response using `extendedResponse(1)` for an hCaptcha answer looks like this: `{"request":"P1_eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9...","respKey":"E0_eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9...","useragent":"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.6478.127 Safari/537.36","status":1}`


## Solve captcha
When you submit any image-based captcha use can provide additional options to help [SolveCaptcha] workers to solve it properly.

### Captcha options
| Option        | Default Value | Description                                                                                        |
| ------------- | ------------- | -------------------------------------------------------------------------------------------------- |
| numeric       | 0             | Defines if captcha contains numeric or other symbols [see more info in the API docs][post options] |
| minLength     | 0             | minimal answer lenght                                                                              |
| maxLength     | 0             | maximum answer length                                                                              |
| phrase        | 0             | defines if the answer contains multiple words or not                                               |
| caseSensitive | 0             | defines if the answer is case sensitive                                                            |
| calc          | 0             | defines captcha requires calculation                                                               |
| lang          | -             | defines the captcha language, see the [list of supported languages]                                |
| hintImg       | -             | an image with hint shown to workers with the captcha                                               |
| hintText      | -             | hint or task text shown to workers with the captcha                                                |

Below you can find basic examples for every captcha type. Check out [examples directory] to find more examples with all available options.

### Basic example
Example below shows a basic solver call example with error handling.

```java
Normal captcha = new Normal();
captcha.setFile("path/to/captcha.jpg");
captcha.setMinLen(4);
captcha.setMaxLen(20);
captcha.setCaseSensitive(true);
captcha.setLang("en");

try {
    solver.solve(captcha);
    System.out.println("Captcha solved: " + captcha.getCode());
} catch (Exception e) {
    System.out.println("Error occurred: " + e.getMessage());
}
```

### Normal Captcha

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#solving_normal_captcha)</sup>

To bypass a normal captcha (distorted text on image) use the following method. This method also can be used to recognize any text on the image.

```java
Normal captcha = new Normal();
captcha.setFile("path/to/captcha.jpg");
captcha.setNumeric(4);
captcha.setMinLen(4);
captcha.setMaxLen(20);
captcha.setPhrase(true);
captcha.setCaseSensitive(true);
captcha.setCalc(false);
captcha.setLang("en");
captcha.setHintImg(new File("path/to/hint.jpg"));
captcha.setHintText("Type red symbols only");
```

### Text Captcha

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#solving_text_captcha)</sup>

This method can be used to bypass a captcha that requires to answer a question provided in clear text.

```java
Text captcha = new Text();
captcha.setText("If tomorrow is Saturday, what day is today?");
captcha.setLang("en");
```

### ReCaptcha v2

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#solving_recaptchav2_new)</sup>

Use this method to solve ReCaptcha V2 and obtain a token to bypass the protection.

```java
ReCaptcha captcha = new ReCaptcha();
captcha.setSiteKey("6Le-wvkSVVABCPBMRTvw0Q4Muexq1bi0DJwx_mJ-");
captcha.setUrl("https://mysite.com/page/with/recaptcha");
captcha.setInvisible(true);
captcha.setEnterprise(true);
captcha.setAction("verify");
captcha.setProxy("HTTPS", "login:password@IP_address:PORT");
```
### ReCaptcha v3

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#solving_recaptchav3)</sup>

This method provides ReCaptcha V3 solver and returns a token.

```java
ReCaptcha captcha = new ReCaptcha();
captcha.setSiteKey("6Le-wvkSVVABCPBMRTvw0Q4Muexq1bi0DJwx_mJ-");
captcha.setUrl("https://mysite.com/page/with/recaptcha");
captcha.setVersion("v3");
captcha.setEnterprise(false);
captcha.setAction("verify");
captcha.setScore(0.3);
captcha.setProxy("HTTPS", "login:password@IP_address:PORT");
```

### FunCaptcha

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#solving_funcaptcha_new)</sup>


FunCaptcha (Arkoselabs) solving method. Returns a token.

```java
FunCaptcha captcha = new FunCaptcha();
captcha.setSiteKey("69A21A01-CC7B-B9C6-0F9A-E7FA06677FFC");
captcha.setUrl("https://mysite.com/page/with/funcaptcha");
captcha.setSUrl("https://client-api.arkoselabs.com");
captcha.setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36");
captcha.setData("anyKey", "anyValue");
captcha.setProxy("HTTPS", "login:password@IP_address:PORT");
```

### GeeTest

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#solving_geetest)</sup>

Method to solve GeeTest puzzle captcha. Returns a set of tokens as JSON.

```java
GeeTest captcha = new GeeTest();
captcha.setGt("f2ae6cadcf7886856696502e1d55e00c");
captcha.setApiServer("api-na.geetest.com");
captcha.setChallenge("12345678abc90123d45678ef90123a456b");
captcha.setUrl("https://mysite.com/captcha.html");
captcha.setProxy("HTTPS", "login:password@IP_address:PORT");
```

### GeeTestV4

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#solving_geetest_v4)</sup>

Method to solve GeeTestV4 puzzle captcha. Returns a set of tokens as JSON.

```java
GeeTestV4 captcha = new GeeTestV4();
captcha.setCaptchaId("72bf15796d0b69c43867452fea615052");
captcha.setApiServer("api-na.geetest.com");
captcha.setChallenge("12345678abc90123d45678ef90123a456b");
captcha.setUrl("https://mysite.com/captcha.html");
captcha.setProxy("HTTPS", "login:password@IP_address:PORT");
```

### hCaptcha

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#solving_hcaptcha)</sup>

Method to solve hCaptcha captcha. Returns a token.
Use `setExtendedResponse` to get `respKey` and `useragent` in captcha answer.

```java
HCaptcha captcha = new HCaptcha();
captcha.setSiteKey("c0421d06-b92e-47fc-ab9a-5caa43c04538");
captcha.setUrl("https://mysite.com/page/with/hcaptcha");
captcha.setProxy("HTTPS", "login:password@IP_address:PORT");
```

### KeyCaptcha

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#solving_keycaptcha)</sup>

Token-based method to solve KeyCaptcha.

```java
KeyCaptcha captcha = new KeyCaptcha();
captcha.setUserId(10);
captcha.setSessionId("493e52c37c10c2bcdf4a00cbc9ccd1e8");
captcha.setWebServerSign("9006dc725760858e4c0715b835472f22");
captcha.setWebServerSign2("2ca3abe86d90c6142d5571db98af6714");
captcha.setUrl("https://www.keycaptcha.ru/demo-magnetic/");
captcha.setProxy("HTTPS", "login:password@IP_address:PORT");
```

### Capy

Token-based method to bypass Capy puzzle captcha.

```java
Capy captcha = new Capy();
captcha.setSiteKey("PUZZLE_Abc1dEFghIJKLM2no34P56q7rStu8v");
captcha.setUrl("https://www.mysite.com/captcha/");
captcha.setProxy("HTTPS", "login:password@IP_address:PORT");
```

### Grid

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#solving_grid)</sup>

Grid method is originally called Old ReCaptcha V2 method. The method can be used to bypass any type of captcha where you can apply a grid on image and need to click specific grid boxes. Returns numbers of boxes.

```java
Grid captcha = new Grid();
captcha.setFile("path/to/captcha.jpg");
captcha.setRows(3);
captcha.setCols(3);
captcha.setPreviousId(0);
captcha.setCanSkip(false);
captcha.setLang("en");
captcha.setHintImg(new File("path/to/hint.jpg"));
captcha.setHintText("Select all images with an Orange");
```

### Canvas

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#canvas)</sup>

Canvas method can be used when you need to draw a line around an object on image. Returns a set of points' coordinates to draw a polygon.

```java
Canvas captcha = new Canvas();
captcha.setFile("path/to/captcha.jpg");
captcha.setPreviousId(0);
captcha.setCanSkip(false);
captcha.setLang("en");
captcha.setHintImg(new File("path/to/hint.jpg"));
captcha.setHintText("Draw around apple");
```

### ClickCaptcha

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#solving_clickcaptcha)</sup>

ClickCaptcha method returns coordinates of points on captcha image. Can be used if you need to click on particular points on the image.

```java
Coordinates captcha = new Coordinates();
captcha.setFile("path/to/captcha.jpg");
captcha.setLang("en");
captcha.setHintImg(new File("path/to/hint.jpg"));
captcha.setHintText("Select all images with an Orange");
```

### Rotate

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#solving_rotatecaptcha)</sup>

This method can be used to solve a captcha that asks to rotate an object. Mostly used to bypass FunCaptcha. Returns the rotation angle.

```java
Rotate captcha = new Rotate();
captcha.setFile("path/to/captcha.jpg");
captcha.setAngle(40);
captcha.setLang("en");
captcha.setHintImg(new File("path/to/hint.jpg"));
captcha.setHintText("Put the images in the correct way up");
```

### Audio

This method can be used to solve a audio captcha

```java
solvecaptcha solver = new Solvecaptcha(args[0]);
byte[] bytes = Files.readAllBytes(Paths.get("src/main/resources/audio-en.mp3"));
String base64EncodedImage = Base64.getEncoder().encodeToString(bytes);
Audio captcha = new Audio();
captcha.setBase64(base64EncodedImage);
```

### Yandex

Use this method to solve Yandex and obtain a token to bypass the protection.

```java
solvecaptcha solver = new Solvecaptcha(args[0]);
Yandex captcha = new Yandex();
captcha.setSiteKey("Y5Lh0tiycconMJGsFd3EbbuNKSp1yaZESUOIHfeV");
captcha.setUrl("https://rutube.ru");
```

### Lemin
Use this method to solve Lemin and obtain a token to bypass the protection.

```java
solvecaptcha solver = new Solvecaptcha(args[0]);
Lemin captcha = new Lemin();      
captcha.setСaptchaId("CROPPED_d3d4d56_73ca4008925b4f83a8bed59c2dd0df6d");
captcha.setUrl("http://sat2.aksigorta.com.tr");
captcha.setApiServer("api.leminnow.com");
```

### Turnstile

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#solving_cloudflare_turnstile)</sup>

Use this method to solve Turnstile and obtain a token to bypass the protection.

```java
solvecaptcha solver = new Solvecaptcha(args[0]);
Turnstile captcha = new Turnstile();
captcha.setSiteKey("0x4AAAAAAAChNiVJM_WtShFf");
captcha.setUrl("https://ace.fusionist.io");
```

### AmazonWaf

Use this method to solve AmazonWaf and obtain a token to bypass the protection.

```java
solvecaptcha solver = new Solvecaptcha(args[0]);
AmazonWaf captcha = new AmazonWaf();
captcha.setSiteKey("AQIDAHjcYu/GjX+QlghicBgQ/7bFaQZ+m5FKCMDnO+vTbNg96AF5H1K/siwSLK7RfstKtN5bAAAAfjB8BgkqhkiG9w0BBwagbzBtAgEAMGgGCSqGSIb3DQEHATAeBglg");
captcha.setUrl("https://non-existent-example.execute-api.us-east-1.amazonaws.com");
captcha.setIV("test_iv");
captcha.setContext("test_context");
```

### Friendly Captcha

Use this method to solve Friendly Captcha and obtain a token to bypass the protection.

```java
solvecaptcha solver = new Solvecaptcha(args[0]);
FriendlyCaptcha friendlyCaptcha = new FriendlyCaptcha();
friendlyCaptcha.setSiteKey("FCMST5VUMCBOCGQ9");
friendlyCaptcha.setPageUrl("https://mysite.com/page/with/FriendlyCaptcha");
```

### MtCaptcha

Use this method to solve MtCaptcha and obtain a token to bypass the protection.

```java
solvecaptcha solver = new Solvecaptcha(args[0]);
MtCaptcha mtCaptcha = new MtCaptcha();
mtCaptcha.setSiteKey("MTPublic-KzqLY1cKH");
mtCaptcha.setPageUrl("https://mysite.com/page/with/mtcaptcha");
```

### Tencent

Use this method to solve Tencent and obtain a token to bypass the protection.

```java
solvecaptcha solver = new Solvecaptcha(args[0]);
Tencent tencent = new Tencent();
tencent.setAppId("2092215077");
tencent.setPageUrl("https://mysite.com/page/with/tencent");
```

## Other methods

### send / getResult
These methods can be used for manual captcha submission and answer polling.

```java
String captchaId = solver.send(captcha);

Thread.sleep(20 * 1000);

String code = solver.getResult(captchaId);
```
### balance

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#additional)</sup>

Use this method to get your account's balance

```java
double balance = solver.balance();
```
### report

<sup>[API method description.](https://solvecaptcha.com/captcha-solver-api#complain)</sup>

Use this method to report good or bad captcha answer.

```java
solver.report(captcha.getId(), true); // captcha solved correctly
solver.report(captcha.getId(), false); // captcha solved incorrectly
```

## Proxies
You can pass your proxy as an additional argument for methods: recaptcha, funcaptcha, geetest, geetest v4, hcaptcha, keycaptcha, capy puzzle, lemin, turnstile, amazon waf and etc. The proxy will be forwarded to the API to solve the captcha.

```java
captcha.setProxy("HTTPS", "login:password@IP_address:PORT");
```


## Error handling
If case of an error captcha solver throws an exception. It's important to properly handle these cases. We recommend to use `try catch` to handle exceptions.

```java
try {
    solver.solve(captcha);
} catch (ValidationException e) {
    // invalid parameters passed
} catch (NetworkException e) {
    // network error occurred
} catch (ApiException e) {
    // api respond with error
} catch (TimeoutException e) {
    // captcha is not solved so far
}
```

## Get in touch

<a href="mailto:info@solvecaptcha.com"><img src="https://github.com/user-attachments/assets/539df209-7c85-4fa5-84b4-fc22ab93fac7" width="80" height="30"></a>
<a href="https://solvecaptcha.com/support/faq#create-ticket"><img src="https://github.com/user-attachments/assets/be044db5-2e67-46c6-8c81-04b78bd99650" width="81" height="30"></a>

## License

The code in this repository is licensed under the MIT License. See the [LICENSE](./LICENSE) file for more details.

<!-- Shared links -->
[Maven Central]: https://search.maven.org/artifact/com.github.solvercaptcha/solvecaptcha-java
[Examples directory]: ./src/main/java/examples

[SolveCaptcha]: https://solvecaptcha.com/
[post options]: https://solvecaptcha.com/captcha-solver-api#normal_post
[list of supported languages]: https://solvecaptcha.com/solvecaptcha-api#language
[Java captcha solver]: https://solvecaptcha.com/captcha-solver/java-captcha-solver-bypass
