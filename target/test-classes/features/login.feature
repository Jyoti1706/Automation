Feature: Application login
Scenario: Login to home page with valid user
Given user is on home page
When username and password entered
And login vutton is clicked
Then home page get populated
And welcome message is displayed
