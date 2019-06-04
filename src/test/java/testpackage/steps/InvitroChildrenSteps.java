package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.InvitroChildrenPage;

public class InvitroChildrenSteps {
    InvitroChildrenPage page;
    @When("^Кликнуть Ссылка ИНВИТРО-детям в подвале$" )
    public void clickLinkInvitroChildren() {page.clickLinkInvitroChildren();    }
    @When("^Проверить Заголовок Журнал «Лабораторная работа»$" )
    public void checkHeaderInvitroChildren() {
        page.checkHeaderInvitroChildren();
    }
    @When("^Проверить Баннер страницы Журнал «Лабораторная работа» Детям$" )
    public void checkBannerInvitroChildren() {
        page.checkBannerInvitroChildren();
    }
    @When("^Проверить Блок Текста страницы Журнал «Лабораторная работа» Детям$" )
    public void checkTextInvitroChildren() {
        page.checkTextInvitroChildren();
    }
    @When("^Проверить Блок выпусков Журнал «Лабораторная работа» Детям$" )
    public void checkIssuesInvitroChildren() {
        page.checkIssuInvitroChildren();
    }

    @When("^Кликнуть Ссылка на первый номер Лабораторная работа$" )
    public void clickLaboratoryWork1InvitroChildren() {
        page.clickLaboratoryWork1InvitroChildren();
    }
    @When("^Кликнуть Ссылка на второй номер Лабораторная работа$" )
    public void clickLaboratoryWork2InvitroChildren() {
        page.clickLaboratoryWork2InvitroChildren();
    }
    @When("^Кликнуть Ссылка на третий номер Лабораторная работа$" )
    public void clickLaboratoryWork3InvitroChildren() {page.clickLaboratoryWork3InvitroChildren();    }
    @When("^Кликнуть Ссылка на четвертый номер Лабораторная работа$" )
    public void clickLaboratoryWork4InvitroChildren() {
        page.clickLaboratoryWork4InvitroChildren();
    }

    @When("^Проверить Баннер страницы Лабораторная работа$" )
    public void checkBannerLaboratoryWork() {
        page.checkBannerLaboratoryWork();
    }
    @When("Проверить Блок текста выбраных тем Лабораторная работа")
    public void checkTextLaboratoryWork() {
        page.checkTextLaboratoryWork();
    }
    @When("Проверить Блок тем Лабораторная работа" )
    public void checkThemeLaboratoryWork() {
        page.checkThemeLaboratoryWork();
    }




}
