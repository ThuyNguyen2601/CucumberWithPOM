Feature: Manage List Film

@D1
Scenario: Search film by display name
Then user goes to the List Film page
Then user search Film by displayed name

@D1
Scenario: Create film without display name
Then user goes to the List Film page
Then user clicks to Create Film button
Then user creates film without display name
Then user checks the display name blank message

