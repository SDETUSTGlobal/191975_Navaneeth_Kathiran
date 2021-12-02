Feature: Login Function
To enter into the smartbears website
User must be able to access website if the login is successful

Scenario: Login

Given: User on the login page

And User enters the "Username" with "Tester" sendKeys

And User enters the "password" with "test" sendKeys

And User clicks the "login" button

Then User sees "Web Orders" = current title

Scenario: Unsuccessful login

When User registration unsuccessful

Then It should reverse back on the login page
