package pageobjecttest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import setup.TestSetup;
import pages.GaragePage;

public class AddCarByGuest extends TestSetup {
    LoginPage loginPage = new LoginPage();
    GaragePage garagePage = new GaragePage();
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void checkAddCar(){

        loginPage.open();
        loginPage.clickGuestLogin();
        softAssert.assertEquals(getDriver().getCurrentUrl(), "https://qauto.forstudy.space/panel/garage", "URL is wrong!");

        garagePage.clickAddCarButton();
        garagePage.selectCarBrand("Audi");
        garagePage.selectCarModel("TT");
        garagePage.enterMillage("20");
        garagePage.clickAddButton();

        softAssert.assertEquals(garagePage.getAddedCarName(), "Audi TT", "Added car name is wrong!");

        String currentDate = java.time.LocalDate.now().toString();
        softAssert.assertTrue(garagePage.getCarUpdateMileage().contains(currentDate), "The date does not equal current date!");

        softAssert.assertEquals(garagePage.getMilesInputValue(), "20", "Miles is not equal 20!");

        softAssert.assertTrue(garagePage.isCarLogoDisplayed(), "Car logo is not displayed!");

        softAssert.assertTrue(garagePage.getCarLogoSrc().endsWith("audi.png"), "URL logo is not ending audi.png");

        softAssert.assertAll();
    }
}
