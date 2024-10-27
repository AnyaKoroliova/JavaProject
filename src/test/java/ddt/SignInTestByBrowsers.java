package ddt;

import browserfactory.BrowserFactory;
import org.example.waiters.WaitElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import setup.TestSetup;

public class SignInTestByBrowsers extends TestSetup {

    private final String url = "https://guest:welcome2qauto@qauto.forstudy.space/";
    private final String invalidEmail = "test@hillel.ua";
    private final String invalidPassword = "1111";

    @DataProvider(name = "browsers")
    public Object[][] browserProvider() {
        return new Object[][]{
                {"chrome"},
                {"firefox"}
        };
    }

    @BeforeMethod
    public void setup(String browser) {
        driver = BrowserFactory.createWebDriver(browser);
        driver.get(url);
    }

    @Test(dataProvider = "browsers")
    public void signInTest(String browser){
        WaitElements waitElements = new WaitElements(driver);
        driver.findElement(By.xpath("//button[contains(text(), 'Sign In')]")).click();
        driver.findElement(By.id("signinEmail")).sendKeys(invalidEmail);
        driver.findElement(By.id("signinPassword")).sendKeys(invalidPassword);
        driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
        WebElement alert = waitElements.waitVisibilityOfElement(By.xpath("//p[contains(text(), 'Wrong email or password')]"));
        Assert.assertTrue(alert.isDisplayed(), "Error alert is not displayed!");
    }

}
