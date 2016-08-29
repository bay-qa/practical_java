package tests;

import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by idorovskikh on 8/29/16.
 */
public class TestBase {

    protected WebDriver driver;

    @Rule
    public ExternalResource resource = new ExternalResource() {

        @Override
        protected void before() throws Throwable {
            driver = new FirefoxDriver();
        }

        @Override
        protected void after() {
            driver.quit();
        }
    };


}
