package setup;

import browserfactory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.Configuration.browser;

public class TestSetup {

    protected WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(){
        driver = BrowserFactory.createWebDriver(browser);
    }

    @AfterMethod
    public void teardown(){
        BrowserFactory.closeWebDriver();
    }
}
