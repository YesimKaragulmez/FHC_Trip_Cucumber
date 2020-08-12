@Negativelogin
Feature: Negativelogin feature

  Scenario: Negative scenario with wrong credential username and password
    Given user on the fhctrip.com
    And user enter the wrong credentials
    Then verify the errormessage