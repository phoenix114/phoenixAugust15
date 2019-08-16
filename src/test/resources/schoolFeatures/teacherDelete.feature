@Bea3
Feature: Deleting Teacher to the School database

  Background: User in on the School Login page

    Given User on the web page and login username "SchoolLogIn" and password "SchoolPassword"
    When User is clicking on LogIn Button

  @TarikAbi&Delal
  Scenario: Deleting a Teacher
    When User clicks on the Teachers dropdown
    And User clicks on All Teachers
    And User will click on dropdown toggle next to the Teachers name
    And User will click on the Delete button
    Then Tester verifies that Teacher is no longer exists in DataBase