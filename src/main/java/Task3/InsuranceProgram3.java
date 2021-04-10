package Task3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsuranceProgram3 {

    @FindBy(xpath = "//h1[@class='uc-form__title']")
    WebElement title;

    @FindBy(xpath = "//h3[contains(text(),'Страхование для путешественников')]")
    public
    WebElement strahTravel;

    public InsuranceProgram3(WebDriver driver){
        PageFactory.initElements(driver,this);
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(title));
    }
}
