package Steps;

import Vars.CheckoutVars;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepDefinitions
{
    Hooks hooks = new Hooks();
    WebDriver driver = hooks.driver;

    public void fillingCheckoutDetails(){
        driver.findElement(By.cssSelector(CheckoutVars.firstNameCheckoutField)).sendKeys(CheckoutVars.checkoutUsername);
        driver.findElement(By.cssSelector(CheckoutVars.lastNameCheckoutField)).sendKeys(CheckoutVars.checkoutLastname);
        driver.findElement(By.cssSelector(CheckoutVars.zipcodeCheckoutField)).sendKeys(CheckoutVars.checkoutZipcode);
    }
}
