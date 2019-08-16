package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.Config;


import utilities.Driver;

public class LoginPage {


    WebDriver driver;


    public LoginPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login")
    public WebElement emailBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;


    public void briteERPLogin(String email, String password){

       // Driver.getDriver().get(Config.getProperty("url"));
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        loginButton.click();
    }
}
