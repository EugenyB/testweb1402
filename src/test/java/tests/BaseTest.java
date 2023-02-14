package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import steps.LoginSteps;
import utils.Browser;
import utils.DriverFactory;

import java.time.Duration;

public class BaseTest {
    private static WebDriver driver;

    protected WebDriverWait wait;

    LoginSteps steps;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void beforeClass() {
//        File file = new File("src/test/resources/chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
//        driver = new ChromeDriver();
        driver = DriverFactory.getDriver(Browser.EDGE);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        steps = new LoginSteps();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
