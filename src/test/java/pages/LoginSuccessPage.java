package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSuccessPage extends BasePage {

    @FindBy(id="id_gray")
    WebElement divGray;

    public void assertIdIsGray() {
        String value = divGray.getCssValue("class");
        assertThat(value).isEqualToIgnoringCase("gray");
    }
}
