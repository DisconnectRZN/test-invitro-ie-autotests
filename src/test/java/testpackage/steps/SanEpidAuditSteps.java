package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.SanEpidAuditPage;



public class SanEpidAuditSteps {
    SanEpidAuditPage page;

    @When("Кликнуть Санэпидаудит в бургер меню")
    public void сlickSanEpidAuditInMenu () { page.сlickSanEpidAuditInMenu(); }

    @When("^Проверка отображения заголовка страницы 'Санэпидаудит'$")
    public void checkSanEpidAuditHeadline () { page.checkSanEpidAuditHeadline(); }

    @When("^Проверка отображения фото блока 'Заказать звонок'$")
    public void visibleSanEpidAuditPhoto1 () { page.visibleSanEpidAuditPhoto1(); }

    @When("^Проверка блока 'Заказать звонок'$")
    public void checkSanEpidAuditOrderCallBlock () { page.checkSanEpidAuditOrderCallBlock(); }

    @When("^Проверка ввода имени в поле блока 'Заказать звонок'$")
    public void enterSanEpidAuditOrderCallNameField () { page.enterSanEpidAuditOrderCallNameField(); }

    @When("^Проверка ввода телефона в поле блока 'Заказать звонок'$")
    public void enterSanEpidAuditOrderCallPhoneField () { page.enterSanEpidAuditOrderCallPhoneField(); }

    @When("^Проверка отображения кнопки блока 'Заказать звонок'$")
    public void checkSanEpidAuditOrderCallSubmitButton () { page.checkSanEpidAuditOrderCallSubmitButton(); }

    @When("Проверка отображения заголовков всех блоков")
    public void checkSanEpidAuditOrderHeadlineAllBlock () { page.checkSanEpidAuditOrderHeadlineAllBlock(); }

    @When("Проверка отображения всех блоков")
    public void checkSanEpidAuditOrderAllBlock () { page.checkSanEpidAuditOrderAllBlock(); }

    @When("^Проверка отображения иконки блока 'Производственный контроль'$")
    public void visibleSanEpidAuditDoctorIcon () { page.visibleSanEpidAuditDoctorIcon(); }

    @When("^Проверка отображения иконки блока 'Лабораторные исследования'$")
    public void visibleSanEpidAuditMicroscopIcon () { page.visibleSanEpidAuditMicroscopIcon(); }

    @When("^Проверка отображения иконки блока 'Обучение сотрудников'$")
    public void visibleSanEpidAuditTrainingIcon () { page.visibleSanEpidAuditTrainingIcon(); }

    @When("^Проверка отображения иконки блока 'Защита от издержек'$")
    public void visibleSanEpidAuditCostProtectionIcon () { page.visibleSanEpidAuditCostProtectionIcon(); }

    @When("^Проверка отображения иконки блока 'Помогаем экономить'$")
    public void visibleSanEpidAuditPercentIcon () { page.visibleSanEpidAuditPercentIcon(); }

    @When("^Проверка отображения иконки блока 'Оптимизируем работу персонала'$")
    public void visibleSanEpidAuditPesonalIcon () { page.visibleSanEpidAuditPesonalIcon(); }

    @When("^Проверка отображения иконки блока 'Только самые полезные решения'$")
    public void visibleSanEpidAuditCloudIcon () { page.visibleSanEpidAuditCloudIcon(); }

    @When("^Проверка отображения иконки блока 'Удобный аутсорсинг'$")
    public void visibleSanEpidAuditOutsourcingIcon () { page.visibleSanEpidAuditOutsourcingIcon(); }

    @When("^Проверка отображения иконки блока 'Никаких бумажек'$")
    public void visibleSanEpidAuditLegalNoPapersIcon () { page.visibleSanEpidAuditLegalNoPapersIcon(); }

    @When("^Проверка отображения иконки блока 'Правовая поддержка'$")
    public void visibleSanEpidAuditLegalSupportIcon () { page.visibleSanEpidAuditLegalSupportIcon(); }

    // Тарифы

    @When("^Кликнуть по кнопке 'Подробнее о тарифах'$")
    public void сlickSanEpidAuditMoreAboutButton () { page.сlickSanEpidAuditMoreAboutButton(); }

    @When("^Проверка отображения блока 'Тарифы'$")
    public void visibleTariffBlock () { page.visibleTariffBlock(); }

    @When("^Проверка отображения бокового меню страницы 'Тарифы'$")
    public void visibleTariffMenuBlock () { page.visibleTariffMenuBlock(); }

    @When("^Кликнуть по кнопке 'Производственный контроль'$")
    public void clickProductionControlMenuPage () { page.clickProductionControlMenuPage(); }

    @When("^Кликнуть по кнопке 'Лабораторные исследования'$")
    public void clickLaboratoryResearchMenuPage () { page.clickLaboratoryResearchMenuPage(); }

    @When("^Кликнуть по кнопке 'Обучение сотрудников'$")
    public void clickEmployeeTrainingMenuPage () { page.clickEmployeeTrainingMenuPage(); }

    @When("^Кликнуть по кнопке 'Защита от издержек'$")
    public void clickCostProtectionMenuPage () { page.clickCostProtectionMenuPage(); }

    @When("^Проверка отображения заголовка 'Производственный контроль'$")
    public void visibleProductionControlHeadline () { page.visibleProductionControlHeadline(); }

    @When("^Проверка отображения фото блока 'Производственный контроль'$")
    public void visibleProductionControlPhoto1 () { page.visibleProductionControlPhoto1(); }

    @When("^Проверка ввода имени в поле блока 'Производственный контроль'$")
    public void enterProductionControlOrderCallNameField () { page.enterProductionControlOrderCallNameField(); }

    @When("^Проверка ввода телефона в поле блока 'Производственный контроль'$")
    public void enterProductionControlOrderCallPhoneField () { page.enterProductionControlOrderCallPhoneField(); }

    @When("^Проверка отображения кнопки блока 'Производственный контроль'$")
    public void visibleProductionControlOrderCallSubmitButton () { page.visibleProductionControlOrderCallSubmitButton(); }

    @When("^Проверка отображения блока 'Производственный контроль'$")
    public void visibleProductionControlOrderCallBlock () { page.visibleProductionControlOrderCallBlock(); }

    @When("^Проверка отображения блоков страницы$")
    public void visibleProductionControlAllBlock () { page.visibleProductionControlAllBlock(); }

    @When("^Проверка отображения заголовка 'Лабораторные исследования'$")
    public void checkLaboratoryResearchHeadline () { page.checkLaboratoryResearchHeadline(); }

    @When("^Проверка отображения заголовка 'Обучение сотрудников'$")
    public void checkEmployeeTrainingHeadline () { page.checkEmployeeTrainingHeadline(); }

    @When("^Проверка отображения заголовка 'Защита от издержек'$")
    public void checkCostProtectionHeadline () { page.checkCostProtectionHeadline(); }
}
