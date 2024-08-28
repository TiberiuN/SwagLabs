package Steps;

import Managers.DriverManager;
import Vars.LoginVars;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setup() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments(
//                "--disable-search-engine-choice-screen",
////                "enable-automation",
////                "--no-sandbox",
////                "--disable-infobars",
////                "--disable-dev-shm-usage",
////                "--incognito",
//                "--disable-browser-side-navigation");
//        WebDriver driver = new ChromeDriver(options);
//        driver.get(LoginVars.landingPage);


        driver = DriverManager.getDriver();
        driver.get(LoginVars.landingPage);
    }


//    @Before
//    public WebDriver setup() {
//        driver = new ChromeDriver();
//
//        driver.get(LoginVars.landingPage);
//        return driver;
//    }

    @After
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
//            driver = null;
        }
    }
}
