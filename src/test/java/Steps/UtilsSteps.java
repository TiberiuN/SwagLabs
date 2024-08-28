package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UtilsSteps {

    UtilsStepDefinitions utilsStepDefinitions = new UtilsStepDefinitions();

    @Given("The User clicks on css {string}")
    public void theUserClicksOnCss(String cssLocator) {
        utilsStepDefinitions.clickOnCssElement(cssLocator);
    }

    @Then("The User clicks {string} and {string}")
    public void theUserClicksAnd(String selector, String selectorType) {
        utilsStepDefinitions.clickOnElement(selector, selectorType);
    }

    @Then("The action is performed and the User can see the {string} from {string} and {string}")
    public void theActionIsPerformedAndTheUserCanSeeTheFromAnd(String message, String locator, String selectorType) {
        utilsStepDefinitions.assertMessage(message, locator, selectorType);
    }
}
