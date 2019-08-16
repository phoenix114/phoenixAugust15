@test
Feature: Test Expenses Module

  Background: User on the Login page

    Given User on the web page and login username "manager1Email" and password "manager1Password"
    When User in home page and clicking to Expense Product Button


  @Delal
  Scenario: Uploading attachment to the Expenses To Submit

    Then click to create Button
    And user fills out all the mandatory fields
    And user clicks on Documents Button
    And user clicks on Import Button
    And user uploads the file

  @Hilal_1
  Scenario Outline:  totalAmountToSubmitHilal

    And user create Button click
    And user clicking on productDropDown button
    And user click on tshirt button
    And user type unitPrice "<unitPrice>"
    Then Then user type quantity "<quantity>"
    And user verifying actual title with expected title "<expectedTitle>"
    Examples:

      |unitPrice|quantity|expectedTitle|
      |5        |3       |$ 15.00      |




  @Hilal_2
  Scenario Outline:  Choosing Item From Dropdown List on Expenses To Submit Page

    Then user is clicking  the create Button
    And user selects the product from the Dropdown list
    And user writes the price "<unitPrice>" and quantity "<quantity>"
    And user selects the employee name
    And user clicks on the Submit button
    Examples:

         |unitPrice|quantity|
         |5.00       |3       |

  @Hilal_3
  Scenario: Choosing Employee Name From Dropdown List on Expenses To Submit Page
    Then user is clicking  on the create Button
    And user clicks on the Employee Dropdown list
    And user selects the Employee Name



    @Munnever_2
    Scenario Outline: select Employee Name From Dropdown List on Expenses To Submit Page
#      When user log on the webpage where username is "<username>" and "<password>"
#      Then user should clicking on the ExpenseProductButton
      And user should be able  on the create Button
      Then user clicks on the Employee Dropdown listt
      And user selects the Employee Namee
      Then user should be able click on documents
      Then user should be able createAttachment
      Examples:
        |username              |password        |
        |in_ex_manager@info.com|LLighg88        |



  @Munnever_1
  Scenario: Accessing to Expenses to Submit
    And User click on create button
    And User put customer name "Munevver"
    And User selects other options
    When User saves the expenses
    Then Verify the employee name





