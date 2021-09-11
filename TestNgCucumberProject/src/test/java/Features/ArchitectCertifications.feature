Feature: Architect Certifications

  Scenario: Architect Certifications
    Given Admin login to salesForce
    When Click on Learn More link in Mobile Publisher
    And MouseHover On Resources
    And Select SalesForce Certification Under Learnings
    And Choose Your Role as Salesforce Architect
    And Get the Text Summary of Salesforce Architect
    And Download the Image of Technical Architect
    And Download the Image of Solution Architect
    Then Get the List of Salesforce Architect Certifications Available
    When Click on Application Architect
    Then Get the List of Certifications available
    And Admin logsOut
