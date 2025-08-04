package testpackage.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import testpackage.help.WebPage;

@DefaultUrl("https://only.digital/")

public class FooterPage extends WebPage {
//------------------------------------------ X'path Button click on Main page----------------------------------------------------//

    //region X'path - Кнопки главной страницы

    /** Кнопка Окей поп-апа Cookies */

    public By button_OK_Cookies = By.xpath("//button[@class = 'buttons Button_root__GbzzH Button_regular__RLX5e Button_secondary__pFIlL Cookie_rootButton__38Z2N']");

    /** Кнопка Проекты из Header меню */

    public By button_Projects_On_Header_menu = By.xpath("//div[@class = 'Header_links__CblPJ menu ']//*[@href = '/projects']");

    /** Кнопка Компания из Header меню */

    public By button_Company_On_Header_menu = By.xpath("//div[@class = 'Header_links__CblPJ menu ']//*[@href = '/company']");

    /** Кнопка Направления из Header меню */

    public By button_Fields_On_Header_menu = By.xpath("//div[@class = 'Header_links__CblPJ menu ']//*[@href = '/fields']");

    /** Кнопка Карьера из Header меню */

    public By button_Job_On_Header_menu = By.xpath("//div[@class = 'Header_links__CblPJ menu ']//*[@href = '/job']");

    /** Кнопка Блог из Header меню */

    public By button_Blog_On_Header_menu = By.xpath("//div[@class = 'Header_links__CblPJ menu ']//*[@href = '/blog']");

    /** Кнопка Контакты из Header меню */

    public By button_Сontacts_On_Header_menu = By.xpath("//div[@class = 'Header_links__CblPJ menu ']//*[@href = '/contacts']");

    //endregion

//----------------------------------------------- X'path Footer Main page-------------------------------------------------------//

    //region X'path - Элементы футтера главной страницы

    /** Блок футтера для Главной страницы сайта */
    public By footerBlock_MainPage = By.xpath("//footer[@class = 'Footer_root___6Q28']");

    /** Кнопка новый проект */
    public By buttonNewProject_MainPage = By.xpath("//button[@class = 'buttons Button_root__GbzzH Button_regular__RLX5e Button_primary__swzAa StartProjectButton_root__jB_Lv  Footer_button__RHd0Q']");

    /** Блок кнопок социальных сетей */
    public By socialsWrapButton_MainPage = By.xpath("//div[@class = 'Socials_socialsWrap__DPtp_ Footer_socials__C39yX']");

    /** Кнопка behance.net */
    public By buttonBehance_MainPage = By.xpath("//div[@class = 'Socials_socialsWrap__DPtp_ Footer_socials__C39yX']//*[@href = 'https://www.behance.net/onlydigitalagency']");

    /** Кнопка dprofile.ru */
    public By buttonDprofile_MainPage = By.xpath("//div[@class = 'Socials_socialsWrap__DPtp_ Footer_socials__C39yX']//*[@href = 'https://dprofile.ru/only']");

    /** Кнопка t.me */
    public By buttonTelegram_MainPage = By.xpath("//div[@class = 'Socials_socialsWrap__DPtp_ Footer_socials__C39yX']//*[@href = 'https://t.me/onlycreativedigitalagency']");

    /** Кнопка vk.com */
    public By buttonVK_MainPage = By.xpath("//div[@class = 'Socials_socialsWrap__DPtp_ Footer_socials__C39yX']//*[@href = 'https://vk.com/onlydigitalagency']");

    /** Telegram для связи */
    public By TelegramForCommunication_MainPage = By.xpath("//div[@class = 'Telegram_telegramWrap__USZkq Footer_telegram__Y0DSn']");

    /** Почта и номер телефона для связи */
    public By MailAndPhoneNumber_MainPage = By.xpath("//div[@class = 'ContactsLinks_contactLinks__vex86 Footer_contacts__s7c9v']");

