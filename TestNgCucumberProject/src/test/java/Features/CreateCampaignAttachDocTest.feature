Feature: Attach document to the newly created campaign
Scenario: Attach document to the newly created campaign

Given Admin login to salesForce
When Click on toggle menu button from the left corner
And Click view All
And click Sales from App Launcher
And Click on Campaigns tab 
And Click "Bootcamp" link
And Click on Upload button 
And Select a file from local and upload  a pdf file
Then Verify the file name displayed as link
And "1 file was added to the Campaign." should be displayed
And Admin logsOut