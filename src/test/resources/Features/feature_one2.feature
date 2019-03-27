@feature_one
Feature: My First Feature2

  @scenario_one
  Scenario Outline: My First Scenario2
    Given I have <test> cukes in my belly
    When I print out the results
    Then I should see seach results

    Examples:
    | test |
    | 1    |
    | 2    |
	
  @scenario_two
  Scenario: My Second Scenario2
    Given I have 7 cukes in my bellies
    Then I print out the results