package testpackage.pages;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;


public class GuideBlanksPage extends PageObject{
    private static final Help_Methods help = Help_Methods.getInstance();
    private By GuideBlanks = By.xpath("//*[contains(@class,'header-nav__item')][3]");// Ссылка на Бланки
    private By HeaderGuideBlanks = By.xpath("//*[contains(@class,'title-block')]");//Заголовок Направительные бланки
    private By CentreGuideBlank = By.xpath("//*[contains(@class,'content-block')]/div[1]");// Центральный блок описания
    private By BlockGuideBlanks = By.xpath("//*[contains(@class,'content-block')]/div[2]");// Блок направительных бланков

    public void clickGuideBlanks() {// Клик Бланки в блоке Врачам
        help.Click_Method(GuideBlanks);
    }
    public void checkHeaderGuideBlanks() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(HeaderGuideBlanks);
    }
    public void checkCentreGuideBlank() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(CentreGuideBlank);
    }
    public void checkBlockGuideBlanks() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(BlockGuideBlanks);
    }

}
