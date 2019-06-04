package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.ClinicalReseachesPage;

public class ClinicalReseachesSteps {

    ClinicalReseachesPage page;


    @When("Перейти из футера на страницу Клинические исследования")
    public void ClickClinicalReseachFooter() {
        page.ClickClinicalReseachFooter();
    }

    @When("Проверить наличие хлебных крошек на странице Клинические исследования")
    public void VeriFyKroshkiClinicalReseach() {
        page.VeriFyKroshkiClinicalReseach();
    }

    @When("Проверить наличие заголовка на странице Клинические исследования")
    public void VeriFyClinicalNameSection() {
        page.VeriFyClinicalNameSection();
    }

    @When("Сравнить наименование раздела в хлебных крошках и в заголовке на странице Клинические исследования")
    public void VeriFyNameRazdelaClinRes_Krochki() {
        page.VeriFyNameRazdelaClinRes_Krochki();
    }

    @When("Проверка меню Клинических исследований и наличия описания разделов")
    public void AllClinicalMenu() {
        page.AllClinicalMenu();
    }

}
