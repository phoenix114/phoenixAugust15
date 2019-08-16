package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.ExpensesPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.Config;
import utilities.Driver;

public class ExpensesModuleCucumberJenkins_steps {
    LoginPage loginPage = new LoginPage();
    ExpensesPage expensesPage = new ExpensesPage();

    HomePage hp = new HomePage();

   // BilalPD116_test1
        @Given("User on the web page and login username {string} and password {string}")
        public void user_on_the_web_page_and_login_username_and_password(String string, String string2) throws InterruptedException {
            Driver.getDriver().get(Config.getProperty("url"));
            LoginPage lp = new LoginPage();

            lp.briteERPLogin(Config.getProperty(string), Config.getProperty(string2));// Given website url
            Thread.sleep(2000);
        }
        @When("User in home page and clicking to Expense Product Button")
        public void user_in_home_page_and_clicking_to_Expense_Product_Button() {

            hp.clickingOnExpensesButton();   // Then click to home page;
        }

        @Given("click to ExpenseProductButton")
        public void click_to_ExpenseProductButton() throws InterruptedException {
            expensesPage.clickingExpenseProductsButton(); // And click to ExpenseProductButton;
            Thread.sleep(2000);
        }

        @Given("click to creat Button")
        public void click_to_creat_Button() throws InterruptedException {
            //WebElement createButton = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]"));
Thread.sleep(2000);
            expensesPage.createButtonBilal.click();//when click to creat Button;
        }

        @Given("type product name in productNameBox")
        public void type_product_name_in_productNameBox() {
            WebElement productNameBox = Driver.getDriver().findElement(By.xpath("//*[@id=\"o_field_input_99\"]"));
            productNameBox.sendKeys(Config.getProperty("productName1"));// Then type product name in productNameBox;
        }

        @Given("Select Consumable in productTypeDropDownButon")
        public void select_Consumable_in_productTypeDropDownButon() {
            WebElement productTypeDropdown = Driver.getDriver().findElement(By.xpath("//*[@id=\"o_field_input_101\"]"));
            Select select = new Select(productTypeDropdown);
            select.selectByVisibleText("Consumable");// And Select Consumable in productTypeDropDownButon;
        }

        @When("click to taxTypesDropDown")
        public void click_to_taxTypesDropDown() {
            WebElement taxTypesDropdown = Driver.getDriver().findElement(By.xpath("//*[@id=\"o_field_input_108\"]"));
            taxTypesDropdown.click();// When click to taxTypesDropDown;
        }

        @Then("click to salesTaxSelection")
        public void click_to_salesTaxSelection() {
            WebElement salesTaxSelection = Driver.getDriver().findElement(By.xpath("//a[.='sales']"));
            salesTaxSelection.click();//Then click to salesTaxSelection;
        }

        @Then("check the archiveButton, is it enabled or not")
        public void check_the_archiveButton_is_it_enabled_or_not() {
            WebElement archiveButton = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/div[1]/button/div[2]/span[1]"));
            boolean check = archiveButton.isEnabled();

            Assert.assertTrue(check, "Verification of archieving new expense product is FAILED");// And check the archiveButton, is it enabled or not;
            //Driver.getDriver().close();
        }


//     DelalPD121_test2




        @Then("click to create Button")
        public void click_to_create_Button() throws InterruptedException {
            Thread.sleep(2000);
            WebElement createButton = Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-primary btn-sm o_list_button_add']"));
            createButton.click();// And click to creat button
            Thread.sleep(2000);
        }

        @Then("user fills out all the mandatory fields")
        public void user_fills_out_all_the_mandatory_fields() throws InterruptedException {
            Driver.getDriver().findElement(By.id("o_field_input_19")).click();
            Thread.sleep(2000);
            Driver.getDriver().findElement(By.xpath("//a[.='[253] Tshirt']")).click();
            Thread.sleep(2000);
            Driver.getDriver().findElement(By.id("o_field_input_27")).click();
            Thread.sleep(2000);
            Driver.getDriver().findElement(By.xpath("//a[.='Ashley Presley']")).click();
            Thread.sleep(2000);

        }

        @Then("user clicks on Documents Button")
        public void user_clicks_on_Documents_Button() throws InterruptedException {
            Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-sm oe_stat_button']")).click();
            Thread.sleep(2000);

        }

