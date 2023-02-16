package steps;

import pages.LoginFailedPage;
import pages.LoginSuccessPage;

public class LoginFailedSteps {

    LoginFailedPage page = new LoginFailedPage();

    public void verifyThatFailedPageVisible() {
        page.assertThatUserDivAbsent();
        page.assertThatErrorDivPresent();
        //page.assertBackLinkExists();
    }

    public void verifyThatBackLinkVisible() {
        page.assertBackLinkExists();
    }
}
