package Task3.util;

import Task3.steps.BaseTest3;
import org.junit.runner.notification.Failure;
import ru.yandex.qatools.allure.junit.AllureRunListener;

public class AllureListener extends AllureRunListener {

    @Override
    public void testFailure(Failure failure){
        BaseTest3.takeScreenshot();
        super.testFailure(failure);
    }

}
