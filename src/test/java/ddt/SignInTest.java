package ddt;

import org.example.waiters.WaitElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import setup.TestSetup;

public class SignInTest extends TestSetup {

    @DataProvider(name = "signinData")
    public Object[][] signinData() {
        return new Object[][] {
                { "test@hillel.ua", "1111" },
                { "test@hillel.ua", "1234" }
        };
    }

    @Test(dataProvider = "signinData")
    public void signInTest(String email, String password) {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        WaitElements waitElements = new WaitElements(driver);
        WebElement signInButton = driver.findElement(By.xpath("//button[contains(text(), 'Sign In')]"));
        signInButton.click();

        WebElement emailInput = driver.findElement(By.id("signinEmail"));
        emailInput.sendKeys(email);

        WebElement passwordInput = driver.findElement(By.id("signinPassword"));
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));
        loginButton.click();

        WebElement alert = waitElements.waitVisibilityOfElement(By.xpath("//p[contains(text(), 'Wrong email or password')]"));
        Assert.assertTrue(alert.isDisplayed(), "Error alert is not displayed!");
    }

}
