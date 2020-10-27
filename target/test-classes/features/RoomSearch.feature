@SearchRoom
Feature:
  Scenario: As a manager, I should be able to search room with invalid room data.
    Given user is logged in

    And Click on Hotel Management Management button
    And Click on the room reservation button
    And Click on ContactNameSurname textbox and type valid name	"ELENI ILIAD"
    And Click on ContactPhone textbox and type valid phone number	"(306) 987-712"
    And Click on Search button
    Then Verify the message "No data available in table"


