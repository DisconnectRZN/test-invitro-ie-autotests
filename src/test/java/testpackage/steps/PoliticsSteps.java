package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.PoliticsPage;

public class PoliticsSteps {
    PoliticsPage page;
    @When("Клик 1Ссылка Политика в отношении персональных данных")
    public void checkHeadlinePoliticsPage() {page.сlickPoliticsPagePage();}
    @When("Проверить 1Видимость Заголовка Политика в отношении персональных данных")
    public void checkHeadlinePolPoliticsPage() {page.checkHeadlinePolPoliticsPage();}
    @When("Проверить 1 Видимость Сайт-бар слева Политика в отношении персональных данныха")
    public void checkSideBarPoliticsPage() {page.checkSideBarPoliticsPage();}
    @When("Проверить 1 Видимость Центральный информационный блок Политика в отношении персональных данных")
    public void checkInformationBlockPoliticsPage() {page.checkInformationBlockPoliticsPage();}

}
