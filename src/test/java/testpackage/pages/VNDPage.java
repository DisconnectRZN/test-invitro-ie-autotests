package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;




public class VNDPage extends PageObject {

    @Managed(uniqueSession = true, clearCookies=BeforeEachTest)
    private static final Help_Methods help = Help_Methods.getInstance();
    private By VNDLink = By.xpath("//*[@class='header-nav__link'][contains(text(),'Выезд на дом')]"); // Ссылка в шапке сайта
    private By Headline = By.xpath("//div[contains(@class,'title-block')]"); // Заголовк страницы
    private By Banner = By.xpath("//*[contains(text(),'Заказать услуги')]//parent::*/preceding-sibling::*//img"); // Баннер страницы
    private By BlockTextBanner = By.xpath("//*[@class='service-home-about']"); // Блок рядом с баннером
    private By InputName = By.xpath("//*[@id='form_text_10']"); // Поле ввода имени
    private By InputPhone = By.xpath("//input[@id='form_text_11']"); // Поле ввода телефона
    private By RequestCall = By.xpath("//input[@value='Заказать звонок']"); // Кнопка "Заказать звонок"
    private By BlockAnalyzesHome = By.xpath("//div[@class='directions show-block show-block--active']"); // Блок с иконками анализы на дому
    private By BlockAdditional = By.xpath("//*[@class='service-home-row pb0'][1]"); // Блок Дополнительные возможности
    private By BlockIssue = By.xpath("//*[contains(@class,'show-block-wrap')][2]"); // Блок оформите заявку
    private By BlockAnalyzes = By.xpath("//*[@class='catalog']/div[5]"); // Блок как получить анализы
    private By BlockCost = By.xpath("//*[@class='service-home-row'][1]"); // Блок стоимость вызова
    private By BlockSchedule = By.xpath("//*[@class='service-home-row'][2]"); // Блок графика оказания услуг
    private By SamaraCity = By.xpath("//div[@class='change-city-wrapper__left']//a[contains(text(), 'Самара')]"); //выбрать Самара
    private By ImageBanner = By.xpath("//*[contains(text(),'Заказать услуги')]//parent::*/preceding-sibling::*//img"); // Баннер изображение слева
    private By City_Applet = By.xpath("//div[@class='city__label']");
    private By Yes_Btn = By.xpath("//button[@class='btn btn--narrow city__confirm-btn']");
    private By ChangeOtherCity = By.xpath("//div[@class='row row--start']/a");//Выбрать другой
    private By CheckCity = By.xpath("//span[@class='city__name city__btn city__name--label']");



    public void сlickVNDLink() {// Клик Ссылка в шапке сайта
        help.Click_Method(VNDLink); }

    public void checkHeadline() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(Headline); }


    public void visiblebanner() { //Проверить видимость баннера
        help.Check_Enabled_Element(Banner); }


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


    public void visibleblockadditional()  { // Блок Дополнительные возможности
        help.Check_Enabled_Element(BlockAdditional); }


    public void visibleblockissue()  { // Блок оформите заявку
        help.Check_Enabled_Element(BlockIssue); }


    public void visibleblockanalyzes()  { // Блок как получить анализы
        help.Check_Enabled_Element(BlockAnalyzes); }

    public void visibleblockcost()  { // Блок стоимость вызова
        help.Check_Enabled_Element(BlockCost); }

    public void visibleblockschedule()  { // Блок графика оказания услуг
        help.Check_Enabled_Element(BlockSchedule); }

    public void visibleImageBanner()  { //Проверить видимость Баннер изображение слева
        help.Check_Enabled_Element(ImageBanner); }

    public void addSamaraCity(){// Смена города на Самару
        if (find(CheckCity).getText().equals("Самара")){
            if (find(Yes_Btn).isVisible()){
                find(Yes_Btn).waitUntilClickable().click();
            } else {
                help.Click_Method(City_Applet);
                find(Yes_Btn).waitUntilClickable().click();
            }
        } else {
            if(find(ChangeOtherCity).isVisible()){
                help.Click_Method(ChangeOtherCity);
                help.Click_Method(SamaraCity);
            } else{
                help.Click_Method(City_Applet);
                help.Click_Method(ChangeOtherCity);
                help.Click_Method(SamaraCity);
            }
            if (find(Yes_Btn).isVisible()){
                find(Yes_Btn).waitUntilClickable().click();
            } else {
                help.Click_Method(City_Applet);
                find(Yes_Btn).waitUntilClickable().click();
            }
        }

        }
        //find(SamaraCity).click();





}
