package Task4;

import Task4.steps.BaseTest4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelSendAppPage4 {

    @FindBy(xpath = "//h2[contains(text(),'Страхование путешественников')]")
    public WebElement pageTitle;

    @FindBy(xpath = "//div[@class='online-card-program selected']")
    public WebElement minSumStrah;

    @FindBy(xpath = "//button[contains(text(),'Оформить')]")
    public WebElement buttonDrawUp;

    @FindBy(xpath = "//input[@id='surname_vzr_ins_0']")
    public WebElement zastrahSurName;

    @FindBy(xpath = "//input[@id='name_vzr_ins_0']")
    public WebElement zastrahName;

    @FindBy(xpath = "//input[@id='birthDate_vzr_ins_0']")
    public WebElement zastrahBirthDate;

    @FindBy(xpath = "//input[@id='person_lastName']")
    public WebElement personLastName;

    @FindBy(xpath = "//input[@id='person_firstName']")
    public WebElement personFirstName;

    @FindBy(xpath = "//input[@id='person_middleName']")
    public WebElement personMiddleName;

    @FindBy(xpath = "//input[@id='person_birthDate']")
    public WebElement personBirthDate;

    @FindBy(xpath = "//input[@id='passportSeries']")
    public WebElement passportSeries;

    @FindBy(xpath = "//input[@id='passportNumber']")
    public WebElement passportNumber;

    @FindBy(xpath = "//input[@id='documentDate']")
    public WebElement documentDate;

    @FindBy(xpath = "//input[@id='documentIssue']")
    public WebElement documentIssue;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitStrah;

    @FindBy(xpath = "//*[contains(text(),'Поле не заполнено.')]")
    public WebElement validationMessage;

    @FindBy(xpath = "//div[@class='alert-form alert-form-error']")
    public WebElement errorMessage;

    public TravelSendAppPage4(){
        PageFactory.initElements(BaseTest4.getDriver(),this);
        Wait<WebDriver> wait = new WebDriverWait(BaseTest4.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(pageTitle));
    }
}
