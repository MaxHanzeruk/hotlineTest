package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;


public class HotlineSearchResultsPage extends BasePage {

    public HotlineSearchResultsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getResultField() {
        return driver.findElements(By.xpath("//a[contains(text(), 'Samsung Galaxy S24 Ultra 12/512GB Titanium Black (SM-S928BZKH')]")).get(1);    }
}