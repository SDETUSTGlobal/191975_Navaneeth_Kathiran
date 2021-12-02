
Feature: View all orders
To view the page showing all orders  
User must be able to access orders website

Scenario: checkall button
Given: I am on List of all orders page
When I click on Check all button
Then: all products must be selected

Scenario: uncheckall button
When I click on Uncheck all button
Then: all products must be deselected

Scenario: check button
When I click on Checkbox
Then Particular products must be selected

Scenario: delete
When: I click on delect selected button
Then: Particular products must be deleted
