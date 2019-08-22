package com.qa.util;

import com.qa.pages.*;

public class PageGeneratorManager {
	public static HomePage getHomePage() {
		return new HomePage();
	}
	
	public static ContentProvider getContentProvider() {
		return new ContentProvider();
	}
	
	public static LoginPage getLoginPage() {
		return new LoginPage();
	}
	
	public static ServiceProvider getServiceProvider() {
		return new ServiceProvider();
	}
	
}
