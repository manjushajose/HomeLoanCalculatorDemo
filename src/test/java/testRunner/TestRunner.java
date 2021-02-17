package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/Features",
		glue= {"stepdefinitions"},
		//tags = {"RegressionTest"},
		dryRun=false,
		monochrome=true
		)
public class TestRunner {

}

