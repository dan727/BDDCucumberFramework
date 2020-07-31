Feature: Login feature

  Scenario: Login Scenario
    Given User is in the application homepage
    When The application home page title is Slickdeals
    Then User clicks on Login button
    And enters username
    Then clicks Continue
    And enters password
    Then clicks Log In