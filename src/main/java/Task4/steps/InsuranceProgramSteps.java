package Task4.steps;

import Task4.InsuranceProgram4;
import ru.yandex.qatools.allure.annotations.Step;

public class InsuranceProgramSteps {

    @Step("выбран вид страхования 'Страхование для путешественников'")
    public void stepSelectInsuranceProgram(){
        InsuranceProgram4 insuranceProgram4 = new InsuranceProgram4();
        insuranceProgram4.strahTravel.click();
    }
}
