
Feature: Content Provider functions

Background:
	Given user opens the browser page
	And user goes to the TVoD login page
	And user logs into the TVoD page

@CP1
Scenario: Search Content Provider by name
	When user goes to the Content Provider page
	Then user checks the title of Content Provider page
	Then user searches Content Provider by name
	
@CP2
Scenario: Search Content Provider by calendar
	When user goes to the Content Provider page
	Then user searches Content Provider by calendar


	

