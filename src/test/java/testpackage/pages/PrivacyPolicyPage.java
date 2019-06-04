package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

public class PrivacyPolicyPage extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();
    private By PrivacyPolicyPage = By.xpath("//a[@class='ft-sm-list__link'][contains(text(),'Условия конфиденциальности')]");// Ссылка Условия конфиденциальности
    private By HeadlinePrivacyPolicy = By.xpath("//div[contains(@class,'title-block')]"); // Заголовк страницы Условия конфиденциальности
    private By SideBarPrivacyPolicy = By.xpath("//div[contains(@class,'side-bar')]");// Сайт-бар слева Условия конфиденциальности
    private By InformationBlockPrivacyPolicy = By.xpath("//div[contains(@class,'content__inner')]"); // Центральный информационный блок Условия конфиденциальности


    public void сlickPrivacyPolicyPage() {// Клик Ссылка Политика в отношении персональных данных
        help.Click_Method(PrivacyPolicyPage); }
    public void checkHeadlinePrivacyPolicy() { // Проверить Видимость Заголовка Политика в отношении персональных данных
        help.Check_Enabled_Element(HeadlinePrivacyPolicy); }
    public void checkSideBarPrivacyPolicy() { // Проверить Видимость Сайт-бар слева Политика в отношении персональных данных
        help.Check_Enabled_Element(SideBarPrivacyPolicy); }
    public void checkInformationBlockPrivacyPolicy() { // Проверить Видимость Центральный информационный блок Политика в отношении персональных данных
        help.Check_Enabled_Element(InformationBlockPrivacyPolicy); }





}