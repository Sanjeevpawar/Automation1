Feature: To test the functioanlity of login page

Scenario Outline: Test the login page with valid creds
Given User navigates to the login page
When user enters the valid email id <username>
And User enters valid password <password>
And Clicks on login button
Then Login should be succesfull and home page must be displayed
Examples: 
     |username        |password    |
     |student		      |Password123 |
     |incorrectUser   |Password123 |