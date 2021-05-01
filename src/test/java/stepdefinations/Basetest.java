package stepdefinations;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import PageObjects.SearchCustomer;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Basetest {

    public WebDriver driver;
    public LoginPage loginobj;
    public AddCustomerPage addcus;
    public SearchCustomer searchCus;

    public static String RandonString() {
        String generatedString = RandomStringUtils.randomAlphabetic(6);
        return generatedString;
    }

    public void Implicitwait(int Sec, WebDriver driver3) {
        driver3.manage().timeouts().implicitlyWait(Sec, TimeUnit.SECONDS);
    }


}
