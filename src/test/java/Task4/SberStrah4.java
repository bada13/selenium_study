package Task4;

import Task4.InsuranceProgram4;
import Task4.steps.*;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Title;

public class SberStrah4 extends BaseTest4 {
/*
    @Test
    @Title("Страхование путешественников")
    public void testInsuranceTravel(){
        driver.get(baseUrl + "/");
        MainSteps mainSteps = new MainSteps();
        InsuranceProgramSteps insuranceProgramSteps = new InsuranceProgramSteps();
        PageProgramSteps pageProgramSteps = new PageProgramSteps();
        TravelSendAppPageSteps travelSendAppPageSteps = new TravelSendAppPageSteps();

        mainSteps.stepSelectMainMenu("Страхование");
        mainSteps.stepSelectSubMenu("Перейти в каталог");

        InsuranceProgram4 insuranceProgram = new InsuranceProgram4(driver);
        WebElement element = insuranceProgram.strahTravel;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        insuranceProgramSteps.stepSelectInsuranceProgram();

        pageProgramSteps.checkPageTitle("Страхование путешественников");
        pageProgramSteps.goToSendAppPage();

        travelSendAppPageSteps.stepMinSumInsurance();
        travelSendAppPageSteps.stepButtonDraw();
        travelSendAppPageSteps.stepFillFields();
        travelSendAppPageSteps.stepCheckFillFields();
        travelSendAppPageSteps.stepSubmitInsurance();
        travelSendAppPageSteps.stepCheckFail();
    }*/
}
