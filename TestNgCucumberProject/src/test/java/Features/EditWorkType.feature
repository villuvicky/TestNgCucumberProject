Feature: Edit WorkType

  Scenario: Edit WorkType
    Given Admin login to salesForce
    When Click on toggle menu button from the left corner
    And Click view All
    And Click on Work Types
    And Click on the Arrow button at the end of the first result
    And Click on Edit
    And Enter Time Frame Start as '9'
    And Enter Time Frame End as '18'
    And Click on Save workType
    Then Verify the success message
    And Admin logsOut
