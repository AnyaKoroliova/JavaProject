package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class iFramesTest {
    private WebDriver driver;

    @BeforeMethod
    public void setDefaults() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anyak\\Downloads\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @Test
    public void testIFrameTitle() {
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='hero-video_frame']"));
        driver.switchTo().frame(iframe);

        String actualFrameTitle = driver.findElement(By.xpath("//a[@class='ytp-title-link yt-uix-sessionlink']")).getText();
        String expectedFrameTitle = "Як потрапити у майбутнє? Трансформація навчання.";

        Assert.assertEquals(actualFrameTitle, expectedFrameTitle, "Title doesn’t equals to the expected result");

    }

    @Test
    public void testSocialMediaIcons() {
        driver.manage().window().maximize();
        List<WebElement> socialIcons = driver.findElements(By.xpath("//div[@class='contacts_socials socials']//a"));
        int expectedIconCount = 5;
        Assert.assertEquals(socialIcons.size(), expectedIconCount, "Social network block doesn’t contain 5 items");

        for (WebElement icon : socialIcons) {
            String iconUrl = icon.getAttribute("href");

            String mainWindow = driver.getWindowHandle();
            icon.click();

            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            Assert.assertTrue(tabs.size() > 1, "New tab did not open after clicking");

            driver.switchTo().window(tabs.get(1));
            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.contains(iconUrl), "Incorrect URL of social network: " + currentUrl);

            driver.close();
            driver.switchTo().window(mainWindow);
        }
    }

    @AfterMethod
    public void quit(){
        if (driver != null) {
            driver.quit();
        }
    }
}
