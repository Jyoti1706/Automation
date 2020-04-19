package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
       System.out.println("user is on home page");
    }

    @When("^username and password entered$")
    public void username_and_password_entered() throws Throwable {
        System.out.println("username and password entered$");
    }

    @Then("^home page get populated$")
    public void home_page_get_populated() throws Throwable {
        System.out.println("home page get populated$");
    }

    @And("^login vutton is clicked$")
    public void login_vutton_is_clicked() throws Throwable {
        System.out.println("login vutton is clicked$");
    }

    @And("^welcome message is displayed$")
    public void welcome_message_is_displayed() throws Throwable {
        System.out.println("welcome message is displayed$");
    }

}