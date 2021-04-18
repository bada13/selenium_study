package FinalTask;

import FinalTask.steps.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageYandex {

    @FindBy(xpath = "//div[@class='container container__services container__line']")
    WebElement mainMenu;

    @FindBy(xpath = "//div[contains(text(),'Маркет')]")
    WebElement subMenu;

    public MainPageYandex(){
        PageFactory.initElements(BaseSteps.getDriverYandex(),this);
    }

    public void selectMainMenu(String menuItem) {
        String winHandleBefore = BaseSteps.getDriverYandex().getWindowHandle();
        mainMenu.findElement(By.xpath("//div[contains(text(),'"+menuItem+"')]")).click();
        for(String winHandle : BaseSteps.getDriverYandex().getWindowHandles()){
            BaseSteps.getDriverYandex().switchTo().window(winHandle);
        }
    }

}
