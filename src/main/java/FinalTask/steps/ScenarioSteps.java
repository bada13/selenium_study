package FinalTask.steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    MarketYandexSteps marketYandexSteps = new MarketYandexSteps();
    CatalogElektronikaYandexSteps catalogElektronikaYandexSteps = new CatalogElektronikaYandexSteps ();
    CatalogHeadphonesYandexSteps catalogHeadphonesYandexSteps = new CatalogHeadphonesYandexSteps ();
    CatalogTvYandexSteps catalogTvYandexSteps = new CatalogTvYandexSteps();
    AdvancedSearchPageSteps advancedSearchPageSteps = new AdvancedSearchPageSteps();

    @When("^яндекс выбран пункт меню \"(.+)\"$")
    public void selectMainMenu(String menuName){
        mainSteps.stepSelectMainMenu(menuName);
    }

    @When("^яндекс выбран пункт меню маркета \"(.+)\"$")
    public void selectElektronika(String menuItem){
        marketYandexSteps.stepSelectElektronika(menuItem);
    }

    @When("^яндекс выбраны телевизоры$")
    public void selectTv(){
        catalogElektronikaYandexSteps.stepSelectSubCatalogTv();
    }

    @When("^яндекс выбраны проводные наушники$")
    public void selectHeadphones(){
        catalogElektronikaYandexSteps.stepSelectSubCatalogHeadphones();
    }

    @When("^яндекс выбран расширенный поиск Tv$")
    public void selectAdvancedSearchTv(){
        catalogTvYandexSteps.pushAdvancedSearc();
    }

    @When("^яндекс выбран расширенный поиск Headphones$")
    public void selectAdvancedSearchHeadphones(){
        catalogHeadphonesYandexSteps.pushAdvancedSearch();
    }

    @When("^яндекс указать цена от \"(.+)\"$")
    public void addPriceFrom(String price){
        advancedSearchPageSteps.stepPriceFrom(price);
    }

    @When("^яндекс указать брэнд \"(.+)\"$")
    public void addBrand(String brand){
        advancedSearchPageSteps.stepManufacturer(brand);
    }

    @When("^яндекс применить фильтр$")
    public void SubmitFilter(){
        advancedSearchPageSteps.stepSubmitFilter();
    }

    @Then("^яндекс проверка поиском TV$")
    public void checkFilterTv(){
        advancedSearchPageSteps.stepHeaderSearchFirstProductTv();
    }

    @Then("^яндекс проверка поиском Headphones$")
    public void checkFilterHeadphones(){
        advancedSearchPageSteps.stepHeaderSearchFirstProductHeadphones();
    }
/*
    @Then("^яндекс подсчет количества товара$")
    public void checkCount(){
        advancedSearchPageSteps.stepCountProduct();
    }
    */
}
