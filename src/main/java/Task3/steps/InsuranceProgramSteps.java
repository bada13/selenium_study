package Task3.steps;

import Task3.InsuranceProgram3;
import ru.yandex.qatools.allure.annotations.Step;

public class InsuranceProgramSteps extends BaseTest3 {

    @Step("выбран вид страхования 'Страхование для путешественников'")
    public void stepSelectInsuranceProgram(){
        InsuranceProgram3 insuranceProgram3 = new InsuranceProgram3(driver);
        insuranceProgram3.strahTravel.click();
    }
}
