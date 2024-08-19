package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UtilsSteps {

//    @Given("The User clicks on {string} and {string} type")
//    public void theUserClicksOnOfType(String selector, String selectorType) {
//        UtilsStepDefinitions.clickOnElement(selector, selectorType);
//    }

    @Given("The User clicks on css {string}")
    public void theUserClicksOnCss(String cssLocator) {
        UtilsStepDefinitions.clickOnCssElement(cssLocator);
    }

    @Then("The User clicks {string} and {string}")
    public void theUserClicksAnd(String selector, String selectorType) {
        UtilsStepDefinitions.clickOnElement(selector, selectorType);
    }
}
