package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {
	
	@Given("User is on landing page")
	public void user_is_on_landing_page() {
	    System.out.println("landng page");
	}

	@When("User login with emailid {string} and password {string}")
	public void user_login_with_emailid_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string);
	    System.out.println(string2);
	    
	}


	@Then("Home Page is populated")
	public void home_page_is_populated() {
		  System.out.println("Home");
	}


    @Then("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }


}
