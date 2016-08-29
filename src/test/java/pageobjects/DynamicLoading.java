package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by idorovskikh on 8/29/16.
 */
public class DynamicLoading extends Base {
    By startButton = By.cssSelector("#start button");
    By finishText = By.id("finish");

    public DynamicLoading(WebDriver driver) {
        super(driver);
    }
    public void loadExample(String exampleNumber) {
        visit("http://the-internet.herokuapp.com/dynamic_loading/" + exampleNumber);
        click(startButton);
    }
    public Boolean finishTextPresent() {
        return waitFor(finishText, 10);
    }
}
