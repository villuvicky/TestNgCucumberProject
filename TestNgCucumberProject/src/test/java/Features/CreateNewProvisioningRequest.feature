Feature: Opportunity is created, edited and deleted

Scenario: Create New Provisioning Request
Given Admin login to salesForce
When Click on toggle menu button from the left corner
And Click view All
When Click on User Provisioning Request
And Click on the open in SalesForce Classic
And Click on Create New View
And Enter View Name as 'vicky'
And Enter View Unique Name as '77896'
And Click on My User Provisioning Requests Under Step two
And Under Field Select First DropDown as 'Name'
And Under Operator Get the List of values availble from dropdown
And Get the size of DropDown
And Under Field Select the First DropDown as 'Created Date'
And Under Step3 Get the List of Available Fields
And Under Step3 Get the List of Selected Fields
And Select an Option From Available Field  and Click Add Option 
Then Verify whether Field is added to Selected Fields 
When Under Step4  Click on Visible to All Users 
And Click on Save request
Then Verify New User is Created
And Get the Title of the Page
When Close Other Browsers Than Current Browser
Then other windows closed
And Admin logsOut