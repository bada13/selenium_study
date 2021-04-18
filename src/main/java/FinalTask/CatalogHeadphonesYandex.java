package FinalTask;

import FinalTask.steps.BaseSteps;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CatalogHeadphonesYandex {
    @FindBy(xpath = "//a[@class='zsSJkfeAPw _2sWJL7-h2E eD98J84A1g _36y1jOUHs5']")
    public
    WebElement advancedSearchButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[3]/div[3]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[4]/div[1]/h3[1]/a[1]")
    public
    WebElement firstProduct;

    public CatalogHeadphonesYandex(){
        PageFactory.initElements(BaseSteps.getDriverYandex(),this);

        WebElement element = advancedSearchButton;
        ((JavascriptExecutor) BaseSteps.getDriverYandex()).executeScript("arguments[0].scrollIntoView(true);", element);

        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriverYandex(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(advancedSearchButton));
    }
}
