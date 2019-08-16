package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SchoolAllStudents_Page {

    WebDriver driver;


    public SchoolAllStudents_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath= "(//div/h4/a[.='mnwr']/../../div)[2]")
    public WebElement firstStudentToggle;

    @FindBy(xpath= "//a[@aria-expanded='true']/..//a[@data-target='#delete_employee']")
    public WebElement delete;





}
