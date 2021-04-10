package Task3.steps;

import Task3.PageProgram3;
import org.junit.Assert;
import ru.yandex.qatools.allure.annotations.Step;

public class PageProgramSteps extends BaseTest3 {
    @Step("Заголовок страницы - равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = new PageProgram3(driver).title.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Step("нажатие кнопки Оформить онлайн")
    public void goToSendAppPage(){
        new PageProgram3(driver).pageTeaserButton.click();
    }


}
