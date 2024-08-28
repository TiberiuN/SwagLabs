package Managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public WebDriver driver;

    public static WebDriver getDriver() {
        /*if(driver == null){
            ChromeOptions options = new ChromeOptions();
            options.addArguments(
                    "start-maximized",
                    "--disable-search-engine-choice-screen",
                    "enable-automation",
                    "--no-sandbox",
                    "--disable-infobars",
                    "--disable-dev-shm-usage",
                    "--incognito",
                    "--disable-browser-side-navigation");
            driver = new ChromeDriver(options);
        }

        return driver;*/

        ChromeOptions options = new ChromeOptions();
        options.addArguments(
                "--disable-search-engine-choice-screen",
//                "enable-automation",
//                "--no-sandbox",
//                "--disable-infobars",
//                "--disable-dev-shm-usage",
//                "--incognito",
                "--disable-browser-side-navigation");
        WebDriver driver = new ChromeDriver(options);
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        return driver;
    }
}
