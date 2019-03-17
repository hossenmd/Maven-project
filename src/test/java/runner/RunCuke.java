package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//Copy paste this code in your RunCuke Class to execute the Cucumber Test

@CucumberOptions(features={"src/test/resources/features"}, glue="steps", tags={"@Search-Cars"})
public class RunCuke extends AbstractTestNGCucumberTests{
	
}
