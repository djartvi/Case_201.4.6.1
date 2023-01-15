package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgeTextPage {

    private final WebDriver driver;

    String text = "Некоторые считают";

    private final By textLocator = By.xpath(String.format("//p[contains(text(), '%s')]", text));

    public AgeTextPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isTextDisplayed() {
        return driver.findElements(textLocator).size() > 0;
    }
}
