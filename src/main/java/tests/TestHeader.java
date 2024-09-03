package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HotlineHomePage;

public class TestHeader extends TestInit {

    @Test
    public void checkIconHeader() {
        HotlineHomePage hotlineHomePage = new HotlineHomePage(driver);

        hotlineHomePage.navigateHotline();
        Assert.assertTrue(hotlineHomePage.getCity().isDisplayed());
        Assert.assertTrue(hotlineHomePage.getLike().isDisplayed());
        Assert.assertTrue(hotlineHomePage.getCompareIcn().isDisplayed());
        Assert.assertTrue(hotlineHomePage.getSearch().isDisplayed());
        Assert.assertTrue(hotlineHomePage.getIconMan().isDisplayed());

    }

}








