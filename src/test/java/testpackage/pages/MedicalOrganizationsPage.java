package testpackage.pages;//*[contains(@class,'side-slider side-slider--blocks show-block side-slider--blocks-lg side-slider--list-p0 side-slider--bt')]


import org.openqa.selenium.By;
import testpackage.help.Help_Methods;
import net.thucydides.core.pages.PageObject;


public class MedicalOrganizationsPage extends PageObject{
    private static final Help_Methods help = Help_Methods.getInstance();
    private By CorporativeClients = By.xpath("//*[contains(@class,'header-top-nav__item')][4]");// Ссылка Корпоративным клиентам
    private By Header = By.xpath("//*[contains(@class,'title-block')]");// Заголовок Медицинским организациям
    private By BlockPartner = By.xpath("//*[contains(@class,'service-home-block')]");//Блок Станьте партнером крупнейшей
    private By FIO1 = By.xpath("//*[contains(@class,'input')][contains(@id, 'form_text_32NlmMoa0S')]");// Блок ввода ФИО
    private By Tel1 = By.xpath("//*[contains(@class,'input')][contains(@id, 'form_text_35NlmMoa0S')]");//Блок Ввода телефона
    private By SubmitApplication = By.xpath("//*[contains(@class,'btn-icon btn-icon--fill js-button-submit')][contains(@xpath,'1')]");//Кнопка Отправить заявку
    private By ReliableBlock = By.xpath("//*[contains(@class,'content content-block--offset-top')]");//Блок ИНВИТРО – надежный партнер
    private By LaboratoryBlock = By.xpath("//*[contains(@class,'service-home-row pb0')][1]");// Блок более 2000 лабораторных исследований
    private By DiscoverBlock = By.xpath("//*[contains(@class,'content subscribe-client')]");//Блок Хотите узнать, как все работает?
    private By FIO2 = By.xpath("//*[contains(@class,'input')][contains(@id, 'form_text_32ivD3AOU5')]");// Блок ввода ФИО Хотите узнать, как все работает?
    private By Tel2 = By.xpath("//*[contains(@class,'input')][contains(@id, 'form_text_35ivD3AOU5')]");//Блок ввода Телефона Хотите узнать, как все работает?
    private By AffiliateBlock = By.xpath("//*[contains(@class,'service-home-row pb0')][2]");//Блок Партнерская программа ИНВИТРО
    private By BenefitsBlock = By.xpath("//*[contains(@class,'service-home-row pb0')][3]");//Блок Преимущества сотрудничества
    private By EquipmentBlock = By.xpath("//*[contains(@class,'side-slider side-slider--blocks show-block side-slider--blocks-lg side-slider--list-p0 side-slider--bt')]");//Блок Наше оборудование
    private By PackageBlock = By.xpath("//*[contains(@class,'service-home-row pb0')][4]");// Блок Полный пакет услуг «Все включено»
    private By AutomateBlock  = By.xpath("//*[contains(@class,'service-home-row pb0')][5]");//Блок Автоматизируем работу с клиентами
    private By NetworkBlock = By.xpath("//*[contains(@class,'service-home-row')][6]");//Блок Возможность направлять ваших пациентов в сеть медицинских офисов ИНВИТРО
    private By MoreBlock = By.xpath("//*[contains(@class,'show-block-wrap')][2]");//Блок Более 4000 медучреждений в России и странах СНГ сотрудничают с ИНВИТРО
    private By ReviewsBlock = By.xpath("//*[contains(@class,'side-slider side-slider--blocks show-block side-slider--blocks-lg side-slider--list-p0 side-slider--bt side-slider--reviews')]");// Блок Отзывы
    private By QuestionsBlock = By.xpath("//*[contains(@class,'subscribe__inner')]");//Блок Остались вопросы?
    private By SubmitCall = By.xpath("//*[contains(@class,'subscribe')][2]");//Кнопка Перезвонить



    public void clickCorporativeClients() {// Клик Бланки в блоке Врачам
        help.Click_Method(CorporativeClients);
    }
    public void clickHeader() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(Header);
    }
    public void checkBlockPartner() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(BlockPartner);
    }
    public void enterFIO1() { // Ввод Логина
        find(FIO1).sendKeys("autotest"); }
    public void enterTel1() { // Поле ввода телефона
        find(Tel1).sendKeys("9999999999"); }
    public void checkSubmitApplication() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(SubmitApplication);
    }
    public void checkReliableBlock() {  help.Check_Enabled_Element(ReliableBlock); }
    public void checkLaboratoryBlock() { help.Check_Enabled_Element(LaboratoryBlock); }
    public void checkDiscoverBlock() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(DiscoverBlock);
    }
    public void enterFIO2() { // Ввод Логина
        find(FIO2).sendKeys("autotest"); }
    public void enterTel2() { // Поле ввода телефона
        find(Tel2).sendKeys("9999999999"); }
    public void checkAffiliateBlock() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(AffiliateBlock);
    }
    public void checkBenefitsBlock() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(BenefitsBlock);
    }
    public void checkEquipmentBlock() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(EquipmentBlock);
    }
    public void checkPackageBlock() {  help.Check_Enabled_Element(PackageBlock); }
    public void checkAutomateBlock() { help.Check_Enabled_Element(AutomateBlock); }
    public void checkNetworkBlock() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(NetworkBlock);
    }
    public void checkMoreBlock() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(MoreBlock);
    }
    public void checkReviewsBlock() {  help.Check_Enabled_Element(ReviewsBlock); }
    public void checkQuestionsBlock() { help.Check_Enabled_Element(QuestionsBlock); }
    public void checkSubmitCall() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(SubmitCall);
    }






}
