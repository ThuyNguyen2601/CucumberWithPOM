package com.qa.runner;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/java/com/qa/features"
,glue= {"stepDefinitions"}
)

public class TestRunner {

}
