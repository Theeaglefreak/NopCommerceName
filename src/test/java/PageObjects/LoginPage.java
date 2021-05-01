package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //public WebDriver driver;

    public LoginPage(WebDriver newdriver)
    {
        // driver = newdriver;

         PageFactory.initElements(newdriver,this);

    }

    @FindBy(id="Email")
    @CacheLookup
     private WebElement email;

    @FindBy(id="Password")
    @CacheLookup
     private WebElement pwd;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    @CacheLookup
     private WebElement LoginButton;

    @FindBy(xpath = "//a[text()='Logout']")
    @CacheLookup
     private WebElement LogOutButton;


    public void setEmail(String emailid)
    {
        email.clear();
        email.sendKeys(emailid);
    }

    public void setPwd(String password)
    {
        pwd.clear();
        pwd.sendKeys(password);
    }

    public void Login()
    {
        LoginButton.click();
    }
    public void logOut()
    {
        LogOutButton.click();
    }

        }

