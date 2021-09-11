Feature: Edit contact

  Scenario: Edit Contact
    Given Admin login to salesForce
    When Click on toggle menu button from the left corner
    And Click view All
    And click contacts from App Launcher
    And Get the size of conatcts available and print the list
    And search for the contact using unique name
    And Click on the dropdown icon available in the unique contact and select edit
    And Edit Title as 'Testing'
    And select '02/15/1997' in the birthday field
    And edit Lead Source as Purchased list
    And Edit Phone number with '9579235532'
    And Click Save and Verify and Print Phone number
    Then phone number should be verified and printed
    And Admin logsOut
