package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		features = "src\\test\\resources\\Features\\Customer.feature",
		features = {"src\\test\\resources\\Features\\Customer.feature","src\\test\\resources\\Features\\login.feature"},
		glue = {"Stepdefination"},
//				tags = "(@sanity)",
				tags = "(@sanity  or  @regression )",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
				"junit:src/test/java/reports/report.xml",
				"json:src/test/java/reports/report.json",
				"html:src/test/java/reports/report.html"
				},
		
				publish = true
		)
public class Runner 
{
}
 //testupdate