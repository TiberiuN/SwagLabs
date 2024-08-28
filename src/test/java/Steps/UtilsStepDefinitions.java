package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    public void waitForElementClickable(String locator, String locatorType){
        WebElement element;
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);

        switch (locatorType) {
            case "id":
                element = wait.until(
                        ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
                element.click();
                break;
            case "css":
                element = wait.until(
                        ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
                element.click();
                break;
            case "class":
                element = wait.until(
                        ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
                element.click();
                break;
            case "xpath":
                element = wait.until(
                        ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
                element.click();
                break;
        }

    }
}
