package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {

    LoginStepDefinition loginStepDefinition = new LoginStepDefinition();

    @Then("The logout is performed and the window is closed")
    public void theLogoutIsPerformedAndTheWindowIsClosed() throws InterruptedException {
        loginStepDefinition.logout();
    }

    @Given("The User is on landing page")
    public void theUserIsOnLandingPage() {
        loginStepDefinition.loginWithCredentials("", "");
    }
}
