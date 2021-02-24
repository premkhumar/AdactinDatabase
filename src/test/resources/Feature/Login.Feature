Feature: Validating Login Functionality of Adactin

  Scenario: Successfull Login with valid Credentials
    Given User is on the login page
    When User enters Valid username and password
    Then Successfull Login and HomePage is visible
