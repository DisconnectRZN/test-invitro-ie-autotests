package testpackage.help;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepEventBus;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.time.temporal.ChronoUnit;

public class Help_Methods extends PageObject {

    private static final Help_Methods INSTANCE = new Help_Methods();

    /*
    Данный класс позволит заново не переписывать все методы, а вызывать их отсюда,
    достаточно подставить переменную xPath, которую мы объявляем в классах Page.

    Для того, чтобы было возможно обращаться к методам из этого класса в других,
    внутри нужного нам класса необходимо прописать следующую конструкцию:

    private static final Help_Methods help = Help_Methods.getInstance();

    Где help - является переменной, которую можно назвать как угодно,
    она будет распространятся только внутри класса, в котором написана
    и для вызова метода необходимо внутри созданного метода прописать следущее:

    public void Verify_Address_Button (){
        help.Check_Visible_Element(Address_Page);}

    В примере выше, мы создаем метод в классе, обращаемся к help,
    который подтягивает методы из класса Help_Methods.class, через точку выбираем нужный метод
    например Check_Visible_Element, для того, чтобы кликнуть по элементу.
    В скобках вызванного метода вставить перменную содержащую xPath, например Address_Page,
    которой соответсвует запись:

    private By Address_Page = By.xpath("//a[text()='Адреса']");

    Так как java достаточно умный язык, он будет показывать допустимые методы при написании тестов
     */

    private Help_Methods() {
    }

    public static Help_Methods getInstance() {
        return INSTANCE;
    }

    public void Click_Method(By test) { //Метод клика по элементу
        find(test).waitUntilClickable().click();
        getSlow();
    }

    /**
     * Вывод в консоль названия текущего шага
     */
    public void consoleOutput() {
        System.out.println(StepEventBus.getEventBus().getCurrentStep().toString()
                .replaceAll("^Optional\\[", "").replaceAll("]", ""));
    }

    /**
     * Скролл к нужному элементу через By
     */
    public void scrollTo(By test) {
        WebElementFacade element = find(test).withTimeoutOf(30, ChronoUnit.SECONDS).waitUntilVisible();
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", test);
    }

    public void Check_Enabled_Element(By test) {
        Assertions.assertThat(find(test).isEnabled());
    }

    public void Verify_Text(By test, String test1) {
        Assertions.assertThat(find(test).getText()).isEqualTo(test1);
    }

    public void Check_Visible_Element(By test) {
        Assertions.assertThat(find(test).isVisible());
    }

    public void Enter_Text(By test, String test1) {
        find(test).sendKeys(test1);
    }

    public void getSlow() { //Притормаживает выполнение на 1 секунду
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

