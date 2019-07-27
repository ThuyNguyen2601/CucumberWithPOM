Feature: Login to the system

  Scenario: Login success to system
  	Given open the browser
    When open the url login page
    And enter the username
    And enter the password
    And click to login button
    Then validate home page title
    And validate logged in username