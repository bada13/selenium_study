package FinalTask.steps;

import FinalTask.CatalogTvYandex;
import ru.yandex.qatools.allure.annotations.Step;

public class CatalogTvYandexSteps {

    @Step("Нажать расширенный поиск")
    public void pushAdvancedSearc() {
        CatalogTvYandex catalogTvYandex = new CatalogTvYandex();
        catalogTvYandex.advancedSearchButton.click();
    }

}
