package org.example;

import org.example.waiters.WaitElements;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.*;


public class Waiters {

    private WebDriver driver;

    @BeforeMethod
    public void setDefaults() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anyak\\Downloads\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @Test
    public void titlePageTest() {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        WaitElements waitElements = new WaitElements(driver);
        boolean waitTitle = waitElements.waitFotPageTitle("Hillel Qauto");
        Assert.assertTrue(waitTitle, "Title is not correct!");


        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement guestLoginButton = driver.findElement(By.xpath("//button[text()='Guest log in']"));
        jsExecutor.executeScript("arguments[0].click();", guestLoginButton);
        WebElement guestLoginForm = waitElements.waitVisibilityOfElement(By.xpath("//p[text()='Logged in as guest, any changes will be lost!']"));
        Assert.assertTrue(guestLoginForm.isDisplayed(), "Guest login form is not displayed!");


        WebElement addCarButton = waitElements.waitClickableOfElement(By.xpath("//button[text()='Add car']"));
        Assert.assertTrue(addCarButton.isEnabled(), "'Add car' button is not clickable!");
    }
    @AfterClass
    public void quit(){
            driver.quit();
        }

}

