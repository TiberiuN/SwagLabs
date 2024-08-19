package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
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

    public static void clickOnCssElement(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public static void clickOnElement(String locator, String locatorType) {
        switch (locatorType) {
            case "css":
                driver.findElement(By.cssSelector(locator)).click();
                break;
            case "class":
                driver.findElement(By.className(locator)).click();
                break;
            case "xpath":
                driver.findElement(By.xpath(locator)).click();
                break;
            case "id":
                driver.findElement(By.id(locator)).click();
                break;
        }


    }

//    public static void clickOnElements(String elementLocator, String elementLocatorType, int indexOfElement){
//        switch (elementLocatorType) {
//            case "css": driver.findElement(By.cssSelector(elementLocator)).click();
//                break;
//            case "class": List<WebElement> listOfElements = driver.findElements(By.className(elementLocator));
//                driver.get(listOfElements(0)
//                break;
//            case "xpath": driver.findElement(By.xpath(elementLocator)).click();
//                break;
//        }
//}
}
