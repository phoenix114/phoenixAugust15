@Bea1
Feature: Deleting Student to the School database

  Background: User in on the School Login page

    Given User1 on the web page and login username "SchoolLogIn" and password "SchoolPassword"
    When User1 is clicking on LogIn Button

  @Munevver&Bilal
  Scenario: Deleting a Student
    When User clicks on the Students dropdown
    And User clicks on All Students
    And User will click on dropdown toggle next to the students name
    And User will click on Delete button
    Then Tester verifies that Students name nolonger is in DataBase