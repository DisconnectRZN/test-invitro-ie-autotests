package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import testpackage.help.Help_Methods;
import org.openqa.selenium.By;

public class ECGAtHomePage extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();
    private By VNDLink = By.xpath("//*[@class='header-nav__link'][contains(text(),'Выезд на дом')]"); // Ссылка в шапке сайта
    private By ECGAtHome = By.xpath("//*[@src='/upload/iblock/44a/44a792ae290a159c2245f23ee3bd23ab.svg']"); // Ссылка на ЭКГ на дому
    private By ZHeadlineECG = By.xpath("//div[contains(@class,'title-block')]"); // Заголовк страницы
    private By ECGBanner = By.xpath("//*[contains(text(),'Заказать услуги')]//parent::*/preceding-sibling::*//img"); // Баннер ЭКГ на дому
    private By BlockTextBanner = By.xpath("//*[@class='service-home-about']"); // Блок рядом с баннером
    private By InputName = By.xpath("//*[@id='form_text_10']"); // Поле ввода имени
    private By InputPhone = By.xpath("//input[@id='form_text_11']"); // Поле ввода телефона
    private By RequestCall = By.xpath("//input[@value='Заказать звонок']"); // Кнопка "Заказать звонок"
    private By BlockAnalyzesHome = By.xpath("//div[@class='directions show-block directions--three show-block--active']"); // Блок с иконками анализы на дому

    private By BlockBenefits = By.xpath("//div[@class='service-home-row pb0']"); // Блок Преимущества
    private By BlockMakeApplicationECG = By.xpath("//div[@class='directions show-block  directions--three']"); // Блок Оформите заявку ЭКГ
    private By BlockDepartureCostECG = By.xpath("//div[@class='service-home-row'][1]"); // Блок Стоимость выезда
    private By BlockScheduleECG = By.xpath("//div[@class='service-home-row'][2]"); // Блок График оказания услуг

    public void сlickVNDLink() {// Клик Ссылка в шапке сайта
        help.Click_Method(VNDLink); }
    public void сlickECGAtHome() {// Клик Ссылка на ЭКГ на дому
        help.Click_Method(ECGAtHome); }
    public void checkZHeadlineECG() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(ZHeadlineECG); }
    public void visibleecgbanner() { //Проверить ЭКГ на дому видимость баннера
        help.Check_Enabled_Element(ECGBanner); }
    public void checkBlockTextBanner() {//Проверить видимость Блок рядом с баннером
        help.Check_Enabled_Element(BlockTextBanner); }
    public void enterInputName() { // Ввод Логина
        find(InputName).sendKeys("autotest"); }
    public void enterInputPhone() { // Поле ввода телефона
        find(InputPhone).sendKeys("9999999999"); }
    public void visiblerequestcall() {//Проверить видимость Кнопка "Заказать звонок"
        help.Check_Enabled_Element(RequestCall); }
    public void visibleblockanalyzeshome() {//Проверить видимость Блок с иконками анализы на дому
        help.Check_Enabled_Element(BlockAnalyzesHome); }
    public void visibleBlockBenefits()  { //  Блок Преимущества
        help.Check_Enabled_Element(BlockBenefits); }
    public void visibleBlockMakeApplicationECG()  { // Блок Оформите заявку ЭКГ
        help.Check_Enabled_Element(BlockMakeApplicationECG); }
    public void visibleBlockDepartureCostECG()  { // Блок Стоимость выезда
        help.Check_Enabled_Element(BlockDepartureCostECG); }
    public void visibleBlockScheduleECG()  { // Блок График оказания услуг
        help.Check_Enabled_Element(BlockScheduleECG); }



}
