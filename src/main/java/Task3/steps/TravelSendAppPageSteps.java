package Task3.steps;

import Task3.TravelSendAppPage3;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertEquals;

public class TravelSendAppPageSteps extends BaseTest3 {

    @Step("выбор минимальной суммы страховки")
    public void stepMinSumInsurance(){
        new TravelSendAppPage3(driver).minSumStrah.click();
    }

    @Step("нажате кнопки оформить")
    public void stepButtonDraw(){
        new TravelSendAppPage3(driver).buttonDrawUp.click();
    }

    @Step("заполнение формы")
    public void stepFillFields(){
        TravelSendAppPage3 travelSendAppPage3 = new TravelSendAppPage3(driver);
        travelSendAppPage3.zastrahSurName.click();
        travelSendAppPage3.zastrahSurName.sendKeys("Иванов");
        travelSendAppPage3.zastrahName.click();
        travelSendAppPage3.zastrahName.sendKeys("Иван");
        travelSendAppPage3.zastrahBirthDate.click();
        travelSendAppPage3.zastrahBirthDate.sendKeys("01.01.2001");

        travelSendAppPage3.personLastName.click();
        travelSendAppPage3.personLastName.sendKeys("Петров");
        travelSendAppPage3.personFirstName.click();
        travelSendAppPage3.personFirstName.sendKeys("Петр");
        travelSendAppPage3.personMiddleName.click();
        travelSendAppPage3.personMiddleName.sendKeys("Петрович");
        travelSendAppPage3.personBirthDate.click();
        travelSendAppPage3.personBirthDate.sendKeys("02.02.2002");
        travelSendAppPage3.passportSeries.click();
        travelSendAppPage3.passportSeries.sendKeys("1111");
        travelSendAppPage3.passportNumber.click();
        travelSendAppPage3.passportNumber.sendKeys("222222");
        travelSendAppPage3.documentDate.click();
        travelSendAppPage3.documentDate.sendKeys("01.01.2019");
        travelSendAppPage3.documentIssue.click();
        travelSendAppPage3.documentIssue.sendKeys("Выдано там то");
    }

    @Step("проверка заполения формы")
    public void stepCheckFillFields(){
        TravelSendAppPage3 travelSendAppPage3 = new TravelSendAppPage3(driver);
        assertEquals("Иванов", travelSendAppPage3.zastrahSurName.getAttribute("value"));
        assertEquals("Иван", travelSendAppPage3.zastrahName.getAttribute("value"));
        assertEquals("01.01.2001", travelSendAppPage3.zastrahBirthDate.getAttribute("value"));
        assertEquals("Петров", travelSendAppPage3.personLastName.getAttribute("value"));
        assertEquals("Петр", travelSendAppPage3.personFirstName.getAttribute("value"));
        assertEquals("Петрович", travelSendAppPage3.personMiddleName.getAttribute("value"));
        assertEquals("02.02.2002", travelSendAppPage3.personBirthDate.getAttribute("value"));
        assertEquals("1111", travelSendAppPage3.passportSeries.getAttribute("value"));
        assertEquals("222222", travelSendAppPage3.passportNumber.getAttribute("value"));
        assertEquals("01.01.2019", travelSendAppPage3.documentDate.getAttribute("value"));
        assertEquals("Выдано там то", travelSendAppPage3.documentIssue.getAttribute("value"));
    }

    @Step("нажате кнопки Продолжить")
    public void stepSubmitInsurance(){
        new TravelSendAppPage3(driver).submitStrah.click();
    }

    @Step("Проверка отображения ошибок")
    public void stepCheckFail(){
        TravelSendAppPage3 travelSendAppPage3 = new TravelSendAppPage3(driver);
        assertEquals("При заполнении данных произошла ошибка", travelSendAppPage3.errorMessage.getText());
        assertEquals("Поле не заполнено.", travelSendAppPage3.validationMessage.getText());
    }


}
