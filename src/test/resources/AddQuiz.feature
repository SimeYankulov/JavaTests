Feature: Adding a Quiz

  Scenario Outline:
    Given Open screen for adding a Quiz
    When We input a quiz name: "<name>"
    And Press the button to add
    Then We get a message : "<expectedMessage>"
    Examples:
      | name                  | expectedMessage                     |
      | Geography1            | Successfully added a new quiz       |
      | Geography             | Quiz name already exists            |
      |                       | Quiz name cannot be blank           |
      | qui                   | Invalid quiz name                   |
      | quizquizquizquizquizz | Invalid quiz name                   |
      | @quizz                | Quiz name cannot contain characters |

