Feature: Hotel Creation feature

  Background:
    Given user is logged in
    And user clicks on hotel management

  @hotelCreation
  Scenario: user create a hotel
    When user clicks on hotel list
    Then verify the new page
    When user clicks on the ADD HOTEL
    Then verify the list of hotels page
    And user enter the code
    And user enter the name
    And user enter the address
    And user enter the phone
    And user enter the email
    And user enter the IDgroup
    And user clicks on the save button
    And user clicks on the OK button

  @roomCreation
  Scenario: user create a room
    When user clicks on hotel Rooms
    And user clicks addhotelroom
    And user enter the IDhotel
    And user enter the description
    And user enter the price
    And user enter the room type
    And user enter the max adult count
    And user enter the max children count
    And user clicks on the Save button
    Then Verifying text is equal to HotelRoom was inserted successfully

  @roomReservation
  Scenario: user reserve a room

    When user clicks on Room Reservations
    And user clicks ADD ROOM RESERVATION
    And user enter the Select user
    And user enter the Select hotel room
    And user enter the Price
    And user enter the date start
    And user enter the date end
    And user enter the adultamount
    And user enter the childrenamount
    And user enter the contactnamesurname
    And user enter the contactphone
    And user enter the contact email
    And user enter the notes
    And user clicks Approved
    And user clicks Is paid
    Then user clicks on the save button