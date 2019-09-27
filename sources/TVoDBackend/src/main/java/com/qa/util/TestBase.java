package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	
	

	public TestBase() {
		try {
			prop = new Properties();
			String pathconfigfolder = Paths.get(".").normalize().toAbsolutePath().toString() + "\\src\\main\\java\\com\\qa\\config";
			Path propPath = Paths.get(pathconfigfolder, "config.properties");
			String propString = propPath.toAbsolutePath().toString();
			FileInputStream fis = new FileInputStream(propString);
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			Path chromeDriverPath = Paths.get("libs", "selenium-drivers", "chromedriver.74.0.3729.6.exe");
			System.setProperty("webdriver.chrome.driver", chromeDriverPath.toAbsolutePath().toString());
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			Path geckoDriverPath = Paths.get("libs", "geckodriver", "geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", geckoDriverPath.toAbsolutePath().toString());
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver(capabilities);
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}
	
	
}
