package testpackage.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import testpackage.pages.FooterPage;

public class FooterPageSteps {

    FooterPage page;
    private Object element;

    @Given("Открыть главную страницу сайта$")
    public void openPage() { page.open(); }

    //region Шаги закрытия поп-апа Cookies и Пролистать страницу вниз
    @When("^Клик по кнопке Окей поп-апа Cookies$")
    public void click_button_OK_Cookies() {page.click_button_OK_Cookies();}

    @When("^Пролистать страницу вниз$")
    public void scrollPage() {
        page.evaluateJavascript("scroll(0,100000)");
    }

    //endregion

    //region Шаги проверки отображения элементов футтера для страниц: Главная, Компания, Направления, Блог
    @When("^Проверка отображения блока футтера$")
    public void checkVisible_FooterBlock() {page.checkVisible_FooterBlock();}

    @When("^Проверка отображения Кнопки 'Новый проект'$")
    public void checkVisibleFooter_buttonNewProject() {page.checkVisibleFooter_buttonNewProject();}

    @When("^Проверка отображения LOGO only.digital$")
    public void checkVisibleFooter_LOGO_Only_Digital() {page.checkVisibleFooter_LOGO_Only_Digital();}

    @When("^Проверка отображения блока кнопок 'Социальных сетей'$")
    public void checkVisibleFooter_socialsWrapButton() {page.checkVisibleFooter_socialsWrapButton();}

    @When("^Проверка отображения кнопки behance.net$")
    public void checkVisibleFooter_buttonBehance() {page.checkVisibleFooter_buttonBehance();}

    @When("^Проверка отображения кнопки dprofile.ru$")
    public void checkVisibleFooter_buttonDprofile() {page.checkVisibleFooter_buttonDprofile();}

    @When("^Проверка отображения кнопки t.me$")
    public void checkVisibleFooter_buttonTelegram() {page.checkVisibleFooter_buttonTelegram();}

    @When("^Проверка отображения кнопки vk.com$")
    public void checkVisibleFooter_buttonVK() {page.checkVisibleFooter_buttonVK();}

    @When("^Проверка отображения блока Telegram для связи$")
    public void checkVisibleFooter_TelegramForCommunication() {page.checkVisibleFooter_TelegramForCommunication();}

    @When("^Проверка отображения блока Почта и номер телефона для связи$")
    public void checkVisibleFooter_MailAndPhoneNumber() {page.checkVisibleFooter_MailAndPhoneNumber();}

    @When("^Проверка отображения блока Текста девиза$")
    public void checkVisibleFooter_TextOfTheMotto() {page.checkVisibleFooter_TextOfTheMotto();}

    @When("^Проверка отображения блока презентаций компании$")
    public void checkVisibleFooter_CompanyPresentationBlock() {page.checkVisibleFooter_CompanyPresentationBlock();}

    @When("^Проверка отображения кнопки презентации компании PDF$")
    public void checkVisibleFooter_PDF_PresentationButton() {page.checkVisibleFooter_PDF_PresentationButton();}

    @When("^Проверка отображения кнопки презентации компании PITCH$")
    public void checkVisibleFooter_PITCH_PresentationButton() {page.checkVisibleFooter_PITCH_PresentationButton();}

    @When("^Проверка отображения Годы работы компании$")
    public void checkVisibleFooter_bannerFooter_years() {page.checkVisibleFooter_bannerFooter_years();}

    @When("^Проверка отображения баннера Creative Digital Production$")
    public void checkVisibleBannerCreative_Digital_Production() {page.checkVisibleBannerCreative_Digital_Production();}

    @When("^Проверка отображения кнопки Политика конфиденциальности$")
    public void checkVisibleFooter_PrivacyPolicyButton() {page.checkVisibleFooter_PrivacyPolicyButton();}

    //endregion

    //region Шаги клика по кнопкам Header меню
    @When("^Клик по кнопке Проекты в Header меню$")
    public void click_button_Projects_On_Header_menu() {page.click_button_Projects_On_Header_menu();}

    @When("^Клик по кнопке Компания в Header меню$")
    public void click_button_Company_On_Header_menu() {page.click_button_Company_On_Header_menu();}

    @When("^Клик по кнопке Направления в Header меню$")
    public void click_button_Fields_On_Header_menu() {page.click_button_Fields_On_Header_menu();}

    @When("^Клик по кнопке Карьера в Header меню$")
    public void click_button_Job_On_Header_menu() {page.click_button_Job_On_Header_menu();}

    @When("^Клик по кнопке Блог в Header меню$")
    public void click_button_Blog_On_Header_menu() {page.click_button_Blog_On_Header_menu();}

    @When("^Клик по кнопке Контакты в Header меню$")
    public void click_button_Сontacts_On_Header_menu() {page.click_button_Сontacts_On_Header_menu();}

    //endregion

    //region Шаги проверки отображения элементов для страниц Карьера и Контакты
    @When("^Проверка отображения блока футтера страницы Карьера$")
    public void checkVisible_footerBlock_JobPage() {page.checkVisible_footerBlock_JobPage();}

    @When("^Проверка отображения блока футтера страницы Контакты$")
    public void checkVisible_footerBlock_ContactsPage() {page.checkVisible_footerBlock_ContactsPage();}

    @When("^Проверка отображения блока кнопок 'Социальных сетей' для страниц Карьера и Контакты$")
    public void checkVisibleFooter_socialsWrapButton_JobPage() {page.checkVisibleFooter_socialsWrapButton_JobPage();}

    @When("^Проверка отображения кнопки behance.net для страниц Карьера и Контакты$")
    public void checkVisibleFooter_buttonBehance_JobPage() {page.checkVisibleFooter_buttonBehance_JobPage();}

    @When("^Проверка отображения кнопки dprofile.ru для страниц Карьера и Контакты$")
    public void checkVisibleFooter_buttonDprofile_JobPage() {page.checkVisibleFooter_buttonDprofile_JobPage();}

    @When("^Проверка отображения кнопки t.me для страниц Карьера и Контакты$")
    public void checkVisibleFooter_buttonTelegram_JobPage() {page.checkVisibleFooter_buttonTelegram_JobPage();}

    @When("^Проверка отображения кнопки vk.com для страниц Карьера и Контакты$")
    public void checkVisibleFooter_buttonVK_JobPage() {page.checkVisibleFooter_buttonVK_JobPage();}
    @When("^Проверка отображения Годы работы компании для страниц Карьера и Контакты$")
    public void checkVisibleFooter_bannerFooter_years_JobPage() {page.checkVisibleFooter_bannerFooter_years_JobPage();}

    @When("^Проверка отображения баннера Creative Digital Production страницы Карьера$")
    public void checkVisiblebannerCreative_Digital_Production_JobPage() {page.checkVisiblebannerCreative_Digital_Production_JobPage();}

    @When("^Проверка отображения баннера Creative Digital Production страницы Контакты$")
    public void checkVisiblebannerCreative_Digital_Production_ContactsPage() {page.checkVisiblebannerCreative_Digital_Production_ContactsPage();}

    @When("^Проверка отображения кнопки Политика конфиденциальности для страниц Карьера и Контакты$")
    public void checkVisibleFooter_PrivacyPolicyButton_ProjectsPage() {page.checkVisibleFooter_PrivacyPolicyButton_ProjectsPage();}

    //endregion

}
