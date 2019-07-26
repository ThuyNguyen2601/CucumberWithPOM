package com.qa.runner;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "D:\\ThuyNT\\Automation\\test\\CucumberWithPOM\\sources\\CucumberMaven\\src\\main\\java\\com\\qa\\features"
,glue= {"D:\\ThuyNT\\Automation\\test\\CucumberWithPOM\\sources\\CucumberMaven\\src\\main\\java\\com\\qa\\stepDefinitions"}
)

public class TestRunner {

}
