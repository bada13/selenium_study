package Task4.util;

import gherkin.formatter.model.Result;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.Allure;
import ru.yandex.qatools.allure.events.MakeAttachmentEvent;

import static Task4.steps.BaseTest4.getDriver;

public class AllureListener extends ru.yandex.qatools.allure.cucumberjvm.AllureReporter {

    @Override
    public void result(Result result) {
        if ("failed".equals(result.getStatus())) takeScreenshot(result);
        super.result(result);
    }

    public void takeScreenshot(Result step) {
        if (getDriver() != null) {
            Allure.LIFECYCLE.fire(new MakeAttachmentEvent(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES),
                    "Скриншот в момент ошибки", "image/png"));
        }
    }

}
