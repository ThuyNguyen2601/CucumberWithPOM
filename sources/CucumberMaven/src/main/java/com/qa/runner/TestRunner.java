package com.qa.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.CucumberFeatureWrapper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/java/com/qa/features",
glue= {"com.qa.stepDefinitions"}
,monochrome = true
,strict = true
,dryRun = false 
)

public class TestRunner {
	
}
