package FinalTask;

import FinalTask.steps.BaseSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CatalogElektronikaYandex {
    @FindBy(xpath = "//h1[@class='_39qdPorEKz']")
    public
    WebElement title;

    @FindBy(xpath = "//a[@class='_2qvOOvezty _2x2zBaVN-3 _9qbcyI_fyS'][contains(text(),'Телевизоры')]")
    public static
    WebElement subMenuElektronikaTv;

    @FindBy(xpath = "//a[contains(text(),'Проводные наушники')]")
    public static
    WebElement subMenuElektronikaHeadphones;

    public CatalogElektronikaYandex(){
        PageFactory.initElements(BaseSteps.getDriverYandex(),this);
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriverYandex(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(title));
    }
}
