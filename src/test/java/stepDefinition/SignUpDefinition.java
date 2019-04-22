package stepDefinition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpDefinition {
	
	
	@Given("^: i on the sign up page$")
	public void i_on_the_sign_up_page() throws Throwable {
	   System.out.println("user has sucessfully navigated to the home page");
	     
	}

	@When("^: entered the following details$")
	public void entered_the_following_details(DataTable dt) throws Throwable {
		
		List<List<String>> raw = dt.raw();
		System.out.println(raw.get(0).get(0));
		System.out.println(raw.get(1).get(1));
	    
	     
	}

	@When("^: click on signup button$")
	public void click_on_signup_button() throws Throwable {
	    System.out.println("user has succesfully clicked on the login button");
	     
	}

	@Then("^: i must have been landed on to the home page$")
	public void i_must_have_been_landed_on_to_the_home_page() throws Throwable {
	    System.out.println("user is on home page now");
	     
	}


}
