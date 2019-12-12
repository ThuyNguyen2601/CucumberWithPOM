package com.qa.util;

import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.Assert;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AbstractTest extends TestBase {
	public static Actions action;
	public static Select select;
	public static WebElement element;
	public static WebDriverWait wait;
	public static Alert alert;

	protected final Log log;

	// Contructor
	protected AbstractTest() {
		log = LogFactory.getLog(getClass());
	}

	private boolean checkPassed(boolean condition) {
		boolean pass = true;
		try {
			if (condition == true)
				log.info("===PASSED==");
			else
				log.info("===FAILED==");
			AssertJUnit.assertTrue(condition);
		} catch (Throwable e) {
			pass = false;

			// Add lỗi vào ReportNG
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyTrue(boolean condition) {
		return checkPassed(condition);
	}

	private boolean checkFailed(boolean condition) {
		boolean pass = true;
		try {
			if (condition == false)
				log.info("===PASSED===");
			else
				log.info("===FAILED===");
			AssertJUnit.assertFalse(condition);
		} catch (Throwable e) {
			pass = false;
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyFalse(boolean condition) {
		return checkFailed(condition);
	}

	private boolean checkEquals(Object actual, Object expected) {
		boolean pass = true;
		boolean status;
		try {
			if (actual instanceof String && expected instanceof String) {
				actual = actual.toString().trim();
				log.info("Actual = " + actual);
				expected = expected.toString().trim();
				log.info("Expected = " + expected);
				status = (actual.equals(expected));
			} else {
				status = (actual == expected);
			}

			log.info("Compare value = " + status);
			if (status) {
				log.info("===PASSED===");
			} else {
				log.info("===FAILED===");
			}
			Assert.assertEquals(actual, expected, "Value is not matching!");
		} catch (Throwable e) {
			pass = false;
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyEquals(Object actual, Object expected) {
		return checkEquals(actual, expected);
	}

	public int randomData() {
		Random random = new Random();
		return random.nextInt(99999);
	}

	public void clickToElementByJavaScript(WebElement element1) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		waitForElementClickalbe(element1);
		executor.executeScript("arguments[0].click();", element1);
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
		waitForAlertPresence();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert box text " + alert.getText());
		alert.accept();
	}

	public void cancelAlert() {
		waitForAlertPresence();
		alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void sendKeyToAlert(String value) {
		waitForAlertPresence();
		driver.switchTo().alert().sendKeys(value);
	}

	public void sendKeyToElement(WebElement element1, String value) {
		waitForElementVisible(element1);
		element1.sendKeys(value);
	}

	public void clearToElement(WebElement element1) {
		waitForElementVisible(element1);
		element1.clear();
	}

	public int countElementNumber(String locator) {
		List<WebElement> elements = driver.findElements(By.xpath(locator));
		return elements.size();
	}

	public void clickToElement(WebElement element1) {
		waitForElementClickalbe(element1);
		element1.click();
	}

	public void clickToElementByAction(WebElement element1) {
		action = new Actions(driver);
		waitForElementVisible(element1);
		waitForElementClickalbe(element1);
		action.moveToElement(element1).click().perform();
	}

	public boolean isControlDisplayed(WebElement element1) {
		return element1.isDisplayed();
	}

	public boolean isControlSelected(WebElement element1) {
		return element1.isSelected();
	}

	public boolean isControlEnabled(WebElement element1) {
		return element1.isEnabled();
	}

	public String getTextElement(WebElement element1) {
		waitForElementVisible(element1);
		return element1.getText();
	}

	public void doubleClickToElement(WebElement element1) {
		action = new Actions(driver);
		waitForElementVisible(element1);
		action.doubleClick(element1).perform();
	}

	public void moveToElement(WebElement element1) {
		action = new Actions(driver);
		waitForElementVisible(element1);
		action.moveToElement(element1).build().perform();
	}

	public void moveToElementByJS(WebElement element1) {
		action = new Actions(driver);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
		action.moveToElement(element1).perform();
	}

	public void rightClick(WebElement element1) {
		action = new Actions(driver);
		waitForElementVisible(element1);
		action.contextClick(element1).perform();
	}

	public void dragAndDrop(WebElement sourceElement, WebElement destinationElement) {
		action = new Actions(driver);
		action.dragAndDrop(sourceElement, destinationElement).build().perform();
	}

	public void sendKeyboardToElement(WebElement element1, Keys key) {
		action = new Actions(driver);
		waitForElementVisible(element1);
		action.sendKeys(element1, key).perform();
	}

	public void selectItemHtmlDropdownByVisibleText(WebElement element1, String itemText) {
		select = new Select(element1);
		select.selectByVisibleText(itemText);
	}

	public void selectItemHtmlDropdownByValue(WebElement element1, String value) {
		waitForElementVisible(element1);
		select = new Select(element1);
		select.selectByValue(value);
	}

	public void selectItemDropdow(WebElement parentdropdown, List<WebElement> allItemDropdown, String ExpectedText) throws Exception {
		// Click con dropdown
		// WebElement parentdropdownelement =
		// driver.findElement(By.xpath(parentdropdownlocator));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", parentdropdown);
		Thread.sleep(1000);

		// Wait all element is display
		WebDriverWait driverwait = new WebDriverWait(driver, 3000);
		driverwait.until(ExpectedConditions.visibilityOfAllElements(allItemDropdown));

		// Get all iteam in dropdown
		// List<WebElement> allItem = driver.findElements(By.xpath(allItemDropdown));

		// Use FOR to gettext elements
		for (int i = 0; i < allItemDropdown.size(); i++) {
			String ItemText = allItemDropdown.get(i).getText();
			if (ItemText.equals(ExpectedText)) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", allItemDropdown.get(i));
				Thread.sleep(1000);
				if (allItemDropdown.get(i).isDisplayed()) {
					// selenium click
					allItemDropdown.get(i).click();
				} else {
					// javascrip click
					((JavascriptExecutor) driver).executeScript("arguments[0].click();", allItemDropdown.get(i));
				}
				break;
			}
		}
	}

	public String getSelectedItemInHtmlDropdown(WebElement element1, String itemText) {
		select = new Select(element1);
		select.selectByVisibleText(itemText);
		WebElement option = select.getFirstSelectedOption();
		return option.getText();
	}

	public void checkTheCheckbox(WebElement element1) {
		waitForElementVisible(element1);
		element1.click();
	}

	// javascriptExecutor
	public Object executeForBrowser(String javaScript) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(javaScript);
	}

	public boolean verifyTextInInterText(String textExpected) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String actualText = (String) js.executeScript("return document.documentElement.innerText.match('" + textExpected + "')[0]");
		return actualText.equals(textExpected);
	}

	public Object scrollToBottomPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public Object scrollToElement(WebElement element1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("arguments[0].scrollIntoView(true);", element1);
	}

	public Object scrollToIntoviewElement(WebElement element1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("arguments[0].scrollIntoView();", element1);
	}

	public void highlighElement(WebElement element1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String originalStyle = element1.getAttribute("style");
		js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element1, "style", "border:5px solid red; border-style:dashed;");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", element1, "style", originalStyle);
	}

	public Object removeAtributeOfElement(WebElement element1, String attributeRemove) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("arguments[0].removeAttribute('" + attributeRemove + "');", element1);
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

	public void switchToIframe(WebElement element1) {
		driver.switchTo().frame(element1);
	}

	public void uploadFile(WebElement uploadElement) throws InterruptedException {
		Path fileUpload = Paths.get("src", "main/java/datatest", "animal1.jpg");
		String fileUploadPathString = fileUpload.toAbsolutePath().toString();
		// enter file path onto the file-selection input field
		//waitForElementVisible(uploadElement);
		Thread.sleep(2000);
		uploadElement.sendKeys(fileUploadPathString);
		//waitForElementVisible(uploadElement);
		// check the "I accept the terms of service" checkbox
		// driver.findElement(By.id("terms")).click();

		// click the upload button
		// driver.findElement(By.name("send")).click();
		// Thread.sleep(1000);
	}

	public void uploadFileByRobot(WebElement browserButton) throws AWTException, InterruptedException {
		browserButton.click();
		Path fileUpload = Paths.get("src", "main/java/datatest", "animal1.jpg");
		String fileUploadPathString = fileUpload.toAbsolutePath().toString();

		StringSelection strSel = new StringSelection(fileUploadPathString);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);

		// Create an object for robot class
		Robot robot = new Robot();
		Thread.sleep(1000);
		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);

		// Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);

		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public boolean compareContainText(String text, String subText) {
		return text.contains(subText);
	}

	public void HandleJQueryDateTimePicker(String day, By locator) throws InterruptedException {
		wait = new WebDriverWait(driver, 5);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By
		// .id("ui-datepicker-div")));
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
		// button to open the calendar
		WebElement selectDate = driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-calendar']"));
		selectDate.click();

		// button to move next in calendar
		WebElement nextLink = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'»')]"));

		// button to click center of calendar header
		WebElement midLink = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));

		// button to click previous in calendar
		WebElement previousLink = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='prev'][contains(text(),'«')]"));

		// Split the date time to get only the date part
		String date_dd_MM_yyyy[] = (date.split(" ")[0]).split("/");

		// get the year difference between current year and year to set in calander
		int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);

		midLink.click();
		if (yearDiff != 0) {
			// if you have to move next year
			if (yearDiff > 0) {
				for (int i = 0; i < yearDiff; i++) {
					System.out.println("Year Diff->" + i);
					nextLink.click();
				}
			}

			// if you have to move previous year
			else if (yearDiff < 0) {
				for (int i = 0; i < (yearDiff * (-1)); i++) {
					System.out.println("Year Diff->" + i);
					previousLink.click();
				}
			}
		}

		Thread.sleep(1000);

		// Get all months from calendar to select correct one
		List<WebElement> listAllMonthToBook = driver.findElements(By.xpath("//div[@class='datepicker-months']//span"));
		listAllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1]) - 1).click();

		Thread.sleep(1000);

		// get all dates from calendar to select correct one
		List<WebElement> listAllDateToBook = driver.findElements(By.xpath("//div[@class='datepicker-days']//td[@class = 'day']"));
		listAllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0]) - 1).click();

	}

	public void viewDetailContent(WebElement element1) throws Throwable {
		String xpathValueOfName = "//th[contains(text(),'Name')]//following-sibling::td";
		// click in view icon
		waitForElementClickalbe(element1);
		clickToElementByJavaScript(element1);

		// get name of content
		String nameOfElement = driver.findElement(By.xpath(xpathValueOfName)).getText();

		// get the title of detail content page
		String titleOfDetailContentPage = getPageTitle();

		// assert the title of page with name of content
		Assert.assertEquals(titleOfDetailContentPage, nameOfElement);
		Thread.sleep(1000);
		back();

	}

	public void waitForElementVisible(WebElement element2) {
		wait = new WebDriverWait(driver, 50);
		element = wait.until(ExpectedConditions.visibilityOf(element2));
	}

	public void waitForElementClickalbe(WebElement element2) {
		wait = new WebDriverWait(driver, 50);
		element = wait.until(ExpectedConditions.elementToBeClickable(element2));
	}

	public void waitForAlertPresence() {
		wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void clickElementByAction(WebElement element1) {
		action = new Actions(driver);
		waitForElementClickalbe(element1);
		action.moveToElement(element1).click().build().perform();
	}

	public void waitForLoad() {
		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		wait = new WebDriverWait(driver, 50);
		wait.until(pageLoadCondition);
	}
	

}
