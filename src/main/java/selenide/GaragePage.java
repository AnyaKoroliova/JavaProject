package selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class GaragePage {

    public void clickAddCarButton() {
        $(By.xpath("//button[contains(text(),'Add car')]")).click();
    }

    public void selectCarOptions(String brand, String model, int millage) {

        $(By.xpath("//select[@id='addCarBrand']")).selectOption(brand);
        $(By.xpath("//select[@id='addCarModel']")).selectOption(model);
        $(By.xpath("//select[@id='addCarMileage']")).setValue(String.valueOf(millage));
    }

    public void clickAddButton() {
        $(By.xpath("//button[contains(text(),'Add')]")).click();
    }

    public void verifyCarOptions(String brand, String model, String expectedImageUrl, int expectedMillage) {

        $$(By.xpath("//p[contains(text(),'Audi TT')]")).findBy(text(brand + " " + model)).should(exist);

        $(By.xpath("//p[contains(@class,'car_update-mileage')]")).shouldHave(text(java.time.LocalDate.now().toString()));

        $(By.xpath("//input[contains(@name, 'miles')]")).shouldHave(value(String.valueOf(expectedMillage)));

        $(By.xpath("//img[@class='car-logo_img']")).shouldBe(visible);

        $(By.xpath("//img[@class='car-logo_img']")).shouldHave(attribute("src", expectedImageUrl));
    }
}
