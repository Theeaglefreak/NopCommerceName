package PageObjects;

import Utilities.CustomersPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {

    public WebDriver driver;

    public AddCustomerPage(WebDriver newdriver)
    {
         driver = newdriver;
        PageFactory.initElements(newdriver,this);

    }
 public void ClickOnCustomer()
 {
    driver.findElement(By.xpath(CustomersPageObjects.customersdropdown)).click();
 }

    public void ClickAddnewCustomer()
    {
        driver.findElement(By.xpath(CustomersPageObjects.Addnew)).click();
    }

    public void enterEmail(String Emailaddress)
    {
        driver.findElement(By.xpath(CustomersPageObjects.Email)).sendKeys(Emailaddress);

    }
    public void enterpassword(String pwd)
    {
        driver.findElement(By.xpath(CustomersPageObjects.password)).sendKeys(pwd);

    }
    public void enterFirstName(String firstName)
    {
        driver.findElement(By.xpath(CustomersPageObjects.firstName)).sendKeys(firstName);

    }
    public void enterLastName(String Lastname)
    {
        driver.findElement(By.xpath(CustomersPageObjects.LastName)).sendKeys(Lastname);

    }
    public void ClickGender(String gender)
    {
       if(gender.equalsIgnoreCase("Male"))
       {
           driver.findElement(By.xpath(CustomersPageObjects.GenderMale)).click();
       }
       else
       {
           driver.findElement(By.xpath(CustomersPageObjects.GenderFemale)).click();
       }

    }

    public void enterDob(String DOB)
    {
        driver.findElement(By.xpath(CustomersPageObjects.DOB)).sendKeys(DOB);
    }

    public void entercompany(String Company)
    {
        driver.findElement(By.xpath(CustomersPageObjects.company)).sendKeys(Company);
    }
    public  void SelectCustomerrole(String Cusrole)
    {
       /* WebElement element= driver.findElement(By.xpath(CustomersPageObjects.SelectCustomerRole));
        Select sel= new Select(element);
        sel.deselectAll();
        sel.selectByVisibleText(Cusrole);*/
        driver.findElement(By.xpath(CustomersPageObjects.SelectCustomerRole)).sendKeys(Cusrole);
    }

    public  void SelectManagevendor(String ManageVendor)
    {
        WebElement element= driver.findElement(By.xpath(CustomersPageObjects.ManagerOfVendor));
        Select sel= new Select(element);
        sel.selectByVisibleText(ManageVendor);

    }


    public void SavebuttonClick(){
        driver.findElement(By.xpath(CustomersPageObjects.save)).click();
    }

    public  String  getTitle()
    {
        String title= driver.getTitle();
        return title;
    }
    public void clickOnCustomersbutton()
    {
        driver.findElement(By.xpath(CustomersPageObjects.customersbutton)).click();
    }

}
