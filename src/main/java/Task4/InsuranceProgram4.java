package Task4;

import Task4.steps.BaseTest4;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsuranceProgram4 {

    @FindBy(xpath = "//h1[@class='uc-form__title']")
    WebElement title;

    @FindBy(xpath = "//h3[contains(text(),'Страхование для путешественников')]")
    public
    WebElement strahTravel;

    public InsuranceProgram4(){
        PageFactory.initElements(BaseTest4.getDriver(),this);

        WebElement element = strahTravel;
        ((JavascriptExecutor) BaseTest4.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);

        Wait<WebDriver> wait = new WebDriverWait(BaseTest4.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(strahTravel));

    }
}
