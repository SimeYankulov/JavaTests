Feature: Adding a Question

  Scenario Outline:
    Given Open screen for adding a question
    When We input a quiz name for question: "<name>"
    And We input a question : "<question>"
    And We input points : <points>
    And We input timer : <timer>
    And Press the button to add question
    Then We get a message  : "<expectedMessage>"
    Examples:
      | name                  | question                                                   | points | timer | expectedMessage              |
      |                       | How many continents are there                              | 5      | 30    | Name of a quiz must be valid |
      | qui                   | How many continents are there                              | 5      | 30    | Name of a quiz must be valid |
      | quizquizquizquizquizz | How many continents are there                              | 5      | 30    | Name of a quiz must be valid |
      | @quizz                | How many continents are there                              | 5      | 30    | Name of a quiz must be valid |
      | Geography1            | How many continents are there                              | 5      | 30    | Name of a quiz must be valid |
      | Geography             |                                                            | 5      | 30    | Invalid question             |
      | Geography             | How                                                        | 5      | 30    | Invalid question             |
      | Geography             | How many continents are thereHow many continents are there | 5      | 30    | Invalid question             |
      | Geography             | @How many continents are there                             | 5      | 30    | Invalid question             |
      | Geography             | How many continents are theree                             | 5      | 30    | Question already added       |
      | Geography             | How many continents are there                              | 0      | 30    | Invalid points               |
      | Geography             | How many continents are there                              | 11     | 30    | Invalid points               |
      | Geography             | How many continents are there                              | 5      | 10    | Timer invalid                |
      | Geography             | How many continents are there                              | 5      | 65    | Timer invalid                |
      | Geography             | How many continents are there                              | 5      | 30    | Question added to quiz       |

