@smoke

Feature: Sign up as a user using various verification tools

  Background:
    Given the user is on the 4Stay home page
    When the user clicks on the registration options



  Scenario: Create a user profile using an email address
    Then the user should be able to sign up with a valid email address


  Scenario: Create a user profile using a facebook account
    Then the user should be able to sign up with a valid facebook account

  Scenario:  Create a user profile using a Google+ account
    Then the user should be able to sign up with a valid Google+ address