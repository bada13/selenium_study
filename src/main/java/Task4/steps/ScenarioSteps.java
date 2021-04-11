package Task4.steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    InsuranceProgramSteps insuranceProgramSteps = new InsuranceProgramSteps();
    PageProgramSteps pageProgramSteps = new PageProgramSteps();
    TravelSendAppPageSteps travelSendAppPageSteps = new TravelSendAppPageSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMainMenu(String menuName){
        mainSteps.stepSelectMainMenu(menuName);
    }

    @When("^выбран пункт подменю \"(.+)\"$")
    public void selectSubMainMenu(String menuSubName){
        mainSteps.stepSelectSubMenu(menuSubName);
    }

    @When("^выбрано страхование путеществеников$")
    public void selectInsuranceProgram(){
        insuranceProgramSteps.stepSelectInsuranceProgram();
    }

    @Then("^заголовок страницы - равен \"(.+)\"$")
    public void checkProgramTitle(String title){
        pageProgramSteps.checkPageTitle(title);
    }

    @When("^нажать оформить онлайн$")
    public void goToSendAppPage(){
        pageProgramSteps.goToSendAppPage();
    }

    @When("^выбор стоимости страховки$")
    public void minSumInsurance() {
        travelSendAppPageSteps.stepMinSumInsurance();
    }

    @When("^нажать оформить$")
    public void pushButtonDraw() {
        travelSendAppPageSteps.stepButtonDraw();
    }

    @When("^заполнение формы$")
    public void fillFields() {
        travelSendAppPageSteps.stepFillFields();
    }

    @Then("^проверка заполненой формы$")
    public void checkFillFields(){
        travelSendAppPageSteps.stepCheckFillFields();
    }

    @When("^нажать продолжить$")
    public void pushSubmitButton() {
        travelSendAppPageSteps.stepSubmitInsurance();
    }

    @Then("^проверка вывода ошибок$")
    public void checkFields(){
        travelSendAppPageSteps.stepCheckFail();
    }
}
