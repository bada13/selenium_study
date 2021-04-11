package Task4.steps;

import Task4.PageProgram4;
import org.junit.Assert;
import ru.yandex.qatools.allure.annotations.Step;

public class PageProgramSteps {
    @Step("Заголовок страницы - равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = new PageProgram4().title.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Step("нажатие кнопки Оформить онлайн")
    public void goToSendAppPage(){
        new PageProgram4().pageTeaserButton.click();
    }


}
