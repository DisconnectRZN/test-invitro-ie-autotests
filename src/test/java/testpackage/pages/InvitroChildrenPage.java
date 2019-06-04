package testpackage.pages;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;


public class InvitroChildrenPage extends PageObject{
    private static final Help_Methods help = Help_Methods.getInstance();
    private By LinkInvitroChildren = By.xpath("//a[@class='ft-sm-block__title'][contains(text(),'ИНВИТРО-детям')]");// Ссылка ИНВИТРО-детям
    private By HeaderInvitroChildren = By.xpath("//div[contains(@class,'title-block')]");//Заголовок Журнал «Лабораторная работа»
    private By BannerInvitroChildren = By.xpath("//*[contains(@class,'content patients-children patients-children--intro')]");// Баннер страницы Журнал «Лабораторная работа» Детям
    private By TextInvitroChildren = By.xpath("//*[contains(@class,'content patients-children patients-children--grey')]");//Блок Текста страницы Журнал «Лабораторная работа» Детям
    private By IssuInvitroChildren = By.xpath("//*[contains(@class,'patients-children__cards')]");// Блок выпусков Журнал «Лабораторная работа» Детям
    private By LaboratoryWork1InvitroChildren = By.xpath("//a[contains(@class,'patients-children__cards-item')][1]//*[contains(text(),'Подробнее')]");//Ссылка на первый номер Лабораторная работа
    private By LaboratoryWork2InvitroChildren = By.xpath("//a[contains(@class,'patients-children__cards-item')][2]//*[contains(text(),'Подробнее')]");// Ссылка на второй номер Лабораторная работа
    private By LaboratoryWork3InvitroChildren = By.xpath("//a[contains(@class,'patients-children__cards-item')][3]//*[contains(text(),'Подробнее')]");//Ссылка на третий номер Лабораторная работа
    private By LaboratoryWork4InvitroChildren = By.xpath("//a[contains(@class,'patients-children__cards-item')][4]//*[contains(text(),'Подробнее')]");// Ссылка на четвертый номер Лабораторная работа
    //--------------Лабораторная работа
    private By BannerLaboratoryWork = By.xpath("//img[@class='patients-children-inner__intro-img']");// Баннер страницы Лабораторная работа
    private By TextLaboratoryWork = By.xpath("//*[contains(@class,'patients-children-slider__list')]");// Блок текста выбраных тем
    private By ThemeLaboratoryWork = By.xpath("//*[contains(@class,'patients-children-inner__right')]");// Блок тем


    public void clickLinkInvitroChildren() {// Клик Бланки в блоке Врачам
        help.Click_Method(LinkInvitroChildren);
    }
    public void checkHeaderInvitroChildren() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(HeaderInvitroChildren);
    }
    public void checkBannerInvitroChildren() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(BannerInvitroChildren);
    }
    public void checkTextInvitroChildren() {  help.Check_Enabled_Element(TextInvitroChildren); }
    public void checkIssuInvitroChildren() { help.Check_Enabled_Element(IssuInvitroChildren); }
    public void clickLaboratoryWork1InvitroChildren() { // Проверить Видимость Заголовка
        help.Click_Method(LaboratoryWork1InvitroChildren);
    }
    public void clickLaboratoryWork2InvitroChildren() { // Проверить Видимость Заголовка
        help.Click_Method(LaboratoryWork2InvitroChildren);
    }
    public void clickLaboratoryWork3InvitroChildren() { // Проверить Видимость Заголовка
        help.Click_Method(LaboratoryWork3InvitroChildren);
    }
    public void clickLaboratoryWork4InvitroChildren() { // Проверить Видимость Заголовка
        help.Click_Method(LaboratoryWork4InvitroChildren);
    }
    //--------------Лабораторная работа
    public void checkBannerLaboratoryWork() {  help.Check_Enabled_Element(BannerLaboratoryWork); }
    public void checkTextLaboratoryWork() { help.Check_Enabled_Element(TextLaboratoryWork); }
    public void checkThemeLaboratoryWork() { // Проверить Видимость Заголовка
        help.Check_Enabled_Element(ThemeLaboratoryWork);
    }


}
