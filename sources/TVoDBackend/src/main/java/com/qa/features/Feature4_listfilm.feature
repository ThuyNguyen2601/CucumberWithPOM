Feature: Manage List Film

#@D1
Scenario: Search film by display name
Then user goes to the List Film page
Then user search Film by displayed name

#@D1
Scenario: Create film without display name
Then user goes to the List Film page
Then user clicks to Create Film button
Then user creates film without display name
Then user checks the display name blank message

#@D1
Scenario: Create film without poster image
Then user goes to the List Film page
Then user clicks to Create Film button
Then user creates film without poster image
Then user checks the poster image blank message

#@D1
Scenario: Create film without slideshow image
Then user goes to the List Film page
Then user clicks to Create Film button
Then user creates film without slideshow image
Then user checks the slideshow image blank message

#@D1
Scenario: Create Film without Service Provider
Then user goes to the List Film page
Then user clicks to Create Film button
Then user creates film without service provider
Then user checks the service provider blank message

#@D1
Scenario: Create Film without Category
Then user goes to the List Film page
Then user clicks to Create Film button
Then user creates film without Category
Then user checks the Category blank message

#@D1
Scenario: Create Film successful
Then user goes to the List Film page
Then user clicks to Create Film button
Then user creates film with valid values
Then user checks create Film successful message

#@D1
Scenario: Change status Film directory
Then user goes to the List Film page
Then user clicks to change status button
Then user selects value in dropdown
Then user clicks to apply change status button

#@D1
Scenario: View the Film
Then user goes to the List Film page
Then user clicks to the view film icon
Then user check the name of viewed film with title page

@D1
Scenario: Update the Film without Display name
Then user goes to the List Film page
Then user clicks to the update film icon
Then user update the Film without Display name
Then user check the update Display name blank message

@D1
Scenario: Update the Film without Poster image
Then user goes to the List Film page
Then user clicks to the update film icon
Then user update the Film without Poster image
Then user check the update Poster image blank message

@D1
Scenario: Update the Film without Slideshow image
Then user goes to the List Film page
Then user clicks to the update film icon
Then user update the Film without Slideshow image
Then user check the update Slideshow image blank message


@D1
Scenario: Update the Film without Service Provider
Then user goes to the List Film page
Then user clicks to the update film icon
Then user update the Film without Service Provider
Then user check the update Service Provider blank message


