package Task4;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"selenium_study.Task4"},
        plugin = {
                "Task4.util.AllureListener",
        })
public class CucumberRunner {
}
