@smoke

Feature: Booking functionality testing
  Agile Story: As a user, I should be
  able to use the request a stay functionality.

  Scenario: As a registered user I should be able to request a stay
    Given The user is on the 4Stay home page
    When user is successfully logged in and dashboard is displayed
    Then user searches the <"area"> in search bar
    And user is able to see all listings in <"area">
    And user should be able to click the <"2"> listed option
    And user should be able to click on <"request a stay button">
    Then user should be able to see a confirmation

  Scenario: As a non registered user I should not be able to request a stay
    Given The user is on the 4Stay home page
    When User searches the <"area"> in search bar
    And user is able to see all listings in <"area">
    And user should be able to click the <"2"> listed option
    Then user should not be able to click on <"request a stay button">