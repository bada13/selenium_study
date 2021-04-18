package FinalTask.steps;

import FinalTask.CatalogElektronikaYandex;
import ru.yandex.qatools.allure.annotations.Step;

public class CatalogElektronikaYandexSteps {

    @Step("выбран пункт меню Tv")
    public void stepSelectSubCatalogTv(){
        CatalogElektronikaYandex catalogElektronikaYandex = new CatalogElektronikaYandex();
        catalogElektronikaYandex.subMenuElektronikaTv.click();
    }

    @Step("выбран пункт меню Headphones")
    public void stepSelectSubCatalogHeadphones(){
        CatalogElektronikaYandex catalogElektronikaYandex = new CatalogElektronikaYandex();
        catalogElektronikaYandex.subMenuElektronikaHeadphones.click();
    }
}
