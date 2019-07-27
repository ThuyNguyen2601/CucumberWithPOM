package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			String pathconfigfolder = Paths.get(".").normalize().toAbsolutePath().toString()
					+ "\\src\\main\\java\\com\\qa\\config";
			Path propPath = Paths.get(pathconfigfolder, "config.properties");
			String propString = propPath.toAbsolutePath().toString();
			FileInputStream fis = new FileInputStream(propString);
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			Path chromeDriverPath = Paths.get("libs", "chromedriver", "chromedriver.exe");
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
