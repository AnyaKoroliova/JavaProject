package selenidetest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenide.GaragePage;
import selenide.LoginPage;

public class AddCarByGuest {
    LoginPage loginPage = new LoginPage();
    GaragePage garagePage = new GaragePage();

    @BeforeClass
    public void setUp() {
        Configuration.browser = "chrome";
    }

    @Test
    public void checkAddCar() {

        loginPage.openPage();
        loginPage.clickGuestLogin();
        loginPage.verifyGarageUrl();
        garagePage.clickAddCarButton();
        garagePage.selectCarOptions("Audi", "TT", 20);
        garagePage.clickAddButton();
        garagePage.verifyCarOptions("Audi", "TT", "audi.png", 20);
    }
}
