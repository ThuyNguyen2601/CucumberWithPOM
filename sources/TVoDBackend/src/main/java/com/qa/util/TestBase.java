package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static Actions action;
	public static Select select;

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
	
	public static void tearDown() {
		driver.close();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
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
	
	public void dragAndDrop(WebElement sourceElement, WebElement destinationElement) {
		action = new Actions(driver);
		action.dragAndDrop(sourceElement, destinationElement).build().perform();
	}
	
	
	public void sendKeyboardToElement(WebElement element, Keys key) {
		action = new Actions(driver);
		action.sendKeys(element, key).perform();
	}
	
	public void selectItemHtmlDropdown(WebElement element, String itemText) {
		select = new Select(element);
		select.selectByVisibleText(itemText);
	}
	
	public String getSelectedItemInHtmlDropdown(WebElement element, String itemText) {
		select = new Select(element);
		select.selectByVisibleText(itemText);
		WebElement option = select.getFirstSelectedOption();
		return option.getText();
	}
	
	public void checkTheCheckbox(WebElement element) {
		element.click();
	}
	
	//javascriptExecutor
		public Object executeForBrowser(WebDriver driver, String javaScript) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript(javaScript);
		}
		
		public boolean verifyTextInInterText(String textExpected) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String actualText = (String)js.executeScript("return document.documentElement.innerText.match('"+textExpected+"')[0]");
			return actualText.equals(textExpected);
		}
		
		public Object scrollToBottomPage(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}
		
		public Object scrollToElement(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("argument[0].scrollIntoView(true);", element);
		}
		
		public void highlighElemtn(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String originalStyle = element.getAttribute("style");
			js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element, "style", "border:5px solid red; border-style:dashed;");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", element, "style", originalStyle);
		}
		
		public Object removeAtributeOfElement(WebElement element, String attributeRemove) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].removeAttribute('" + attributeRemove + "');", element);
		}
		
		//window
		public void switchToWindowByID(String parent) {
			Set<String> allwindowns = driver.getWindowHandles();
			for (String runWindown : allwindowns) {
				if (!runWindown.equals(parent)) {
					driver.switchTo().window(runWindown);
					break;
				}
			}
		}
		
		public void switchToWindownByTitle(String title) {
			Set<String> allWindown = driver.getWindowHandles();
			for (String runWindown : allWindown) {
				driver.switchTo().window(runWindown);
				String curentWin = driver.getTitle();
				if (curentWin.equals(title)) {
					break;
				}
			}
		}
		
		public boolean closeAllWindownWithoutParent(String ParentID) {
			Set<String> allWindown = driver.getWindowHandles();
			for (String runWindown : allWindown) {
				if (!runWindown.equals(ParentID)) {
					driver.switchTo().window(runWindown);
					driver.close();
				}
			}
			driver.switchTo().window(ParentID);
			if (driver.getWindowHandles().size() == 1) {
				return true;
			} else {
				return false;
			}
		}
		
		public void switchToIframe(WebElement element) {
			driver.switchTo().frame(element);
		}
		
		public void uploadFile(WebElement uploadElement) throws InterruptedException {
			Path fileUpload = Paths.get("src", "tem/selenium/core", "DemoWebAlert.html");
			String fileUploadPathString = fileUpload.toAbsolutePath().toString();
			//enter file path onto the file-selection  input field
			uploadElement.sendKeys(fileUploadPathString);
			Thread.sleep(5000);
			//check the "I accept the terms of service" checkbox
			driver.findElement(By.id("terms")).click();
			
			//click the upload button
			driver.findElement(By.name("send")).click();
			Thread.sleep(10000);
			
		}
		
		public boolean compareContainText(String text, String subText) {
			return text.contains(subText);
		}
	
	

}
