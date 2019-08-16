@test
Feature: Test Expenses Module_1
  Background: User on the Login page
    Given User on the web page and login username "manager1Email" and password "manager1Password"
    When User in home page and clicking to Expense Product Button
  @Bilal
  Scenario: creatingNewExpenseProduct
    And click to ExpenseProductButton
    And click to creat Button
    And type product name in productNameBox
    And Select Consumable in productTypeDropDownButon
    When click to taxTypesDropDown
    Then click to salesTaxSelection
    And check the archiveButton, is it enabled or not
