package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgeSelectionPage {

    private final WebDriver driver;

    private final By ageButtons = By.xpath("//*[@type='radio' and @name='age']");
    private final By sendButton = By.xpath("//*[@type='submit']");

    public AgeSelectionPage(WebDriver driver) {
        this.driver = driver;
    }

    public AgeSelectionPage selectAge(int buttonNumber) {
        driver.findElements(ageButtons).get(buttonNumber).click();
        return this;
    }

    public void clickSendButton() {
        driver.findElement(sendButton).click();
    }
}
