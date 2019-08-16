package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SchoolAddStudents_Page;
import pages.SchoolAllStudents_Page;
import pages.SchoolHome_Page;
import utilities.Config;
import utilities.DBUtility;
import utilities.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolStudentAddAndDelete_steps {

    SchoolHome_Page home = new SchoolHome_Page();
    SchoolAddStudents_Page schoolAddStudents_page = new SchoolAddStudents_Page();
    SchoolAllStudents_Page schoolAllStudentsPage = new SchoolAllStudents_Page();

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    @Given ("User on the CybertekTraining web page")
    public void user_on_the_CybertekTraining_web_page() {
        Driver.getDriver().get(Config.getProperty("SchoolURL"));
    }





    @When("User clicks on Students dropdown")
    public void user_clicks_on_Students_dropdown() {
       home.studentDrop.click();

    }

    @When("User clicks on Add Student")
    public void user_clicks_on_Add_Student() {
        home.addStudent.click();
    }

    @When("User fills out information field for Student")
    public void user_fills_out_information_field_for_Student() {
        schoolAddStudents_page.firstNameBox.sendKeys(Config.getProperty("StudentFirstName"));
        schoolAddStudents_page.lastNameBox.sendKeys(Config.getProperty("StudentLastName"));
        schoolAddStudents_page.emailBox.sendKeys(Config.getProperty("StudentEmail"));
        schoolAddStudents_page.joiningDateBox.sendKeys(Config.getProperty("StudentJoiningDate"));
        schoolAddStudents_page.subjectBox.sendKeys(Config.getProperty("StudentSubject"));
        schoolAddStudents_page.mobileNumberBox.sendKeys(Config.getProperty("StudentMobileNumber"));

        Select select = new Select(schoolAddStudents_page.genderBox);
        select.selectByVisibleText(Config.getProperty("StudentGender"));

        schoolAddStudents_page.birthDateBox.sendKeys(Config.getProperty("StudentBirthDate"));
        schoolAddStudents_page.majorBox.sendKeys(Config.getProperty("StudentMajor"));
        schoolAddStudents_page.permanentAddressBox.sendKeys(Config.getProperty("StudentPermanentAddress"));
        schoolAddStudents_page.companyNameBox.sendKeys(Config.getProperty("StudentCompanyName"));
        schoolAddStudents_page.titleBox.sendKeys(Config.getProperty("StudentTitle"));
        schoolAddStudents_page.startDateBox.sendKeys(Config.getProperty("StudentStartDate"));
        schoolAddStudents_page.cityBox.sendKeys(Config.getProperty("StudentCity"));
        schoolAddStudents_page.streetBox.sendKeys(Config.getProperty("StudentStreet"));
        schoolAddStudents_page.zipCodeBox.sendKeys(Config.getProperty("StudentZipCode"));
        schoolAddStudents_page.stateBox.sendKeys(Config.getProperty("StudentState"));


    }

    @When("User clicks on Submit button to submit new Student")
    public void user_clicks_on_Submit_button_to_submit_new_Student() {
    schoolAddStudents_page.submitButton.click();
    }

    @Then("Tester verifies if new Student exists in DataBase")
    public void tester_verifies_if_new_Student_exists_in_DataBase() throws SQLException {
        connection = DriverManager.getConnection(Config.getProperty("oracleUrl"),
                Config.getProperty("oracleUsername"),
                Config.getProperty("oraclePassword"));
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        resultSet = statement.executeQuery("select * from student");
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        List<Map<String, Object>> table = new ArrayList<>();

        while (resultSet.next()){
            Map<String, Object> map = new HashMap<>();

            for(int column =1; column<=columnCount; column++){
                map.put(metaData.getColumnName(column), resultSet.getObject(column));

            }
            table.add(map);
        }


//        List<Map<String, Object>> table = DBUtility.executeSQLquery("select * from employees");
//
//        System.out.println("Size of my table: " + table.size());
//        for(Map<String, Object> m : table){
//            System.out.println(m.get("FIRST_NAME") + " " + m.get("LAST_NAME") + " " + m.get("SALARY"));
//        }








        boolean result = false;
        for (Map<String, Object> eachRow : table){

            boolean firstNameCheck = false;
            boolean lastNameCheck = false;
            boolean dateOfBirthCheck = false;
            boolean majorCheck = false;
            boolean subjectCheck = false;
            System.out.println(eachRow.get("BIRTH_DATE").toString().trim());

            for(int column =1; column<=columnCount; column++){
                if(eachRow.get(metaData.getColumnName(column)).toString().trim().equalsIgnoreCase("Munevver")){
                    firstNameCheck = true;
                    //System.out.println("First name: " + firstNameCheck);
                }
                if(eachRow.get(metaData.getColumnName(column)).toString().trim().equalsIgnoreCase("Tekin")){
                    lastNameCheck = true;
                    //System.out.println("Last name: " + lastNameCheck);
                }
                if(eachRow.get(metaData.getColumnName(column)).toString().trim().contains("1987-04-07")){
                    dateOfBirthCheck = true;
                    //System.out.println("Date of Birth: " + dateOfBirthCheck);
                }
                if(eachRow.get(metaData.getColumnName(column)).toString().trim().equalsIgnoreCase("Computer Science")){
                    majorCheck = true;
                    //System.out.println("Major: " + majorCheck);
                }

                if(eachRow.get(metaData.getColumnName(column)).toString().trim().equalsIgnoreCase("API")){

                    subjectCheck = true;
                    //System.out.println("Subject: " + subjectCheck);
                }
            }


        if(firstNameCheck==true&&lastNameCheck==true&&dateOfBirthCheck==true&&majorCheck==true&&subjectCheck==true){
            result = true;
            System.out.println("Result" + result);
            break;
        }



        }
        Assert.assertTrue("Database Check Failed", result);

        DBUtility.closeConnection();
    }

    @Then("User clicks on the three dots on the added new student spot")
    public void user_clicks_on_the_three_dots_on_the_added_new_student_spot() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();



        schoolAllStudentsPage.threeDotsOnTheAddedStudent.get(schoolAllStudentsPage.threeDotsOnTheAddedStudent.size()-1).click();
        schoolAllStudentsPage.allTheDeleteOptions.get(schoolAllStudentsPage.allTheDeleteOptions.size()-1).click();
    }

    @Then("User clicks on the Delete option")
    public void user_clicks_on_the_Delete_option() {
        schoolAllStudentsPage.allTheDeleteOptions.get(schoolAllStudentsPage.allTheDeleteOptions.size()-1);
//        Actions actions = new Actions(Driver.getDriver());
//        actions.moveToElement(schoolAllStudentsPage.deleteButton).perform();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.elementToBeClickable(schoolAllStudentsPage.deleteButton));
        schoolAllStudentsPage.deleteButton.click();
    }

    @Then("Tester verifies if the deleted student is still in the database")
    public void tester_verifies_if_the_deleted_student_is_still_in_the_database() throws SQLException {
        connection = DriverManager.getConnection(Config.getProperty("oracleUrl"),
                Config.getProperty("oracleUsername"),
                Config.getProperty("oraclePassword"));
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        resultSet = statement.executeQuery("select * from student");
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        List<Map<String, Object>> table = new ArrayList<>();

        while (resultSet.next()){
            Map<String, Object> map = new HashMap<>();

            for(int column =1; column<=columnCount; column++){
                map.put(metaData.getColumnName(column), resultSet.getObject(column));

            }
            table.add(map);
        }


//        List<Map<String, Object>> table = DBUtility.executeSQLquery("select * from employees");
//
//        System.out.println("Size of my table: " + table.size());
//        for(Map<String, Object> m : table){
//            System.out.println(m.get("FIRST_NAME") + " " + m.get("LAST_NAME") + " " + m.get("SALARY"));
//        }








        boolean result = false;
        for (Map<String, Object> eachRow : table){

            boolean firstNameCheck = false;
            boolean lastNameCheck = false;
            boolean dateOfBirthCheck = false;
            boolean majorCheck = false;
            boolean subjectCheck = false;
            System.out.println(eachRow.get("BIRTH_DATE").toString().trim());

            for(int column =1; column<=columnCount; column++){
                if(eachRow.get(metaData.getColumnName(column)).toString().trim().equalsIgnoreCase("Munevver")){
                    firstNameCheck = true;
                    //System.out.println("First name: " + firstNameCheck);
                }
                if(eachRow.get(metaData.getColumnName(column)).toString().trim().equalsIgnoreCase("Tekin")){
                    lastNameCheck = true;
                    //System.out.println("Last name: " + lastNameCheck);
                }
                if(eachRow.get(metaData.getColumnName(column)).toString().trim().contains("1987-04-07")){
                    dateOfBirthCheck = true;
                    //System.out.println("Date of Birth: " + dateOfBirthCheck);
                }
                if(eachRow.get(metaData.getColumnName(column)).toString().trim().equalsIgnoreCase("Computer Science")){
                    majorCheck = true;
                    //System.out.println("Major: " + majorCheck);
                }

                if(eachRow.get(metaData.getColumnName(column)).toString().trim().equalsIgnoreCase("API")){

                    subjectCheck = true;
                    //System.out.println("Subject: " + subjectCheck);
                }
            }


            if(firstNameCheck==true&&lastNameCheck==true&&dateOfBirthCheck==true&&majorCheck==true&&subjectCheck==true){
                result = true;
                System.out.println("Result" + result);
                break;
            }



        }
        Assert.assertTrue("Database Check Failed for Deletion", !result);

        DBUtility.closeConnection();
    }
}
