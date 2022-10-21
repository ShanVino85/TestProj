package stepdefinitions;

import org.testng.annotations.BeforeMethod;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ManageProgram;

public class ManageProgramStep extends BaseClass{
	
	ManageProgram mp = new ManageProgram();
	
		

	@Given("User in Manage Progrem Page")
	public void user_in_manage_progrem_page() {
	    
	 mp = new ManageProgram();
	    
	}

	@When("User Click the Add Program Buttom")
	public void user_click_the_add_program_buttom() {
	   	 mp.addnewprog();
	}

	@Then("Program Details Page Opened")
	public void program_details_page_opened() {
	//	 System.out.println("User on Page " + pd.getPDPageTitle() );
	    
	}


}
