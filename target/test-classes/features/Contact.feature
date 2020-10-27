@contactPage
Feature: contact feature

  Scenario: user should send a message
    Given user is on the fhctrip contact url
    And user enter her name and surname
    And user enter the email address in to email address input box
    And user enter the  phone number in to phone number input box
    And user enter the subject in to subject input box
    And user enter the message in to message input box
    And user clicks the send message box
    Then verify if user send message successfully
