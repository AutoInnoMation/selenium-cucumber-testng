@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Search in Google
    Given I launch website using "<Website Name>"
    And I accept cookies
    When I search for "<Search Text>"
	
	Examples:
		| Website Name 			 | Search Text | 
		| https://google.com | Selenium    |
	