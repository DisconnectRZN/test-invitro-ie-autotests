package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

public class PressCentrPage extends PageObject {

    private static final Help_Methods help = Help_Methods.getInstance();
    // Страница Пресс-центр
    private By PressCentrInBurger = By.xpath("//div[@class='header-menu__col']/a[contains(text(),'Пресс-центр')]");// Кликнуть 'Пресс-центр' в бургер меню
    private By PressCentrHeadLine = By.xpath("//h1[contains(text(),'Пресс-релизы')]");// Заголовок 'Пресс-релизы'
    private By PressCentrFilterBlock = By.xpath("//div[@class='date-picker__block']");// Блок Фильтра 'Пресс-релизы' и страницы 'Новости' содержит архив по годам
    private By PressCentrBlock = By.xpath("//div[@class='news-list__wrap']");// Блок 'Пресс-релизы'
    private By PressCentrPageTwo = By.xpath("//a[@class='paginator__list-link'][contains(text(),'2')]");// Кнопка перехода на вторую страницу Пресс-релизов
    private By PressCentrPageThree = By.xpath("//a[@class='paginator__list-link'][contains(text(),'3')]");// Кнопка перехода на третью страницу Пресс-релизов
    private By PressCentrPageFour = By.xpath("//a[@class='paginator__list-link'][contains(text(),'4')]");// Кнопка перехода на четвертую страницу Пресс-релизов
    private By PressCentrPageFive = By.xpath("//a[@class='paginator__list-link'][contains(text(),'5')]");// Кнопка перехода на пятую страницу Пресс-релизов
    private By PressCentrPageSix = By.xpath("//a[@class='paginator__list-link'][contains(text(),'6')]");// Кнопка перехода на шестую страницу Пресс-релизов
    private By PressCentrPageOne = By.xpath("//a[@class='paginator__list-link'][contains(text(),'1')]");// Кнопка перехода на первую страницу Пресс-релизов

    // Методы страницы Пресс-центр
    public void сlickPressCentrInBurger() {

        help.Click_Method(PressCentrInBurger);
    }

    public void checkPressCentrHeadLine() {

        help.Check_Enabled_Element(PressCentrHeadLine);
    }

    public void visiblePressCentrFilterBlock() {

        help.Check_Visible_Element(PressCentrFilterBlock);
    }

    public void visiblePressCentrBlock() {

        help.Check_Visible_Element(PressCentrBlock);
    }

    public void сlickPressCentrPageTwo() {

        help.Click_Method(PressCentrPageTwo);
    }

    public void сlickPressCentrPageThree() {

        help.Click_Method(PressCentrPageThree);
    }

    public void сlickPressCentrPageFour() {

        help.Click_Method(PressCentrPageFour);
    }

    public void сlickPressCentrPageFive() {

        help.Click_Method(PressCentrPageFive);
    }

    public void сlickPressCentrPageSix() {

        help.Click_Method(PressCentrPageSix);
    }

    public void сlickPressCentrPageOne() {

        help.Click_Method(PressCentrPageOne);
    }

}

