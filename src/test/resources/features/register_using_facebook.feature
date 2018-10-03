@smoke
Feature: Register using Facebook or Google+

  Scenario: Register a user using Facebook
    Given test facebook user is available
    When a user registers using facebook
    Then the host should be able to see listing options

  Scenario: Register a user using Google+
    Given test facebook user is available
    When a user registers using googlePlus
    Then the guest should be able to search for listings