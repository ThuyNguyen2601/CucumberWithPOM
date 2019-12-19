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
