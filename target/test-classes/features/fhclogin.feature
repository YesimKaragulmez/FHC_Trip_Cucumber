@fhclogin
Feature: Login Functionality

  Scenario: 2011 Manager is able to login with valid credentials
    Given User is on Home Page
    And Click on Log in link
    And Click on user name text box and type it "manager2"
    And Click on password name text box and type it "Man1ager2!"
    And Click login button
    Then Verify LISTOFUSERS text is located


