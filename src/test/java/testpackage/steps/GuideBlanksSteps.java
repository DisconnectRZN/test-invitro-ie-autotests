package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.GuideBlanksPage;

public class GuideBlanksSteps {
    GuideBlanksPage page;

    @When("Кликнуть Ссылка на Бланки" )
    public void clickGuideBlanks() {page.clickGuideBlanks();    }
    @When("Проверить Заголовок Направительные бланки" )
    public void checkHeaderGuideBlanks() {
        page.checkHeaderGuideBlanks();
    }
    @When("Проверить Центральный блок описания" )
    public void checkCentreGuideBlank() {
        page.checkCentreGuideBlank();
    }
    @When("Проверить Блок направительных бланков")
    public void checkBlockGuideBlanks() {
        page.checkBlockGuideBlanks();
    }



}
