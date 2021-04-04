package Task2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class SberStrah2 extends BaseTest{

    @Test
    public void createTravel () {
        driver.get(baseUrl + "/");

        MainPage mainPage = new MainPage(driver);
        mainPage.selectMainMenu("Страхование");
        mainPage.selectSubMenu("Перейти в каталог");

        InsuranceProgram insuranceProgram = new InsuranceProgram(driver);
        WebElement element = insuranceProgram.strahTravel;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        insuranceProgram.strahTravel.click();

        PageProgram pageProgram = new PageProgram(driver);
        Assert.assertEquals("Страхование путешественников",pageProgram.title.getText());
        pageProgram.pageTeaserButton.click();

        TravelSendAppPage travelSendAppPage = new TravelSendAppPage(driver);
        travelSendAppPage.minSumStrah.click();
        travelSendAppPage.buttonDrawUp.click();

        travelSendAppPage.zastrahSurName.click();
        travelSendAppPage.zastrahSurName.sendKeys("Иванов");
        travelSendAppPage.zastrahName.click();
        travelSendAppPage.zastrahName.sendKeys("Иван");
        travelSendAppPage.zastrahBirthDate.click();
        travelSendAppPage.zastrahBirthDate.sendKeys("01.01.2001");

        travelSendAppPage.personLastName.click();
        travelSendAppPage.personLastName.sendKeys("Петров");
        travelSendAppPage.personFirstName.click();
        travelSendAppPage.personFirstName.sendKeys("Петр");
        travelSendAppPage.personMiddleName.click();
        travelSendAppPage.personMiddleName.sendKeys("Петрович");
        travelSendAppPage.personBirthDate.click();
        travelSendAppPage.personBirthDate.sendKeys("02.02.2002");
        travelSendAppPage.passportSeries.click();
        travelSendAppPage.passportSeries.sendKeys("1111");
        travelSendAppPage.passportNumber.click();
        travelSendAppPage.passportNumber.sendKeys("222222");
        travelSendAppPage.documentDate.click();
        travelSendAppPage.documentDate.sendKeys("01.01.2019");
        travelSendAppPage.documentIssue.click();
        travelSendAppPage.documentIssue.sendKeys("Выдано там то");

        assertEquals("Иванов", travelSendAppPage.zastrahSurName.getAttribute("value"));
        assertEquals("Иван", travelSendAppPage.zastrahName.getAttribute("value"));
        assertEquals("01.01.2001", travelSendAppPage.zastrahBirthDate.getAttribute("value"));
        assertEquals("Петров", travelSendAppPage.personLastName.getAttribute("value"));
        assertEquals("Петр", travelSendAppPage.personFirstName.getAttribute("value"));
        assertEquals("Петрович", travelSendAppPage.personMiddleName.getAttribute("value"));
        assertEquals("02.02.2002", travelSendAppPage.personBirthDate.getAttribute("value"));
        assertEquals("1111", travelSendAppPage.passportSeries.getAttribute("value"));
        assertEquals("222222", travelSendAppPage.passportNumber.getAttribute("value"));
        assertEquals("01.01.2019", travelSendAppPage.documentDate.getAttribute("value"));
        assertEquals("Выдано там то", travelSendAppPage.documentIssue.getAttribute("value"));

        travelSendAppPage.submitStrah.click();;

        assertEquals("При заполнении данных произошла ошибка", travelSendAppPage.errorMessage.getText());
        assertEquals("Поле не заполнено.", travelSendAppPage.validationMessage.getText());
        //Thread.sleep(5000);
    }
}
