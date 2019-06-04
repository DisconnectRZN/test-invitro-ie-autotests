package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

public class DriversInspectionPage extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();

    private By VNDLink = By.xpath("//*[@class='header-nav__link'][contains(text(),'Выезд на дом')]"); // Ссылка в шапке сайта
    private By DriversInspection = By.xpath("//*[@src='/upload/iblock/544/544bf01290fac4ee3ef11d715c0f3edd.svg']"); // Ссылка на Осмотр водителей
    private By ZHeadlineDI = By.xpath("//div[contains(@class,'title-block')]"); // Заголовк страницы
    private By DIBanner = By.xpath("//*[contains(text(),'Заказать услуги')]//parent::*/preceding-sibling::*//img"); // Баннер Осмотр водителей
    private By BlockTextBanner = By.xpath("//*[@class='service-home-about']"); // Блок рядом с баннером
    private By InputName = By.xpath("//*[@id='form_text_10']"); // Поле ввода имени
    private By InputPhone = By.xpath("//input[@id='form_text_11']"); // Поле ввода телефона
    private By RequestCall = By.xpath("//input[@value='Заказать звонок']"); // Кнопка "Заказать звонок"
    private By BlockAnalyzesHome = By.xpath("//div[@class='directions show-block directions--three show-block--active']"); // Блок с иконками анализы на дому
    private By BlockWhere = By.xpath("//div[@class='service-home-row pb0']"); // Блок Где провести осмотр ваших сотрудников
    private By BlockMakeApplication = By.xpath("//div[@class='directions show-block  directions--three']"); // Блок Оформите заявку
    private By BlockNeedConsultation = By.xpath("//div[@class='service-home-row']"); // Блок Нужна консультация

    public void сlickVNDLink() {// Клик Ссылка в шапке сайта
        help.Click_Method(VNDLink); }
    public void сlickDriversInspection() {// Клик Ссылка на Осмотр водителей
        help.Click_Method(DriversInspection); }
    public void checkZHeadlineDI() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(ZHeadlineDI); }
    public void visibledibanner() { //Проверить видимость Баннер Осмотр водителей
        help.Check_Enabled_Element(DIBanner); }
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
    public void visibleBlockWhere()  { // Блок Где провести осмотр ваших сотрудников
        help.Check_Enabled_Element(BlockWhere); }
    public void visibleBlockMakeApplication()  { // Блок оформите заявку
        help.Check_Enabled_Element(BlockMakeApplication); }
    public void visibleBlockNeedConsultation()  { // Блок Нужна консультация
        help.Check_Enabled_Element(BlockNeedConsultation); }






}
