package Steps;

import Managers.DriverManager;
import Vars.LoginVars;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setup() {
        driver = DriverManager.getDriver();
        driver.get(LoginVars.landingPage);
    }

    @After
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
