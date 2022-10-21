package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ManageProgram extends BaseClass{

private WebDriver driver;

public ManageProgram(){
	 PageFactory.initElements(driver,this);
	}


public ProgDtl addnewprog()
{
	By AddPrgButton = By.id("new");
	
	BaseClass.getDriver().findElement(AddPrgButton).click();
 return new ProgDtl();
}

}
