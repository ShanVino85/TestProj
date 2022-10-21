package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.BaseClass;

public class ProgDtl extends BaseClass {

public WebDriver driver =  BaseClass.getDriver();
	
	private By Pname = By.id("programName");
	private By Pdesc = By.id("programDescription");
	
	
    private By active = By.className("p-radiobutton-box p-highlight");
	private By inactive = By.className("p-radiobutton-box");
	private By savebtn = By.className("p-button-rounded p-button-success p-button p-component ng-star-inserted");
	
					
					
    public ProgDtl() {
    	driver =  BaseClass.getDriver();
    
	}
	
    
    public String getPDPageTitle() {
    	return driver.getTitle();
    }
    
	  public void AddProgName(String PName)
			{
		  
		  BaseClass.getDriver().findElement(Pname).sendKeys(PName);
		//	Name.sendKeys(PName);	
		}
	  
	  public void AddProgDesc(String PDesc)
			{
		  BaseClass.getDriver().findElement(Pdesc).sendKeys(PDesc);
		} 
			
	  public void ActiveStatus() {
		  
			BaseClass.getDriver().findElement(active).click();
	  }
		
	  public void InactiveStatus() {
		  
		driver.findElement(inactive).click();
	  }
	  
	  public void SaveProg() {
		  
		  BaseClass.getDriver().findElement(savebtn).click();
	  }
	  
	 
	

}
