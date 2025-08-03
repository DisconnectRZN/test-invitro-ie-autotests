package testpackage.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import testpackage.pages.MainPage;

public class MainPageSteps {

    MainPage page;
    private Object element;

    @Given("Открыть главную страницу сайта$")
    public void openPage() { page.open(); }

    @When("^Клик по кнопке Окей поп-апа Cookies$")
    public void click_button_OK_Cookies() {page.click_button_OK_Cookies();}

    @When("^Пролистать страницу вниз$")
    public void scrollPage() {
        page.evaluateJavascript("scroll(0,60000)");
    }

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

    @When("^Проверка отображения кнопки Политика конфиденциальности$")
    public void checkVisibleFooter_PrivacyPolicyButton() {page.checkVisibleFooter_PrivacyPolicyButton();}

}
