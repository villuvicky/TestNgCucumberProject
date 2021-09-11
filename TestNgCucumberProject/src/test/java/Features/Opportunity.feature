Feature: Opportunity is created, edited and deleted

  Background: 
    Given Admin login to salesForce
    When Click on toggle menu button from the left corner
    And Click view All
    And click Sales from App Launcher
    And Click on Opportunity tab

  Scenario: Create New Opportunity
    When Click on New button
    And Enter Opportunity name as 'Salesforce Automation by Vignesh Vicky Kannan'
    And Choose close date as Today
    And Select Stage as 'Needs Analysis'
    And Click on save
    Then New Opportunity should be created with name as 'Opportunity "Salesforce Automation by Vignesh Vicky Kannan" was created.'
    And Admin logsOut

  Scenario: Edit Opportunity
    When Search the Opportunity 'Salesforce Automation by Vignesh Vicky Kannan'
    And Click on the Dropdown icon and Select Edit
    And Choose close date as Tomorrow date
    And Select Stage as 'Perception Analysis'
    And Select Deliver Status as 'In progress'
    And Enter Description as 'SalesForce'
    And Click on Save and Verify Stage as 'Perception Analysis'
    Then Opportunity is Edited Successfully
    And Admin logsOut

  Scenario: Delete Opportunity
    When Search the Opportunity 'Salesforce Automation by Vignesh Vicky Kannan'
    And Click on  the Dropdown icon and Select Delete
    Then Opportunity deleted message is displayed as '"Salesforce Automation by Vignesh Vicky Kannan" was deleted. Undo'
    And Admin logsOut

  Scenario: Create Opportunity without mandatoryfields
    When Click on New button
    And Choose close date as Tomorrow date
    And Click on save
    Then Verify the Alert message as 'We hit a snag.' and 'Opportunity Name' and 'Stage'
    And 'Complete this field.' message should be displayed for Name and Stage fields
    When user clicks on cancel
    And Admin logsOut

  Scenario: OpportunitiesSortByAscendingTest
    When Select the Table view
    And Sort the Opportunities by Close Date in ascending order
    Then Verify the Opportunities displayed in ascending order by Close date
    And Admin logsOut
