package Steps;

import Vars.DashboardVars;
import Vars.LoginVars;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinition {

    UtilsStepDefinitions utilsStepDefinitions = new UtilsStepDefinitions();

    Hooks hooks = new Hooks();
    WebDriver driver = hooks.driver;

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
    }

    public void logout() {
        utilsStepDefinitions.waitForElementClickable(DashboardVars.hamburgerButton, "css");
        utilsStepDefinitions.waitForElementClickable(LoginVars.logoutButton, "css");
    }
}
