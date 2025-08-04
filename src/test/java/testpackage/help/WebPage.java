package testpackage.help;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import java.time.temporal.ChronoUnit;

public class WebPage extends PageObject {

/////////////////////////////////////////////////// Xpath's \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

/////////////////////////////////////////////////// Методы \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


    /** Метод клика по элементу */
    public void clickMethod_1(WebElementFacade by) {
        WebElementFacade element =
                element(by).withTimeoutOf(30, ChronoUnit.SECONDS).waitUntilVisible();
        element.click();
    }

    /** Метод клика по элементу */
    public void clickMethod_2(By by) {
        WebElementFacade element =
                element(by).withTimeoutOf(30, ChronoUnit.SECONDS).waitUntilVisible();
        scrollTo(by);
        element.click();
    }

    public void checkVisibleElement(By test) {
        WebElementFacade element = find((By) test).withTimeoutOf(30, ChronoUnit.SECONDS).waitUntilVisible();
        Assertions.assertThat(element.isDisplayed()).as(test.toString() + " not visible").isTrue();
    }

    /** Скролл к нужному элементу через WebElementFacade */
    public void scrollTo(WebElementFacade element) {
        final JavascriptExecutor driver = (JavascriptExecutor) getDriver();
        driver.executeScript("arguments[0].scrollIntoView(true);",
                element);
        driver.executeScript("if(window.pageYOffset>=100) scrollBy(0, -150); else scroll(0, 0);");
    }

    /** Скролл к нужному элементу через By */
    public void scrollTo(By element) {
        WebElementFacade test = find(element).withTimeoutOf(30, ChronoUnit.SECONDS).waitUntilVisible();
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", test);
    }

    public void getSlow() { //Притормаживает выполнение на 5 секунд
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
