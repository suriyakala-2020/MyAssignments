Feature: Create account in salesforce

Scenario Outline: Create public account in salesforce
Given Launch the browser for testing salesforce application
And Load the url as 'https://login.salesforce.com'
And Enter the username as 'vidyar@testleaf.com'
And Enter the password as 'Sales@123'
And Click on the salesforce Login button
And Click on toggle menu button from the left corner 
And Click view All and click Sales from App Launcher 
And Click on Accounts tab 
And Click on New button 
And Enter account name as <AccountName>
And Select Ownership as Public
When Click save button
Then verify Account name appears as <AccountName>
Examples:
|AccountName|
|'Suriyakala'|

