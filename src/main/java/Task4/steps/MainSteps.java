package Task4.steps;

import Task4.MainPage4;
import ru.yandex.qatools.allure.annotations.Step;

public class MainSteps {

    @Step("выбран пункт меню {0}")
    public void stepSelectMainMenu(String menuItem){
        new MainPage4().selectMainMenu(menuItem);
    }

    @Step("выбран пункт подменю {0}")
    public void stepSelectSubMenu(String menuSubItem){
        new MainPage4().selectSubMenu(menuSubItem);
    }
}
