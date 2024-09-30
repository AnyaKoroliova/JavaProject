package pageobjecttest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.GaragePage;
import pages.LoginPage;
import setup.TestSetup;
import org.testng.Assert;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class FileDownloadTest extends TestSetup {


    @Test
    public void checkFileDownload() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        GaragePage garagePage = new GaragePage();

        loginPage.open();
        loginPage.clickGuestLogin();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://guest:welcome2qauto@qauto.forstudy.space/panel/garage", "URL is wrong!");

        garagePage.clickInstructionsSideBarLink();
        Thread.sleep(3000);
        garagePage.downloadFrontWipersFileLink();

        Thread.sleep(2000);

        File downloadedFile = new File("C:\\Users\\anyak\\Downloads\\Front windshield wipers on Audi TT.pdf");
        Assert.assertTrue(downloadedFile.exists());
    }

    @Test
    public void checkSaveCarListToFile() throws IOException {
        LoginPage loginPage = new LoginPage();
        GaragePage garagePage = new GaragePage();

        loginPage.open();
        loginPage.clickGuestLogin();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://guest:welcome2qauto@qauto.forstudy.space/panel/garage", "URL is wrong!");

        garagePage.clickInstructionsSideBarLink();
        garagePage.clickBrandDropdown();
        List<WebElement> brandList = garagePage.getCars();

        FileWriter writer = new FileWriter("C:\\Users\\anyak\\Downloads\\brands_list.txt");
        for (WebElement car : brandList) {
            writer.write(car.getText() + "\n");
        }
        writer.close();

        Assert.assertTrue(new File("C:\\Users\\anyak\\Downloads\\brands_list.txt").exists());
    }
}
