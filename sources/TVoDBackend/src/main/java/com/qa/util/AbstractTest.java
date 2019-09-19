package com.qa.util;

import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbstractTest extends TestBase{
	
	public static WebDriver driver;
	
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
		return random.nextInt(9999);
	}
	
	public void clickToElementByJavaScript(WebElement element1) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element1);
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
