//package smokeSuite;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.Ignore;
//import org.testng.annotations.Test;
//import pages.ExpensesPage;
//import pages.HomePage;
//import pages.LoginPage;
//import utilities.Config;
//import utilities.Driver;
//
//
//import java.util.List;
//
//import static utilities.Config.getProperty;
//
//
//public class ExpensesModule {
//
//
//    @Test
//    public void creatingNewExpenseProduct(){
//
//        LoginPage lp = new LoginPage();
//
//        lp.briteERPLogin(Config.getProperty("manager1Email"), Config.getProperty("manager1Password"));
//
//        HomePage hp = new HomePage();
//        hp.clickingOnExpensesButton();
//
//        ExpensesPage ep = new ExpensesPage();
//        ep.clickingExpenseProductsButton();
//
//        WebElement createButton = Driver.getDriver().findElement(By.cssSelector("button.btn.btn-primary.btn-sm.o-kanban-button-new.btn-default"));
//        createButton.click();
//
//        WebElement productNameBox = Driver.getDriver().findElement(By.cssSelector("input#o_field_input_95"));
//        productNameBox.sendKeys(getProperty("productName1"));
//
//        WebElement productTypeDropdown = Driver.getDriver().findElement(By.id("o_field_input_97"));
//        Select select = new Select(productTypeDropdown);
//        select.selectByVisibleText("Consumable");
//
//        WebElement taxTypesDropdown = Driver.getDriver().findElement(By.id("o_field_input_104"));
//        taxTypesDropdown.click();
//
//        WebElement salesTaxSelection = Driver.getDriver().findElement(By.xpath("//a[.='sales']"));
//        salesTaxSelection.click();
//
//        WebElement archiveButton = Driver.getDriver().findElement(By.cssSelector("button.btn.btn-sm.oe_stat_button"));
//        boolean check = archiveButton.isEnabled();
//
//        Assert.assertTrue(check, "Verification of archieving new expense product is FAILED");
//
//
//    }
//
//
//
//    @Test
//    public void uploadDc()throws InterruptedException{
//        Driver.getDriver().get(Config.getProperty("url"));
//        Thread.sleep(1000);
//        WebElement email  = Driver.getDriver().findElement(By.xpath("//div[@class='form-group field-login']//input"));
//        WebElement password = Driver.getDriver().findElement(By.xpath("//div[@class='form-group field-password']/input"));
//        email.sendKeys("in_ex_manager@info.com");
//        password.sendKeys("LLighg88");
//        Thread.sleep(1000);
//        WebElement logInButton = Driver.getDriver().findElement(By.xpath("//div[@class='clearfix oe_login_buttons']/button"));
//        logInButton.click();
//        WebElement Expenses = Driver.getDriver().findElement(By.xpath("//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[9]/a/span"));
//        Expenses.click();
//        WebElement createButton = Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-primary btn-sm o_list_button_add']"));
//        createButton.click();
//        Driver.getDriver().findElement(By.id("o_field_input_19")).click();
//        Driver.getDriver().findElement(By.xpath("//a[.='[253] Tshirt']")).click();
//        Driver.getDriver().findElement(By.id("o_field_input_27")).click();
//        Driver.getDriver().findElement(By.xpath("//a[.='Ashley Presley']")).click();
//        Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-sm oe_stat_button']")).click();
//        Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-sm btn-default o_button_import']")).click();
//        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@class='oe_import_file_show form-control']"));
//        // chooseFile.click();
//        Thread.sleep(2000);
//
//        chooseFile.sendKeys("C:\\Users\\delal\\Desktop\\mavenb11\\briteERP.txt"+ Keys.ENTER);
//        Thread.sleep(2000);
//
//
//    }
//
//
//
//
//    @Test
//    public void totalAmountToSubmitHilal() throws InterruptedException {
//    /*
//PD-94 / As user i would like to be able to see total amount be for submit
//1 - Go to the Brite ERP Website-->the user should be able to open the website
//2 - select the expenses button-->the user should be able to open the website
//3 - Click on the create button-->The user should be able to click the button and see the all the functionality
//4 - Click on the Product button -->User should be able to choose item from the list as they wish
//5 - Click on the unit price button-->the user should be able to select the unit price
//6 - Click on the quantity button-->The user should be able to select the quantity
//7 - Total amount-->The user should be able to see Total amount before submitting
//
//     */
//
//        Driver.getDriver().get("http://54.148.96.210/web/login");
//
//
//        Thread.sleep(1000);
////        WebElement email  = Driver.getDriver().findElement(By.xpath("//div[@class='form-group field-login']//input"));
////        WebElement password = Driver.getDriver().findElement(By.xpath("//div[@class='form-group field-password']/input"));
////        email.sendKeys("in_ex_manager@info.com");
////        password.sendKeys("LLighg88");
//
//        LoginPage lg= new LoginPage();
//        lg.briteERPLogin("in_ex_manager@info.com","LLighg88");
//        Thread.sleep(1000);
////        WebElement logInButton = Driver.getDriver().findElement(By.xpath("//div[@class='clearfix oe_login_buttons']/button"));
////        logInButton.click();
//        WebElement expensesLink = Driver.getDriver().findElement(By.xpath("//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[9]/a/span"));
//        expensesLink.click();
//
//
//
//        Thread.sleep(1000);
//        WebElement createButton = Driver.getDriver().findElement(By.cssSelector(".o_list_button_add"));
//        createButton.click();
//        WebElement productDropdown = Driver.getDriver().findElement(By.id("o_field_input_19"));
//        productDropdown.click();
//        WebElement tshirt = Driver.getDriver().findElement(By.xpath("//a[.='[253] Tshirt']"));
//        tshirt.click();
//        Thread.sleep(1000);
//        WebElement unitPriceInput = Driver.getDriver().findElement(By.id("o_field_input_20"));
//        unitPriceInput.clear();
//        unitPriceInput.sendKeys("5.00");
//        WebElement quantityInput = Driver.getDriver().findElement(By.id("o_field_input_21"));
//        quantityInput.clear();
//        quantityInput.sendKeys("3"+ Keys.ENTER);
//        Thread.sleep(1000);
//        WebElement totalAmount = Driver.getDriver().findElement(By.xpath("//span[@name='total_amount']"));
//        String actualtitle = totalAmount.getText();
//        String expecttitle = "$ 15.00";
//        Assert.assertEquals(actualtitle,expecttitle);
//
//    }
//    @Test
//    public void dropDownListHilal() throws InterruptedException {
//     /*
//PD-98 / As user i would like to be able to choose the item products on the drop down list
//1 - Go to the Brite ERP Website-->the user should be able to open the website
//2 - select the  expenses button-->the user should be able to open the website
//3 - Click on the create button-->The user should be able to click the button and see the all the functionality
//4 - Click on the Product button -->User should be able to choose item from the list as they wish
//5 - Click on the unit price button-->the user should be able to select the unit price
//6 - Click on item--> The user should be able to click on the item and select
//7 - Click on submit button--> The user should be able to click and save the file the functionality meets the requirements
//      */
//        Driver.getDriver().get("http://54.148.96.210/web/login");
//        Thread.sleep(1000);
////        WebElement email  = Driver.getDriver().findElement(By.xpath("//div[@class='form-group field-login']//input"));
////        WebElement password = Driver.getDriver().findElement(By.xpath("//div[@class='form-group field-password']/input"));
////        email.sendKeys("in_ex_manager@info.com");
////        password.sendKeys("LLighg88");
////
//        LoginPage lg= new LoginPage();
//        lg.briteERPLogin("in_ex_manager@info.com","LLighg88");
//
//        Thread.sleep(1000);
////        WebElement logInButton = Driver.getDriver().findElement(By.xpath("//div[@class='clearfix oe_login_buttons']/button"));
////        logInButton.click();
////        Thread.sleep(1000);
//        WebElement expensesLink = Driver.getDriver().findElement(By.xpath("//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[9]/a/span"));
//        expensesLink.click();
//
//
//        Thread.sleep(2000);
//        WebElement createButton = Driver.getDriver().findElement(By.cssSelector(".o_list_button_add"));
//        createButton.click();
//        Thread.sleep(1000);
//        WebElement productDropdown = Driver.getDriver().findElement(By.id("o_field_input_19"));
//        productDropdown.click();
//        WebElement tshirt = Driver.getDriver().findElement(By.xpath("//a[.='[253] Tshirt']"));
//        tshirt.click();
//        WebElement unitPriceInput = Driver.getDriver().findElement(By.id("o_field_input_20"));
//        unitPriceInput.clear();
//        unitPriceInput.sendKeys("5.00");
//        WebElement quantityInput = Driver.getDriver().findElement(By.id("o_field_input_21"));
//        quantityInput.clear();
//        quantityInput.sendKeys("3"+ Keys.ENTER);
//        WebElement employeeDropdown = Driver.getDriver().findElement(By.id("o_field_input_27"));
//        employeeDropdown.click();
//        WebElement selectEmployee = Driver.getDriver().findElement(By.xpath("//a[.='Demo User']"));
//        selectEmployee.click();
//        WebElement submitButton = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/button[1]"));
//        submitButton.click();
//
//        WebElement expectedText = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[4]/ul/li[1]/a"));
//        Assert.assertTrue(expectedText.isDisplayed());
//
//    }
//    @Test
//    public void selectEmployeeHilal() throws InterruptedException {
//        /*
// PD-99 / As user i would like to be able to select my name
//1 - Go to the Brite ERP Website-->the user should be able to open the website
//2 - select the expenses button-->the user should be able to open the website
//3 - Click on the create button-->The user should be able to click the button and see the all the functionality
//4 - Click on Employee tab-->The user should be able to click on the button and should be able to see the names in dropdown list
//5 - Select the employee name-->The user should be able to select their name under the Employees dropdown list
//         */
//        Driver.getDriver().get("http://54.148.96.210/web/login");
//        Thread.sleep(1000);
////        WebElement email  = Driver.getDriver().findElement(By.xpath("//div[@class='form-group field-login']//input"));
////        WebElement password = Driver.getDriver().findElement(By.xpath("//div[@class='form-group field-password']/input"));
////        email.sendKeys("in_ex_manager@info.com");
////        password.sendKeys("LLighg88");
//
//        LoginPage lg= new LoginPage();
//        lg.briteERPLogin("in_ex_manager@info.com","LLighg88");
//
//        Thread.sleep(1000);
////        WebElement logInButton = Driver.getDriver().findElement(By.xpath("//div[@class='clearfix oe_login_buttons']/button"));
////        logInButton.click();
////        Thread.sleep(2000);
//        WebElement expensesLink = Driver.getDriver().findElement(By.xpath("//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[9]/a/span"));
//        expensesLink.click();
//        Thread.sleep(2000);
//        WebElement createButton = Driver.getDriver().findElement(By.cssSelector(".o_list_button_add"));
//        createButton.click();
//        WebElement employeeDropdown = Driver.getDriver().findElement(By.id("o_field_input_27"));
//        employeeDropdown.click();
//        WebElement selectEmployee = Driver.getDriver().findElement(By.xpath("//a[.='David Samson']"));
//        selectEmployee.click();
//        Thread.sleep(1000);
//        Assert.assertTrue(!selectEmployee.isDisplayed());
//
//    }
//
//
//    @Test
//    public void expenseReportsAnalysisByBilal(){
//        LoginPage lp = new LoginPage();
//
//        lp.briteERPLogin(Config.getProperty("manager1Email"), Config.getProperty("manager1Password"));
//
//        HomePage hp = new HomePage();
//        hp.clickingOnExpensesButton();
//
//        hp.clickingOnCreateButton();
//
//        WebElement expenseDescriptionBox = Driver.getDriver().findElement(By.id("o_field_input_18"));
//        expenseDescriptionBox.sendKeys(Config.getProperty("expenseDescription1"));
//
//        WebElement productDropdown = Driver.getDriver().findElement(By.id("o_field_input_19"));
//        productDropdown.click();
//
//        WebElement selectingLaptop = Driver.getDriver().findElement(By.xpath("//a[.='[E-COM05] laptop']"));
//        selectingLaptop.click();
//
//        WebElement unitPriceBox = Driver.getDriver().findElement(By.id("o_field_input_20"));
//        unitPriceBox.clear();
//        unitPriceBox.sendKeys("5000000000000000000");
//
//        WebElement employeeDropdown = Driver.getDriver().findElement(By.id("o_field_input_27"));
//        employeeDropdown.click();
//
//        WebElement employeeAshleyPresley = Driver.getDriver().findElement(By.xpath("//a[.='Ashley Presley']"));
//        employeeAshleyPresley.click();
//
//        WebElement submitToManagerButton = Driver.getDriver().findElement(By.xpath("//button[.='Submit to Manager']"));
//        submitToManagerButton.click();
//
//        WebElement approveButton = Driver.getDriver().findElement(By.xpath("//button[.='Approve']"));
//        approveButton.click();
//
//        WebElement expensesRepoprtsAnalysisButton = Driver.getDriver().findElement(By.xpath("//a[@data-menu-xmlid='hr_expense.menu_hr_expense_sheet_all_all']//span"));
//        expensesRepoprtsAnalysisButton.click();
//
//        List<WebElement> barsOnTheGraph = Driver.getDriver().findElements(By.cssSelector("rect.nv-bar.positive"));
//
//        WebElement barForAshleyPresley = barsOnTheGraph.get(1);
//
//        Actions actions = new Actions(Driver.getDriver());
//        actions.moveToElement(barForAshleyPresley).perform();
//
//        WebElement tagForTheEmployeeAshleyPresley = Driver.getDriver().findElement(By.xpath("//strong[.='Ashley Presley']"));
//        boolean check = tagForTheEmployeeAshleyPresley.isDisplayed();
//        Assert.assertTrue(check, "Verification of presenting the name on the all expense reports is FAILED");
//
//    }
//
//
//
//    @Test
//    public void munevverExpenseReports() throws InterruptedException {
//
//        LoginPage loginPage = new LoginPage();
//
//        loginPage.briteERPLogin(Config.getProperty("manager1Email"), Config.getProperty("manager1Password"));
//
//        Thread.sleep(2000);
//
//        ExpensesPage expensesPage = new ExpensesPage();
//
//        expensesPage.expenses.click();
//
//        expensesPage.createButton.click();
//
//        expensesPage.customer.sendKeys("Munevver");
//
//        expensesPage.product.click();
//
//        expensesPage.chooseProduct.click();
//
//        expensesPage.dateInput.click();
//
//        expensesPage.datebox.click();
//
//        expensesPage.employeeInput.click();
//
//        expensesPage.employeeName.click();
//
//        expensesPage.clickSave.click();
//
//        String expectedDate ="07/22/2019";
//
//        String expectedEmployeeName = "Ashley Presley";
//
//        Assert.assertEquals(expensesPage.actualDate.getText(), expectedDate);
//
//        Assert.assertTrue(expensesPage.actualEmployeeName.getText().equals(expectedEmployeeName));
//    }
//
//    @Test
//    public void muneevverExpenseRefused () throws InterruptedException {
//
//        LoginPage loginPage = new LoginPage();
//
//        loginPage.briteERPLogin(Config.getProperty("manager1Email"), Config.getProperty("manager1Password"));
//
//        Thread.sleep(2000);
//
//        ExpensesPage expensesPage = new ExpensesPage();
//
//        expensesPage.expenses.click();
//
//        expensesPage.createButton.click();
//
//        expensesPage.customer.sendKeys("Munevver");
//
//        expensesPage.product.click();
//
//        expensesPage.chooseProduct.click();
//
//        expensesPage.dateInput.click();
//
//        expensesPage.datebox.click();
//
//        expensesPage.employeeInput.click();
//
//        expensesPage.employeeName.click();
//
//        expensesPage.clickSave.click();
//
//        String expectedRefusedReports = "Refused Reports";
//
//        String expectedExpenseAnalysis = "Expenses Analysis";
//
//        Assert.assertTrue(expensesPage.actualRefusedReports.isDisplayed());
//
//        Assert.assertEquals(expensesPage.actualExpenseAnalysis.getText(), (expectedExpenseAnalysis));
//    }
//
//    @Test
//
//    public void munevverAttachmentNameAndType() throws InterruptedException {
//
//        LoginPage loginPage = new LoginPage();
//        Driver.getDriver().get(Config.getProperty("url"));
//        loginPage.briteERPLogin(Config.getProperty("manager1Email"), Config.getProperty("manager1Password"));
//
//        Thread.sleep(2000);
//
//        ExpensesPage expensesPage = new ExpensesPage();
//
//        expensesPage.expenses.click();
//
//        expensesPage.createButton.click();
//
//        expensesPage.customer.sendKeys("Munevver");
//
//        expensesPage.product.click();
//
//        expensesPage.chooseProduct.click();
//
//        expensesPage.dateInput.click();
//
//        expensesPage.datebox.click();
//
//        expensesPage.employeeInput.click();
//
//        expensesPage.employeeName.click();
//
//        expensesPage.clickSave.click();
//
//        expensesPage.document.click();
//
//        expensesPage.createAttachment.click();
//
//        expensesPage.typeAttachment.sendKeys("munevver file");
//
//        Select select = new Select(expensesPage.type);
//        select.selectByIndex(1);
//
//        expensesPage.url.sendKeys("https://www.google.com/");
//
//        expensesPage.save.click();
//
//        String expectedUrl ="https://www.google.com/";
//
//        Assert.assertEquals(expensesPage.actualUrl.getAttribute("href") , expectedUrl);
//    }
//
//
//    @Ignore
//    @Test
//
//    public void expensesUpload()throws InterruptedException {
//
//
//
//        Driver.getDriver().get(Config.getProperty("url"));
//        LoginPage loginPage = new LoginPage();
//        loginPage.briteERPLogin("in_ex_manager@info.com", "LLighg88");
//
//        HomePage homePage = new HomePage();
//        homePage.expensesButton.click();
//        Thread.sleep(1000);
//        ExpensesPage expensesPage = new ExpensesPage();
//        Thread.sleep(2000);
//        expensesPage.creatButtonA.click();
//        Thread.sleep(2000);
//
//       expensesPage.productWindowA.click();
//        Thread.sleep(2000);
//        expensesPage.iPhoneInProductA.click();
//
//        Thread.sleep(1000);
//        expensesPage.employeeWindowA.click();
//        Thread.sleep(1000);
//        expensesPage.antonieInEmployeeA.click();
//        Thread.sleep(1000);
//        expensesPage.documentsButtonA.click();
//        Thread.sleep(1000);
//        expensesPage.createButtonAfterclickDocumentsA.click();
//        Thread.sleep(1000);
//        expensesPage.discardButtonA.click();
//        Thread.sleep(1000);
//        Assert.assertTrue(expensesPage.expectedElementAfterDiscardA.getText().contains(expensesPage.expectedText),"Failed, expected text is not matching... ");
//
//    }
//
//    @AfterClass
//    public void endingTheSmokeSuite(){
//        Driver.quitDriver();
//    }
//
//
//}
