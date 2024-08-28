package Steps;

import Vars.CheckoutVars;
import Vars.DashboardVars;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {

    UtilsStepDefinitions utilsStepDefinitions = new UtilsStepDefinitions();
    CheckoutStepDefinitions checkoutStepDefinitions = new CheckoutStepDefinitions();

    @Then("The action is performed and the User can see the {string} in the Page")
    public void theActionIsPerformedAndTheUserCanSeeTheInThePage(String message) {
        utilsStepDefinitions.assertMessage(message, CheckoutVars.backPackTitle, "xpath");
    }

    @And("The User clicks on add to cart button")
    public void theUserClicksOnAddToCartButton() {
        utilsStepDefinitions.waitForElementClickable(CheckoutVars.addToCartButton, "xpath");
    }

    @Then("The User clicks on Cart button")
    public void theUserClicksOnCartButton() {
        utilsStepDefinitions.waitForElementClickable(DashboardVars.cartButton, "xpath");
    }

    @And("The User clicks on remove button")
    public void theUserClicksOnRemoveButton() {
        utilsStepDefinitions.waitForElementClickable(CheckoutVars.removeShirtCartButton, "id");
    }

    @Then("The User clicks on Continue Shopping button")
    public void theUserClicksOnContinueShoppingButton() {
        utilsStepDefinitions.waitForElementClickable(DashboardVars.continueShopping, "css");
    }

    @Given("The User clicks on TShirt add to cart button")
    public void theUserClicksOnTShirtAddToCartButton() {
        utilsStepDefinitions.waitForElementClickable(CheckoutVars.addTShirtToCartButton, "css");
    }

    @And("The User clicks on Checkout button")
    public void theUserClicksOnCheckoutButton() {
        utilsStepDefinitions.waitForElementClickable(CheckoutVars.checkoutButton, "css");
    }

    @When("The User fills in the required details")
    public void theUserFillsInTheRequiredDetails() {
        checkoutStepDefinitions.fillingCheckoutDetails();
    }

    @Then("The User can see that {string}> is in the final checkout")
    public void theUserCanSeeThatIsInTheFinalCheckout(String message) {
        utilsStepDefinitions.waitForElementVisible(CheckoutVars.tshirtCheckout, "xpath");
        utilsStepDefinitions.assertMessage(message, CheckoutVars.tshirtCheckout, "xpath");
    }

    @And("The User clicks on continue Button")
    public void theUserClicksOnContinueButton() {
        utilsStepDefinitions.waitForElementClickable(CheckoutVars.continueButton, "css");
    }

    @And("The User clicks on Finish Button")
    public void theUserClicksOnFinishButton() {
        utilsStepDefinitions.waitForElementClickable(CheckoutVars.finishButton, "css");
    }

    @And("The User can see the {string} message")
    public void theUserCanSeeTheMessage(String message) {
        utilsStepDefinitions.assertMessage(message, CheckoutVars.thankYouNote, "xpath");
    }

    @And("The User clicks on Back to Products button")
    public void theUserClicksOnBackToProductsButton() {
        utilsStepDefinitions.waitForElementClickable(CheckoutVars.backToProductsButton, "css");
    }
}
