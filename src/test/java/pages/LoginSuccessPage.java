package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSuccessPage extends BasePage {

    @FindBy(xpath="//*[@id='id_gray']")
    WebElement divGray;

    public void assertThatUserDivPresent() {
        assertThat(divGray.isDisplayed()).isTrue();
    }
}
