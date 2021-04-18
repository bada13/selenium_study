package FinalTask.steps;

import FinalTask.MainPageYandex;
import ru.yandex.qatools.allure.annotations.Step;

public class MainSteps {

    @Step("выбран пункт меню {0}")
    public void stepSelectMainMenu(String menuItem){
        new MainPageYandex().selectMainMenu(menuItem);
    }

}
