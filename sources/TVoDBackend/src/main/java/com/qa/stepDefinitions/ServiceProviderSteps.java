package com.qa.stepDefinitions;

import org.testng.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ServiceProvider;
import com.qa.util.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ServiceProviderSteps extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	ServiceProvider serviceProvider;
	String admin = "admin" + randomData();
	String name = "Thuy auto " + randomData();
	String email = "abc" + randomData() + "@gmail.com";
	String phoneNumber = "0941912591";
	String password = "12345678";
	String confirmPassword = "12345678";
	String description = "Thuy created automatically " + randomData();
	String website = "https://www.guru99.com/mysql-tutorial.html";
	String dealer = "20";
	String currencies = "Cambodia Riel";
	String status = "Active";
	
	
//	@When("^Admin logins into the page$")
//	public void user_logins_into_the_page() throws Throwable {
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//	}
//	
//	@Then("^verify the title of page$")
//	public void verify_the_title_of_page() throws Throwable {
//		String titlePage = homePage.getHomePageTitle();
//		Assert.assertEquals(titlePage, "TVOD-Backend");
//	}

	@When("^user go to Service Provider page$")
	public void user_go_to_Service_Provider_page() throws Throwable {
		Thread.sleep(1000);
		homePage = new HomePage();
		serviceProvider = homePage.gotoServiceProviderPage();
	}

	@Then("^user check the title of page$")
	public void user_check_the_title_of_page() throws Throwable {
		String spTitle = serviceProvider.getServiceProviderTitle();
		Assert.assertEquals(spTitle, "Manage Service Provider");
	}

	@Then("^user search service provider by name$")
	public void user_search_service_provider_by_name() throws Throwable {
		serviceProvider.searchServiceProviderByName("chang");
	}
	
	//@After("@SP1")
	public void closeBrowser1() {
		tearDown();
	}
	
	
	@When("^user presses to Create Service Provider button$")
	public void user_presses_to_Create_Service_Provider_button() throws Throwable {
		serviceProvider = homePage.gotoServiceProviderPage();
		clickToElement(serviceProvider.createServiceProviderButton);
	}

	@Then("^user creates Service Provider with Name blank$")
	public void user_creates_Service_Provider_with_Name_blank() throws Throwable {
		serviceProvider.createServiceProvider(" ", admin, email, phoneNumber, password, confirmPassword);
	}

	@And("^verify notified name blank message$")
	public void verify_notified_name_blank_message() throws Throwable {
		boolean flag = serviceProvider.verifyNameBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check Name blank is : "+ flag + "\n");
	}
	
	//@After("@SP2")
	public void closeBrowser2() {
		tearDown();
	}
	
	@Then("^user creates Service Provider with Account Name blank$")
	public void user_creates_Service_Provider_with_Account_Name_blank() throws Throwable {
		serviceProvider.createServiceProvider(name, " ", email, phoneNumber, password, confirmPassword);
	}

	@Then("^verify notified account name blank message$")
	public void verify_notified_account_name_blank_message() throws Throwable {
		boolean flag = serviceProvider.verifyAccountNameBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check Account Name blank is: " + flag + "\n");
	}

	//@After("@SP3")
	public void closeBrowser3() {
		tearDown();
	}
	
	@Then("^user creates Service Provider with Email blank$")
	public void user_creates_Service_Provider_with_Email_blank() throws Throwable {
		serviceProvider.createServiceProvider(name, admin, " ", phoneNumber, password, confirmPassword);
	}

	@Then("^verify notified email blank message$")
	public void verify_notified_email_blank_message() throws Throwable {
		boolean flag = serviceProvider.verifyEmailBlankMessage();
		Assert.assertTrue(flag);
		System.out.println("Check Email blank is: " + flag + "\n");
	}
	
	//@After("@SP4")
	public void closeBrowser4() {
		tearDown();
	}
	
	@Then("^user creates Service Provider with Phone Number blank$")
	public void user_creates_Service_Provider_with_Phone_Number_blank() throws Throwable {
		serviceProvider.createServiceProvider(name, admin, email, "", password, confirmPassword);
	}

	@Then("^verify notified phone number blank message$")
	public void verify_notified_phone_number_blank_message() throws Throwable {
		Thread.sleep(3000);
		boolean flag = serviceProvider.verifyPhoneNumberBlankMessage();
		Assert.assertTrue(flag);
		System.out.println("Check Phone Number blank is: " + flag  + "\n");
	}
	
	//@After("@SP5")
	public void closeBrowser5() {
		tearDown();
	}
	
	@Then("^user creates Service Provider with Password blank$")
	public void user_creates_Service_Provider_with_Password_blank() throws Throwable {
		serviceProvider.createServiceProvider(name, admin, email, phoneNumber, "", confirmPassword);
	}

	@Then("^verify notified password blank message$")
	public void verify_notified_password_blank_message() throws Throwable {
		boolean flag = serviceProvider.verifyPasswordBlankMessage();
		Assert.assertTrue(flag);
		System.out.println("Check Password blank is: " + flag + "\n");
	}
	
	//@After("@SP6")
	public void closeBrowser6() {
		tearDown();
	}
	
	@Then("^user creates Service Provider with Confirm Password blank$")
	public void user_creates_Service_Provider_with_Confirm_Password_blank() throws Throwable {
		serviceProvider.createServiceProvider(name, admin, email, phoneNumber, password, " ");
	}

	@Then("^verify notified confirm password blank message$")
	public void verify_notified_confirm_password_blank_message() throws Throwable {
		boolean flag = serviceProvider.verifyConfirmPasswordBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check Confirm Password blank is: " + flag + "\n");
	}
	
	//@After("@SP7")
	public void closeBrowser7() {
		tearDown();
	}
	
	@Then("^user creates Service Provider with existed name$")
	public void user_creates_Service_Provider_with_existed_name() throws Throwable {
		serviceProvider.createServiceProvider("1234", admin, email, phoneNumber, password, confirmPassword);
	}

	@Then("^verify notified Service Provider Name existed message$")
	public void verify_notified_Service_Provider_Name_existed_message() throws Throwable {
		boolean flag = serviceProvider.verifyServiceProviderExistedMessage();
		Assert.assertTrue(flag);
		System.out.println("Check Existed Service Provider Name is: " + flag + "\n");
	}

	//@After("@SP8")
	public void closeBrowser8() {
		tearDown();
	}
	
	@Then("^user creates Service Provider with existed Account Name$")
	public void user_creates_Service_Provider_with_existed_Account_Name() throws Throwable {
		serviceProvider.createServiceProvider(name, "admin", email, phoneNumber, password, confirmPassword);
	}

	@Then("^verify notified Account Name existed message$")
	public void verify_notified_Account_Name_existed_message() throws Throwable {
		boolean flag = serviceProvider.verifyAccountNameExistedMessage();
		Assert.assertTrue(flag);
		System.out.println("Check Account Name existed is: " + flag  + "\n");
	}
	
	//@After("@SP9")
	public void closeBrowser9() {
		tearDown();
	}
	
	@Then("^user creates Service Provider with invalid Email$")
	public void user_creates_Service_Provider_with_invalid_Email() throws Throwable {
		serviceProvider.createServiceProvider(name, admin, "123", phoneNumber, password, confirmPassword);
	}

	@Then("^verify notified Invalid Email message$")
	public void verify_notified_Invalid_Email_message() throws Throwable {
		boolean flag = serviceProvider.verifyEmailInvalidMessage();
		Assert.assertTrue(flag);
		System.out.print("Check Invalid Email is: " + flag + "\n");
	}
	
	//@After("@SP10")
	public void closeBrowser10() {
		tearDown();
	}
	
	@Then("^user creates Service Provider with invalid Password$")
	public void user_creates_Service_Provider_with_invalid_Password() throws Throwable {
		serviceProvider.createServiceProvider(name, admin, email, phoneNumber, "12345", confirmPassword);
	}

	@Then("^verify notified Invalid Password$")
	public void verify_notified_Invalid_Password() throws Throwable {
		boolean flag = serviceProvider.verifyPasswordInvalidMessage();
		Assert.assertTrue(flag);
		System.out.println("Check Invalid Password is: " + flag + "\n");
	}
	
	//@After("@SP11")
	public void closeBrowser11() {
		tearDown();
	}
	
	@Then("^user creates Service Provider with invalid Confirm Password$")
	public void user_creates_Service_Provider_with_invalid_Confirm_Password() throws Throwable {
		serviceProvider.createServiceProvider(name, admin, email, phoneNumber, password, "12345");
	}

	@Then("^verify notified Invalid Confirm Password$")
	public void verify_notified_Invalid_Confirm_Password() throws Throwable {
		boolean flag = serviceProvider.verifyConfirmPasswordInvalidMessage();
		Assert.assertTrue(flag);
		System.out.print("Check Invalid Confirm Password is: " + flag + "\n");
	}
	
	//@After("@SP12")
	public void closeBrowser12() {
		tearDown();
	}
	
	@Then("^user creates Service Provider with invalid Phone Number$")
	public void user_creates_Service_Provider_with_invalid_Phone_Number() throws Throwable {
		serviceProvider.createServiceProvider(name, admin, email, "aaaa", password, confirmPassword);
	}

	@Then("^verify notified Invalid Phone Number message$")
	public void verify_notified_Invalid_Phone_Number_message() throws Throwable {
		boolean flag = serviceProvider.verifyPhoneNumberWrongFormat();
		Assert.assertTrue(flag);
		System.out.print("Check Wrong Format Phone Number is: " + flag + "\n");
	}
	
	//@After("@SP13")
	public void closeBrowser13() {
		tearDown();
	}
	
	@Then("^user creates Service Provider with not matched password and confirm password$")
	public void user_creates_Service_Provider_with_not_matched_password_and_confirm_password() throws Throwable {
		serviceProvider.createServiceProvider(name, admin, email, phoneNumber, "99999999", "11111111");
	}

	@Then("^verify notified not matched password and confirm password message$")
	public void verify_notified_not_matched_password_and_confirm_password_message() throws Throwable {
		boolean flag = serviceProvider.verifyConfirmPasswordInvalidMessage();
		Assert.assertTrue(flag);
		System.out.println("Check not matched password and confirm password is: " + flag + "\n");
	}
	
	//@After("@SP14")
	public void closeBrowser14() {
		tearDown();
	}
	
	@Then("^user creates Service Provider with full value$")
	public void user_creates_Service_Provider_with_full_value() throws Throwable {
		serviceProvider.createServiceProviderWithFullValue(name, "Thuy created", "https://www.guru99.com", "Viet Nam Dong", "10", "Active", admin, email, phoneNumber, password, confirmPassword);
	}

	@Then("^verify create Service Provider success message$")
	public void verify_create_Service_Provider_success_message() throws Throwable {
		Thread.sleep(5000);
		boolean flag = serviceProvider.verifyCreateServiceProviderSuccessMessage();
		Assert.assertTrue(flag);
		System.out.print("Check Create Service Provider success is: " + flag + "\n");
	}
	
	//@After("@SP15")
	public void closeBrowser15() {
		tearDown();
	}
	
	@When("^user presses to Update icon$")
	public void user_presses_to_Update_icon() throws Throwable {
		Thread.sleep(5000);
		serviceProvider = homePage.gotoServiceProviderPage();
		//Thread.sleep(10000);
		//scrollToElement(serviceProvider.updateServiceProviderIcon);
		Thread.sleep(5000);
		//clickToElement(serviceProvider.updateServiceProviderIcon);
		clickToElementByJavaScript(serviceProvider.updateServiceProviderIcon);
	}

	@Then("^user update Service Provider when do not enter name$")
	public void user_update_Service_Provider_when_do_not_enter_name() throws Throwable {
		serviceProvider.updateServiceProvider(" ", description, website, dealer, currencies, status);
	}

	@Then("^verify update Service Provider name blank message$")
	public void verify_update_Service_Provider_name_blank_message() throws Throwable {
		boolean flag = serviceProvider.verifyNameUpdateBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check update Service Provider with name blank is: " + flag);
	}
	
	//@After("@SP16")
	public void closeBrowser16() {
		tearDown();
	}
	
	@Then("^user update Service Provider with values$")
	public void user_update_Service_Provider_with_values() throws Throwable {
		serviceProvider.updateServiceProvider(name, description, website, dealer, currencies, status);
	}

	@Then("^verify update Service Provider success$")
	public void verify_update_Service_Provider_success() throws Throwable {
		boolean flag = serviceProvider.verifyUpdateServiceProviderSuccessMessage();
		Assert.assertTrue(flag);
		System.out.print("Check update Service Provider success is: " + flag);
	}
	
	//@After("@SP17")
	public void closeBrowser17() {
		tearDown();
	}
	
	@Then("^user update Service Provider but press Cancel button$")
	public void user_update_Service_Provider_but_press_Cancel_button() throws Throwable {
		serviceProvider.updateServiceProviderButCancel(name, description, website, dealer, currencies, status);
	}

	@Then("^verify title of Service Provider page$")
	public void verify_title_of_Service_Provider_page() throws Throwable {
		String serviceProviderTitle = serviceProvider.getServiceProviderTitle();
		Assert.assertEquals(serviceProviderTitle, "Manage Service Provider");
		System.out.println("The title of page after press Cancel is: " + serviceProviderTitle);
	}
	
	//@After("@SP18")
	public void closeBrowser18() {
		tearDown();
	}
	
	@When("^user presses to Delete icon$")
	public void user_presses_to_Delete_icon() throws Throwable {
		serviceProvider = homePage.gotoServiceProviderPage();
		Thread.sleep(3000);
		clickToElementByJavaScript(serviceProvider.deleteServiceProviderIcon);
		//clickToElement(serviceProvider.deleteServiceProviderIcon);
	}

	@Then("^user presses to Cancel button in the alert$")
	public void user_presses_to_Cancel_button_in_the_alert() throws Throwable {
		//waitForAlertPresent();
		Thread.sleep(3000);
		clickToElementByJavaScript(serviceProvider.CancelButtonInDeleteConfirmAlert);
	}
	
	//@After("@SP19")
	public void closeBrowser19() {
		tearDown();
	}

	@Then("^user presses to OK button in the alert$")
	public void user_presses_to_OK_button_in_the_alert() throws Throwable {
		//waitForAlertPresent();
		Thread.sleep(3000);
		clickToElementByJavaScript(serviceProvider.OKButtonInDeleteConfirmAlert);
		//acceptAlert();
	}

	@Then("^verify delete Service Provider success message$")
	public void verify_delete_Service_Provider_success_message() throws Throwable {
		boolean flag = serviceProvider.verifyDeleteSuccessMessage();
		Assert.assertTrue(flag);
		System.out.print("Delete the Service Provider is: " + flag);
	}
	
	//@After("@SP20")
	public void closeBrowser20() {
		tearDown();
	}
	
	
	@Then("^user views the Service Provider in list$")
	public void user_views_the_Service_Provider_in_list() throws Throwable {
		viewDetailContent(serviceProvider.listViewIcon);
	}

	@Then("^user prints the result$")
	public void user_prints_the_result() throws Throwable {
		System.out.print("Check view the Service Provider in list is done!");
	}



}
