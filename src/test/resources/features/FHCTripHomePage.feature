@HomePage
Feature: HomePage Feature

  Background:
    Given go to fhctrip.com

  Scenario: verify the fhctrip text
    When verify the FHCTRIP text on the top-left corner

  Scenario: verify the welcome text
    When verify the Welcome To Our Hotel text

  Scenario: verify the number of staff
    When  verify the number of staff is 1,000


