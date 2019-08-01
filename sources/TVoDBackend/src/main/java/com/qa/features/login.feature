Feature: Login to the system

Background:
Given open the browser
    When user in the login page

  Scenario: Login success to system
    Then user logs into the page
    Then validate home page title
    And validate logged in username
    
  Scenario: Login to system when do not enter username
  	Then user logs into the page with username blank
  	Then validate the username blank message