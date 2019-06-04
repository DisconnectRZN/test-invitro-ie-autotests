package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.FederalLaw54Page;

public class FederalLaw54Steps {
    FederalLaw54Page page;
    @When("Клик Ссылка 54-ФЗ")
    public void сlickFederalLaw54Page() {page.сlickFederalLaw54Page();}
    @When("Проверить Видимость 54-ФЗ Заголовка")
    public void checkHeadline54fz() {page.checkHeadline54fz();}
    @When("Проверить Видимость Сайт-бар слева")
    public void checkSideBar54() {page.checkSideBar54();}
    @When("Проверить Видимость Центральный информационный блок")
    public void checkInformationBlock54fz() {page.checkInformationBlock54fz();}

}
