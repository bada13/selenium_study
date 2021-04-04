package Task1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class SberStrah {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        //System.setProperty("webdriver.gecko.driver", "drv/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");

        driver = new ChromeDriver();
        baseUrl = "http://www.sberbank.ru/ru/person";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void creatStrah () throws InterruptedException {
        driver.get(baseUrl + "/");
        driver.findElement(By.xpath("//a[contains(@class,'kitt-top-menu__link kitt-top-menu__link_first kitt-top-menu__link_icons kitt-top-menu__link_wide')][contains(text(),'Страхование')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Перейти в каталог')]")).click();

        WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Страхование для путешественников')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        driver.findElement(By.xpath("//h3[contains(text(),'Страхование для путешественников')]")).click();
        Assert.assertEquals("Страхование путешественников", driver.findElement(By.xpath("//h1[contains(@class,'page-teaser-dict__header kitt-heading_size_l')]")).getText());
        driver.findElement(By.xpath("//a[contains(@data-test-id,'PageTeaserDict_button')]")).click();

        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(By.xpath("//h2[contains(text(),'Страхование путешественников')]"))));

        driver.findElement(By.xpath("//div[@class='online-card-program selected']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[contains(text(),'Оформить')]")).click();

        driver.findElement(By.xpath("//input[@id='surname_vzr_ins_0']")).click();
        driver.findElement(By.xpath("//input[@id='surname_vzr_ins_0']")).sendKeys("Иванов");
        driver.findElement(By.xpath("//input[@id='name_vzr_ins_0']")).click();
        driver.findElement(By.xpath("//input[@id='name_vzr_ins_0']")).sendKeys("Иван");
        driver.findElement(By.xpath("//input[@id='birthDate_vzr_ins_0']")).click();
        driver.findElement(By.xpath("//input[@id='birthDate_vzr_ins_0']")).sendKeys("01.01.2001");

        driver.findElement(By.xpath("//input[@id='person_lastName']")).click();
        driver.findElement(By.xpath("//input[@id='person_lastName']")).sendKeys("Петров");
        driver.findElement(By.xpath("//input[@id='person_firstName']")).click();
        driver.findElement(By.xpath("//input[@id='person_firstName']")).sendKeys("Петр");
        driver.findElement(By.xpath("//input[@id='person_middleName']")).click();
        driver.findElement(By.xpath("//input[@id='person_middleName']")).sendKeys("Петрович");
        driver.findElement(By.xpath("//input[@id='person_birthDate']")).click();
        driver.findElement(By.xpath("//input[@id='person_birthDate']")).sendKeys("02.02.2002");
        //driver.findElement(By.xpath("//label[@class='btn ng-valid ng-touched ng-dirty']")).click();
        driver.findElement(By.xpath("//input[@id='passportSeries']")).click();
        driver.findElement(By.xpath("//input[@id='passportSeries']")).sendKeys("1111");
        driver.findElement(By.xpath("//input[@id='passportNumber']")).click();
        driver.findElement(By.xpath("//input[@id='passportNumber']")).sendKeys("222222");
        driver.findElement(By.xpath("//input[@id='documentDate']")).click();
        driver.findElement(By.xpath("//input[@id='documentDate']")).sendKeys("01.01.2019");
        driver.findElement(By.xpath("//input[@id='documentIssue']")).click();
        driver.findElement(By.xpath("//input[@id='documentIssue']")).sendKeys("Выдано там то");

        assertEquals("Иванов", driver.findElement(By.xpath("//input[@id='surname_vzr_ins_0']")).getAttribute("value"));
        assertEquals("Иван", driver.findElement(By.xpath("//input[@id='name_vzr_ins_0']")).getAttribute("value"));
        assertEquals("01.01.2001", driver.findElement(By.xpath("//input[@id='birthDate_vzr_ins_0']")).getAttribute("value"));
        assertEquals("Петров", driver.findElement(By.xpath("//input[@id='person_lastName']")).getAttribute("value"));
        assertEquals("Петр", driver.findElement(By.xpath("//input[@id='person_firstName']")).getAttribute("value"));
        assertEquals("Петрович", driver.findElement(By.xpath("//input[@id='person_middleName']")).getAttribute("value"));
        assertEquals("02.02.2002", driver.findElement(By.xpath("//input[@id='person_birthDate']")).getAttribute("value"));
        assertEquals("1111", driver.findElement(By.xpath("//input[@id='passportSeries']")).getAttribute("value"));
        assertEquals("222222", driver.findElement(By.xpath("//input[@id='passportNumber']")).getAttribute("value"));
        assertEquals("01.01.2019", driver.findElement(By.xpath("//input[@id='documentDate']")).getAttribute("value"));
        assertEquals("Выдано там то", driver.findElement(By.xpath("//input[@id='documentIssue']")).getAttribute("value"));

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='alert-form alert-form-error']")).getText().equals("При заполнении данных произошла ошибка");
        driver.findElement(By.xpath("//*[contains(text(),'Поле не заполнено.')]")).getText().equals("Поле не заполнено.");

        assertEquals("При заполнении данных произошла ошибка", driver.findElement(By.xpath("//div[@class='alert-form alert-form-error']")).getText());
        assertEquals("Поле не заполнено.", driver.findElement(By.xpath("//*[contains(text(),'Поле не заполнено.')]")).getText());
        //Thread.sleep(5000);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
