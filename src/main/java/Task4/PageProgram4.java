package Task4;

import Task4.steps.BaseTest4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageProgram4 {
    @FindBy(xpath = "//h1[contains(@class,'page-teaser-dict__header kitt-heading_size_l')]")
    public
    WebElement title;

    @FindBy(xpath = "//a[contains(@data-test-id,'PageTeaserDict_button')]")
    public
    WebElement pageTeaserButton;

    public PageProgram4(){
        PageFactory.initElements(BaseTest4.getDriver(),this);
        Wait<WebDriver> wait = new WebDriverWait(BaseTest4.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(title));
    }
}
