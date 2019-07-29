Feature: Login to the system

  Scenario: Login success to system
  	Given open the browser
    When user in the login page
    And user logs into the page
    Then validate home page title
    And validate logged in username