Feature: Search Service Provider function

Background:
		Given user open the browser
		And user goto the login page
		And user logins into the page

@SP1
Scenario: Search Service Provider by name
	When user go to Service Provider page
	Then user check the title of page
	Then user search service provider by name
	
@SP2
Scenario: Add Service Provider when do not enter Name
	When user presses to Create Service Provider button
	Then user creates Service Provider with Name blank
	And verify notified name blank message 
	
@SP3
Scenario: Add Service Provider when do not enter Account Name
	When user presses to Create Service Provider button
	Then user creates Service Provider with Account Name blank
	And verify notified account name blank message

@SP4
Scenario: Add Service Provider when do not enter Email
	When user presses to Create Service Provider button
	Then user creates Service Provider with Email blank
	And verify notified email blank message
	
@SP5
Scenario: Add Service Provider when do not enter Phone Number
	When user presses to Create Service Provider button
	Then user creates Service Provider with Phone Number blank
	And verify notified phone number blank message
	
@SP6
Scenario: Add Service Provider when do not enter Password
	When user presses to Create Service Provider button
	Then user creates Service Provider with Password blank
	And verify notified password blank message
	
@SP7
Scenario: Add Service Provider when do not enter Confirm Password
	When user presses to Create Service Provider button
	Then user creates Service Provider with Confirm Password blank
	And verify notified confirm password blank message
	
@SP8
Scenario: Add Service Provider when enter existed Service Provider name
	When user presses to Create Service Provider button
	Then user creates Service Provider with existed name
	And verify notified Service Provider Name existed message
	
@SP9
Scenario: Add Service Provider when enter existed Account Name
	When user presses to Create Service Provider button
	Then user creates Service Provider with existed Account Name
	And verify notified Account Name existed message
	
@SP10
Scenario: Add Service Provider when enter invalid Email
	When user presses to Create Service Provider button
	Then user creates Service Provider with invalid Email
	And verify notified Invalid Email message
	
@SP11
Scenario: Add Service Provider when enter invalid Password
	When user presses to Create Service Provider button
	Then user creates Service Provider with invalid Password
	And verify notified Invalid Password
	
@SP12
Scenario: Add Service Provider when enter invalid Confirm Password
	When user presses to Create Service Provider button
	Then user creates Service Provider with invalid Confirm Password
	And verify notified Invalid Confirm Password

@SP13
Scenario: Add Service Provider when enter invalid Phone Number
	When user presses to Create Service Provider button
	Then user creates Service Provider with invalid Phone Number
	And verify notified Invalid Phone Number message
	
@SP14
Scenario: Add Service Provider when enter not matched password and confirm password
	When user presses to Create Service Provider button
	Then user creates Service Provider with not matched password and confirm password
	And verify notified not matched password and confirm password message
	
@SP15
Scenario: Add Service Provider success
	When user presses to Create Service Provider button
	Then user creates Service Provider with full value
	And verify create Service Provider success message
	
@SP16
Scenario: Update Service Provider when do not enter Name
	When user presses to Update icon
	Then user update Service Provider when do not enter name
	And verify update Service Provider name blank message
	
@SP17
Scenario: Update Service Provider success
	When user presses to Update icon
	Then user update Service Provider with values
	And verify update Service Provider success
	
@SP18
Scenario: Update Service Provider but press Cancel
	When user presses to Update icon
	Then user update Service Provider but press Cancel button
	And verify title of Service Provider page

@SP19
Scenario: Delete Service Provider but press Cancel button
	When user presses to Delete icon
	Then user presses to Cancel button in the alert
	And verify title of Service Provider page

@SP20
Scenario: Delete Service Provider and press OK button
	When user presses to Delete icon
	Then user presses to OK button in the alert
	And verify delete Service Provider success message
	
	

	
