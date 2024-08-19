package Steps;

import Vars.LoginVars;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinition {

    static WebDriver driver;

    public static WebDriver chromeDriverInitialization() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(
                "start-maximized",
                "--disable-search-engine-choice-screen",
                "enable-automation",
                "--no-sandbox",
                "--disable-infobars",
                "--disable-dev-shm-usage",
                "--disable-browser-side-navigation",
                "--disable-browser-side-navigation");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static void landingPageInitialization() {
        chromeDriverInitialization();
        driver.get(LoginVars.landingPage);
    }

    public static void loginWithCredentials(String username, String password){
        if(username.isEmpty()||username.isBlank()) {
            driver.findElement(By.cssSelector(LoginVars.usernameField)).sendKeys(LoginVars.username);
        }
        else{
            driver.findElement(By.cssSelector(LoginVars.usernameField)).sendKeys(username);
        }

        if(password.isBlank()||password.isEmpty()) {
            driver.findElement(By.cssSelector(LoginVars.passwordField)).sendKeys(LoginVars.password);
        }
        else{
            driver.findElement(By.cssSelector(LoginVars.passwordField)).sendKeys(password);
        }
        driver.findElement(By.cssSelector(LoginVars.loginButton)).click();
    }
}
