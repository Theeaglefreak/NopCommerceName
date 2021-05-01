package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitforelement {
    public WebDriver driver;

    public Waitforelement(WebDriver driver) {
        this.driver = driver;

    }

    public void Waitforelemnt(WebElement element, long timeoutInsec) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInsec);
        wait.until(ExpectedConditions.visibilityOf(element));


    }


}
