package testpackage.help;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import java.time.temporal.ChronoUnit;


public class WebPage extends PageObject {

/////////////////////////////////////////////////// Xpath's \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    /**
     * Кнопка смены языка сайта
     */
    private final By enRuButton = By.xpath("//a[@class='switch-lang__icon']");



/////////////////////////////////////////////////// Методы \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


    /** Метод клика по элементу */
    public void clickMethod(By by) {
        WebElementFacade element =
                element(by).withTimeoutOf(30, ChronoUnit.SECONDS).waitUntilVisible();
        scrollTo(by);
        element.click();
    }


    /** Метод проверки видимости элемента напрямую */
    public void checkVisibleElement(By test, String s) {
        WebElementFacade element = find(test).withTimeoutOf(30, ChronoUnit.SECONDS).waitUntilVisible();
        Assertions.assertThat(element.isDisplayed()).as(test.toString() + " not visible").isTrue();
    }


    /**
     * Скролл к нужному элементу через By
     *
     * @param element Элемент на странице
     */
    public void scrollTo(By element) {
        WebElementFacade test = find(element).withTimeoutOf(30, ChronoUnit.SECONDS).waitUntilVisible();
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", test);
    }

}
