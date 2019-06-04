package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.VakansiiPage;

public class VakansiiSteps {
    VakansiiPage page;

    @When("Кликнуть Вакансии в подвале" )
    public void clickVakansii() {page.clickVakansii();    }
    @When("Проверить header Работа в Инвитро" )
    public void checkJob() {
        page.checkJob();
    }
    @When("Проверить Блок слева" )
    public void checkLeftBlock() {
        page.checkLeftBlock();
    }
    @When("Проверить Блок под заголовком с описанием и банером")
    public void checkHeaderBanner() {
        page.checkHeaderBanner();
    }
    @When("Проверить Блок Постоянное развитие" )
    public void checkDevelopment() {
        page.checkDevelopment();
    }
    @When("Проверить Блок Интервью с Виталиной Левашовой" )
    public void checkInterview() {
        page.checkInterview();
    }
    @When("Проверить Блок ИНВИТРО - лауреат премий в области HR")
    public void checkLaureate() {
        page.checkLaureate();
    }









}
