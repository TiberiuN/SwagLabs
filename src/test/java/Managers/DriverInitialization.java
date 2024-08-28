package Managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;

public class DriverInitialization {
    public static void DriverInit(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments(
                "--disable-search-engine-choice-screen",
//                "enable-automation",
//                "--no-sandbox",
//                "--disable-infobars",
//                "--disable-dev-shm-usage",
//                "--incognito",
                "--disable-browser-side-navigation");

        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver(options);
    }

    public void closeDriver(Driver driver){
        DriverInitialization.DriverInit();
//        driver.close();
    }

}
