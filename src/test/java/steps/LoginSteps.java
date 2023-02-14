package steps;

import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    public LoginSuccessSteps doLogin(String login, String password) {
        loginPage.fillLoginField(login);
        loginPage.fillPasswordField(password);
        loginPage.clickButton();
        return new LoginSuccessSteps();
    }
}
