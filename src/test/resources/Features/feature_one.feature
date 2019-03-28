@feature_one
Feature: My First Feature

  @scenario_one
  Scenario Outline: My First Scenario
    Given I am able to go to Google homepage
    When I am able to search "<search_string>" 
    Then I should see search results

    Examples:
    |search_string	|
    |Maven Sample	|
    |Cucumber Sample|
	
  @scenario_two
  Scenario: My Second Scenario
    Given I am able to go to cucumber homepage
    Then I should see cucumber icon