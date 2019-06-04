package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.MedicalOrganizationsPage;

public class MedicalOrganizationsSteps {
    MedicalOrganizationsPage page;
    @When("Кликнуть Корпоративным клиентам в шапке" )
    public void clickCorporativeClients() {page.clickCorporativeClients();    }
    @When("Проверить Заголовок Медицинским организациям" )
    public void clickHeader() {
        page.clickHeader();
    }
    @When("Проверить Блок Станьте партнером крупнейшей" )
    public void checkBlockPartner() {
        page.checkBlockPartner();
    }
    @When("Проверить Блок 1ввода ФИО")
    public void enterFIO1() {
        page.enterFIO1();
    }
    @When("Проверить Блок 1Ввода телефона" )
    public void enterTel1() {
        page.enterTel1();
    }
    @When("Проверить Кнопка 1Отправить заявку" )
    public void checkSubmitApplication() {
        page.checkSubmitApplication();
    }
    @When("Проверить Блок ИНВИТРО – надежный партнер")
    public void checkReliableBlock() {
        page.checkReliableBlock();
    }

    @When("Проверить Блок более 2000 лабораторных исследований" )
    public void checkLaboratoryBlock() {page.checkLaboratoryBlock();    }
    @When("Проверить Блок Хотите узнать, как все работает" )
    public void checkDiscoverBlock() {
        page.checkDiscoverBlock();
    }
    @When("Проверить Блок ввода ФИО Хотите узнать, как все работает" )
    public void enterFIO2() {
        page.enterFIO2();
    }
    @When("Проверить Блок ввода Телефона Хотите узнать, как все работает")
    public void enterTel2() {
        page.enterTel2();
    }
    @When("Проверить Блок Партнерская программа ИНВИТРО" )
    public void checkAffiliateBlock() {
        page.checkAffiliateBlock();
    }
    @When("Проверить Блок Преимущества сотрудничества" )
    public void checkBenefitsBlock() {
        page.checkBenefitsBlock();
    }
    @When("Проверить Блок Наше оборудование")
    public void checkEquipmentBlock() {
        page.checkEquipmentBlock();
    }
    @When("Проверить Блок Полный пакет услуг Все включено" )
    public void checkPackageBlock() {page.checkPackageBlock();    }
    @When("Проверить Блок Автоматизируем работу с клиентами" )
    public void checkAutomateBlock() {
        page.checkAutomateBlock();
    }
    @When("Проверить Блок Возможность направлять ваших пациентов в сеть медицинских офисов ИНВИТРО" )
    public void checkNetworkBlock() {
        page.checkNetworkBlock();
    }
    @When("Проверить Блок Более 4000 медучреждений в России и странах СНГ сотрудничают с ИНВИТРО")
    public void checkMoreBlock() {
        page.checkMoreBlock();
    }
    @When("Проверить Блок Отзывы" )
    public void checkReviewsBlock() {
        page.checkReviewsBlock();
    }
    @When("Проверить Блок Остались вопросы" )
    public void checkQuestionsBlock() {
        page.checkQuestionsBlock();
    }
    @When("Проверить Кнопка Перезвонить")
    public void checkSubmitCall() {
        page.checkSubmitCall();
    }





}
