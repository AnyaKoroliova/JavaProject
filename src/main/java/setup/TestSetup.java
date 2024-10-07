package setup;

import browserfactory.BrowserFactory;
import browserfactory.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestSetup {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        return driver;
    }

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anyak\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //driver = BrowserFactory.createWebDriver(BrowserType.CHROME);
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
