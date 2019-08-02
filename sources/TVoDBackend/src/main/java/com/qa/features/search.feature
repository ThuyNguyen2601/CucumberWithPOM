
Feature: Search Service Provider function

@SP1
Scenario: Search Service Provider by name
	Given user open the browser
	And user goto the login page
	And user logins into the page
	When user go to Service Provider page
	Then user check the title of page
	Then user search service provider by name
	


