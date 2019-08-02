Feature: Login to the system

Background:
	Given open the browser
  When user in the login page
  
	@Test1
  Scenario: Login success to system
    Then user logs into the page
    Then validate home page title
    And validate logged in username
  
  @Test2  
  Scenario: Login to system when do not enter username
  	Then user logs into the page with username blank
  	Then validate the username blank message
  
  @Test3	
  Scenario: Login to system when do not enter password
  	Then user logs into the page with password blank
  	Then validate the password blank message
  	
  @Test4
  Scenario: Login to system when enter wrong account
  	Then user logs into the page with wrong account
  	Then validate the wrong account message