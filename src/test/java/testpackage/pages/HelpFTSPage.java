package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

public class HelpFTSPage extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();
    private By PrivacyHelpFTS = By.xpath("//a[@class='ft-sm-list__link'][contains(text(),'Условия конфиденциальности')]");// Ссылка Справка для ФНС
    private By HeadlineHelpFTS = By.xpath("//div[contains(@class,'title-block')]"); // Заголовк страницы Справка для ФНС
    private By SideBarHelpFTS = By.xpath("//div[contains(@class,'side-bar')]");// Сайт-бар слева Справка для ФНС
    private By InformationBlockHelpFTS = By.xpath("//div[contains(@class,'content__inner')]"); // Центральный информационный блок Справка для ФНС


    public void сlickPrivacyHelpFTS() {// Клик Ссылка Справка для ФНС
        help.Click_Method(PrivacyHelpFTS); }
    public void checkHeadlineHelpFTS() { // Проверить Видимость Заголовка Справка для ФНС
        help.Check_Enabled_Element(HeadlineHelpFTS); }
    public void checkSideBarHelpFTS() { // Проверить Видимость Сайт-бар слева Справка для ФНС
        help.Check_Enabled_Element(SideBarHelpFTS); }
    public void checkInformationBlockHelpFTS() { // Проверить Видимость Центральный информационный блок Справка для ФНС
        help.Check_Enabled_Element(InformationBlockHelpFTS); }
}
