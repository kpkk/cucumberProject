package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Definitions {
	@Given("user on the facebook login page")
	public void navigate_to_login_page() {
		System.out.println();
	}
	@When("user on the facebook login page")
	public void enter_username_password() {
		
	}
	@And(" Click on sigin button")
	public void click_Submit_button() {
		
	}
	@Then("user should be navigated to FaceBook home page")
	public void verify_home_Page_Title() {
		
	}
	

}
