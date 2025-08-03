package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.FindBy;
import testpackage.help.WebPage;

@DefaultUrl("https://only.digital/")

public class MainPage extends WebPage {

//----------------------------------------------------- X'path -------------------------------------------------------//

    /** Блок футтера внизу сайта */
    public By footerBlock = By.xpath("//footer[@class = 'Footer_root___6Q28']");

    /** Кнопка новый проект */
    public By buttonNewProject = By.xpath("//button[@class = 'buttons Button_root__GbzzH Button_regular__RLX5e Button_primary__swzAa StartProjectButton_root__jB_Lv  Footer_button__RHd0Q']");

    /** Блок кнопок социальных сетей */
    public By socialsWrapButton = By.xpath("//div[@class = 'Socials_socialsWrap__DPtp_ Footer_socials__C39yX']");

    /** Кнопка behance.net */
    public By buttonBehance = By.xpath("//div[@class = 'Socials_socialsWrap__DPtp_ Footer_socials__C39yX']//*[@href = 'https://www.behance.net/onlydigitalagency']");

    /** Кнопка dprofile.ru */
    public By buttonDprofile = By.xpath("//div[@class = 'Socials_socialsWrap__DPtp_ Footer_socials__C39yX']//*[@href = 'https://dprofile.ru/only']");

    /** Кнопка t.me */
    public By buttonTelegram = By.xpath("//div[@class = 'Socials_socialsWrap__DPtp_ Footer_socials__C39yX']//*[@href = 'https://t.me/onlycreativedigitalagency']");

    /** Кнопка vk.com */
    public By buttonVK = By.xpath("//div[@class = 'Socials_socialsWrap__DPtp_ Footer_socials__C39yX']//*[@href = 'https://vk.com/onlydigitalagency']");

    /** Telegram для связи */
    public By TelegramForCommunication = By.xpath("//div[@class = 'Telegram_telegramWrap__USZkq Footer_telegram__Y0DSn']");

    /** Почта и номер телефона для связи */
    public By MailAndPhoneNumber = By.xpath("//div[@class = 'ContactsLinks_contactLinks__vex86 Footer_contacts__s7c9v']");

    /** Текст девиза */
    public By TextOfTheMotto = By.xpath("//*[@class = 'text2 Footer_text___ATim']");

    /** Блок презентаций компании */
    public By CompanyPresentationBlock = By.xpath("//div[@class = 'Documents_documentsWrap__iNfwU Footer_documents___mRvU']");

    /** Кнопка презентации компании PDF */
    public By PDF_PresentationButton = By.xpath("//div[@class = 'Documents_documentsWrap__iNfwU Footer_documents___mRvU']//*[@href = '../pdf/Корпоративная_презентация_Only.pdf']");

    /** Кнопка презентации компании PITCH */
    public By PITCH_PresentationButton = By.xpath("//div[@class = 'Documents_documentsWrap__iNfwU Footer_documents___mRvU']//*[@href = 'https://pitch.com/v/only-x9f8ka']");

    /** Годы работы компании */
    public By bannerFooter_years = By.xpath("//*[@class = 'h4 Footer_year__nyNCc']");

    /** Баннер creative digital production */
    public By bannerCreative_Digital_Production = By.xpath("//footer[@class = 'Footer_root___6Q28']//div[@class = 'copyrightsBig FooterText_root___Rdpb']");

    /** Кнопка Политика конфиденциальности */
    @FindBy(xpath = "//footer[@class = 'Footer_root___6Q28']//*[@href = '/pdf/Политика_конфиденциальности_Онли_2025.pdf']")
    public WebElementFacade PrivacyPolicyButton;

    /** LOGO  only.digital */
    public By LOGO_Only_Digital = By.xpath("//*[name() = 'svg'][contains(@class, 'Footer_logo__2QEhf')]");

    /** Кнопка Окей поп-апа Cookies */
    @FindBy(xpath = "//button[@class = 'buttons Button_root__GbzzH Button_regular__RLX5e Button_secondary__pFIlL Cookie_rootButton__38Z2N']")
    public WebElementFacade button_OK_Cookies;

//------------------------------------------------ Шапка сайта -------------------------------------------------------//

    /** Клик по кнопке Окей поп-апа Cookies */
    public void click_button_OK_Cookies() {
        clickMethod(button_OK_Cookies);
    }

    /** Проверка видимости блока футтера */
    public void checkVisible_FooterBlock() {
        scrollTo(PrivacyPolicyButton);
        getSlow();
        checkVisibleElement((By) footerBlock);
    }

    /** Проверка видимости Кнопки "Новый проект" */
    public void checkVisibleFooter_buttonNewProject() {
        checkVisibleElement((By) buttonNewProject);
    }

    /** Проверка видимости блока кнопок "Социальных сетей" */
    public void checkVisibleFooter_socialsWrapButton() {
        checkVisibleElement((By) socialsWrapButton);
    }

    /** Проверка видимости кнопки behance.net */
    public void checkVisibleFooter_buttonBehance() {
        checkVisibleElement((By) buttonBehance);
    }

    /** Проверка видимости кнопки dprofile.ru */
    public void checkVisibleFooter_buttonDprofile() {
        checkVisibleElement((By) buttonDprofile);
    }

    /** Проверка видимости кнопки t.me */
    public void checkVisibleFooter_buttonTelegram() {
        checkVisibleElement((By) buttonTelegram);
    }

    /** Проверка видимости кнопки vk.com */
    public void checkVisibleFooter_buttonVK() {
        checkVisibleElement((By) buttonVK);
    }

    /** Проверка видимости блока Telegram для связи */
    public void checkVisibleFooter_TelegramForCommunication() {
        checkVisibleElement((By) TelegramForCommunication);
    }

    /** Проверка видимости блока Почта и номер телефона для связи */
    public void checkVisibleFooter_MailAndPhoneNumber() {
        checkVisibleElement((By) MailAndPhoneNumber);
    }

    /** Проверка видимости блока Текста девиза */
    public void checkVisibleFooter_TextOfTheMotto() {
        checkVisibleElement((By) TextOfTheMotto);
    }

    /** Проверка видимости блока презентаций компании */
    public void checkVisibleFooter_CompanyPresentationBlock() {
        checkVisibleElement((By) CompanyPresentationBlock);
    }

    /** Проверка видимости кнопки презентации компании PDF */
    public void checkVisibleFooter_PDF_PresentationButton() {
        checkVisibleElement((By) PDF_PresentationButton);
    }

    /** Проверка видимости кнопки презентации компании PITCH */
    public void checkVisibleFooter_PITCH_PresentationButton() {
        checkVisibleElement((By) PITCH_PresentationButton);
    }

    /** Проверка видимости Годы работы компании */
    public void checkVisibleFooter_bannerFooter_years() {
        checkVisibleElement((By) bannerFooter_years);
    }

    /** Проверка видимости кнопки Политика конфиденциальности */
    public void checkVisibleFooter_PrivacyPolicyButton() {
        checkVisibleElement((By) PrivacyPolicyButton);
    }

    /** Проверка видимости LOGO only.digital */
    public void checkVisibleFooter_LOGO_Only_Digital() {
        checkVisibleElement((By) LOGO_Only_Digital);
    }

}
