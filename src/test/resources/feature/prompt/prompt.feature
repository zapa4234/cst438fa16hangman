Feature: Prompt
  As a user, I can see where the prompt is, so that I can see where to type my answer.

  Scenario: Visible prompt
    When I am on the hangman homepage
    Then the prompt should read Letter
