package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.ClinicsAndPartnersPage;

public class ClinicsAndPartnersSteps {
    ClinicsAndPartnersPage page;

    @When("Кликнуть Корпоративным клиентам в Header меню")
    public void сlickKKPage () { page.сlickKKPage(); }

    @When("^Кликнуть Клиники-партнеры в меню$")
    public void сlickClinicsAndParnersPage () { page.сlickClinicsAndParnersPage(); }

    @When("^Проверка отображения заголовка 'Клиники-партнеры'$")
    public void сlickClinicsAndParnersText () { page.сlickClinicsAndParnersText(); }

    @When("^Проверка отображения блока текста 'Клиники-партнеры'$")
    public void сlickClinicsAndParnersBlockText () { page.сlickClinicsAndParnersBlockText(); }

    @When("Проверка отображения карты")
    public void visibleMap () { page.visibleMap(); }

    @When("^Проверка блока Клиники-партнеры$")
    public void VisibleClinic () { page.VisibleClinic(); }
}
