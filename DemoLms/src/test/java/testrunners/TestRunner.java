package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features"},
		glue = {"stepdefinitions"},
		plugin = {"pretty" ,"html:target/reports/cucumber.html"				
		}
		
		)

public class TestRunner {

}
