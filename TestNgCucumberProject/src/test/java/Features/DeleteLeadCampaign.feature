Feature: Delete the Lead associated to Campaign and check

  Scenario: Delete the Lead associated to Campaign and check
    Given Admin login to salesForce
    When Click on toggle menu button from the left corner
    And Click view All
    And click Sales from App Launcher
    And Click on Leads tab
    And Search for Lead with name as 'Rajkumar VV'
    And Click on dropdown icon for the Lead and Select Delete
    And Confirm the Delete for Lead
    And Click on Campaigns tab
    And Click 'Bootcamp3' link
    And Verify the associated Lead
    Then Lead should not be there as it is deleted
    And Admin logsOut
