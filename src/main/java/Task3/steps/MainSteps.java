package Task3.steps;

import Task3.MainPage3;
import ru.yandex.qatools.allure.annotations.Step;

public class MainSteps extends BaseTest3 {

    @Step("выбран пункт меню {0}")
    public void stepSelectMainMenu(String menuItem){
        new MainPage3(driver).selectMainMenu(menuItem);
    }

    @Step("выбран пункт подменю {0}")
    public void stepSelectSubMenu(String menuSubItem){
        new MainPage3(driver).selectSubMenu(menuSubItem);
    }
}
