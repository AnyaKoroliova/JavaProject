package selenide;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.*;

public class LoginPage {

    public void openPage() {
        open("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    public void clickGuestLogin() {
        $(By.xpath("//button[@class='header-link -guest']")).click();
    }

    public void verifyGarageUrl() {
        webdriver().shouldHave(url("https://qauto.forstudy.space/panel/garage"));
    }
}
