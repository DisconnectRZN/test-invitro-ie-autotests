package testpackage.pages;


import org.openqa.selenium.By;
import testpackage.help.Help_Methods;
import net.thucydides.core.pages.PageObject;



public class FranchisingPage extends PageObject{
    private static final Help_Methods help = Help_Methods.getInstance();
    private By Franchising = By.xpath("//*[contains(@class,'header-top-nav__item')][3]");// Ссылка на Франчайзинг
    private By FranchisingHeder = By.xpath("//*[contains(@class,'title-block')]");// Блок заголовка
    private By HederBlock = By.xpath("//*[contains(@class,'service-home-block')]");//Блок Собственный бизнес с лидером
    private By HeaderInvitro = By.xpath("//*[contains(@class,'service-home-row-wrap')][1]");// Блок INVITRO – один из самых известных
    private By Steps = By.xpath("//*[contains(@class,'service-home-row')][2]");//Блок 5 шагов к собственному медицинскому офису
    private By Photo = By.xpath("//*[contains(@class,'side-slider side-slider--blocks show-block side-slider--blocks-md')]");//Блок фото и видео
    private By Requirements = By.xpath("//*[contains(@class,'service-home-row')][3]");//Блок Требования к инвесторам
    private By Scheme = By.xpath("//*[contains(@class,'service-home-row')][4]");//Блок Выберите удобную схему сотрудничества
    private By Map = By.xpath("//*[contains(@class,'investors__map-block')]");//Блок Мы уже открыли более 1000 медицинских офисов



    public void clickFranchising() {// Клик Бланки в блоке Врачам
        help.Click_Method(Franchising);
    }
    public void checkFranchisingHeder() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(FranchisingHeder);
    }
    public void checkHederBlock() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(HederBlock);
    }
    public void checkHeaderInvitro() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(HeaderInvitro);
    }
    public void checkSteps() {  help.Check_Enabled_Element(Steps); }
    public void checkPhoto() { help.Check_Enabled_Element(Photo); }
    public void checkRequirements() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(Requirements);
    }
    public void checkScheme() { help.Check_Enabled_Element(Scheme); }
    public void checkMap() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(Map);
    }


}
