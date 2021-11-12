package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

// where is feature files and where are step definition files

@CucumberOptions(
		features = {"C:\\Users\\sonal\\eclipse-workspace\\10NovBDDCucumberEdureka\\src\\test\\java\\features"},
		glue = {"steps"},
		
		plugin = {"pretty",
			"html:results/html",
				"json:results/json/results.json",
				"junit:results/junit/cucumber.xml"},
		
		dryRun= false,
		tags = "@ebay",
		monochrome= true
		
		
		)


public class TestRunner {

}
