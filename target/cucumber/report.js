$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/expenses.feature");
formatter.feature({
  "name": "Test Expenses Module",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenarioOutline({
  "name": "select Employee Name From Dropdown List on Expenses To Submit Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test9"
    }
  ]
});
formatter.step({
  "name": "user log on the webpage where username is \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should clicking on the ExpenseProductButton",
  "keyword": "Then "
});
formatter.step({
  "name": "user should be able  on the create Button",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on the Employee Dropdown listt",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects the Employee Namee",
  "keyword": "And "
});
formatter.step({
  "name": "user should be able click on documents",
  "keyword": "Then "
});
formatter.step({
  "name": "user should be able createAttachment",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "in_ex_manager@info.com",
        "LLighg88"
      ]
    }
  ]
});
formatter.background({
  "name": "User on the Login page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User on the Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "BilalPD116_test1.user_on_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "select Employee Name From Dropdown List on Expenses To Submit Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    },
    {
      "name": "@test9"
    }
  ]
});
formatter.step({
  "name": "user log on the webpage where username is \"in_ex_manager@info.com\" and \"LLighg88\"",
  "keyword": "When "
});
formatter.match({
  "location": "MunevverPD123_test9.user_log_on_the_webpage_where_username_is_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should clicking on the ExpenseProductButton",
  "keyword": "Then "
});
formatter.match({
  "location": "MunevverPD123_test9.user_should_clicking_on_the_ExpenseProductButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able  on the create Button",
  "keyword": "And "
});
formatter.match({
  "location": "MunevverPD123_test9.user_should_be_able_on_the_create_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Employee Dropdown listt",
  "keyword": "Then "
});
formatter.match({
  "location": "MunevverPD123_test9.user_clicks_on_the_Employee_Dropdown_listt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the Employee Namee",
  "keyword": "And "
});
formatter.match({
  "location": "MunevverPD123_test9.user_selects_the_Employee_Namee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able click on documents",
  "keyword": "Then "
});
formatter.match({
  "location": "MunevverPD123_test9.user_should_be_able_click_on_documents()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able createAttachment",
  "keyword": "Then "
});
formatter.match({
  "location": "MunevverPD123_test9.user_should_be_able_createAttachment()"
});
formatter.result({
  "status": "passed"
});
});