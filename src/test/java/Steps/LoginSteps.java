package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {

    UtilsStepDefinitions utilsStepDefinitions = new UtilsStepDefinitions();
    LoginStepDefinition loginStepDefinition = new LoginStepDefinition();

    @Then("The logout is performed and the window is closed")
    public void theLogoutIsPerformedAndTheWindowIsClosed(){
        loginStepDefinition.logout();
    }

    @Given("The User is on landing page")
    public void theUserIsOnLandingPage() {
        loginStepDefinition.loginWithCredentials("", "");
    }

    @Given("The User enters bad credentials {string} and {string}")
    public void theUserEntersBadCredentialsAnd(String username, String password) {
        loginStepDefinition.loginWithCredentials(username, password);
    }

    @Then("The login error banner is displayed")
    public void theLoginErrorBannerIsDisplayed() {
        utilsStepDefinitions.waitForElementClickable("error-button", "class");
    }
}
