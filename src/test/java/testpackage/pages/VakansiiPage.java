package testpackage.pages;


import org.openqa.selenium.By;
import testpackage.help.Help_Methods;
import net.thucydides.core.pages.PageObject;



public class VakansiiPage extends PageObject{
    private static final Help_Methods help = Help_Methods.getInstance();
    private By Vakansii = By.xpath("//*[contains(@class,'container')]//*[contains(text(),'Трудоустр')]");// Ссылка на Вакансии
    private By Job = By.xpath("//*[contains(@class,'title-block')]");//header Работа в Инвитро
    private By LeftBlock = By.xpath("//*[contains(@class,'side-bar-second__link')]");//Блок слева
    private By HeaderBanner = By.xpath("//*[contains(@class,'service-home-block service-home-block--intro-alt')]");// Блок под заголовком с описанием и банером
    private By Development = By.xpath("//*[contains(@class,'article')][1]");//Блок Постоянное развитие
    private By Interview = By.xpath("//*[contains(@class,'vacancy-index__interview interview-block')]");//Блок Интервью с Виталиной Левашовой
    private By Laureate = By.xpath("//*[contains(@class,'article')][2]");//Блок ИНВИТРО - лауреат премий в области HR

    public void clickVakansii() {// Клик Трудоустройство в подвале
        help.Click_Method(Vakansii);
    }
    public void checkJob() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(Job);
    }
    public void checkLeftBlock() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(LeftBlock);
    }
    public void checkHeaderBanner() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(HeaderBanner);
    }
    public void checkDevelopment() {  help.Check_Enabled_Element(Development); }
    public void checkInterview() { help.Check_Enabled_Element(Interview); }
    public void checkLaureate() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(Laureate);
    }

}
