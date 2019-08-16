@Bea
Feature: Adding Student to the School database

  Background: User in on the School Login page

    Given User on the web page and login username "SchoolLogIn" and password "SchoolPassword"
    When User is clicking on LogIn Button

    @Diana&Azamat
  Scenario: Adding new Student
    And User clicks on Students dropdown
    And User clicks on Add Student
    And User fills out information field for Student
    And User clicks on Submit button to submit new Student
    Then Tester verifies if new Student exists in DataBase