Feature: Manage Actor and Director

@E1
Scenario: Add new object when input blank display name
Then user goes to the Manage Actor Director page
Then user clicks to Add new button
Then user adds new Actor or Director without display name
Then user checks the blank display name message

@E1
Scenario: Add new object when does not upload avatar
Then user goes to the Manage Actor Director page
Then user clicks to Add new button
Then user adds new Actor or Director without avatar
Then user checks the blank avatar message

@E1
Scenario: Add new object when press Cancel button
Then user goes to the Manage Actor Director page
Then user clicks to Add new button
Then user adds new Actor or Director but press Cancel button
Then user checks the title of page

@E1
Scenario: Add new object successful
Then user goes to the Manage Actor Director page
Then user clicks to Add new button
Then user adds new Actor or Director and press Add new button
Then user checks the add new actor or director successful message

@E1
Scenario: Update actor or director when input blank display name
Then user goes to the Manage Actor Director page
Then user clicks to update icon
Then user updates new Actor or Director without display name
Then user checks the update blank display name message

@E1
Scenario: Update actor or director when press Cancel button
Then user goes to the Manage Actor Director page
Then user clicks to update icon
Then user updates new Actor or Director when press Cancel button
Then user checks the page title after pressing Cancel button

@E1
Scenario: Update actor or director successful
Then user goes to the Manage Actor Director page
Then user clicks to update icon
Then user updates Actor or Director when press Update button
Then user checks the update actor or director successful message

@E1 
Scenario: Delete actor or director when press Cancel
Then user goes to the Manage Actor Director page
Then user clicks to delete icon but press Cancel
Then user checks the page title after press Cancel button deleting

@E1
Scenario: Delete actor or director successful
Then user goes to the Manage Actor Director page
Then user clicks to delete icon and press OK button
Then user checks the delete actor or director successful message

