Feature: Login Functionality of Leaftaps application

Background: 
Given Launch the browser
And Load the url as 'http://leaftaps.com/opentaps/'

Scenario: Login with valid credentials
And Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should be navigated to the next page

Scenario: Login with Invalid credentials
And Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should be in login page
