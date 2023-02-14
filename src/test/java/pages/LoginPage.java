package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "login")
    WebElement loginField;

    @FindBy(id = "passw")
    WebElement passwordField;

    @FindBy(id = "okbutton")
    WebElement button;

    public void fillLoginField(String text) {
        loginField.clear();
        loginField.sendKeys(text);
    }

    public void fillPasswordField(String text) {
        passwordField.clear();
        passwordField.sendKeys(text);
    }

    public void clickButton() {
        button.click();
    }
}
