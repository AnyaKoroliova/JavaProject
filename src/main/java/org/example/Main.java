package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anyak\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
            WebElement guestLoginButton = driver.findElement(By.xpath("//button[@class='header-link -guest']"));
            guestLoginButton.click();
            Thread.sleep(1000);

            List<WebElement> borderMenuItems = driver.findElements(By.xpath("//nav[contains(@class, 'sidebar')]//a"));

            for (WebElement item : borderMenuItems) {
                System.out.println(item.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}