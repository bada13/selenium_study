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

import java.util.List;

public class AdvancedSearchPage {
    @FindBy(xpath = "//h1")
    public
    WebElement title;

    @FindBy(xpath = "//div/div/div/div/div/input")
    public
    WebElement priceFrom;


    @FindBy(xpath = "//input[@class='_34OG20yGDA']")
    public
    WebElement manufacturer;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]/div[1]")
    public
    WebElement findManufacturer;

    @FindBy(xpath = "//a[@class='_2qvOOvezty _3qN-vKmEan _1Rc6LxE3Tr']")
    public
    WebElement submitFilter;

    @FindBy(xpath = "//div/article[contains(@class,'_1_IxNTwqll cia-vs cia-cs')]']")
    public
    List<WebElement> countProduct;


    public AdvancedSearchPage(){
        PageFactory.initElements(BaseSteps.getDriverYandex(),this);

        WebElement element = title;
        ((JavascriptExecutor) BaseSteps.getDriverYandex()).executeScript("arguments[0].scrollIntoView(true);", element);

        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriverYandex(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(findManufacturer));
    }

    public void selectPriceFrom(String price) {
        priceFrom.sendKeys(price);
    }

    public void selectManufacturer(String brand) {
        manufacturer.clear();
        manufacturer.sendKeys(brand);
        findManufacturer.click();
    }
}
