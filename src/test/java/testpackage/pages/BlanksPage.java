package testpackage.pages;


import org.openqa.selenium.By;
import testpackage.help.Help_Methods;
import net.thucydides.core.pages.PageObject;





public class BlanksPage extends PageObject{
    private static final Help_Methods help = Help_Methods.getInstance();
    private By Doctor = By.xpath("//a[contains(text(),'Врачам')]");//header Врачам
    private By Blanks = By.xpath("//a[contains(text(),'Бланки')]"); // Ссылка на Банки в шапке
    private By Headline = By.xpath("//*[contains(@class,'title-block')]"); //Блок заголовка
    private By BlockBlanks = By.xpath("//*[contains(@class,'content content-block')]"); // Блок описания и направительных бланков
    private By ImageBlanks = By.xpath("//*[(@src ='/local/templates/invitro_main/src/image/icons/icon-pdf.svg')]"); // Иконки направительных бланков


    public void clickDoctor() {// Клик Врачам в шапке сайта
        help.Click_Method(Doctor); }


    public void clickBlanks() {// Клик Бланки в блоке Врачам
        help.Click_Method(Blanks);
    }

    public void checkHeadline() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(Headline);
    }

    public void checkBlockBlanks() { // Проверить Блок описания и направительных бланков
        help.Check_Enabled_Element(BlockBlanks);
    }

    public void visibleImageBlanks() { //Проверить видимость Иконки направительных бланков
        help.Check_Visible_Element(ImageBlanks);
    }


}









