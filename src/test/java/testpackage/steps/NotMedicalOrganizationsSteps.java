package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.NotMedicalOrganizationsPage;

public class NotMedicalOrganizationsSteps {
    NotMedicalOrganizationsPage page;

    @When("Проверить Клик Ссылка Немедицинским организациям" )
    public void clickNotMedicalOrganizationsNOT() {
        page.clickNotMedicalOrganizationsNOT();
    }
    @When("Проверить Видимость Заголовка Немедицинским организациям" )
    public void checkHeaderNOT() {
        page.checkHeaderNOT();
    }

    @When("Проверить Видимость Блок Вниманию HR-директоров и руководителей компаний" )
    public void checkBlockPartnerNOT() {page.checkBlockPartnerNOT();    }
    @When("Проверить Блок Гарантии качества ИНВИТРО" )
    public void checkReliableBlockNOT() {page.checkReliableBlockNOT();    }
    @When("Проверить Блок Немедицинским Что вы приобретаете" )
    public void checkLaboratoryBlockNOT() {
        page.checkLaboratoryBlockNOT();
    }
    @When("Проверить Блок Немедицинским Заинтересовала программа" )
    public void checkDiscoverBlockNOT() {
        page.checkDiscoverBlockNOT();
    }
    @When("Проверить Немедицинским Выберите удобную схему сотрудничества" )
    public void checkNOTAffiliateBlock() {
        page.checkNOTAffiliateBlock();
    }
    @When("Проверить Немедицинским Блок Хранение биоматериала в лаборатори" )
    public void checkNOTBenefitsBlock() {page.checkNOTBenefitsBlock();    }
    @When("Проверить Немедицинским Блок Нам доверяют своих сотрудников компании" )
    public void checkNOTEquipmentBlock() {
        page.checkNOTEquipmentBlock();
    }
    @When("Проверить Немедицинским Блок Остались вопросы" )
    public void checkNOTQuestionsBlock() { page.checkNOTQuestionsBlock(); }



}
