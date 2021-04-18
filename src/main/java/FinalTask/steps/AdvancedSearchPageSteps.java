package FinalTask.steps;

import FinalTask.AdvancedSearchPage;
import FinalTask.CatalogHeadphonesYandex;
import FinalTask.CatalogTvYandex;
import FinalTask.MarketYandex;
import org.junit.Assert;
import ru.yandex.qatools.allure.annotations.Step;

public class AdvancedSearchPageSteps {

    @Step("Ввод цены От {0}")
    public void stepPriceFrom(String price){
        new AdvancedSearchPage().selectPriceFrom(price);
    }

    @Step("выбрать производителя {0}")
    public void stepManufacturer(String brand){
        new AdvancedSearchPage().selectManufacturer(brand);
    }

    @Step("Применить фильтр")
    public void stepSubmitFilter(){
        new AdvancedSearchPage().submitFilter.click();
    }

    @Step("Поиск первого товара на сайте TV")
    public void stepHeaderSearchFirstProductTv(){
        CatalogTvYandex catalogTvYandex = new CatalogTvYandex();
        String firstTv = catalogTvYandex.firstProduct.getText();
        MarketYandex marketYandex = new MarketYandex();
        marketYandex.headerSearch.sendKeys(firstTv);
        marketYandex.submitSearch.click();
        Assert.assertEquals(catalogTvYandex.firstProduct.getText(),firstTv);
    }

    @Step("Поиск первого товара на сайте Headphones")
    public void stepHeaderSearchFirstProductHeadphones(){
        CatalogHeadphonesYandex catalogHeadphonesYandex = new CatalogHeadphonesYandex();
        String firstHeadphones = catalogHeadphonesYandex.firstProduct.getText();
        MarketYandex marketYandex = new MarketYandex();
        marketYandex.headerSearch.sendKeys(firstHeadphones);
        marketYandex.submitSearch.click();
        Assert.assertEquals(catalogHeadphonesYandex.firstProduct.getText(),firstHeadphones);
        //System.out.printf(firstHeadphones);
    }
/*
    @Step("подсчет количества товара на странице")
    public void stepCountProduct(){
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();
        Assert.assertEquals(String.valueOf(advancedSearchPage.countProduct),12);
        System.out.printf(String.valueOf(advancedSearchPage.countProduct));
    }
*/
}
