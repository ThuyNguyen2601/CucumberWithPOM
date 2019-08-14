
Feature: Content Provider functions

#@CP
#Scenario: Admin logs into the page
	#When Admin logs into the TVoD page
	#Then verify the title of page
@A31
Scenario: Search Content Provider by name
	Then user goes to the Content Provider page
	Then user checks the title of Content Provider page
	Then user searches Content Provider by name
	
#@CP2
#Scenario: Search Content Provider by calendar
	#Then user goes to the Content Provider page
	#Then user searches Content Provider by calendar
	
@A3
Scenario: Create Content Provider when do not enter name
	Then user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider without name
	Then verify the name blank message
	
@A3
Scenario: Create Content Provider when do not enter account name
	Then user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider without account name
	Then verify the account name blank message

@A3
Scenario: Create Content Provider when enter existed account name
	Then user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider with existed account name
	Then verify the existed account name message
	
@A3
Scenario: Create Content Provider when do not enter email
	Then user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider without email
	Then verify the email blank message

@A3
Scenario: Create Content Provider when enter wrong email format
	Then user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider with wrong email format
	Then verify the wrong email format message
	
@A3
Scenario: Create Content Provider when do not enter phone number
	Then user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider without phone number
	Then verify the phone number blank message

@A3
Scenario: Create Content Provider when enter wrong phone number format
	Then user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider with wrong phone number format
	Then verify the wrong phone number format message
	
@A3
Scenario: Create Content Provider when do not enter password
	Then user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider without password
	Then verify the password blank message
	
@A3
Scenario: Create Content Provider when enter wrong password format
	Then user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider with wrong password format
	Then verify the wrong password format message
	
@A3
Scenario: Create Content Provider when do not enter confirm password
	Then user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider without confirm password
	Then verify the confirm password blank message
	
@A3
Scenario: Create Content Provider when enter wrong confirm password format
	Then user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider with wrong confirm password format
	Then verify the wrong confirm password format message
	
@A3
Scenario: Create Content Provider when enter password and confirm password not matched
	Then user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider with password and confirm password not matched
	Then verify the password and confirm password not matched message
	
@A3
Scenario: Create Content Provider when do not enter full name
	Then user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider without full name
	Then verify the full name blank message
	
@A3
Scenario: Create Content Provider success
	Then user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider with valid value
	Then verify the create content provider success message
	
@A3
Scenario: Create Content Provider but press Cancel
	Then user goes to the Content Provider page
	Then user presses Create Content Provider button
	Then user create Content Provider but press Cancel button
	Then verify the title of page after Cancel
	
@A3
Scenario: Update Content Provider without name
	Then user goes to the Content Provider page
	Then user presses update Content Provider button
	Then user update Content Provider without name
	Then verify the name update blank message
	
@A3
Scenario: Update Content Provider without email
	Then user goes to the Content Provider page
	Then user presses update Content Provider button
	Then user update Content Provider without email
	Then verify the email update blank message
	
@A3
Scenario: Update Content Provider with wrong email format
	Then user goes to the Content Provider page
	Then user presses update Content Provider button
	Then user update Content Provider with wrong email format
	Then verify the wrong email format update blank message
	
@A3
Scenario: Update Content Provider without phone number
	Then user goes to the Content Provider page
	Then user presses update Content Provider button
	Then user update Content Provider without phone number
	Then verify the phone number update blank message
	
@A3
Scenario: Update Content Provider with wrong phone number format
	Then user goes to the Content Provider page
	Then user presses update Content Provider button
	Then user update Content Provider with wrong phone number format
	Then verify the wrong phone number format update blank message
	
@A3
Scenario: Update Content Provider without password
	Then user goes to the Content Provider page
	Then user presses update Content Provider button
	Then user update Content Provider without password
	Then verify the password update blank message
	
@A3
Scenario: Update Content Provider with wrong password format
	Then user goes to the Content Provider page
	Then user presses update Content Provider button
	Then user update Content Provider with wrong password format
	Then verify the wrong password format update blank message
	
@A3
Scenario: Update Content Provider without confirm password
	Then user goes to the Content Provider page
	Then user presses update Content Provider button
	Then user update Content Provider without confirm password
	Then verify the confirm password update blank message
	
@A3
Scenario: Update Content Provider with password and confirm password not matched
	Then user goes to the Content Provider page
	Then user presses update Content Provider button
	Then user update Content Provider with password and confirm password not matched
	Then verify the password and confirm password update not matched message
	
@A3
Scenario: Update Content Provider without full name
	Then user goes to the Content Provider page
	Then user presses update Content Provider button
	Then user update Content Provider without full name
	Then verify the full name update blank message
	
@A3
Scenario: Update Content Provider when press Cancel button
	Then user goes to the Content Provider page
	Then user presses update Content Provider button
	Then user update Content Provider when press Cancel button
	Then verify the page title after press Cancel update
	
@A3
Scenario: Update Content Provider success
	Then user goes to the Content Provider page
	Then user presses update Content Provider button
	Then user update Content Provider with valid values
	Then verify the update Content Provider success message

@A32
Scenario: Reset the status of Content Provider but press Cancel
	Then user goes to the Content Provider page
	Then user clicks to Reset button
	Then user presses Cancel button on the confirmation reset status alert
	
@A33
Scenario: Reset the status success
	Then user goes to the Content Provider page
	Then user clicks to Reset button
	Then user presses OK button on the confirmation reset status alert
	Then verify the change status successful message
	
@A34
Scenario: Delete the Content Provider but press Cancel button
	Then user goes to the Content Provider page
	Then user clicks to Delete button
	Then user presses Cancel button on the confirmation delete content provider alert
	
@A35
Scenario: Delete the Content Provider success
	Then user goes to the Content Provider page
	Then user clicks to Delete button
	Then user presses OK button on the confirmation delete content provider alert
	Then verify the delete Content Provider success message
	




