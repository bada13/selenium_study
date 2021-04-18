package FinalTask.steps;

import FinalTask.MarketYandex;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketYandexSteps {

    @Step("выбран пункт меню {0}")
    public void stepSelectElektronika(String menuItem){
        MarketYandex marketYandex = new MarketYandex();
        marketYandex.selectMainMenuMarket(menuItem);
    }
}
