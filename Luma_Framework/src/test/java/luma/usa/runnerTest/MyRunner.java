package luma.usa.runnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin=  {"pretty","json:target/cucumber.json"},
		features= ".//Features/",
		glue= {"luma.usa.stepdefination", "luma.usa.hooks"},
		monochrome = true,
		dryRun = false,
		tags = "@Sanity"
		
	)

public class MyRunner extends AbstractTestNGCucumberTests {

}
