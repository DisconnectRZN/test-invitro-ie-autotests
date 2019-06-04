package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.VNDPage;

import java.util.List;


public class VNDSteps {
    VNDPage page;

    @When("Кликнуть Ссылка в шапке сайта")
    public void сlickvndlink() {
        page.сlickVNDLink();
    }

    @When("Проверить видимость Заголовка")
    public void checkheadline() {
        page.checkHeadline();
    }

    @When("Проверить видимость баннера")
    public void visiblebanner() {
        page.visiblebanner();
    }
    @When("Проверить заголовок Баннера")
    public void checkBlockTextBanner() {
        page.checkBlockTextBanner();
    }

    @When("Ввод имени autotest")
    public void enterInputName() {
        page.enterInputName();
    }

    @When("Ввод телефона 9999999999")
    public void enterInputPhone() {
        page.enterInputPhone();
    }

    @When("Проверить видимость Кнопка Заказать звонок")
    public void visiblerequestcall() {
        page.visiblerequestcall();
    }

    @When("Проверить видимость Блок с иконками анализы на дому")
    public void visibleblockanalyzeshome() {
        page.visibleblockanalyzeshome();
    }

    @When("Проверить Блок Дополнительные возможности")
    public void visibleblockadditional() {
        page.visibleblockadditional();
    }

    @When("Проверить Блок оформите заявку")
    public void visibleblockissue() {
        page.visibleblockissue();
    }

    @When("Проверить Блок как получить анализы")
    public void visibleblockanalyzes() {
        page.visibleblockanalyzes();
    }

    @When("Проверить Блок стоимость вызова")
    public void visibleblockcost() {
        page.visibleblockcost();
    }

    @When("Проверить Блок графика оказания услуг")
    public void visibleblockschedule() {
        page.visibleblockschedule();
    }

    @When("Выбрать город Самара")
    public void addSamaraCity(){
        page.addSamaraCity();}

    @When("Проверить видимость Баннер изображение слева")
    public void visibleImageBanner(){
        page.visibleImageBanner();}

    }
