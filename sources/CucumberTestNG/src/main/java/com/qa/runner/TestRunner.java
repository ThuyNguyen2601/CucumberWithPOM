package com.qa.runner;

import org.testng.annotations.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/CucumberTestNG/src/main/java/com/qa/features",
				glue = { "/CucumberTestNG/src/main/java/com/qa/stepDefinitions"}, 
				format = { "pretty","html:target/cucumber-reports/cucumber-pretty", 
						//"json:target/cucumber-reports/CucumberTestReport.json",
						"rerun:target/cucumber-reports/re-run.txt"},
				monochrome = true,
				strict = true,
				dryRun = true)
public class TestRunner {

}
