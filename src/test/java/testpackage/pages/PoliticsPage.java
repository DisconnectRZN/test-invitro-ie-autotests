package testpackage.pages;

import org.openqa.selenium.By;
import testpackage.help.Help_Methods;
import net.thucydides.core.pages.PageObject;

public class PoliticsPage extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();
    private By PoliticsPagePage = By.xpath("//*[@class='ft-sm-list__link'][contains(text(),'Политика в отношении персональных данных')]");// Ссылка Политика в отношении персональных данных
    private By HeadlinePolPoliticsPage = By.xpath("//div[contains(@class,'title-block')]"); // Заголовк страницы
    private By SideBarPolPoliticsPage = By.xpath("//div[contains(@class,'side-bar')]");// Сайт-бар слева
    private By InformationPolBlockPoliticsPage = By.xpath("//div[contains(@class,'content__inner')]"); // Центральный информационный блок


    public void сlickPoliticsPagePage() {// Клик Ссылка Политика в отношении персональных данных
        help.Click_Method(PoliticsPagePage); }
    public void checkHeadlinePolPoliticsPage() { // Проверить Видимость Заголовка Политика в отношении персональных данных
        help.Check_Enabled_Element(HeadlinePolPoliticsPage); }
    public void checkSideBarPoliticsPage() { // Проверить Видимость Сайт-бар слева
        help.Check_Enabled_Element(SideBarPolPoliticsPage); }
    public void checkInformationBlockPoliticsPage() { // Проверить Видимость Центральный информационный блок
        help.Check_Enabled_Element(InformationPolBlockPoliticsPage); }

}
