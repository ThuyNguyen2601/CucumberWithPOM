package com.qa.stepDefinitions;

import org.testng.Assert;

import com.qa.pages.ContentProvider;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.AbstractTest;
import com.qa.util.PageGeneratorManager;
import com.qa.util.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContentProviderSteps extends AbstractTest{
	HomePage homePage;
	ContentProvider contentProvider;
	LoginPage loginPage;
	TestBase testBase;
	
	String name = "Thuy content provider " + randomData();
	String email = "abc" + randomData() + "@gmail.com";
	String address = "124 Hoang Quoc Viet";
	String taxCode = "100";
	String status = "Active";
	String accountName = "admin " + randomData();
	String phoneNumber = "0941912591";
	String password = "12345678";
	String confirmPassword = "12345678";
	String fullName = "Nguyen Thi Thuy " + randomData();
	
//	@Given("^Admin opens the browser page$")
//	public void user_opens_the_browser_page() throws Throwable {
//		initialization();
//	}
//
//	@When("^Admin goes to the TVoD login page$")
//	public void user_goes_to_the_TVoD_login_page() throws Throwable {
//		loginPage = new LoginPage();
//		Thread.sleep(1000);
//		String title = loginPage.getLoginPageTitle();
//		Assert.assertEquals(title, "Login");
//	}

//	@When("^Admin logs into the TVoD page$")
//	public void user_logs_into_the_TVoD_page() throws Throwable {
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//	}
//	
//	@Then("^verify the title of page$")
//	public void verify_the_title_of_page() throws Throwable {
//		String titlePage = homePage.getHomePageTitle();
//		Assert.assertEquals(titlePage, "TVOD-Backend");
//	}

	@Then("^user goes to the Content Provider page$")
	public void user_goes_to_the_Content_Provider_page() throws Throwable {
		homePage = PageGeneratorManager.getHomePage();
		contentProvider = homePage.gotoContentProviderPage();
		waitForLoad();
	}

	@Then("^user checks the title of Content Provider page$")
	public void user_checks_the_title_of_Content_Provider_page() throws Throwable {
		String title = contentProvider.getContentProviderPageTitle();
		//Assert.assertEquals(title, "Manage Content Provider");
		verifyEquals(title, "Manage Content Provider");
	}

	@Then("^user searches Content Provider by name$")
	public void user_searches_Content_Provider_by_name() throws Throwable {
		contentProvider.searchByName(contentProvider.listRowResult, contentProvider.nameCriteria, "Thuy");
	}
	
//	@Then("^user searches Content Provider by calendar$")
//	public void user_searches_Content_Provider_by_calendar() throws Throwable {
//		selectValueInDateTiemPicker("04/07/2019");
//		System.out.print("Check searches Content Provider by calendar success!");
//	}
	
	
	
	@Then("^user presses Create Content Provider button$")
	public void user_presses_Create_Content_Provider_button() throws Throwable {
		//clickToElement(contentProvider.createContentProviderButton);
		clickToElementByJavaScript(contentProvider.createContentProviderButton);
	}

	@Then("^user create Content Provider without name$")
	public void user_create_Content_Provider_without_name() throws Throwable {
		contentProvider.createContentProvider("", taxCode, address, status, accountName, email, phoneNumber, password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the name blank message$")
	public void verify_the_name_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyNameBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP without name is: " + flag + "\n");
	}
	

	@Then("^user create Content Provider without account name$")
	public void user_create_Content_Provider_without_account_name() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, "", email, phoneNumber, password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the account name blank message$")
	public void verify_the_account_name_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyAccountNameBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP without account name is: " + flag + "\n");
	}
	

	@Then("^user create Content Provider with existed account name$")
	public void user_create_Content_Provider_with_existed_account_name() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, "admin", email, phoneNumber, password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the existed account name message$")
	public void verify_the_existed_account_name_message() throws Throwable {
		boolean flag = contentProvider.verifyAccountNameExistedMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP with existed account name is: " + flag + "\n");
		
	}
	

	@Then("^user create Content Provider without email$")
	public void user_create_Content_Provider_without_email() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, "", phoneNumber, password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the email blank message$")
	public void verify_the_email_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyEmailBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP without email is: " + flag + "\n");
	}
	

	@Then("^user create Content Provider with wrong email format$")
	public void user_create_Content_Provider_with_wrong_email_format() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, "123", phoneNumber, password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the wrong email format message$")
	public void verify_the_wrong_email_format_message() throws Throwable {
		boolean flag = contentProvider.verifyWrongEmailFormatMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP wrong email format is: " + flag + "\n");
	}
	

	@Then("^user create Content Provider without phone number$")
	public void user_create_Content_Provider_without_phone_number() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, "", password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the phone number blank message$")
	public void verify_the_phone_number_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyPhoneNumberBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP without phone number is: " + flag + "\n");
	}
	

	@Then("^user create Content Provider with wrong phone number format$")
	public void user_create_Content_Provider_with_wrong_phone_number_format() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, "aaa", password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the wrong phone number format message$")
	public void verify_the_wrong_phone_number_format_message() throws Throwable {
		boolean flag = contentProvider.verifyWrongPhoneNumberFormatMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP wrong phone number format is: " + flag + "\n");
	}
	

	@Then("^user create Content Provider without password$")
	public void user_create_Content_Provider_without_password() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, "", confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the password blank message$")
	public void verify_the_password_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyPasswordBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP without password is: " + flag + "\n");
	}
	
	
	@Then("^user create Content Provider with wrong password format$")
	public void user_create_Content_Provider_with_wrong_password_format() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, "11111", confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the wrong password format message$")
	public void verify_the_wrong_password_format_message() throws Throwable {
		boolean flag = contentProvider.verifyWrongPasswordFormatMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP wrong password format is: " + flag + "\n");
	}
	
	@Then("^user create Content Provider without confirm password$")
	public void user_create_Content_Provider_without_confirm_password() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, password, "", fullName, "CREATE");
	}

	@Then("^verify the confirm password blank message$")
	public void verify_the_confirm_password_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyConfirmPasswordBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP without confirm password is: " + flag + "\n");
	}

	@Then("^user create Content Provider with wrong confirm password format$")
	public void user_create_Content_Provider_with_wrong_confirm_password_format() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, password, "22222", fullName, "CREATE");
	}

	@Then("^verify the wrong confirm password format message$")
	public void verify_the_wrong_confirm_password_format_message() throws Throwable {
		boolean flag = contentProvider.verifyWrongConfirmPasswordFormat();
		Assert.assertTrue(flag);
		System.out.print("Check create CP wrong confirm password format is: " + flag + "\n");
	}
	

	@Then("^user create Content Provider with password and confirm password not matched$")
	public void user_create_Content_Provider_with_password_and_confirm_password_not_matched() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, "111111111", "999999999", fullName, "CREATE");
	}

	@Then("^verify the password and confirm password not matched message$")
	public void verify_the_password_and_confirm_password_not_matched_message() throws Throwable {
		boolean flag = contentProvider.verifyPasswordAndConfirmPasswordNotMatchedMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP password and confirm password not matched is: " + flag + "\n");
	}
	

	@Then("^user create Content Provider without full name$")
	public void user_create_Content_Provider_without_full_name() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, password, confirmPassword, "", "CREATE");
	}

	@Then("^verify the full name blank message$")
	public void verify_the_full_name_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyFullNameBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP without full name is: " + flag + "\n");
	}
	
	
	@Then("^user create Content Provider with valid value$")
	public void user_create_Content_Provider_with_valid_value() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the create content provider success message$")
	public void verify_the_create_content_provider_success_message() throws Throwable {
		boolean flag = contentProvider.verifyCreateContentProviderSuccessMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create Content Provider success is: " + flag + "\n");
	}
	
	
	@Then("^user create Content Provider but press Cancel button$")
	public void user_create_Content_Provider_but_press_Cancel_button() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, password, confirmPassword, fullName, "CANCEL");
	}

	@Then("^verify the title of page after Cancel$")
	public void verify_the_title_of_page_after_Cancel() throws Throwable {
		Thread.sleep(1000);
		String title = contentProvider.getContentProviderPageTitle();
		Assert.assertEquals(title, "Manage Content Provider");
		System.out.print("Check create CP but press Cancel is OK");
	}
	
	@Then("^user presses update Content Provider button$")
	public void user_presses_update_Content_Provider_button() throws Throwable {
		waitForElementClickalbe(contentProvider.updateContentProviderIcon);
		clickToElementByJavaScript(contentProvider.updateContentProviderIcon);
	}

	@Then("^user update Content Provider without name$")
	public void user_update_Content_Provider_without_name() throws Throwable {
		contentProvider.updateContentProvider("", taxCode, address, status, email, phoneNumber, password, confirmPassword, fullName, "UPDATE");
	}

	@Then("^verify the name update blank message$")
	public void verify_the_name_update_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyNameBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check update Content Provider without name is: " + flag + "\n");
	}
	

	@Then("^user update Content Provider without email$")
	public void user_update_Content_Provider_without_email() throws Throwable {
		contentProvider.updateContentProvider(name, taxCode, address, status, "", phoneNumber, password, confirmPassword, fullName, "UPDATE");
	}

	@Then("^verify the email update blank message$")
	public void verify_the_email_update_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyEmailBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check update Content Provider without email is: " + flag + "\n");
	}
	

	@Then("^user update Content Provider with wrong email format$")
	public void user_update_Content_Provider_with_wrong_email_format() throws Throwable {
		contentProvider.updateContentProvider(name, taxCode, address, status, "123", phoneNumber, password, confirmPassword, fullName, "UPDATE");
	}

	@Then("^verify the wrong email format update blank message$")
	public void verify_the_wrong_email_format_update_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyWrongEmailFormatMessage();
		Assert.assertTrue(flag);
		System.out.print("Check update Content Provider with wrong email format is: " + flag + "\n");
	}

	@Then("^user update Content Provider without phone number$")
	public void user_update_Content_Provider_without_phone_number() throws Throwable {
		contentProvider.updateContentProvider(name, taxCode, address, status, email, "", password, confirmPassword, fullName, "UPDATE");
	}

	@Then("^verify the phone number update blank message$")
	public void verify_the_phone_number_update_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyPhoneNumberBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check update Content Provider without phone number is: " + flag + "\n");
	}
	

	@Then("^user update Content Provider with wrong phone number format$")
	public void user_update_Content_Provider_with_wrong_phone_number_format() throws Throwable {
		contentProvider.updateContentProvider(name, taxCode, address, status, email, "aaa", password, confirmPassword, fullName, "UPDATE");
	}

	@Then("^verify the wrong phone number format update blank message$")
	public void verify_the_wrong_phone_number_format_update_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyWrongPhoneNumberFormatMessage();
		Assert.assertTrue(flag);
		System.out.print("Check update Content Provider with wrong phone number format is: " + flag + "\n");
	}
	

	@Then("^user update Content Provider without password$")
	public void user_update_Content_Provider_without_password() throws Throwable {
		contentProvider.updateContentProvider(name, taxCode, address, status, email, phoneNumber, "", confirmPassword, fullName, "UPDATE");
	}

	@Then("^verify the password update blank message$")
	public void verify_the_password_update_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyPasswordBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check update Content Provider without password is: " + flag + "\n");
	}
	
	@Then("^user update Content Provider with wrong password format$")
	public void user_update_Content_Provider_with_wrong_password_format() throws Throwable {
		contentProvider.updateContentProvider(name, taxCode, address, status, email, phoneNumber, "11111", confirmPassword, fullName, "UPDATE");
	}

	@Then("^verify the wrong password format update blank message$")
	public void verify_the_wrong_password_format_update_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyWrongPasswordFormatMessage();
		Assert.assertTrue(flag);
		System.out.print("Check update Content Provider with wrong password format is: " + flag + "\n");
	}
	

	@Then("^user update Content Provider without confirm password$")
	public void user_update_Content_Provider_without_confirm_password() throws Throwable {
		contentProvider.updateContentProvider(name, taxCode, address, status, email, phoneNumber, password, "", fullName, "UPDATE");
	}

	@Then("^verify the confirm password update blank message$")
	public void verify_the_confirm_password_update_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyConfirmPasswordBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check update Content Provider without confirm password is: " + flag + "\n");
	}
	

	@Then("^user update Content Provider with password and confirm password not matched$")
	public void user_update_Content_Provider_with_password_and_confirm_password_not_matched() throws Throwable {
		contentProvider.updateContentProvider(name, taxCode, address, status, email, phoneNumber, "88888888", "55555555", fullName, "UPDATE");
	}

	@Then("^verify the password and confirm password update not matched message$")
	public void verify_the_password_and_confirm_password_update_not_matched_message() throws Throwable {
		boolean flag = contentProvider.verifyPasswordAndConfirmPasswordNotMatchedMessage();
		Assert.assertTrue(flag);
		System.out.print("Check update Content Provider with password and confirm password not matched is: " + flag + "\n");
	}

	@Then("^user update Content Provider without full name$")
	public void user_update_Content_Provider_without_full_name() throws Throwable {
		contentProvider.updateContentProvider(name, taxCode, address, status, email, phoneNumber, password, confirmPassword, "", "UPDATE");
	}

	@Then("^verify the full name update blank message$")
	public void verify_the_full_name_update_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyFullNameBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check update Content Provider without fullname is: " + flag + "\n");
	}

	@Then("^user update Content Provider when press Cancel button$")
	public void user_update_Content_Provider_when_press_Cancel_button() throws Throwable {
		contentProvider.updateContentProvider(name, taxCode, address, status, email, phoneNumber, password, confirmPassword, fullName, "CANCEL");
	}

	@Then("^verify the page title after press Cancel update$")
	public void verify_the_page_title_after_press_Cancel_update() throws Throwable {
		String pageTitle = contentProvider.getContentProviderPageTitle();
		Assert.assertEquals(pageTitle, "Manage Content Provider");
	}
	
	@Then("^user update Content Provider with valid values$")
	public void user_update_Content_Provider_with_valid_values() throws Throwable {
		contentProvider.updateContentProvider(name, taxCode, address, status, email, phoneNumber, password, confirmPassword, fullName, "UPDATE");
	}

	@Then("^verify the update Content Provider success message$")
	public void verify_the_update_Content_Provider_success_message() throws Throwable {
		boolean flag = contentProvider.verifyUpdateContentProviderSuccessMessage();
		Assert.assertTrue(flag);
		System.out.print("Check update Content Provider success is: " + flag + "\n");
	}
	
	@Then("^user clicks to Reset button$")
	public void user_clicks_to_Reset_button() throws Throwable {
		clickToElement(contentProvider.changeStatusIcon);
	}

	@Then("^user presses Cancel button on the confirmation reset status alert$")
	public void user_presses_Cancel_button_on_the_confirmation_reset_status_alert() throws Throwable {
		clickToElement(contentProvider.cancelChangeStatusButton);
	}
	

	@Then("^user presses OK button on the confirmation reset status alert$")
	public void user_presses_OK_button_on_the_confirmation_reset_status_alert() throws Throwable {
		clickToElement(contentProvider.okChangeStatusButton);
	}

	@Then("^verify the change status successful message$")
	public void verify_the_change_status_successful_message() throws Throwable {
		boolean flag = contentProvider.verifyChangeStatusSuccessMessage();
		Assert.assertTrue(flag);
		System.out.print("Check change status of Content Provider success is: " + flag + "\n");
	}
	
	
	@Then("^user clicks to Delete button$")
	public void user_clicks_to_Delete_button() throws Throwable {
		homePage = PageGeneratorManager.getHomePage();
		contentProvider = homePage.gotoContentProviderPage();
		clickToElement(contentProvider.deleteContentProviderIcon);
	}

	@Then("^user presses Cancel button on the confirmation delete content provider alert$")
	public void user_presses_Cancel_button_on_the_confirmation_delete_content_provider_alert() throws Throwable {
		clickToElement(contentProvider.cancelDeleteContentProviderButton);
	}
	
	@Then("^user presses OK button on the confirmation delete content provider alert$")
	public void user_presses_OK_button_on_the_confirmation_delete_content_provider_alert() throws Throwable {
		clickToElement(contentProvider.okDeleteContentProviderButton);
	}

	@Then("^verify the delete Content Provider success message$")
	public void verify_the_delete_Content_Provider_success_message() throws Throwable {
		waitForElementVisible(contentProvider.deleteContentProviderSuccessMessage);
		boolean flag = contentProvider.verifyDeleteContentProviderSuccessMessage();
		Assert.assertTrue(flag);
		System.out.print("Check delete Content Provider success is: " + flag + "\n");
	}

	

	
}
