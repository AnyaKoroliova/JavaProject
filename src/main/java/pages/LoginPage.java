package pages;

import org.openqa.selenium.By;
import setup.PageSetup;


public class LoginPage extends PageSetup {
    private By guestLoginButton = By.xpath("//button[@class='header-link -guest']");
    public void open(){
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }
    public void clickGuestLogin() {
        driver.findElement(guestLoginButton).click();
    }
}
