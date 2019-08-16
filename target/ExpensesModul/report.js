$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/schoolFeatures/studentAddAndDelete.feature");
formatter.feature({
  "name": "Adding Student to the School database",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Bea"
    }
  ]
});
formatter.background({
  "name": "User in on the School Login page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User on the CybertekTraining web page",
  "keyword": "Given "
});
formatter.match({
  "location": "SchoolStudentAddAndDelete_steps.user_on_the_CybertekTraining_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding new Student and Deleting the Added New Student",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Bea"
    },
    {
      "name": "@Diana\u0026Azamat"
    }
  ]
});
formatter.step({
  "name": "User clicks on Students dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "SchoolStudentAddAndDelete_steps.user_clicks_on_Students_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Add Student",
  "keyword": "And "
});
formatter.match({
  "location": "SchoolStudentAddAndDelete_steps.user_clicks_on_Add_Student()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fills out information field for Student",
  "keyword": "And "
});
formatter.match({
  "location": "SchoolStudentAddAndDelete_steps.user_fills_out_information_field_for_Student()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Submit button to submit new Student",
  "keyword": "And "
});
formatter.match({
  "location": "SchoolStudentAddAndDelete_steps.user_clicks_on_Submit_button_to_submit_new_Student()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Tester verifies if new Student exists in DataBase",
  "keyword": "Then "
});
formatter.match({
  "location": "SchoolStudentAddAndDelete_steps.tester_verifies_if_new_Student_exists_in_DataBase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the three dots on the added new student spot",
  "keyword": "Then "
});
formatter.match({
  "location": "SchoolStudentAddAndDelete_steps.user_clicks_on_the_three_dots_on_the_added_new_student_spot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Delete option",
  "keyword": "Then "
});
formatter.match({
  "location": "SchoolStudentAddAndDelete_steps.user_clicks_on_the_Delete_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Tester verifies if the deleted student is still in the database",
  "keyword": "Then "
});
formatter.match({
  "location": "SchoolStudentAddAndDelete_steps.tester_verifies_if_the_deleted_student_is_still_in_the_database()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});