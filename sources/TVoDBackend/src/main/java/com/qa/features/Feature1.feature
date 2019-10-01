Feature: Login to the system

  
  @A1
  Scenario: Login to system when do not enter username
  	Then user logs into the page with username blank
  	Then validate the username blank message
  
  @A1
  Scenario: Login to system when do not enter password
  	Then user logs into the page with password blank
  	Then validate the password blank message
  	
  @A1
  Scenario: Login to system when enter wrong account
  	Then user logs into the page with wrong account
  	Then validate the wrong account message
  	
  @A1
  Scenario: Login success to system
    Then user logs into the page
    Then validate home page title
    And validate logged in username