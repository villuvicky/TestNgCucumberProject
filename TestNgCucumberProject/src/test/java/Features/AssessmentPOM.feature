Feature: AssessmentPOM

  Scenario: AssessmentPOM
    Given Admin login to salesForce
    When Click on Community under Most Recently Used
    And Print the Application Name and Developer Name for the App Type as "Lighting"
    And Click on View Profile icon
    And Click on Switch to Salesforce Classic
    And Click on Create New and Select Event
    And Enter the Subject as "Call/Email/Meeting"
    And Enter Start date as tomorrow
    And Enter End date as day after tomorrow
    And Add invitees as Contact Click on the LookUp icon
    And Search for name "dev r" and select first result
    And click choose File
    And click attach File
    And click done
    Then Verify that the file is attached to the file
    When Click on Save
    And Admin logsOut
