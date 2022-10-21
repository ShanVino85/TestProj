package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;


public class LoginPageStep extends BaseClass {
	
	private static String title;
	public static WebDriver driver;
		
	LoginPage lp =new LoginPage();
	BaseClass bc = new BaseClass();
	
/*	public  LoginPageStep()
	{
		super();
	}*/
	
	@Given("User is in the LMS Login Page")
	public void user_is_in_the_lms_login_page() throws InterruptedException {
	
	bc.intialization();
	driver = bc.getDriver();
	driver.get("https://lms-frontend-phase2.herokuapp.com");
		
		Thread.sleep(1000);
		title = lp.getLoginPageTitle();
		System.out.println("Login Page title is == "+ title);		
	}

	@When("User enter the username {string}")
	public void user_enter_the_username(String username) throws InterruptedException {
		Thread.sleep(1000);
	    lp.enterUserName(username);
	   
	}

	@When("User enter the password {string}")
	public void user_enter_the_password(String pwd) throws InterruptedException {
		Thread.sleep(1000);
	    lp.enterPassword(pwd);
	   
	}

	@When("User click the Login Button")
	public void user_click_the_login_button() throws InterruptedException {
		Thread.sleep(1000);
	   lp.clickOnLogin();
	   
	}

	@Then("User get the title page")
	public void user_get_the_title_page() throws InterruptedException {
		Thread.sleep(1000);
		title = lp.getLoginPageTitle();
		System.out.println("User Enter in == "+ title);	
	   
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title1) throws InterruptedException {
		Thread.sleep(1000);
			Assert.assertTrue(title.contains(title1));
	}

}
