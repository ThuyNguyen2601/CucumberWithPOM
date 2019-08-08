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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static Actions action;
	public static Select select;
	public static WebElement element;
	public static WebDriverWait wait;
	public static Alert alert;

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
	
	public int randomData() {
		Random random = new Random();
		return random.nextInt(9999);
	}

	public void tearDown() {
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

	public void acceptAlert() throws Throwable {
		 try{
			 //WebDriverWait wait = new WebDriverWait(driver, 60);
			 //wait.ignoring(NoAlertPresentException.class).until(ExpectedConditions.alertIsPresent());
             Alert alert = driver.switchTo().alert();
             System.out.println("Alert box text" + alert.getText());
             Thread.sleep(5000);
             alert.accept();

		 } catch (NoAlertPresentException noAlert) {
			 noAlert.getMessage();
		 }
	}

	public void cancelAlert() {
		alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void waitForAlertPresent() throws Throwable {
		driver.switchTo().alert().wait();
	}

	public void sendKeyToAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	public void sendKeyToElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public void clearToElement(WebElement element) {
		element.clear();
	}

	public int countElementNumber(String locator) {
		List<WebElement> elements = driver.findElements(By.xpath(locator));
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

	// javascriptExecutor
	public Object executeForBrowser(String javaScript) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(javaScript);
	}

	public boolean verifyTextInInterText(String textExpected) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String actualText = (String) js
				.executeScript("return document.documentElement.innerText.match('" + textExpected + "')[0]");
		return actualText.equals(textExpected);
	}

	public Object scrollToBottomPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public Object scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void highlighElemtn(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String originalStyle = element.getAttribute("style");
		js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element, "style",
				"border:5px solid red; border-style:dashed;");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", element, "style", originalStyle);
	}

	public Object removeAtributeOfElement(WebElement element, String attributeRemove) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("arguments[0].removeAttribute('" + attributeRemove + "');", element);
	}

	// window
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
		// enter file path onto the file-selection input field
		uploadElement.sendKeys(fileUploadPathString);
		Thread.sleep(5000);
		// check the "I accept the terms of service" checkbox
		driver.findElement(By.id("terms")).click();

		// click the upload button
		driver.findElement(By.name("send")).click();
		Thread.sleep(10000);
	}
	
	public void clickToElementByJavaScript(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public boolean compareContainText(String text, String subText) {
		return text.contains(subText);
	}
	
	public void HandleJQueryDateTimePicker(String day, By locator)
			throws InterruptedException {
		wait = new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By
				//.id("ui-datepicker-div")));
		WebElement table = driver.findElement(locator);
		System.out.println("JQuery Calendar Dates");

		List<WebElement> tableRows = table.findElements(By.xpath("//tr"));
		for (WebElement row : tableRows) {
			List<WebElement> cells = row.findElements(By.xpath("td"));

			for (WebElement cell : cells) {
				if (cell.getText().equals(day)) {
					driver.findElement(By.linkText(day)).click();
				}
			}
		}

		// Switch back to the default screen again and scroll up by using
		// the negative y-coordinates.
		driver.switchTo().defaultContent();
		((JavascriptExecutor) driver).executeScript("scroll(0, -250);");

		// Intentional pause for 2 seconds.
		Thread.sleep(2000);
	}
	public void selectValueInDateTiemPicker(String date) throws Throwable {
		//button to open the calendar
		WebElement selectDate = driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-calendar']"));
		selectDate.click();
		
		//button to move next in calendar
		WebElement nextLink = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'»')]"));
		
		//button to click center of calendar header
		WebElement midLink = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
		
		//button to click previous in calendar
		WebElement previousLink = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='prev'][contains(text(),'«')]"));
		
		//Split the date time to get only the date part
		String date_dd_MM_yyyy[] = (date.split(" ")[0]).split("/");
		
		//get the year difference between current year and year to set in calander
		int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);
		
		midLink.click();
		if(yearDiff != 0) {
			//if you have to move next year
			if(yearDiff > 0) {
				for(int i = 0; i < yearDiff; i++) {
					System.out.println("Year Diff->"+i);
					nextLink.click();
				}
			}
			
			//if you have to move previous year
			else if(yearDiff < 0) {
				for(int i = 0; i < (yearDiff*(-1)); i++) {
					System.out.println("Year Diff->"+i);
					previousLink.click();
				}
			}
		}
		
		Thread.sleep(1000);
		
		//Get all months from calendar to select correct one
		List<WebElement> listAllMonthToBook = driver.findElements(By.xpath("//div[@class='datepicker-months']//span"));
		listAllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1]) - 1).click();
		
		Thread.sleep(1000);
		
		//get all dates from calendar to select correct one
		List<WebElement> listAllDateToBook = driver.findElements(By.xpath("//div[@class='datepicker-days']//td[@class = 'day']"));
		listAllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0]) - 1).click();
			
	}
	
	public void searchByName(List<WebElement> elements, WebElement nameCriteria, String value) throws Throwable {
		sendKeyToElement(nameCriteria, value);
		sendKeyboardToElement(nameCriteria, Keys.ENTER);
		Thread.sleep(3000);
		for (int i = 1; i < elements.size() + 1; i++) {
			String resultText = driver.findElement(By.xpath("//tbody//tr[" + i + "]//td[1]")).getText();
			if (compareContainText(resultText, value)) {
				System.out.print("The result is true\n");
			} else {
				System.out.print("No results found!\n");
			}
		}
	}
	
	

}
