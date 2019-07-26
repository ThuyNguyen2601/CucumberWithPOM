
Feature: Login to the TVOD

  Scenario: Login success to system
    Given open the url login page
    When enter the username
    And enter the password
    And click to login button
    Then validate home page title
    And validate logged in username