        @Then("user clicks on Import Button")
        public void user_clicks_on_Import_Button() {
            Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-sm btn-default o_button_import']")).click();
        }

        @Then("user uploads the file")
        public void user_uploads_the_file() throws InterruptedException {
            WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@class='oe_import_file_show form-control']"));
            // chooseFile.click();
            chooseFile.sendKeys("C:\\Users\\delal\\Desktop\\mavenb11\\briteERP.txt"+ Keys.ENTER);
            Thread.sleep(2000);//And uplaod the file

        }




    // HilalPD94_test3 {





        @When("user create Button click")
        public void user_create_Button_click() throws InterruptedException {
            Thread.sleep(1000);
            WebElement createButton = Driver.getDriver().findElement(By.cssSelector(".o_list_button_add"));
            createButton.click();//And user create Button click
        }

        @When("user clicking on productDropDown button")
        public void user_clicking_on_productDropDown_button() {
            WebElement productDropdown = Driver.getDriver().findElement(By.id("o_field_input_19"));
            productDropdown.click();// And user clicking on productDropDown button
        }

        @When("user click on tshirt button")
        public void user_click_on_tshirt_button() throws InterruptedException {
            WebElement tshirt = Driver.getDriver().findElement(By.xpath("//a[.='[253] Tshirt']"));
            tshirt.click();
            Thread.sleep(1000);// And user click on tshirt button
        }

        @When("user type unitPrice {string}")
        public void user_type_unitPrice(String string) {
            WebElement unitPriceInput = Driver.getDriver().findElement(By.id("o_field_input_20"));
            unitPriceInput.clear();
            unitPriceInput.sendKeys(string);// Then user type unitPrice "5"
        }

        @Then("Then user type quantity {string}")
        public void then_user_type_quantity(String string) throws InterruptedException {
            WebElement quantityInput = Driver.getDriver().findElement(By.id("o_field_input_21"));
            quantityInput.clear();
            quantityInput.sendKeys(string+ Keys.ENTER);
            Thread.sleep(1000);// Then user type quantity "3"
        }



        @Then("user verifying actual title with expected title {string}")
        public void user_verifying_actual_title_with_expected_title(String string) {
            WebElement totalAmount = Driver.getDriver().findElement(By.xpath("//span[@name='total_amount']"));
            String actualtitle = totalAmount.getText();
            String expecttitle = string;
            Assert.assertEquals(actualtitle,expecttitle);//And user verifying actual title with expected title
        }




   // HilalPD98_test4






        @Then("user is clicking  the create Button")
        public void user_is_clicking_the_create_Button() throws InterruptedException {
            Thread.sleep(2000);
            WebElement createButton = Driver.getDriver().findElement(By.cssSelector(".o_list_button_add"));
            createButton.click();
            Thread.sleep(1000);
        }

        @Then("user selects the product from the Dropdown list")
        public void user_selects_the_product_from_the_Dropdown_list() {
            WebElement productDropdown = Driver.getDriver().findElement(By.id("o_field_input_19"));
            productDropdown.click();
            WebElement tshirt = Driver.getDriver().findElement(By.xpath("//a[.='[253] Tshirt']"));
            tshirt.click();
        }
        @Then("user writes the price {string} and quantity {string}")
        public void user_writes_the_price_and_quantity(String string, String string2) throws InterruptedException {
            Thread.sleep(2000);
            WebElement unitPriceInput = Driver.getDriver().findElement(By.id("o_field_input_20"));
            unitPriceInput.clear();
            unitPriceInput.sendKeys(string);
            Thread.sleep(2000);
            WebElement quantityInput = Driver.getDriver().findElement(By.id("o_field_input_21"));
            quantityInput.clear();
            quantityInput.sendKeys(string2+ Keys.ENTER);
            Thread.sleep(2000);
        }


        @Then("user selects the employee name")
        public void user_selects_the_employee_name() {
            WebElement employeeDropdown = Driver.getDriver().findElement(By.id("o_field_input_27"));
            employeeDropdown.click();
            WebElement selectEmployee = Driver.getDriver().findElement(By.xpath("//a[.='Demo User']"));
            selectEmployee.click();
        }

        @Then("user clicks on the Submit button")
        public void user_clicks_on_the_Submit_button() throws InterruptedException {
            WebElement submitButton = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/button[1]"));
            submitButton.click();

            WebElement expectedText = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[4]/ul/li[1]/a"));
            Assert.assertTrue(expectedText.isDisplayed());
            // Driver.getDriver().close();
            Thread.sleep(2000);
        }



   //  HilalPD99_test5




        @Then("user is clicking  on the create Button")
        public void user_is_clicking_on_the_create_Button() {
            WebElement createButton = Driver.getDriver().findElement(By.cssSelector(".o_list_button_add"));
            createButton.click();
        }

        @Then("user clicks on the Employee Dropdown list")
        public void user_clicks_on_the_Employee_Dropdown_list() throws InterruptedException {
            Thread.sleep(2000);
            WebElement employeeDropdown = Driver.getDriver().findElement(By.id("o_field_input_27"));
            employeeDropdown.click();
        }

        @Then("user selects the Employee Name")
        public void user_selects_the_Employee_Name() throws InterruptedException {
            WebElement selectEmployee = Driver.getDriver().findElement(By.xpath("//a[.='David Samson']"));
            selectEmployee.click();
            Thread.sleep(1000);
            Assert.assertTrue(!selectEmployee.isDisplayed());
            //Driver.getDriver().close();

        }


  //   MunevverPD104_test7



        @Given("User click on create button")
        public void user_click_on_create_button() {

            expensesPage.createButton.click();
        }

        @Given("User put customer name {string}")
        public void user_put_customer_name(String name) {

            expensesPage.customer.sendKeys(name);
        }

        @Given("User selects other options")
        public void user_selects_other_options() {

            expensesPage.product.click();

            expensesPage.chooseProduct.click();

            expensesPage.dateInput.click();

            expensesPage.datebox.click();

            expensesPage.employeeInput.click();

            expensesPage.employeeName.click();
        }

        @When("User saves the expenses")
        public void user_saves_the_expenses() {

            expensesPage.clickSave.click();

        }

        @Then("Verify the employee name")
        public void verify_the_employee_name() {

            String expectedEmployeeName = "Ashley Presley";

            org.junit.Assert.assertTrue("Failed because it if not displaed!", expensesPage.actualEmployeeName.isDisplayed());
        }



  //   MunevverPD123_test9




        @When("user log on the webpage where username is {string} and {string}")
        public void user_log_on_the_webpage_where_username_is_and(String string, String string2) {
            Driver.getDriver().get(Config.getProperty("url"));
            LoginPage lg = new LoginPage();
            lg.emailBox.sendKeys("in_ex_officer2@info.com");
            lg.passwordBox.sendKeys("LLighg94");
            lg.loginButton.click();
        }

        @Then("user should clicking on the ExpenseProductButton")
        public void user_should_clicking_on_the_ExpenseProductButton() {
            expensesPage.expenses.click();

        }

        @Then("user should be able  on the create Button")
        public void user_should_be_able_on_the_create_Button() throws InterruptedException {
            Thread.sleep(2000);
            expensesPage.createButton.click();
            expensesPage.customer.sendKeys("munevver");
            expensesPage.product.click();
            expensesPage.chooseProduct.click();
            expensesPage.dateInput.click();
            expensesPage.datebox.click();
        }

        @Then("user clicks on the Employee Dropdown listt")
        public void user_clicks_on_the_Employee_Dropdown_listt() {
            expensesPage.employeeInput.click();


        }

        @Then("user selects the Employee Namee")
        public void user_selects_the_Employee_Namee() {
            expensesPage.employeeName.click();
            expensesPage.clickSave.click();
        }

        @Then("user should be able click on documents")
        public void user_should_be_able_click_on_documents() {
            expensesPage.document.click();
        }

        @Then("user should be able createAttachment")
        public void user_should_be_able_createAttachment() throws InterruptedException {
            Thread.sleep(2000);
            expensesPage.createAttachment.click();
            expensesPage.typeAttachment.sendKeys("munever");
            Select select = new Select(expensesPage.type);
            select.selectByIndex(1);
            expensesPage.url.sendKeys("https://www.google.com/");
            expensesPage.save.click();


        }








}
