package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.Login;

/**
 * Created by idorovskikh on 8/25/16.
 */
public class TestLogin {

    private WebDriver driver;
    private Login login;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        login = new Login(driver);
    }


    @Test
    public void succeed(){
        login.with("tomsmith", "SuperSecretPassword!");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
