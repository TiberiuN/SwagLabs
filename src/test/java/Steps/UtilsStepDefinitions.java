package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class UtilsStepDefinitions {

    Hooks hooks = new Hooks();
     WebDriver driver = hooks.driver;

    public void clickOnCssElement(String locator) {
        this.driver.findElement(By.cssSelector(locator)).click();
    }

    public void clickOnElement(String locator, String locatorType) {
        switch (locatorType) {
            case "id":
                driver.findElement(By.id(locator)).click();
                break;
            case "css":
                driver.findElement(By.cssSelector(locator)).click();
                break;
            case "class":
                driver.findElement(By.className(locator)).click();
                break;
            case "xpath":
                driver.findElement(By.xpath(locator)).click();
                break;
        }
    }

    public void driverClose() {
        this.driver.close();
    }

    public void assertMessage(String message, String locator, String locatorType) {
        String actualString = "";
        switch (locatorType) {
            case "css":
                actualString = driver.findElement(By.cssSelector(locator)).getText();
                break;
            case "class":
                actualString = driver.findElement(By.className(locator)).getText();
                break;
            case "xpath":
                actualString = driver.findElement(By.xpath(locator)).getText();
                break;
            case "id":
                actualString = driver.findElement(By.id(locator)).getText();
                break;
        }
        assertTrue(actualString.contains(message));
    }
}
