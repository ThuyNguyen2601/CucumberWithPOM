
Feature: Manage Category Film
	
  #Scenario: Check filter by status of category film
  #When user goes to the Manage Category Film page
  #Then user chooses status in status collumn
  #Then user check the status of displayed records
  @C1
  Scenario: Check create category film without Category name
  Then user goes to the Manage Category Film page
  Then user clicks to the Create Category Film button
  And user creates the category film without Category name
  And user checks the Category name blank message
  
  @C1
  Scenario: Check create category film without Service Provider
  Then user goes to the Manage Category Film page
  Then user clicks to the Create Category Film button
  And user creates the category film without Service Provider
  And user checks the Service Provider blank message
  
  @C1
  Scenario: Check create category film when pressing cancel button
  Then user goes to the Manage Category Film page
  Then user clicks to the Create Category Film button
  And user creates the category film with valid values but press Cancel button
  And user checks the title of page after pressing cancel button
  
  @C1
  Scenario: Check create category film successful
  Then user goes to the Manage Category Film page
  Then user clicks to the Create Category Film button
  And user creates the category film with valid values
  And user check the create category film successful message
  
  @C1
  Scenario: Check view category film
  Then user goes to the Manage Category Film page
  Then user clicks to the view category film icon
  And user check the title of page when viewing category film
  
  Scenario: Check edit category film without Category name
  Then user goes to the Manage Category Film page
  Then user clicks to the edit category icon
  And user updates the category film without Category name
  And user checks the Category name blank message when updating
  
  Scenario: Check edit category film without Service Provider
  Then user goes to the Manage Category Film page
  Then user clicks to the edit category icon
  And user updates the category film without Service Provider
  And user checks the Service Provider blank message when updating
  
  Scenario: Check edit category film when pressing cancel button
  Then user goes to the Manage Category Film page
  Then user clicks to the edit category film icon
  And user updates the category film with valid values but pressing Cancel button
  And user checks the status of page after canceling update
  
  Scenario: Check edit categoory film successful
  Then user goes to the Manage Category Film page
  Then user clicks to the edit category film icon
  And user updates the category film with valid values
  And user checks the update category film success message
  
  Scenario: Check delete category film when pressing cancel button
  Then user goes to the Manage Category Film page
  Then user clicks to the delete category film icon
  And user presses the Cancel button in the confirm alert
  And user checks the title of page when canceling delete
  
  Scenario: Check delete category film successful
  Then user goes to the Manage Category Film page
  Then user clicks to the delete category film icon
  And user presses the OK button in the confirm alert
  And user checks the delete category film success message
  

