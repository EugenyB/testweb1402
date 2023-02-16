package tests;

import org.testng.annotations.Test;
import steps.LoginFailedSteps;
import steps.LoginSuccessSteps;
import utils.PropertyReader;

public class LoginFailTest extends BaseTest {
    @Test(dataProvider = "loginFailed")
    public void testLoginFailed(String login, String password) {
        getDriver().navigate().to(PropertyReader.getInstance().getURL());
        LoginFailedSteps steps1 = steps.doIncorrectLogin(login, password);
        steps1.verifyThatFailedPageVisible();
    }

    @Test(dependsOnMethods = {"testLoginFailed"}, dataProvider = "loginFailed")
    public void testLoginFailedAndBackLinkPresent(String login, String password) {
        getDriver().navigate().to(PropertyReader.getInstance().getURL());
        LoginFailedSteps steps1 = steps.doIncorrectLogin(login, password);
        steps1.verifyThatBackLinkVisible();
    }
}
