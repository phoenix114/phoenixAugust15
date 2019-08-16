@Bea
Feature: Adding Student to the School database

  Background: User in on the School Login page

    Given User on the CybertekTraining web page


    @Diana&Azamat
  Scenario: Adding new Student and Deleting the Added New Student
    And User clicks on Students dropdown
    And User clicks on Add Student
    And User fills out information field for Student
    And User clicks on Submit button to submit new Student
    Then Tester verifies if new Student exists in DataBase
    Then User clicks on the three dots on the added new student spot
    Then User clicks on the Delete option
    Then Tester verifies if the deleted student is still in the database




