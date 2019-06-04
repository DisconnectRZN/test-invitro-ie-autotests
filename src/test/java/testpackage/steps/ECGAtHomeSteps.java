package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.ECGAtHomePage;

public class ECGAtHomeSteps {
    ECGAtHomePage page;

    @When("Клик Ссылка на ЭКГ на дому")
    public void сlickECGAtHome() {page.сlickECGAtHome();}

    @When("Проверить ЭКГ на дому видимость баннера")
    public void visibleecgbanner() { page.visibleecgbanner();}

    @When("Проверить ЭКГ Видимость Заголовка")
    public void checkZHeadlineECG() { page.checkZHeadlineECG(); }

    @When("Проверить ЭКГ видимость Блок рядом с баннером")
    public void checkBlockTextBanner() { page.checkBlockTextBanner(); }

    @When("ЭКГ Ввод имени autotest")
    public void enterInputName() {page.enterInputName();    }

    @When("ЭКГ Ввод телефона 9999999999")
    public void enterInputPhone() { page.enterInputPhone();    }

    @When("ЭКГ Проверить видимость Кнопка Заказать звонок")
    public void visiblerequestcall() { page.visiblerequestcall(); }

    @When("Проверить ЭКГ видимость Блок с иконками анализы на дому")
    public void visibleblockanalyzeshome() {        page.visibleblockanalyzeshome(); }

    @When("Проверить ЭКГ Блок Преимущества")
    public void visibleBlockBenefits() {
        page.visibleBlockBenefits();
    }

    @When("Проверить ЭКГ Оформите заявку ЭКГ")
    public void visibleBlockMakeApplicationECG() {      page.visibleBlockMakeApplicationECG(); }

    @When("Проверить ЭКГ Блок Стоимость выезда")
    public void visibleBlockDepartureCostECG() {
        page.visibleBlockDepartureCostECG();
    }

    @When("Проверить ЭКГ Блок График оказания услуг")
    public void visibleBlockScheduleECG() {
        page.visibleBlockScheduleECG();
    }

}
