package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WrongLogin {
    @Given("I Open browser")
    public void iOpenBrowser() {
    }

    @And("Located on saucedemo website")
    public void locatedOnSaucedemoWebsite() {
    }

    @When("I login with wrong username and password")
    public void iLoginWithWrongUsernameAndPassword() {
    }

    @Then("stay on the login page and get a login failure notification")
    public void stayOnTheLoginPageAndGetALoginFailureNotification() {
    }
}
