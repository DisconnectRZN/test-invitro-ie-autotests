package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.BlanksPage;

public class BlanksSteps {
    BlanksPage page;

    @When("Кликнуть Врачам в шапке" )
    public void clickDoctor() {page.clickDoctor();    }
    @When("Кликнуть Бланки" )
    public void clickBlanks() {
        page.clickBlanks();
    }
    @When("Проверить Видимость Заголовка" )
    public void checkHeadline() {
        page.checkHeadline();
    }
    @When("Проверить Блок описания и направительных бланков" )
    public void checkBlockBlanks() {
        page.checkBlockBlanks();
    }
    @When("Проверить видимость Иконки направительных бланков")
    public void visibleImageBlanks() {
        page.visibleImageBlanks();
    }




}
