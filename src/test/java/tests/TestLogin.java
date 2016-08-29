package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.Login;

import static org.junit.Assert.assertTrue;

/**
 * Created by idorovskikh on 8/25/16.
 */
public class TestLogin extends TestBase {

    private Login login;

    @Before
    public void setUp(){
        login = new Login(driver);
    }

    @Test
    public void succeed(){
        login.with("tomsmith", "SuperSecretPassword!");
        assertTrue("success message not present", login.successMessagePresent());
    }

}
