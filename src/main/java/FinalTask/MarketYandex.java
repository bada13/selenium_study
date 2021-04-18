package FinalTask;

import FinalTask.steps.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MarketYandex {

    @FindBy(xpath = "//div[@class='SyJTASPsrT _3mU1ofltUh _1fKg8X_Xiz']")
    WebElement mainMenu;

    @FindBy(xpath = "//span[contains(text(),'Электроника')]")
    public
    WebElement elektronika;

    @FindBy(xpath = "//input[@id='header-search']")
    public
    WebElement headerSearch;

    @FindBy(xpath = "//button[@type='submit']")
    public
    WebElement submitSearch;

    public MarketYandex(){
        PageFactory.initElements(BaseSteps.getDriverYandex(),this);
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriverYandex(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(mainMenu));

    }

    public void selectMainMenuMarket(String menuItem) {
        mainMenu.findElement(By.xpath("//span[contains(text(),'"+ menuItem + "')]")).click();
    }
}
