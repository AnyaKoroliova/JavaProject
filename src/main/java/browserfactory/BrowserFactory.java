package browserfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver createWebDriver(BrowserType browserType) {
        WebDriver driver;

        switch (browserType) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\anyak\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver();
                break;

            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            default:
                throw new IllegalArgumentException("Unsupported browser: " + browserType);
        }

        return driver;
    }
}
