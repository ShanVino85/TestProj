package lmsHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {
	
	Properties prop;
	
	@Before(order = 0)
	public void DriverInti() {
		
		BaseClass.intialization();
			
	}

	@After(order =0)
	public void teardown() {
		WebDriver driver = null;
		driver.quit();
	}
}
