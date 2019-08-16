package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Config;
import utilities.Driver;

public class SchoolLogin_Page {

    WebDriver driver;


    public SchoolLogin_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath= "//div/form/div[1]/input")
    public WebElement username;

    @FindBy(xpath = "//div/form/div[2]/input")
    public WebElement passwordd;

    @FindBy(xpath = "//div/form/div[3]/button")
    public WebElement loginButton;

    public void cybertekSchoolLogin(){

        //Driver.getDriver().get(Config.getProperty("SchoolURL"));
        username.sendKeys(Config.getProperty("SchoolLogIn"));
        passwordd.sendKeys(Config.getProperty("SchoolPassword"));

    }
}
