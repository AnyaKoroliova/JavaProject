package setup;

import browserfactory.BrowserFactory;
import browserfactory.BrowserType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestSetup {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        return driver;
    }

    @BeforeMethod
    public void setup(){
        driver = BrowserFactory.createWebDriver(BrowserType.CHROME);
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
