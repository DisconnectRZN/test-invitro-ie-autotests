package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

public class NewsPage extends PageObject {

    private static final Help_Methods help = Help_Methods.getInstance();
    // Страница Новости
    private By NewsInBurger = By.xpath("//a[@class='header-menu__link'][contains(text(),'Новости')]");// Кликнуть 'Новости' в бургер меню
    private By Yes = By.xpath("//button[@class='btn btn--narrow city__confirm-btn']");// Кликнуть 'да, верно"
    private By NewsHeadLine = By.xpath("//h1[contains(text(),'Новости')]");// Заголовок 'Новости'
    private By NewsBlock = By.xpath("//div[@class='news-list__wrap']");// Блок 'Новости'
    private By NewsContactsBlock = By.xpath("//div[@class='info-block__inner info-block__inner--contacts']");// Блок 'Контакты'
    private By NewsPhoneNumber = By.xpath("//a[@class='content__phone info-block__phone']");// Номер телефона '8 (905) 705-31-92'
    private By NewsEmailSMI = By.xpath("//a[contains(text(),'pressa@invitro.ru')]");// Email для СМИ 'pressa@invitro.ru'
    private By NewsEmailAdvertising = By.xpath("//a[contains(text(),'reklama@invitro.ru')]");// Email для коммерческих предложений 'reklama@invitro.ru'
    private By News2018Year = By.xpath("//a[@class='news_archive'][contains(text(),'2018')]");// Кнопка перехода на 2018 год Пресс-релизов
    private By News2017Year = By.xpath("//a[@class='news_archive'][contains(text(),'2017')]");// Кнопка перехода на 2017 год Пресс-релизов
    private By News2016Year = By.xpath("//a[@class='news_archive'][contains(text(),'2016')]");// Кнопка перехода на 2016 год Пресс-релизов
    private By NewsShowMoreButton = By.xpath("//div[@class='btn-icon btn-icon--fill ripple']");// Кнопка 'Показать еще'
    private By NewsActivityBlock1 = By.xpath("//div[@class='column--side side-nav__block']");// Блок 'Мероприятия' содержит кнопку Все мероприятия
    private By NewsAllActivityButton = By.xpath("//a[@class='btn btn--empty']");// Кнопка 'Все мероприятия'
    private By NewsActivityBlock2 = By.xpath("//div[@class='column--base side-slider__list-wrap']");// Блок 'Мероприятия'

    //Методы страницы Новости
    public void clickNewsInBurger() throws InterruptedException {
        if(find(Yes).isVisible()){
            help.Click_Method(Yes);
        }
        else {
            System.out.println("Не закрывает элемент");
        }
        help.Click_Method(NewsInBurger);
        Thread.sleep(3000);
        if(find(NewsHeadLine).isVisible()){
            System.out.println("Произошел переход в раздел Новости");
        }
        else {
            assert (false ):  "Не было перехода в раздел Новости";
        }
    }

    public void checkNewsHeadLine() {

        help.Check_Enabled_Element(NewsHeadLine);
    }

    public void visibleNewsBlock() {

        help.Check_Visible_Element(NewsBlock);
    }

    public void visibleNewsContactsBlock() {

        help.Check_Visible_Element(NewsContactsBlock);
    }

    public void checkNewsPhoneNumber() {

        help.Check_Enabled_Element(NewsPhoneNumber);
    }

    public void checkNewsEmailSMI() {

        help.Check_Enabled_Element(NewsEmailSMI);
    }

    public void checkNewsEmailAdvertising() {

        help.Check_Enabled_Element(NewsEmailAdvertising);
    }

    public void clickNews2018Year() {

        help.Click_Method(News2018Year);
    }

    public void clickNews2017Year() {

        help.Click_Method(News2017Year);
    }

    public void clickNews2016Year() {

        help.Click_Method(News2016Year);
    }

    public void clickNewsShowMoreButton() {

        help.Click_Method(NewsShowMoreButton);
    }

    public void visibleNewsActivityBlock1() {

        help.Check_Visible_Element(NewsActivityBlock1);
    }

    public void visibleNewsAllActivityButton() {

        help.Check_Visible_Element(NewsAllActivityButton);
    }

    public void visibleNewsActivityBlock2() {

        help.Check_Visible_Element(NewsActivityBlock2);
    }

}
