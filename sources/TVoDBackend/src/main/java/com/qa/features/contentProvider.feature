
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
	
@CP3
Scenario: Create Content Provider when do not enter name
	When user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider without name
	Then verify the name blank message
	
@CP4
Scenario: Create Content Provider when do not enter account name
	When user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider without account name
	Then verify the account name blank message

@CP5
Scenario: Create Content Provider when enter existed account name
	When user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider with existed account name
	Then verify the existed account name message
	
@CP6
Scenario: Create Content Provider when do not enter email
	When user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider without email
	Then verify the email blank message

@CP7
Scenario: Create Content Provider when enter wrong email format
	When user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider with wrong email format
	Then verify the wrong email format message
	
@CP8
Scenario: Create Content Provider when do not enter phone number
	When user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider without phone number
	Then verify the phone number blank message

@CP9
Scenario: Create Content Provider when enter wrong phone number format
	When user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider with wrong phone number format
	Then verify the wrong phone number format message
	
@CP10
Scenario: Create Content Provider when do not enter password
	When user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider without password
	Then verify the password blank message
	
@CP11
Scenario: Create Content Provider when enter wrong password format
	When user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider with wrong password format
	Then verify the wrong password format message
	
@CP12
Scenario: Create Content Provider when do not enter confirm password
	When user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider without confirm password
	Then verify the confirm password blank message
	
@CP13
Scenario: Create Content Provider when enter wrong confirm password format
	When user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider with wrong confirm password format
	Then verify the wrong confirm password format message
	
@CP14
Scenario: Create Content Provider when enter password and confirm password not matched
	When user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider with password and confirm password not matched
	Then verify the password and confirm password not matched message
	
@CP15
Scenario: Create Content Provider when do not enter full name
	When user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider without full name
	Then verify the full name blank message
	


