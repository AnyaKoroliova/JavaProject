package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import setup.PageSetup;

import java.util.List;

public class GaragePage extends PageSetup {

    private By addCarButton = By.xpath("//button[contains(text(),'Add car')]");
    private By brandField = By.xpath("//select[@id='addCarBrand']");
    private By modelField = By.xpath("//select[@id='addCarModel']");
    private By mileageField = By.xpath("//select[@id='addCarMileage']");
    private By addButton = By.xpath("//button[contains(text(),'Add')]");
    private By carName = By.xpath("//p[contains(text(),'Audi TT')]");
    private By carUpdateMileage = By.xpath("//p[contains(@class,'car_update-mileage')]");
    private By milesInput = By.xpath("//input[contains(@name, 'miles')]");
    private By carLogo = By.xpath("//img[@class='car-logo_img']");
    private By instructionsLinkSideBar = By.xpath("//a[@routerlink='instructions']");
    private By downloadFrontWipersFileLink = By.xpath("//p[contains(text(), 'Front windshield wipers on Audi TT')]/../a");
    private By brandSelectDropdown = By.xpath("//button[@id='brandSelectDropdown']");
    private By brandSelectDropdownMenu = By.xpath("//ul[contains(@class, 'brand-select-dropdown_menu')]/li");


    public void clickAddCarButton() {
        driver.findElement(addCarButton).click();
    }
    public void selectCarBrand(String brand) {
        new Select(driver.findElement(brandField)).selectByVisibleText(brand);
    }
    public void selectCarModel(String model) {
        new Select(driver.findElement(modelField)).selectByVisibleText(model);
    }
    public void enterMillage(String millage) {
        driver.findElement(mileageField).sendKeys(millage);
    }
    public void clickAddButton() {
        driver.findElement(addButton).click();
    }
    public String getAddedCarName() {
        return driver.findElement(carName).getText();
    }
    public String getCarUpdateMileage() {
        return driver.findElement(carUpdateMileage).getText();
    }
    public String getMilesInputValue() {
        return driver.findElement(milesInput).getAttribute("20");
    }
    public boolean isCarLogoDisplayed() {
        return driver.findElement(carLogo).isDisplayed();
    }
    public String getCarLogoSrc() {
        return driver.findElement(carLogo).getAttribute("src");
    }
    public void clickInstructionsSideBarLink() {
        driver.findElement(instructionsLinkSideBar).click();
    }

    public void downloadFrontWipersFileLink() {
        driver.findElement(downloadFrontWipersFileLink).click();
    }

    public void clickBrandDropdown() {
        driver.findElement(brandSelectDropdown).click();
    }

    public List<WebElement> getCars() {
        return driver.findElements(brandSelectDropdownMenu);
    }
}

