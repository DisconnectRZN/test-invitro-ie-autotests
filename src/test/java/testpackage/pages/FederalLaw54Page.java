package testpackage.pages;

import org.openqa.selenium.By;
import testpackage.help.Help_Methods;
import net.thucydides.core.pages.PageObject;

public class FederalLaw54Page extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();
    private By FederalLaw54Page = By.xpath("//*[@class='ft-sm-list__link'][contains(text(),'54-ФЗ')]");// Ссылка 54-ФЗ
    private By Headline54fz = By.xpath("//div[contains(@class,'title-block')]"); // Заголовк страницы
    private By SideBar54 = By.xpath("//div[contains(@class,'side-bar')]");// Сайт-бар слева
    private By InformationBlock54fz = By.xpath("//div[contains(@class,'content__inner')]"); // Центральный информационный блок


    public void сlickFederalLaw54Page() {// Клик Ссылка 54-ФЗ
        help.Click_Method(FederalLaw54Page); }
    public void checkHeadline54fz() { // Проверить Видимость Заголовка 54-ФЗ
        help.Check_Enabled_Element(Headline54fz); }
    public void checkSideBar54() { // Проверить Видимость Сайт-бар слева
        help.Check_Enabled_Element(SideBar54); }
    public void checkInformationBlock54fz() { // Проверить Видимость Центральный информационный блок
        help.Check_Enabled_Element(InformationBlock54fz); }





}
