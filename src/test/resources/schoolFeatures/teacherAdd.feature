@Bea2
Feature: Adding Teacher to the School database

  Background: User in on the School Login page

    Given User on the web page and login username "SchoolLogIn" and password "SchoolPassword"
    When User is clicking on LogIn Button

  @Hilal&Ulugbec
  Scenario: Adding new Teacher

    And User clicks on Teachers dropdown
    And User clicks on Add Teacher
    And User fills out information field
    And User clicks on Submit button to submit new Teacher
    Then Tester verifies if new Teacher exists in DataBase