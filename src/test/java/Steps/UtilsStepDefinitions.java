package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class UtilsStepDefinitions {
    static WebDriver driver = LoginStepDefinition.driver;

    public static void waitForElementVisibleByCss(String locator) throws InterruptedException {
        for (int i = 0; i <= 20; i++) {
            TimeUnit.SECONDS.sleep(1);
            if (driver.findElement(By.cssSelector(locator)).isDisplayed()) {
                break;
            }
        }
    }
}
