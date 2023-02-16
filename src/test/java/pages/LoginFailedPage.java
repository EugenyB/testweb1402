package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

public class LoginFailedPage extends BasePage {

    @FindBy(xpath = "//*[@id='id_red']")
    WebElement divRed;

    @FindBy(xpath="//*[@id='id_gray']")
    WebElement divGray;

    @FindBy(xpath = "//*[@id='back']")
    WebElement link;

    public void assertBackLinkExists() {
        assertThat(link.getText()).isEqualTo("Back to login page");
    }

    public void assertThatUserDivAbsent() {
        try {
            divGray.isEnabled();
            fail();
        } catch (Exception e) {}

    }

    public void assertThatErrorDivPresent() {
        assertThat(divRed.isDisplayed()).isTrue();
    }
}
