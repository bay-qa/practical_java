package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by idorovskikh on 8/25/16.
 */
public class Login extends Base {
    private WebDriver driver;

    By loginFormLocator = By.id("login");

    By usernameLocator  = By.id("username");
    By passwordLocator  = By.id("password");
    By submitButton     = By.cssSelector("button");
    By successMessageLocator = By.cssSelector(".flash.success");

    public Login(WebDriver driver){
        super(driver);
        visit("http://the-internet.herokuapp.com/login");
        assertTrue("The login form is not present",
                isDisplayed(loginFormLocator));
    }

    public void with (String username, String password){
        type(username, usernameLocator);
        type(password, passwordLocator);

        click(submitButton);
    }

    public Boolean successMessagePresent(){
        return isDisplayed(successMessageLocator);
    }

}
