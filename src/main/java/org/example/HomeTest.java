package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;
import org.testng.annotations.*;

public class HomeTest {

    private WebDriver driver;

    @BeforeMethod
    public void setDefaults(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anyak\\Downloads\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

    }
    @Test(priority = 1)
    public void LogoTest(){
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        WebElement logo = driver.findElement(By.xpath("//a[@class='header_logo']"));
            if (logo.isDisplayed()) {
                System.out.println("Logo is displayed");
            } else {
                System.out.println("Logo does not displayed");
            }
    }
    @Test(priority = 2)
    public void SignUpColorTest(){
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        WebElement signUpButton = driver.findElement(By.xpath("//button[text()='Sign up']"));
        String backgroundColor = signUpButton.getCssValue("background-color");
        String hex = Color.fromString(backgroundColor).asHex();
        if (hex.equals("#0275d8")){
            System.out.println("Background color of Sign up button is correct");
        } else {
            System.out.println("Background color of Sign up button is incorrect");
        }
    }
    @AfterMethod
    public void quit(){
        if (driver != null) {
            driver.quit();
        }
    }
}