    /** Текст девиза */
    public By TextOfTheMotto_MainPage = By.xpath("//*[@class = 'text2 Footer_text___ATim']");

    /** Блок презентаций компании */
    public By CompanyPresentationBlock_MainPage = By.xpath("//div[@class = 'Documents_documentsWrap__iNfwU Footer_documents___mRvU']");

    /** Кнопка презентации компании PDF */
    public By PDF_PresentationButton_MainPage = By.xpath("//div[@class = 'Documents_documentsWrap__iNfwU Footer_documents___mRvU']//*[@href = '../pdf/Корпоративная_презентация_Only.pdf']");

    /** Кнопка презентации компании PITCH */
    public By PITCH_PresentationButton_MainPage = By.xpath("//div[@class = 'Documents_documentsWrap__iNfwU Footer_documents___mRvU']//*[@href = 'https://pitch.com/v/only-x9f8ka']");

    /** Годы работы компании */
    public By bannerFooter_years_MainPage = By.xpath("//*[@class = 'h4 Footer_year__nyNCc']");

    /** Баннер creative digital production */
    public By bannerCreative_Digital_Production_MainPage = By.xpath("//div[@class = 'copyrightsBig FooterText_root___Rdpb ']");

    /** Кнопка Политика конфиденциальности */

    public By PrivacyPolicyButton_MainPage = By.xpath("//*[@class = 'text2 Footer_privacy__NdtU9']");

    /** LOGO  only.digital */
    public By LOGO_Only_Digital_MainPage = By.xpath("//*[name() = 'svg'][contains(@class, 'Footer_logo__2QEhf')]");

    //endregion

//------------------------------------------- X'path Footer Job and Contacts page-------------------------------------------------------//

    //region X'path Элементы футтера страницы Карьера и Контакты

    /** Блок футтера для страницы Карьера*/
    public By footerBlock_JobPage = By.xpath("//footer[@class = 'FooterDark_root__78jjk ']");

    /** Блок футтера для страницы Контакты */
    public By footerBlock_ContactsPage = By.xpath("//footer[@class = 'FooterDark_root__78jjk FooterDark_light__fFKa1']");

    /** Блок кнопок социальных сетей */
    public By socialsWrapButton_JobPage = By.xpath("//div[@class = 'Socials_socialsWrap__DPtp_']");

    /** Кнопка behance.net */
    public By buttonBehance_JobPage = By.xpath("//div[@class = 'Socials_socialsWrap__DPtp_']//*[@href = 'https://www.behance.net/onlydigitalagency']");

    /** Кнопка dprofile.ru */
    public By buttonDprofile_JobPage = By.xpath("//div[@class = 'Socials_socialsWrap__DPtp_']//*[@href = 'https://dprofile.ru/only']");

    /** Кнопка t.me */
    public By buttonTelegram_JobPage = By.xpath("//div[@class = 'Socials_socialsWrap__DPtp_']//*[@href = 'https://t.me/onlycreativedigitalagency']");

    /** Кнопка vk.com */
    public By buttonVK_JobPage = By.xpath("//div[@class = 'Socials_socialsWrap__DPtp_']//*[@href = 'https://vk.com/onlydigitalagency']");

    /** Годы работы компании */
    public By bannerFooter_years_JobPage = By.xpath("//div[@class = 'FooterDark_copyrightsWrapper__xRPf8']//*[@class = 'h4']");

    /** Баннер creative digital production страницы Карьера*/
    public By bannerCreative_Digital_Production_JobPage = By.xpath("//div[@class = 'copyrightsBig FooterText_root___Rdpb ']");

    /** Баннер creative digital production страницы Контакты*/
    public By bannerCreative_Digital_Production_ContactsPage= By.xpath("//div[@class = 'copyrightsBig FooterText_root___Rdpb ']");

    /** Кнопка Политика конфиденциальности */

