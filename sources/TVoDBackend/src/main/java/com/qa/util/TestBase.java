package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static Actions action;

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
	
	public void getPageTitle() {
		driver.getTitle();
	}
	
	public void back() {
		driver.navigate().back();
	}
	
	public void forward() {
		driver.navigate().forward();
	}
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void cancelAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public void sendKeyToAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	
	public void sendKeyToElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public int countElementNumber(String locator) {
		List <WebElement> elements = driver.findElements(By.xpath(locator));
		return elements.size();
	}
	
	public void clickToElement(WebElement element) {
		element.click();
	}
	
	public boolean isControlDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public boolean isControlSelected(WebElement element) {
		return element.isSelected();
	}
	
	public boolean isControlEnabled(WebElement element) {
		return element.isEnabled();
	}
	
	public String getTextElement(WebElement element) {
		return element.getText();
	}
	
	public void doubleClickToElement(WebElement element) {
		action = new Actions(driver);
		action.doubleClick(element).perform();
	}
	
	public void moveToElement(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	public void rightClick(WebElement element) {
		action = new Actions(driver);
		action.contextClick(element).perform();
	}
	
	public void sendKeyboardToElement(WebElement element, Keys key) {
		action = new Actions(driver);
		action.sendKeys(element, key).perform();
	}
	
	

}
