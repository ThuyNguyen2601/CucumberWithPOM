Feature: Manage Category Live

@H1
Scenario: Create Category Live without category name
Then user goes to the Category Live page
Then user clicks to the Create Category Live button
Then user creates new category live without name of category
Then user checks the blank name of category live message

@H2
Scenario: Create Category Live without service provider
Then user goes to the Category Live page
Then user clicks to the Create Category Live button
Then user creates new category live without service provider
Then user checks the service provicder blank message

@H3
Scenario: Create Category Live but press cancel button
Then user goes to the Category Live page
Then user clicks to the Create Category Live button
Then user creates new category live but press cancel button
Then user checks the title of page when press cancel create Category Live

@H4
Scenario: Create Category Live successful
Then user goes to the Category Live page
Then user clicks to the Create Category Live button
Then user creates new category live with valid values
Then user checks create category live successful message

@H5
Scenario: Update category live without category of name
Then user goes to the Category Live page
Then user clicks to the update Category Live icon
Then user updates new category live without name of category
Then user checks the update blank name of category live message

@H6
Scenario: Update category live without service provider
Then user goes to the Category Live page
Then user clicks to the update Category Live icon
Then user updates new category live without service provider
Then user checks the update blank service provider message

@H7
Scenario: Update category live but press cancel button
Then user goes to the Category Live page
Then user clicks to the update Category Live icon
Then user updates new category live but press cancel button
Then user checks the title of page after pressing calcel button

@H8
Scenario: Update category live successful
Then user goes to the Category Live page
Then user clicks to the update Category Live icon
Then user updates new category live with valid values
Then user checks update category live successful message

@H9
Scenario: Delete category live but press cancel button
Then user goes to the Category Live page
Then user clicks to the delete category live icon
Then user clicks to the cancel button in confirm alert
Then user check delete category live but pressing cancel

@H10
Scenario: Delete category live successful
Then user goes to the Category Live page
Then user clicks to the delete category live icon
Then user clicks to the OK button in confirm alert
Then user check delete category live successful message


