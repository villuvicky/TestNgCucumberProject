Feature: Attach document to the newly created campaign
Scenario: Attach document to the newly created campaign

Given Admin login to salesForce
When Click on toggle menu button from the left corner
And Click view All
And click Sales from App Launcher
And Click on Campaigns tab  
And Click "Bootcamp" link
And Click on New Contact under Search field
And Pick Salutation as 'Mr.'
And Enter first name as "Vignesh"
And Enter last name as "Prahash"
And Click Save
And Click on Add Contact from Campaign member
And Select the Created Contact "Vignesh Prahash"
And Click Next
And Click Submit on the Add to Campaign pop up
Then verify the created Contact under Campaign by clicking View All
When Navigate to Contacts tab
And Search for Cantact with your Name "Vignesh Prahash"
Then Contact should be created under Contacts tab and associated to campaign
And Admin logsOut