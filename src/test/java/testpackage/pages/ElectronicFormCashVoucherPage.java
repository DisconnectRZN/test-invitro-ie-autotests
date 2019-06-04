package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

public class ElectronicFormCashVoucherPage extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();
    private By UrInfoFuterMenu = By.xpath("//*[@class='ft-sm-block__title'][contains(text(),'Юридическая')]"); //Ссылка на Юридическую информацию
    private By ElectronicFormPage = By.xpath("//*[contains(@class,'side-bar-second__list')]/li[5]");// Ссылка Электронная форма кассового чека
    private By HeadlineElectronicForm = By.xpath("//div[contains(@class,'title-block')]"); // Заголовк страницы
    private By SideBarElectronicForm = By.xpath("//div[contains(@class,'side-bar')]");// Сайт-бар слева
    private By InformationBlockElectronicForm = By.xpath("//div[contains(@class,'content__inner')]"); // Центральный информационный блок


    public void clickUrInfoFuterMenu() {// Клик Ссылка на Юридическую информацию
        help.Click_Method(UrInfoFuterMenu);
    }
    public void clickElectronicFormPage() {// Клик Ссылка Электронная форма кассового чека
        help.Click_Method(ElectronicFormPage);
    }
    public void checkHeadlineElectronicForm() { // Проверить Видимость Заголовка Электронная форма кассового чека
        help.Check_Enabled_Element(HeadlineElectronicForm);
    }
    public void checkSideBarElectronicForm() { // Проверить Видимость Сайт-бар слева
        help.Check_Enabled_Element(SideBarElectronicForm);
    }
    public void checkInformationBlockInformationBlockElectronicForm() { // Проверить Видимость Центральный информационный блок
        help.Check_Enabled_Element(InformationBlockElectronicForm);
    }

}
