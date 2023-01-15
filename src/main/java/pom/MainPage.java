package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private final WebDriver driver;

    private static final String URL = "http://u920152e.beget.tech";

    private final By emailField = By.xpath("//*[@type='email']");
    private final By passwordField = By.xpath("//*[@type='password']");
    private final By loginButton = By.xpath("//button[@type='submit']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage open() {
        driver.get(URL);
        return this;
    }

    public MainPage inputEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public MainPage inputPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

}
