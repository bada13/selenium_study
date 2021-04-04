package Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(xpath = "//nav[contains(@class,'kitt-top-menu_wide')]")
    WebElement mainMenu;

    @FindBy(xpath = "//div[contains(@class,'kitt-top-menu__dropdown kitt-top-menu__dropdown_icons')]/div[1]")
    WebElement subMenu;

    public MainPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void selectMainMenu(String menuItem) {
        mainMenu.findElement(By.xpath(".//a[contains(text(),'"+menuItem+"')]")).click();
    }

    public void selectSubMenu(String subMenuItem) {
        subMenu.findElement(By.xpath("//a[contains(text(),'"+subMenuItem+"')]")).click();
    }
}