    public By PrivacyPolicyButton_ProjectsPage = By.xpath("//div[@class]//*[@href = '/pdf/Политика_конфиденциальности_Онли_2025.pdf']");

    //endregion


//----------------------------------------- Клик по кнопкам главной страницы (код) --------------------------------------------------//

    //region Клик по кнопкам главной страницы (код)

    /** Клик по кнопке Окей поп-апа Cookies */
    public void click_button_OK_Cookies() {
        clickMethod_2(button_OK_Cookies);
    }

    /** Клик по кнопке Проекты в Header меню */
    public void click_button_Projects_On_Header_menu() {clickMethod_2(button_Projects_On_Header_menu);}

    /** Клик по кнопке Компания в Header меню */
    public void click_button_Company_On_Header_menu() {
        clickMethod_2(button_Company_On_Header_menu);
    }

    /** Клик по кнопке Направления в Header меню */
    public void click_button_Fields_On_Header_menu() {
        clickMethod_2(button_Fields_On_Header_menu);
    }

    /** Клик по кнопке Карьера в Header меню */
    public void click_button_Job_On_Header_menu() {
        clickMethod_2(button_Job_On_Header_menu);
    }

    /** Клик по кнопке Блог в Header меню */
    public void click_button_Blog_On_Header_menu() {
        clickMethod_2(button_Blog_On_Header_menu);
    }

    /** Клик по кнопке Контакты в Header меню */
    public void click_button_Сontacts_On_Header_menu() {clickMethod_2(button_Сontacts_On_Header_menu);}
    //endregion

//---------------------------------  Футтер страниц: Главная, Проекты, Компания, Направления, Блог (код)-------------------------------------------------------//

    //region Футтер страниц: Главная, Компания, Направления, Блог (код)

    /** Проверка отображения блока футтера для Главной страницы сайта */
    public void checkVisible_FooterBlock() {
        getSlow();
        scrollTo(footerBlock_MainPage);
        scrollTo(PrivacyPolicyButton_MainPage);
        getSlow();
        checkVisibleElement((By) footerBlock_MainPage);
    }

    /** Проверка отображения Кнопки "Новый проект" */
    public void checkVisibleFooter_buttonNewProject() {
        checkVisibleElement((By) buttonNewProject_MainPage);
    }

    /** Проверка отображения LOGO only.digital */
    public void checkVisibleFooter_LOGO_Only_Digital() {checkVisibleElement((By) LOGO_Only_Digital_MainPage);}

    /** Проверка отображения блока кнопок "Социальных сетей" */
    public void checkVisibleFooter_socialsWrapButton() {
        checkVisibleElement((By) socialsWrapButton_MainPage);
    }

    /** Проверка отображения кнопки behance.net */
    public void checkVisibleFooter_buttonBehance() {checkVisibleElement((By) buttonBehance_MainPage);}

    /** Проверка отображения кнопки dprofile.ru */
    public void checkVisibleFooter_buttonDprofile() {checkVisibleElement((By) buttonDprofile_MainPage);}

    /** Проверка отображения кнопки t.me */
    public void checkVisibleFooter_buttonTelegram() {checkVisibleElement((By) buttonTelegram_MainPage);}

    /** Проверка отображения кнопки vk.com */
    public void checkVisibleFooter_buttonVK() {checkVisibleElement((By) buttonVK_MainPage);}

    /** Проверка отображения блока Telegram для связи */
    public void checkVisibleFooter_TelegramForCommunication() {checkVisibleElement((By) TelegramForCommunication_MainPage);}

    /** Проверка отображения блока Почта и номер телефона для связи */
    public void checkVisibleFooter_MailAndPhoneNumber() {checkVisibleElement((By) MailAndPhoneNumber_MainPage);}

    /** Проверка отображения блока Текста девиза */
    public void checkVisibleFooter_TextOfTheMotto() {checkVisibleElement((By) TextOfTheMotto_MainPage);}

