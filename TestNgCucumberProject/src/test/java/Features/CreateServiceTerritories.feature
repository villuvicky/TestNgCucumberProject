Feature: Create Service Territories

Scenario: Create Service Territories
Given Admin login to salesForce
When Click on toggle menu button from the left corner
And Click view All
And Click on Service Territories
And Click on New 
And Enter 'Vignesh Kanna' in Name field
And Click on Operating Hours and Choose the First option
And Check Active Field
And Enter the City as 'Karur' in City Field
And Enter the State as 'TamilNadu' in State Field
And Enter the Country as 'India' in Country Field
And Enter '639002' as Postal Zip Code 
And Click on Save service Territories
Then Service Territory is created Successfully and message displayed as 'Service Territory "Vignesh Kanna" was created.'
And Admin logsOut