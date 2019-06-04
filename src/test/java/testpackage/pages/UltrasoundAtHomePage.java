package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

public class UltrasoundAtHomePage extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();

    private By VNDLink = By.xpath("//*[@class='header-nav__link'][contains(text(),'Выезд на дом')]"); // Ссылка в шапке сайта
    private By DriversInspectionUZI = By.xpath("//*[@src='/upload/iblock/722/7227922536958ea94093e9a7d3efec86.svg']"); // Ссылка на УЗИ на дому
    private By ZHeadlineUZI = By.xpath("//div[contains(@class,'title-block')]"); // Заголовк страницы УЗИ на дому
    private By BannerUZI = By.xpath("//*[contains(text(),'Заказать услуги')]//parent::*/preceding-sibling::*//img"); // Баннер УЗИ на дому
    private By BlockTextBannerUZI = By.xpath("//*[@class='service-home-about']"); // Блок рядом с баннером
    private By InputNameUZI = By.xpath("//*[@id='form_text_10']"); // Поле ввода имени
    private By InputPhoneUZI = By.xpath("//input[@id='form_text_11']"); // Поле ввода телефона
    private By RequestCallUZI = By.xpath("//input[@value='Заказать звонок']"); // Кнопка "Заказать звонок"
    private By BlockAnalyzesHomeUZI = By.xpath("//div[@class='directions show-block directions--three show-block--active']"); // Блок с иконками анализы на дому
    private By BlockWhereUZI = By.xpath("//div[@class='service-home-row pb0']"); // Блок Дополнительные возможности
    private By BlockMakeApplicationUZI = By.xpath("//div[@class='directions show-block  directions--three']"); // Блок Оформите заявку
    private By BlockNeedConsultationUZI = By.xpath("//div[@class='service-home-row'][1]"); // Блок Стоимость выезда
    private By BlockScheduleUZI = By.xpath("//div[@class='service-home-row'][2]"); // Блок График оказания услуг

    public void сlickVNDLink() {// Клик Ссылка в шапке сайта
        help.Click_Method(VNDLink); }
    public void clickDriversInspectionUZI() {// Клик Ссылка на УЗИ на дому
        help.Click_Method(DriversInspectionUZI); }
    public void checkZHeadlineUZI() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(ZHeadlineUZI); }
    public void checkbannerUZI() { //Проверить видимость Баннер УЗИ на дому
       help.Check_Enabled_Element(BannerUZI); }
    public void checkBlockTextBannerUZI() {//Проверить видимость Блок рядом с баннером
        help.Check_Enabled_Element(BlockTextBannerUZI); }
    public void enterInputNameUZI() { // Ввод Логина
        find(InputNameUZI).sendKeys("autotest"); }
    public void enterInputPhoneUZI() { // Поле ввода телефона
        find(InputPhoneUZI).sendKeys("9999999999"); }
    public void visiblerequestcallUZI() {//Проверить видимость Кнопка "Заказать звонок"
        help.Check_Enabled_Element(RequestCallUZI); }
    public void visibleblockanalyzeshomeUZI() {//Проверить видимость Блок с иконками анализы на дому
        help.Check_Enabled_Element(BlockAnalyzesHomeUZI); }
    public void visibleBlockWhereUZI()  { // Блок Дополнительные возможности
        help.Check_Enabled_Element(BlockWhereUZI); }
    public void visibleBlockMakeApplicationUZI()  { // Блок оформите заявку
        help.Check_Enabled_Element(BlockMakeApplicationUZI); }
    public void visibleBlockNeedConsultationUZI()  { // Блок Стоимость выезда
        help.Check_Enabled_Element(BlockNeedConsultationUZI); }
    public void visibleBlockScheduleUZI()  { // Блок График оказания услуг
        help.Check_Enabled_Element(BlockScheduleUZI); }






}
