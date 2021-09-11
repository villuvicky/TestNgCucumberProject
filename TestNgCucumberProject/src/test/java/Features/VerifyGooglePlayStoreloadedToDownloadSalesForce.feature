Feature: VerifyGooglePlayStoreloadedToDownloadSalesForce

  Scenario: VerifyGooglePlayStoreloadedToDownloadSalesForce
    Given Admin login to salesForce
    When Click on the sliding icon until Download SalesForceA is displayed
    And Click on Google Play link
    And A confirmation page is displayed.Click on Confirm button
    And Navigate to the Google Play window
    Then Verify that SalesForceA is displayed with enabled Install button
