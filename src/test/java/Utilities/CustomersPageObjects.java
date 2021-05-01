package Utilities;

public interface CustomersPageObjects {

    String customersdropdown = "//a[@href='#']//i[@class='nav-icon far fa-user']";
    String customersbutton="//a[@href='/Admin/Customer/List']";
    String Addnew = "//a[@class='btn btn-primary']";
    String Email = "//input[@id='Email']";
    String password = "//input[@id='Password']";
    String firstName = "//input[@id='FirstName']";
    String LastName = "//input[@id='LastName']";
    String GenderMale = "//input[@id='Gender_Male']";
    String GenderFemale = "//input[@id='Gender_Male']";
    String DOB = "//input[@id='DateOfBirth']";
    String company = "//input[@id='Company']";
    String SelectCustomerRole = "//div[@class='k-multiselect-wrap k-floatwrap']//input[@class='k-input k-readonly']";
    String ManagerOfVendor = "//select[@name='VendorId']";
    String AdminComment = "//textarea[@id='AdminComment']";
    String save = "//button[@name='save']";

}