package Task4;

import Task4.steps.BaseTest4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage4 {

    @FindBy(xpath = "//nav[contains(@class,'kitt-top-menu_wide')]")
    WebElement mainMenu;

    @FindBy(xpath = "//div[contains(@class,'kitt-top-menu__dropdown kitt-top-menu__dropdown_icons')]/div[1]")
    WebElement subMenu;

    public MainPage4(){
        PageFactory.initElements(BaseTest4.getDriver(),this);
    }

    public void selectMainMenu(String menuItem) {
        mainMenu.findElement(By.xpath(".//a[contains(text(),'"+menuItem+"')]")).click();
    }

    public void selectSubMenu(String subMenuItem) {
        subMenu.findElement(By.xpath("//a[contains(text(),'"+subMenuItem+"')]")).click();
    }
}
