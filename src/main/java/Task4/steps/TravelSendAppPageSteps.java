package Task4.steps;

import Task4.TravelSendAppPage4;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertEquals;

public class TravelSendAppPageSteps {

    @Step("выбор минимальной суммы страховки")
    public void stepMinSumInsurance(){
        new TravelSendAppPage4().minSumStrah.click();
    }

    @Step("нажате кнопки оформить")
    public void stepButtonDraw(){
        new TravelSendAppPage4().buttonDrawUp.click();
    }

    @Step("заполнение формы")
    public void stepFillFields(){
        TravelSendAppPage4 travelSendAppPage4 = new TravelSendAppPage4();
        travelSendAppPage4.zastrahSurName.click();
        travelSendAppPage4.zastrahSurName.sendKeys("Иванов");
        travelSendAppPage4.zastrahName.click();
        travelSendAppPage4.zastrahName.sendKeys("Иван");
        travelSendAppPage4.zastrahBirthDate.click();
        travelSendAppPage4.zastrahBirthDate.sendKeys("01.01.2001");

        travelSendAppPage4.personLastName.click();
        travelSendAppPage4.personLastName.sendKeys("Петров");
        travelSendAppPage4.personFirstName.click();
        travelSendAppPage4.personFirstName.sendKeys("Петр");
        travelSendAppPage4.personMiddleName.click();
        travelSendAppPage4.personMiddleName.sendKeys("Петрович");
        travelSendAppPage4.personBirthDate.click();
        travelSendAppPage4.personBirthDate.sendKeys("02.02.2002");
        travelSendAppPage4.passportSeries.click();
        travelSendAppPage4.passportSeries.sendKeys("1111");
        travelSendAppPage4.passportNumber.click();
        travelSendAppPage4.passportNumber.sendKeys("222222");
        travelSendAppPage4.documentDate.click();
        travelSendAppPage4.documentDate.sendKeys("01.01.2019");
        travelSendAppPage4.documentIssue.click();
        travelSendAppPage4.documentIssue.sendKeys("Выдано там то");
    }

    @Step("проверка заполения формы")
    public void stepCheckFillFields(){
        TravelSendAppPage4 travelSendAppPage3 = new TravelSendAppPage4();
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
        new TravelSendAppPage4().submitStrah.click();
    }

    @Step("Проверка отображения ошибок")
    public void stepCheckFail(){
        TravelSendAppPage4 travelSendAppPage3 = new TravelSendAppPage4();
        assertEquals("При заполнении данных произошла ошибка", travelSendAppPage3.errorMessage.getText());
        assertEquals("Поле не заполнено.", travelSendAppPage3.validationMessage.getText());
    }


}
