@smoke
Feature: 4Stay homepage demo

  Agile Story:
  As a guest, when I click on the registration link,
  I should be able to see multiple registration options

  Scenario: Registration link options
    Given the user is on the 4Stay home page
    When the user clicks on the registration options
    Then following registration options should be displayed:
      | Continue with Facebook |
      | Continue with Google   |
      | Continue with Email    |

  Scenario Outline: "What they say?"
    Given the user is on the 4Stay home page
    When user scrolls down page the <"4"> testimotials should be displayed
    And user should be able to click next button to read one testimonial at the time
    Then user should see testimonial information for "<name> <contains_message>"
      | name   | <t_name>  |
      | message  | <contains_message>  |
    Examples:
      |t_name| contains_message   |
      |Leeza Fernand | As an Associate  |
      |Rudolf| I came from |
      |Student| My home was |
      |Zeine P.|  My home was|

