package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExpensesPage {


    WebDriver driver;
    public ExpensesPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "(//span[@class='oe_menu_text'])[28]")
    public WebElement expenseProductsButton;

    @FindBy (linkText = "Expenses")
    public  WebElement expenses;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

    @FindBy (id = "o_field_input_18")
    public WebElement customer;

    @FindBy(xpath ="//input[@class='o_input ui-autocomplete-input']")
    public WebElement product;

    @FindBy (xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[2]")
    public WebElement chooseProduct;

    @FindBy(xpath ="//input[@class='o_datepicker_input o_input']")
    public WebElement dateInput;

    @FindBy(xpath ="//table[@class='table-condensed']/tbody/tr[4]/td[3]")
    public WebElement datebox;

    @FindBy(xpath ="(//input[@class='o_input ui-autocomplete-input'])[4]")
    public WebElement employeeInput;

    @FindBy(xpath ="//a[.='Ashley Presley']")
    public WebElement employeeName;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[4]")
    public WebElement employeeInputText;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement clickSave;

    @FindBy(xpath = "//span[@name='date']")
    public WebElement actualDate;

    @FindBy(id = "o_field_input_27")
    public WebElement actualEmployeeName;

    @FindBy(xpath = "(//div[@class='oe_secondary_menu'])[9]/ul/li[2]/a/span")
    public WebElement actualRefusedReports;

    @FindBy(xpath = "(//div[@class='oe_secondary_menu'])[9]/ul[3]/li")
    public WebElement actualExpenseAnalysis;

    @FindBy(xpath = "//button[@name='action_get_attachment_view']")
    public WebElement document;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createAttachment;

    @FindBy(id = "o_field_input_54")
    public  WebElement typeAttachment;

    @FindBy(id = "o_field_input_55")
    public  WebElement type;

    @FindBy(id = "o_field_input_58")
    public  WebElement url;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement save;

    @FindBy(xpath = "//a[@class='o_field_url o_field_widget o_form_uri o_text_overflow']")
    public WebElement actualUrl;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement createButtonBilal;

    public void clickingExpenseProductsButton(){

        expenseProductsButton.click();
    }



    @FindBy(xpath = "//div[@class='o_list_buttons']/button[1]")
    public WebElement creatButtonA;

    @FindBy(id = "o_field_input_36")
    public WebElement notesFieldA;

    @FindBy(xpath = "//div[@class='o_form_buttons_edit']/button[1]")
    public WebElement saveButtonA;

    @FindBy(xpath = "//div[@class='o_notification_manager']")
    public WebElement popUpRedWindowA;

    @FindBy(id = "o_field_input_19")
    public WebElement productWindowA;

    @FindBy(xpath = "//*[@id=\"ui-id-20\"]/a")
    public WebElement iPhoneInProductA;

    @FindBy(xpath = "//div[@class='o_group']//table[2]//tr[4]//label")
    public WebElement employeeWindowA;

    @FindBy(xpath = "//a[.='Antoine Langlais']")
    public WebElement antonieInEmployeeA;

    @FindBy(xpath = "//button[@class='btn btn-sm oe_stat_button']")
    public WebElement documentsButtonA;

    @FindBy(xpath = "//div[@class='o_cp_buttons']/div/button[1]")
    public WebElement createButtonAfterclickDocumentsA;

    @FindBy(xpath = "//div[@class='o_form_buttons_edit']/button[2]")
    public WebElement discardButtonA;

    @FindBy (xpath = "//p")
    public WebElement expectedElementAfterDiscardA;

    public String expectedText = "Click here to attach a new document";






}
