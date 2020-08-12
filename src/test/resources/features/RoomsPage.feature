@roomsPage
Feature: roomspage feature
  Scenario: user should be advanced search
    Given user is on the contact page url
    When user clicks on the rooms button
    And user select room type
    And user select adult count
    And user select children count
    And user clicks search button
