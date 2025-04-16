Feature: Create Lead Functionality of Leaftaps application

Scenario Outline: Create Lead with multiple data
Given Launch the browser
And Load the url as 'http://leaftaps.com/opentaps/'
And Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should be navigated to the next page
When Click on the CRMSFA link
And Click on the Leads link
And Click on the CreateLeads Link
And Enter the companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>
And Click on the CreateLead button

Examples:
|companyname|firstname|lastname|
|'TestLeaf'|'Suriya'|'kala'|
|'Qeagle'|'Suriya'|'kala'|
