package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import pages.SchoolAllStudents_Page;
import pages.SchoolHome_Page;
import pages.SchoolLogin_Page;
import utilities.Driver;

import java.util.List;

public class SchoolStudentDelete_steps {

    SchoolLogin_Page login = new SchoolLogin_Page();
    SchoolHome_Page home = new SchoolHome_Page();
    SchoolAllStudents_Page schoolAllStudent = new SchoolAllStudents_Page();


    @When("User clicks on the Students dropdown")
    public void user_clicks_on_the_Students_dropdown() {
        home.studentDrop.click();


    }

    @When("User clicks on All Students")
    public void user_clicks_on_All_Students() {
        home.allStudents.click();
    }

    @When("User will click on dropdown toggle next to the students name")
    public void user_will_click_on_dropdown_toggle_next_to_the_students_name() {
            schoolAllStudent.firstStudentToggle.click();
    }
    @When("User will click on Delete button")
    public void user_will_click_on_Delete_button() throws InterruptedException {

        Thread.sleep(4000);
        schoolAllStudent.delete.click();
        //schoolAllStudent.deleted.click();
    }

    @Then("Tester verifies that Students name nolonger is in DataBase")
    public void tester_verifies_that_Students_name_nolonger_is_in_DataBase() {

    }
    @Given("User{int} on the web page and login username {string} and password {string}")
    public void user_on_the_web_page_and_login_username_and_password(Integer int1, String string, String string2) {
        login.cybertekSchoolLogin();
    }

    @When("User{int} is clicking on LogIn Button")
    public void user_is_clicking_on_LogIn_Button(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        login.loginButton.click();
    }

}
