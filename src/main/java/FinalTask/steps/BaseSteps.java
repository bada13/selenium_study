package FinalTask.steps;


import FinalTask.util.TestPropertiesYandex;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSteps {

    public static WebDriver getDriverYandex() {
        return driver;
    }

    public static WebDriver driver;
    public static String baseUrlYandex;
    public static Properties properties = TestPropertiesYandex.getInstance().getProperties();

    @Before
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
        driver = new ChromeDriver();

        baseUrlYandex = properties.getProperty("final.url");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrlYandex);
    }


    @After
    public static void tearDown() {
        driver.quit();
    }

    @Attachment(type = "image/png", value = "Скриншот ошибки")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
