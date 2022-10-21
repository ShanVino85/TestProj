package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() 
	{
		
		//Read my Property;
		
		try {
			prop=new Properties();
			FileInputStream ip= new FileInputStream("C:\\Users\\shanj\\eclipse-workspace\\DemoLms\\src\\test\\java\\configs\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		
		}
		}
	
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void intialization() 
	{
	String browserName= prop.getProperty("browser");
	if( browserName.equals("chrome")) {
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\shanj\\eclipse-workspace\\DemoLms\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
	}
	else if( browserName.equals("firefox")) {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\shanj\\eclipse-workspace\\DemoLms\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		
	}
	else if( browserName.equals("Edge browser")) {
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\shanj\\eclipse-workspace\\DemoLms\\src\\test\\resources\\Drivers\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		driver =new  EdgeDriver();
		
	}
	
	driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	}
	 
	public static void closeBrowser()
	{
		driver.quit();
	}
	
	
}
