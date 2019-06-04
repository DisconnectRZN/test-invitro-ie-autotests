package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.UltrasoundAtHomePage;

public class UltrasoundAtHomeSteps {
    UltrasoundAtHomePage page;

    @When("Клик Ссылка на УЗИ на дому")
    public void clickDriversInspectionUZI() {page.clickDriversInspectionUZI();}

    @When("Проверить УЗИ на дому видимость баннера")
    public void checkbannerUZI() { page.checkbannerUZI();}

    @When("Проверить УЗИ Видимость Заголовка")
    public void checkZHeadlineUZI() { page.checkZHeadlineUZI(); }

    @When("Проверить УЗИ видимость Блок рядом с баннером")
    public void checkBlockTextBannerUZI() { page.checkBlockTextBannerUZI(); }

    @When("УЗИ Ввод имени autotest")
    public void enterInputNameUZI() {page.enterInputNameUZI();    }

    @When("УЗИ Ввод телефона 9999999999")
    public void enterInputPhoneUZI() { page.enterInputPhoneUZI();    }

    @When("УЗИ Проверить видимость Кнопка Заказать звонок")
    public void visiblerequestcallUZI() { page.visiblerequestcallUZI(); }

    @When("Проверить УЗИ видимость Блок с иконками анализы на дому")
    public void visibleblockanalyzeshomeUZI() {        page.visibleblockanalyzeshomeUZI(); }

    @When("Проверить УЗИ Блок Дополнительные возможностиа")
    public void visibleBlockWhereUZI() {
        page.visibleBlockWhereUZI();
    }

    @When("Проверить УЗИ Оформите заявку")
    public void visibleBlockMakeApplicationUZI() {      page.visibleBlockMakeApplicationUZI(); }

    @When("Проверить УЗИ Блок Стоимость выезда")
    public void visibleBlockNeedConsultationUZI() {
        page.visibleBlockNeedConsultationUZI();
    }

    @When("Проверить УЗИ Блок График оказания услуг")
    public void visibleBlockScheduleUZI() {
        page.visibleBlockScheduleUZI();
    }

}
