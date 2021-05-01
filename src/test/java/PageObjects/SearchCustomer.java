package PageObjects;

import Utilities.Waitforelement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchCustomer {
    public WebDriver driver;
    Waitforelement waitforelement;


    public SearchCustomer(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(driver, this);
        waitforelement = new Waitforelement(driver);
    }

    @FindBy(how = How.ID, using = "SearchEmail")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(how = How.ID, using = "SearchFirstName")
    @CacheLookup
    WebElement firstName;


    @FindBy(how = How.ID, using = "SearchLastName")
    @CacheLookup
    WebElement lastName;


    @FindBy(how = How.ID, using = "search-customers")
    @CacheLookup
    WebElement searchButton;


    @FindBy(how = How.XPATH, using = "//table[@id='customers-grid']")
    @CacheLookup
    WebElement table;

    @FindBy(how = How.XPATH, using = "//table[@id='customers-grid']//tbody//tr")
    @CacheLookup
    List<WebElement> tableRow;


    @FindBy(how = How.XPATH, using = "//table[@id='customers-grid']//tbody//tr//td")
    @CacheLookup
    List<WebElement> tableColumn;

    public void setEmail(String email) {
        waitforelement.Waitforelemnt(txtEmail, 30);
        txtEmail.clear();
        txtEmail.sendKeys(email);

    }

    public void setFirstName(String firstname) {
        waitforelement.Waitforelemnt(firstName, 30);
        txtEmail.clear();
        txtEmail.sendKeys(firstname);

    }

    public void Search() {
        searchButton.click();
    }

    public int NoOftableRows() {
        return tableRow.size();
    }

    public int NoOftableColumns() {
        return tableColumn.size();
    }


    public boolean getEmail(String email) {

        Boolean flag = false;

        for (int i = 1; i <= NoOftableRows(); i++) {

            String actualEmail = table.findElement(By.xpath("//tbody//tr[" + i + "]//td[2]")).getText();

            if (actualEmail.equalsIgnoreCase(email)) {
                flag = true;
            }
        }
        return flag;
    }


}
