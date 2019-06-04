package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

public class SanEpidAuditPage extends PageObject {

    private static final Help_Methods help = Help_Methods.getInstance();
    //Локаторы
    private By SanEpidAuditInMenu = By.xpath("//a[@class='header-menu__link'][contains(text(),'Санэпидаудит')]");// Санэпидаудит в бургер меню
    private By SanEpidAuditHeadline = By.xpath("//h1[contains(text(),'Комплексная система санитарно-эпидемиологического менеджмента')]");// Заголовок Комплексная система санитарно-эпидемиологического менеджмента
    private By SanEpidAuditPhoto1 = By.xpath("//img[@src='/upload/medialibrary/f09/f09bd0b2aa5cdc920b63b006878ed169.jpg']");// Санэпидаудит Фото
    private By SanEpidAuditOrderCallBlock = By.xpath("//div[@class='service-home-about service-home-about--pr']");// Блок заказа обратного звонка
    private By SanEpidAuditOrderCallNameField = By.xpath("//input[@id='form_text_37']");// Поле ввода имени
    private By SanEpidAuditOrderCallPhoneField = By.xpath("//input[@id='form_text_38']");// Поле ввода номера телефона
    private By SanEpidAuditOrderCallSubmitButton = By.xpath("//input[@class='btn-icon btn-icon--fill ripple js-button-submit']");// Кнопка заказать звонок
    private By SanEpidAuditOrderHeadlineAllBlock = By.xpath("//div[@class='service-home-column-main']/preceding::*[1]");// Все заголовки блоков на странице Санэпидаудит
    private By SanEpidAuditAllBlock = By.xpath("//div[@class='service-home-column-main']/ancestor-or-self::*[1]");// Все блоки на странице Санэпидаудит
    private By SanEpidAuditDoctorIcon = By.xpath("//img[@src='/upload/iblock/8d2/8d22dffa28347a8e1de3ca76dca0c449.svg']");// Иконка Производственный контроль
    private By SanEpidAuditMicroscopIcon = By.xpath("//img[@src='/upload/iblock/5c5/5c5cbfebe51bd0786c2d5ba5a4216e7f.svg']");// Иконка Лабораторные исследования
    private By SanEpidAuditTrainingIcon = By.xpath("//img[@src='/upload/iblock/9a8/9a80000bd116b4d1145685315ad46c1b.svg']");// Иконка Обучение сотрудников
    private By SanEpidAuditCostProtectionIcon = By.xpath("//img[@src='/upload/iblock/ac1/ac1e82ac5492b21fa7549a2d5c676ed1.svg']");// Иконка Защита от издержек
    private By SanEpidAuditPercentIcon = By.xpath("//img[@src='/local/templates/invitro_main/src/image/icons/medoffice-center-icon-2.svg']");// Иконка Помогаем экономить
    private By SanEpidAuditPesonalIcon = By.xpath("//img[@src='/local/templates/invitro_main/src/image/icons/manager.svg']");// Иконка Оптимизируем работу персонала
    private By SanEpidAuditCloudIcon = By.xpath("//img[@src='/local/templates/invitro_main/src/image/icons/app-feature-5.svg']");// Иконка Только самые полезные решения
    private By SanEpidAuditOutsourcingIcon = By.xpath("//img[@src='/local/templates/invitro_main/src/image/icons/operator.svg']");// Иконка Удобный аутсорсинг
    private By SanEpidAuditLegalNoPapersIcon = By.xpath("//img[@src='/local/templates/invitro_main/src/image/icons/docs.svg']");// Иконка Никаких бумажек
    private By SanEpidAuditLegalSupportIcon = By.xpath("//img[@src='/local/templates/invitro_main/src/image/icons/pravo.svg']");// Иконка Никаких бумажек
    // Страница Тарифы
    private By SanEpidAuditMoreAboutButton = By.xpath("//a[@class='btn-icon btn-icon--fill service-home-banner__send-button']");// Подробнее о тарифах
    private By TariffBlock = By.xpath("//div[@class='table table--theme-comparison']");// Подробнее о тарифах
    private By TariffMenuBlock = By.xpath("//ul[@class='side-bar__list']");// Боковое меню страницы тарифы
    private By ProductionControlMenuPage = By.xpath("//a[@class='side-bar-second__link'][contains(text(),'Производственный контроль')]");// Боковое меню страницы тарифы 'Производственный контроль'
    private By LaboratoryResearchMenuPage = By.xpath("//a[@class='side-bar-second__link'][contains(text(),'Лабораторные исследования')]");// Боковое меню страницы тарифы 'Лабораторные исследования'
    private By EmployeeTrainingMenuPage = By.xpath("//a[@class='side-bar-second__link'][contains(text(),'Обучение сотрудников')]");// Боковое меню страницы тарифы 'Обучение сотрудников'
    private By CostProtectionMenuPage= By.xpath("//a[@class='side-bar-second__link'][contains(text(),'Защита от издержек')]");// Боковое меню страницы тарифы 'Защита от издержек'
    private By ProductionControlHeadline = By.xpath("//h1[contains(text(),'Производственный контроль')]");
    private By ProductionControlPhoto1 = By.xpath("//img[@src='/local/templates/invitro_main/src/image/content/clients/clients-sanepidaudit-bg.jpg']");// 'Производственный контроль' Фото
    private By ProductionControlOrderCallNameField = By.xpath("//div[@class='form__field form__field--w50']/input[@name='form_text_37']");// Поле ввода имени
    private By ProductionControlOrderCallPhoneField = By.xpath("//div[@class='form__field form__field--w50']/input[@name='form_text_38']");// Поле ввода номера телефона
    private By ProductionControlOrderCallSubmitButton = By.xpath("//input[@class='btn-icon btn-icon--fill ripple js-button-submit']");// Кнопка заказать звонок
    private By ProductionControlOrderCallBlock = By.xpath("//div[@class='service-home-about']");// Блок заказа обратного звонка
    private By ProductionControlAllBlock = By.xpath("//div[@class='service-home-column-main-wrap']/ancestor-or-self::*[3]");// Все блоки на странице 'Производственный контроль'
    private By LaboratoryResearchHeadline = By.xpath("//h1[contains(text(),'Лабораторные исследования')]");
    private By EmployeeTrainingHeadline = By.xpath("//h1[contains(text(),'Обучение сотрудников')]");
    private By CostProtectionHeadline = By.xpath("//h1[contains(text(),'Защита от издержек')]");

