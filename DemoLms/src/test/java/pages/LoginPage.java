package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	private WebDriver driver;
	
	
	private By usernametxt = By.id("username");
	private By passwordtxt = By.id("password");
    private By loginButton = By.id("login");
   
    
    public LoginPage() {
    	
      	 this.driver = BaseClass.getDriver();
   	}

    public String getLoginPageTitle() {
		return BaseClass.getDriver().getTitle();
	}
    
    public void enterUserName(String username) {
    	BaseClass.getDriver().findElement(usernametxt).sendKeys(username);
	}
	
    public void enterPassword(String pwd) {
    	BaseClass.getDriver().findElement(passwordtxt).sendKeys(pwd);
	}
    
    public ManageProgram clickOnLogin() {    
    	BaseClass.getDriver().findElement(loginButton).click();
	return new ManageProgram();
    }	

}
