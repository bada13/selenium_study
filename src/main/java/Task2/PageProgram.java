package Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageProgram {
    @FindBy(xpath = "//h1[contains(@class,'page-teaser-dict__header kitt-heading_size_l')]")
    WebElement title;

    @FindBy(xpath = "//a[contains(@data-test-id,'PageTeaserDict_button')]")
    WebElement pageTeaserButton;

    public PageProgram(WebDriver driver){
        PageFactory.initElements(driver,this);
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(title));
    }
}
