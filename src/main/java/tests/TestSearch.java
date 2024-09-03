package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HotlineHomePage;
import pageObjects.HotlineSearchResultsPage;
import tests.TestInit;

public class TestSearch extends TestInit {

    @Test
    public void searchTest() {
        HotlineHomePage hotlineHomePage = new HotlineHomePage(driver);

        hotlineHomePage.navigateHotline();
        hotlineHomePage.getSearch().sendKeys("Samsung Galaxy S24 Ultra 12/512GB Titanium Black");
        hotlineHomePage.getSearchImageBtn().click();
        HotlineSearchResultsPage hotlineSearchResultsPage = new HotlineSearchResultsPage(driver);
        sleep(); //wait 4 seconds

        Assert.assertTrue(hotlineSearchResultsPage.getResultField().isDisplayed());
    }
}