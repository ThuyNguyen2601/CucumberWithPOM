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
	
	public static CategoryFilm getCategoryFilm() {
		return new CategoryFilm();
	}
	
	public static ListFilm getListFilm() {
		return new ListFilm();
	}
	
	public static ActorAndDirector getActorAndDirector() {
		return new ActorAndDirector();
	}
	
}
