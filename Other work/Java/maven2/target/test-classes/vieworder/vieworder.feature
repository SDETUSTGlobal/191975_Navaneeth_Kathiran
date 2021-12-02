
Feature: View all orders
To view the page showing all orders  
User must be able to access orders website

Scenario: checkall button
Given: I am on the website page
When: User clicks all 
Then: all items are checked

Scenario: uncheckall button
Given:  I am on website page
When: all items are checked
And: User clicks uncheckall 
Then: all items unchecked

Scenario: check button
Given: I am on website page
When: User click the checkbox
Then: the order is selected

Scenario: delete
Given: I am on website page
When: the order is selected
And: User click delete
Then: items deleted
