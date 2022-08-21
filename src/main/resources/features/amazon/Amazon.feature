Feature: Testing amazon functionality

  Scenario: Happy path Amazon search functionality
    Given User navigates to Amazon
    When User searches for iPhone 13 cases
    Then User gets 50000 links on Amazon
    And User validates all headers contains iPhone