    public void сlickSanEpidAuditInMenu() {

        help.Click_Method(SanEpidAuditInMenu);
    }

    public void checkSanEpidAuditHeadline() {

        help.Check_Visible_Element(SanEpidAuditHeadline);
    }

    public void visibleSanEpidAuditPhoto1() {

        help.Check_Visible_Element(SanEpidAuditPhoto1);
    }

    public void checkSanEpidAuditOrderCallBlock() {

        help.Check_Visible_Element(SanEpidAuditOrderCallBlock);
    }

    public void enterSanEpidAuditOrderCallNameField() {

        help.Enter_Text(SanEpidAuditOrderCallNameField,"Test1");
    }

    public void enterSanEpidAuditOrderCallPhoneField() {

        help.Enter_Text(SanEpidAuditOrderCallPhoneField,"+7 (999) 888-77-66");
    }

    public void checkSanEpidAuditOrderCallSubmitButton() {

        help.Check_Visible_Element(SanEpidAuditOrderCallSubmitButton);
    }

    public void checkSanEpidAuditOrderHeadlineAllBlock() {

        help.Check_Visible_Element(SanEpidAuditOrderHeadlineAllBlock);
    }

    public void checkSanEpidAuditOrderAllBlock() {

        help.Check_Visible_Element(SanEpidAuditAllBlock);
    }

    public void сlickSanEpidAuditMoreAboutButton() {

        help.Click_Method(SanEpidAuditMoreAboutButton);
    }

    public void visibleSanEpidAuditDoctorIcon() {

        help.Check_Visible_Element(SanEpidAuditDoctorIcon);
    }

    public void visibleSanEpidAuditMicroscopIcon() {

        help.Check_Visible_Element(SanEpidAuditMicroscopIcon);
    }

    public void visibleSanEpidAuditTrainingIcon() {

        help.Check_Visible_Element(SanEpidAuditTrainingIcon);
    }

    public void visibleSanEpidAuditCostProtectionIcon() {

        help.Check_Visible_Element(SanEpidAuditCostProtectionIcon);
    }

    public void visibleSanEpidAuditPercentIcon() {

        help.Check_Visible_Element(SanEpidAuditPercentIcon);
    }

    public void visibleSanEpidAuditPesonalIcon() {

        help.Check_Visible_Element(SanEpidAuditPesonalIcon);
    }

    public void visibleSanEpidAuditCloudIcon() {

        help.Check_Visible_Element(SanEpidAuditCloudIcon);
    }

    public void visibleSanEpidAuditOutsourcingIcon() {

        help.Check_Visible_Element(SanEpidAuditOutsourcingIcon);
    }

    public void visibleSanEpidAuditLegalNoPapersIcon() {

        help.Check_Visible_Element(SanEpidAuditLegalNoPapersIcon);
    }

    public void visibleSanEpidAuditLegalSupportIcon() {

        help.Check_Visible_Element(SanEpidAuditLegalSupportIcon);
    }

    public void visibleTariffBlock() {

        help.Check_Visible_Element(TariffBlock);
    }

    public void visibleTariffMenuBlock() {

        help.Check_Visible_Element(TariffMenuBlock);
    }

    public void clickProductionControlMenuPage() {

        help.Click_Method(ProductionControlMenuPage);
    }

    public void clickLaboratoryResearchMenuPage() {

        help.Click_Method(LaboratoryResearchMenuPage);
    }

    public void clickEmployeeTrainingMenuPage() {

        help.Click_Method(EmployeeTrainingMenuPage);
    }

    public void clickCostProtectionMenuPage() {

        help.Click_Method(CostProtectionMenuPage);
    }

    public void visibleProductionControlHeadline() {

        help.Check_Visible_Element(ProductionControlHeadline);
    }

    public void checkLaboratoryResearchHeadline() {

        help.Check_Visible_Element(LaboratoryResearchHeadline);
    }

    public void checkEmployeeTrainingHeadline() {

        help.Check_Visible_Element(EmployeeTrainingHeadline);
    }

    public void checkCostProtectionHeadline() {

        help.Check_Visible_Element(CostProtectionHeadline);
    }

    public void visibleProductionControlPhoto1() {

        help.Check_Visible_Element(ProductionControlPhoto1);
    }

    public void enterProductionControlOrderCallNameField() {

        help.Enter_Text(ProductionControlOrderCallNameField,"test1");
    }

    public void enterProductionControlOrderCallPhoneField() {

        help.Enter_Text(ProductionControlOrderCallPhoneField,"+7 (999) 888-77-66");
    }

    public void visibleProductionControlOrderCallSubmitButton() {

        help.Check_Visible_Element(ProductionControlOrderCallSubmitButton);
    }

    public void visibleProductionControlOrderCallBlock() {

        help.Check_Visible_Element(ProductionControlOrderCallBlock);
    }

    public void visibleProductionControlAllBlock() {

        help.Check_Visible_Element(ProductionControlAllBlock);
    }

}
