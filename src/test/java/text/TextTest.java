package text;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import pom.AgeSelectionPage;
import pom.AgeTextPage;
import pom.BrowserSelect;
import pom.MainPage;

import static org.junit.Assert.assertTrue;

public class TextTest {

    @Rule
    public BrowserSelect browserSelect = new BrowserSelect();

    private MainPage mainPage;
    private AgeSelectionPage ageSelectionPage;
    private AgeTextPage ageTextPage;

    @Before
    public void openBrowser() {

        mainPage = new MainPage(browserSelect.getDriver());
        ageSelectionPage = new AgeSelectionPage(browserSelect.getDriver());
        ageTextPage = new AgeTextPage(browserSelect.getDriver());

        mainPage.open();
    }

    @Test
    public void showingAgeTextTest() {

        mainPage
                .inputEmail("valid@example.com")
                .inputPassword("123456")
                .clickLoginButton();

        ageSelectionPage
                .selectAge(0)
                .clickSendButton();

        assertTrue(ageTextPage.isTextDisplayed());
    }
}