    /** Проверка отображения блока презентаций компании */
    public void checkVisibleFooter_CompanyPresentationBlock() {checkVisibleElement((By) CompanyPresentationBlock_MainPage);}

    /** Проверка отображения кнопки презентации компании PDF */
    public void checkVisibleFooter_PDF_PresentationButton() {checkVisibleElement((By) PDF_PresentationButton_MainPage);}

    /** Проверка отображения кнопки презентации компании PITCH */
    public void checkVisibleFooter_PITCH_PresentationButton() {checkVisibleElement((By) PITCH_PresentationButton_MainPage);}

    /** Проверка отображения Годы работы компании */
    public void checkVisibleFooter_bannerFooter_years() {checkVisibleElement((By) bannerFooter_years_MainPage);}

    /** Проверка отображения баннера Creative Digital Production */
    public void checkVisibleBannerCreative_Digital_Production() {checkVisibleElement((By) bannerCreative_Digital_Production_MainPage);}

    /** Проверка отображения кнопки Политика конфиденциальности */
    public void checkVisibleFooter_PrivacyPolicyButton() {checkVisibleElement((By) PrivacyPolicyButton_MainPage);}

    //endregion

//----------------------------------------------  Футтер страницы Карьера (код)-------------------------------------------------------//

    //region Футтер страницы Карьера (код)

    /** Проверка отображения блока футтера страницы Карьера */
    public void checkVisible_footerBlock_JobPage() {
        getSlow();
        scrollTo(bannerFooter_years_JobPage);
        getSlow();
        checkVisibleElement((By) footerBlock_JobPage);
    }

    /** Проверка отображения блока кнопок "Социальных сетей" */
    public void checkVisibleFooter_socialsWrapButton_JobPage() {
        checkVisibleElement((By) socialsWrapButton_JobPage);
    }

    /** Проверка отображения кнопки behance.net */
    public void checkVisibleFooter_buttonBehance_JobPage() {checkVisibleElement((By) buttonBehance_JobPage);}

    /** Проверка отображения кнопки dprofile.ru */
    public void checkVisibleFooter_buttonDprofile_JobPage() {checkVisibleElement((By) buttonDprofile_JobPage);}

    /** Проверка отображения кнопки t.me */
    public void checkVisibleFooter_buttonTelegram_JobPage() {checkVisibleElement((By) buttonTelegram_JobPage);}

    /** Проверка отображения кнопки vk.com */
    public void checkVisibleFooter_buttonVK_JobPage() {checkVisibleElement((By) buttonVK_JobPage);}

    /** Проверка отображения Годы работы компании */
    public void checkVisibleFooter_bannerFooter_years_JobPage() {checkVisibleElement((By) bannerFooter_years_JobPage);}

    /** Проверка отображения баннера Creative Digital Production для страницы Карьера */
    public void checkVisiblebannerCreative_Digital_Production_JobPage() {checkVisibleElement((By) bannerCreative_Digital_Production_JobPage);}

    /** Проверка отображения кнопки Политика конфиденциальности */
    public void checkVisibleFooter_PrivacyPolicyButton_ProjectsPage() {checkVisibleElement((By) PrivacyPolicyButton_ProjectsPage);}

    //endregion

//----------------------------------------------  Футтер страницы Контакты (код)-------------------------------------------------------//

    //region Футтер страницы Контакты (код)

    /** Проверка отображения блока футтера страницы Контакты */
    public void checkVisible_footerBlock_ContactsPage() {
        getSlow();
        scrollTo(PrivacyPolicyButton_ProjectsPage);
        getSlow();
        checkVisibleElement((By) footerBlock_ContactsPage);
    }

    /** Проверка отображения баннера Creative Digital Production для страницы Контакты  */
    public void checkVisiblebannerCreative_Digital_Production_ContactsPage() {checkVisibleElement((By) bannerCreative_Digital_Production_ContactsPage);}

    //endregion

}
