@smoke
Feature: Setting functionality testing
  Agile Story: As a registered user, I should be
  able to use the setting functionality
  to edit my information.

  Scenario: As a registered user I should be able to change my information
    Given The user is on the 4Stay home page
    When user is successfully logged in and dashboard is displayed
    And user should be able to change his information
    Then user should be able to see the the changes

