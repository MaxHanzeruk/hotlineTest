package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class HotlineHomePage extends BasePage {

    public HotlineHomePage(WebDriver driver) {
        super(driver);
    }

    // Метод для знаходження елемента пошуку
    public WebElement getSearch() {
        return driver.findElement(By.xpath("//input[@placeholder='Знайти товар, магазин, бренд']"));
    }

    // Метод для знаходження іконки користувача
    public WebElement getIconMan() {
        return driver.findElement(By.xpath("//div[@class='user-button__image flex middle-xs center-xs']"));
    }

    public WebElement getLike(){
        return driver.findElements(By.xpath("//div[@class=\"button__icon flex\"]")).get(1);

    }

    public WebElement getCompareIcn(){
        return driver.findElements(By.xpath("//div[@class=\"button__icon flex\"]")).get(0);
    }

    public WebElement getCity(){
        return driver.findElement(By.xpath("//div[@class=\"location__city\"]"));
    }

    public WebElement getSearchImageBtn(){
        return driver.findElement(By.xpath("//button[@class=\"search__btn flex middle-xs center-xs\"]"));
    }

    public void navigateHotline(){
        driver.get("https://hotline.ua/");
    }
}

