Feature: Manage Category Clip

@F1
Scenario: Create new Category Clip when input blank name of category
Then user goes to the Category Clip page
Then user clicks to the Create Category Clip button
Then user creates new category clip without name of category
Then user checks the blank name of category clip message

@F1
Scenario: Create new Category Clip when does not select service provider
Then user goes to the Category Clip page
Then user clicks to the Create Category Clip button
Then user creates new category clip without service provider
Then user checks the blank service provider message

@F1
Scenario: Create new Category Clip when press Cancel button
Then user goes to the Category Clip page
Then user clicks to the Create Category Clip button
Then user creates new category clip but press Cancel button
Then user checks the page title after canceling create category clip

@F1
Scenario: Create new Category Clip successful
Then user goes to the Category Clip page
Then user clicks to the Create Category Clip button
Then user creates new category clip
Then user checks the create category clip successful message

@F1
Scenario: Update a Category Clip without name
Then user goes to the Category Clip page
Then user clicks to the update Category Clip icon
Then user updates Category Clip without name
Then user check the update Category Clip without name message

#@F1
Scenario: Update Category Clip without service provider
Then user goes to the Category Clip page
Then user clicks to the update Category Clip icon
Then user updates Category Clip without service provider
Then user check the update Category Clip without service provider message

@F1
Scenario: Update Category Clip successful
Then user goes to the Category Clip page
Then user clicks to the update Category Clip icon
Then user updates Category Clip with valid values
Then user check the update Category Clip successful message

@F1
Scenario: Delete Category Clip but press Cancel button
Then user goes to the Category Clip page
Then user clicks to the delete Category Clip icon
Then user presses cancel button in the confirm alert
Then user check the delete Category Clip but press cancel button

