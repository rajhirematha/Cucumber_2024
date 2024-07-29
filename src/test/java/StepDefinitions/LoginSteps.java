package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {
        System.out.println("Inside step - user in the login page");
    }
    @When("User enters user name and password")
    public void user_enters_user_name_and_password() {
        System.out.println("Inside step - user user enters username and password");
    }
    @And("click on the login page")
    public void click_on_the_login_page() {
        System.out.println("Inside step - user click on login button");
    }
    @Then("User is navigated to home page")
    public void user_is_navigated_to_home_page() {
        System.out.println("Inside step - user iis on home page");
    }

}
