package stepdefinations;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import PageObjects.SearchCustomer;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Steps extends Basetest {

    Basetest baset = new Basetest();

    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver/chromedriver.exe");
        driver = new ChromeDriver();
        loginobj = new LoginPage(driver);


    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("User enters email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String Password) {
        loginobj.setEmail(email);
        loginobj.setPwd(Password);
    }

    @When("click on login")
    public void click_on_login() {
        loginobj.Login();

    }

    @Then("page title should be {string}")
    public void page_title_should_be(String pagetitle) {
        String CurrentPagetitle = driver.getTitle();
        Assert.assertEquals(CurrentPagetitle, pagetitle);
    }

    @When("User clicks on log out link")
    public void user_clicks_on_log_out_link() {
        loginobj.logOut();
    }

    @Then("close the browser")
    public void close_the_browser() {
        driver.quit();

    }

    // new steps starts for add customer scenario


    @Then("User can view Dashboard")
    public void user_can_view_dashboard() {
        addcus = new AddCustomerPage(driver);
        String Dashboardtitle = addcus.getTitle();
        Assert.assertEquals("Dashboard / nopCommerce administration", Dashboardtitle);

    }

    @When("User clicks on Customers menu")
    public void user_clicks_on_customers_menu() {
        addcus.ClickOnCustomer();
        baset.Implicitwait(3, driver);

    }

    @When("Clicks on Customer Menu Item")
    public void clicks_on_customer_menu_item() {
        addcus.clickOnCustomersbutton();
        baset.Implicitwait(2, driver);
    }

    @When("click on Add new Button")
    public void click_on_add_new_button() {
        addcus.ClickAddnewCustomer();
        baset.Implicitwait(3, driver);
    }

    @Then("User can view Add new Customer Page")
    public void user_can_view_add_new_customer_page() {

        String Dashboardtitle = addcus.getTitle();
        Assert.assertEquals("Add a new customer / nopCommerce administration", Dashboardtitle);
    }

    @When("User enter customer info")
    public void user_enter_customer_info() {
        String email = RandonString() + "@gmail.com";
        addcus.enterEmail(email);
        addcus.enterpassword("Abc123");
        addcus.enterFirstName("Soumya");
        addcus.enterLastName("Samal");
        addcus.ClickGender("Male");
        addcus.enterDob("04/12/2008");
        addcus.entercompany("Acc");
        addcus.SelectManagevendor("Vendor 1");
        addcus.SelectCustomerrole("Guests");


    }

    @When("click on save button")
    public void click_on_save_button() {
        addcus.SavebuttonClick();
        baset.Implicitwait(6, driver);
    }

    @Then("User can view Confirmation message {string}")
    public void user_can_view_confirmation_message(String msg) {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));

    }


    //steps for searching a customer by email id
    @When("User enters email")
    public void user_enters_email() {
        searchCus = new SearchCustomer(driver);
        searchCus.setEmail("victoria_victoria@nopCommerce.com");


    }

    @When("User click on search button")
    public void user_click_on_search_button() {
        searchCus.Search();
    }

    @Then("User should found email in search button")
    public void user_should_found_email_in_search_button() {
        boolean flag = searchCus.getEmail("victoria_victoria@nopCommerce.com");
        Assert.assertEquals(flag, true);
    }


}
