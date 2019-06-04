package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.DriversInspectionPage;

public class DriversInspectionSteps {
    DriversInspectionPage page;

    @When("Клик Ссылка на Осмотр водителей")
    public void сlickDriversInspection() {page.сlickDriversInspection();}

    @When("Проверить видимость Баннер Осмотр водителей")
    public void visibledibanner() { page.visibledibanner();}

    @When("Проверить Осмотр водителей Видимость Заголовка")
    public void checkZHeadlineDI() { page.checkZHeadlineDI(); }

    @When("Проверить Осмотр водителей видимость Блок рядом с баннером")
    public void checkBlockTextBanner() { page.checkBlockTextBanner(); }

    @When("Осмотр водителей Ввод имени autotest")
    public void enterInputName() {page.enterInputName();    }

    @When("Осмотр водителей Ввод телефона 9999999999")
    public void enterInputPhone() { page.enterInputPhone();    }

    @When("Осмотр водителей Проверить видимость Кнопка Заказать звонок")
    public void visiblerequestcall() { page.visiblerequestcall(); }

    @When("Проверить Осмотр водителей видимость Блок с иконками анализы на дому")
    public void visibleblockanalyzeshome() {        page.visibleblockanalyzeshome(); }

    @When("Проверить Осмотр водителей Блок Где провести осмотр ваших сотрудников")
    public void visibleBlockWhere() {
        page.visibleBlockWhere();
    }

    @When("Проверить Осмотр водителей Блок оформите заявку")
    public void visibleBlockMakeApplication() {      page.visibleBlockMakeApplication(); }

    @When("Проверить Осмотр водителей Блок Нужна консультация")
    public void visibleBlockNeedConsultation() {
        page.visibleBlockNeedConsultation();
    }

}
