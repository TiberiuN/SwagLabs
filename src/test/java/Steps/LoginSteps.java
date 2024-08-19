package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {


    @io.cucumber.java.en.Given("The URL is set and the page is accessed")
    public void theURLIsSetAndThePageIsAccessed() {
        LoginStepDefinition.landingPageInitialization();
    }

    @Then("The login is performed using {string} and {string}")
    public void theLoginIsPerformedUsingAnd(String username, String password) {
        LoginStepDefinition.loginWithCredentials(username, password);
    }

    @Then("The logout is performed and the window is closed")
    public void theLogoutIsPerformedAndTheWindowIsClosed() {
    }
}
