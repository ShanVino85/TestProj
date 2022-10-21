package stepdefinitions;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProgDtl;

public class ProgDtlStep extends BaseClass{
	
	ProgDtl pd = new ProgDtl();
	
	@Given("User is in Program Details Page")
	public void user_is_in_name_field_in_program_details_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Enter the program Name {string}")
	public void enter_the_program_name(String pname) {
	    // Write code here that turns the phrase above into concrete actions
	    pd.AddProgName(pname);
	}

	@When("Enter the program Description {string}")
	public void enter_the_program_description(String pdesc) {
	    // Write code here that turns the phrase above into concrete actions
	    pd.AddProgDesc(pdesc);
	}

	@When("Click the Active Radio Button")
	public void click_the_active_radio_button() {
	    // Write code here that turns the phrase above into concrete actions
	    pd.ActiveStatus();
	}

	@When("Press Save Button")
	public void press_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    pd.SaveProg();
	}

	@Then("Program will be added and message will be displayed")
	public void program_will_be_added_and_message_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    pd.getPDPageTitle();
	}


}
