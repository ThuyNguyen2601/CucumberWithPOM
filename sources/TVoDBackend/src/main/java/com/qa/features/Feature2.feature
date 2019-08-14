Feature: Service Provider functions

#@SP
#Scenario: Admin logs in to the TVoD page
	#When Admin logins into the page
	#Then verify the title of page

Scenario: Search Service Provider by name
	When user go to Service Provider page
	Then user check the title of page
	Then user search service provider by name
	

Scenario: Add Service Provider when do not enter Name
	Then user presses to Create Service Provider button
	Then user creates Service Provider with Name blank
	And verify notified name blank message 
	

Scenario: Add Service Provider when do not enter Account Name
	Then user presses to Create Service Provider button
	Then user creates Service Provider with Account Name blank
	And verify notified account name blank message


Scenario: Add Service Provider when do not enter Email
	Then user presses to Create Service Provider button
	Then user creates Service Provider with Email blank
	And verify notified email blank message
	

Scenario: Add Service Provider when do not enter Phone Number
	Then user presses to Create Service Provider button
	Then user creates Service Provider with Phone Number blank
	And verify notified phone number blank message
	

Scenario: Add Service Provider when do not enter Password
	Then user presses to Create Service Provider button
	Then user creates Service Provider with Password blank
	And verify notified password blank message
	

Scenario: Add Service Provider when do not enter Confirm Password
	Then user presses to Create Service Provider button
	Then user creates Service Provider with Confirm Password blank
	And verify notified confirm password blank message
	

Scenario: Add Service Provider when enter existed Service Provider name
	Then user presses to Create Service Provider button
	Then user creates Service Provider with existed name
	And verify notified Service Provider Name existed message
	

Scenario: Add Service Provider when enter existed Account Name
	Then user presses to Create Service Provider button
	Then user creates Service Provider with existed Account Name
	And verify notified Account Name existed message
	

Scenario: Add Service Provider when enter invalid Email
	Then user presses to Create Service Provider button
	Then user creates Service Provider with invalid Email
	And verify notified Invalid Email message
	

Scenario: Add Service Provider when enter invalid Password
	Then user presses to Create Service Provider button
	Then user creates Service Provider with invalid Password
	And verify notified Invalid Password
	

Scenario: Add Service Provider when enter invalid Confirm Password
	Then user presses to Create Service Provider button
	Then user creates Service Provider with invalid Confirm Password
	And verify notified Invalid Confirm Password


Scenario: Add Service Provider when enter invalid Phone Number
	Then user presses to Create Service Provider button
	Then user creates Service Provider with invalid Phone Number
	And verify notified Invalid Phone Number message
	

Scenario: Add Service Provider when enter not matched password and confirm password
	Then user presses to Create Service Provider button
	Then user creates Service Provider with not matched password and confirm password
	And verify notified not matched password and confirm password message
	

Scenario: Add Service Provider success
	Then user presses to Create Service Provider button
	Then user creates Service Provider with full value
	And verify create Service Provider success message
	

Scenario: Update Service Provider when do not enter Name
	Then user presses to Update icon
	Then user update Service Provider when do not enter name
	And verify update Service Provider name blank message
	
Scenario: Update Service Provider but press Cancel
	Then user presses to Update icon
	Then user update Service Provider but press Cancel button
	And verify title of Service Provider page
	
	
Scenario: Update Service Provider success
	Then user presses to Update icon
	Then user update Service Provider with values
	And verify update Service Provider success


Scenario: Delete Service Provider but press Cancel button
	Then user presses to Delete icon
	Then user presses to Cancel button in the alert
	And verify title of Service Provider page


Scenario: Delete Service Provider and press OK button
	Then user presses to Delete icon
	Then user presses to OK button in the alert
	And verify delete Service Provider success message
	

Scenario: View detail the Service Provider
	Then user go to Service Provider page
	Then user views the Service Provider in list
	Then user prints the result
	

	
