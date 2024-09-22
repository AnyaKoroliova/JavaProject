package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeAsserts {
    private WebDriver driver;

    @BeforeMethod
    public void setDefaults() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anyak\\Downloads\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @Test(priority = 1)
    public void testLogoIsDisplayed(){
        WebElement logo = driver.findElement(By.xpath("//a[@class='header_logo']"));
        Assert.assertTrue(logo.isDisplayed(), "Logo does not displayed!");
    }

    @Test(priority = 1)
    public void testSignUpButtonColor(){
        WebElement signUpButton = driver.findElement(By.xpath("//button[text()='Sign up']"));
        String backgroundColor = signUpButton.getCssValue("background-color");
        String actualColor = Color.fromString(backgroundColor).asHex();
        String expectedColor = "#0275d8";
        Assert.assertEquals(actualColor, expectedColor, "Background color of Sign up button is incorrect!");

    }
    @AfterMethod
    public void quit(){
        if (driver != null) {
            driver.quit();
        }
    }


}
