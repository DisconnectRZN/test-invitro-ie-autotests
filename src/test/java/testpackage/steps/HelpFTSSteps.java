package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.HelpFTSPage;

public class HelpFTSSteps {
    HelpFTSPage page;
    @When("Клик Ссылка  Справка для ФНС")
    public void сlickPrivacyHelpFTS() {page.сlickPrivacyHelpFTS();}
    @When("Проверить Видимость  Справка для ФНС Заголовка")
    public void checkHeadlineHelpFTS() {page.checkHeadlineHelpFTS();}
    @When("Проверить Видимость Сайт-бар  Справка для ФНС слева")
    public void checkSideBarHelpFTS() {page.checkSideBarHelpFTS();}
    @When("Проверить Видимость  Справка для ФНС Центральный информационный блок")
    public void checkInformationBlockHelpFTS() {page.checkInformationBlockHelpFTS();}

}
