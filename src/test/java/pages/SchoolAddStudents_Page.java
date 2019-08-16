package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SchoolAddStudents_Page {


    WebDriver driver;

    public SchoolAddStudents_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[1]//input")
    public WebElement firstNameBox;


    @FindBy (xpath="(//div[@class='form-group custom-mt-form-group'])[8]//input")
    public WebElement lastNameBox;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[2]//input")
    public WebElement emailBox;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[9]//input")
    public WebElement joiningDateBox;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[4]//input")
    public WebElement subjectBox;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[11]//input")
    public WebElement mobileNumberBox;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[5]//select")
    public WebElement genderBox;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[6]//input")
    public WebElement birthDateBox;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[13]//input")
    public WebElement majorBox;

    @FindBy (css = "textarea#message")
    public WebElement permanentAddressBox;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[15]//input")
    public WebElement companyNameBox;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[19]//input")
    public WebElement titleBox;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[16]//input")
    public WebElement startDateBox;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[20]//input")
    public WebElement cityBox;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[17]//input")
    public WebElement streetBox;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[21]//input")
    public WebElement zipCodeBox;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[18]//input")
    public WebElement stateBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitButton;






}

