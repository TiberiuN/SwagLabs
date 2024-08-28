package Steps;

import Vars.DashboardVars;
import Vars.LoginVars;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginStepDefinition {

    Hooks hooks = new Hooks();
    WebDriver driver = hooks.driver;

//    private WebDriver driver;
//
//    public LoginStepDefinition(WebDriver driver){
//
//        this.driver = driver;
//    }


    public void loginWithCredentials(String username, String password) {
        if (username.isEmpty() || username.isBlank()) {
            driver.findElement(By.cssSelector(LoginVars.usernameField)).sendKeys(LoginVars.username);
        } else {
            driver.findElement(By.cssSelector(LoginVars.usernameField)).sendKeys(username);
        }

        if (password.isBlank() || password.isEmpty()) {
            driver.findElement(By.cssSelector(LoginVars.passwordField)).sendKeys(LoginVars.password);
        } else {
            driver.findElement(By.cssSelector(LoginVars.passwordField)).sendKeys(password);
        }
        driver.findElement(By.cssSelector(LoginVars.loginButton)).click();
//    WebElement usernameField = driver.findElement(By.cssSelector("#user-name"));
//    usernameField.sendKeys("test");
    }

    public void logout() throws InterruptedException {
        Duration duration = Duration.ofSeconds(10);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        WebElement hamburgerButton = driver.until(ExpectedConditions.elementToBeClickable(By.cssSelector(DashboardVars.hamburgerButton)));
//        hamburgerButton.click();

        driver.findElement(By.cssSelector(DashboardVars.hamburgerButton)).click();

//        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(LoginVars.logoutButton)));
//        logoutButton.click();
        driver.findElement(By.cssSelector(LoginVars.logoutButton)).click();
        TimeUnit.SECONDS.sleep(2);
    }
}
