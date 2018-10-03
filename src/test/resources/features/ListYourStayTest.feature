
@ssss
Feature: List your stay functionality testing
  Agile Story: As a host, I should be able to log in
  and go to the List Your Stay page
  and see multiple List Your Stay related options.


  Scenario: List Your Stay - Stay type options
    Given the user is on the 4Stay home page
    And the user logs in as a host
    And the user goes to the List Your Stay Page
    Then they should see various stay options:
    |Stay Type|
    |Property details|
    |Property amenities & rules|
    |Property location         |
    |Room details              |
    |Stay Features             |
    |Availability details      |
    |Price details             |
    |Stay photos               |
    |Review                    |


