package FinalTask.steps;

import FinalTask.CatalogHeadphonesYandex;
import ru.yandex.qatools.allure.annotations.Step;

public class CatalogHeadphonesYandexSteps {

    @Step("Нажать расширенный поиск")
    public void pushAdvancedSearch() {
        CatalogHeadphonesYandex catalogHeadphonesYandex = new CatalogHeadphonesYandex();
        catalogHeadphonesYandex.advancedSearchButton.click();
    }
}
