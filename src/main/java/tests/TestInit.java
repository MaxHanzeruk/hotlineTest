package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {


    WebDriver driver;

    @BeforeMethod
    public void beforeMyTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @AfterMethod
    public void afterMyTest(){
        driver.quit();
    }


    public void sleep(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

}
