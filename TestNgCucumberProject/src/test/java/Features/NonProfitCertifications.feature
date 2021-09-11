Feature: NonProfitCertifications

  Scenario: NonProfitCertifications
    Given Admin login to salesForce
    When Click on the sliding icon until "See System Status" is displayed
    And Click on Get Started link
    And Navigate to SalesForce Trust new Window
    And Select Trust Compliance from the dropdown
    And Click on Show Filters
    And Select "Nonprofit" under INDUSTRIES
    Then Verify the 20 Ceriticates that are Nonprofit only should be displayed
    And Clear Filter option should be displayed
    And 20 Nonprofit certifications only be displayed
