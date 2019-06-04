package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.FranchisingPage;


public class FranchisingSteps {
    FranchisingPage page;

    @When("Кликнуть Ссылка на Франчайзинг" )
    public void clickFranchising() {page.clickFranchising();    }
    @When("Проверить Блок заголовка" )
    public void checkFranchisingHeder() {
        page.checkFranchisingHeder();
    }
    @When("Проверить Блок Собственный бизнес с лидером" )
    public void checkHederBlock() {
        page.checkHederBlock();
    }
    @When("Проверить Блок INVITRO – один из самых известных")
    public void checkHeaderInvitro() {
        page.checkHeaderInvitro();
    }
    @When("Проверить Блок 5 шагов к собственному медицинскому офису" )
    public void checkSteps() {
        page.checkSteps();
    }
    @When("Проверить Блок фото и видео" )
    public void checkPhoto() {
        page.checkPhoto();
    }
    @When("Проверить Блок Требования к инвесторам")
    public void checkRequirements() {
        page.checkRequirements();
    }
    @When("Проверить Блок Выберите удобную схему сотрудничества" )
    public void checkScheme() {
        page.checkScheme();
    }
    @When("Проверить Блок Мы уже открыли более 1000 медицинских офисов")
    public void checkMap() {
        page.checkMap();
    }
}
