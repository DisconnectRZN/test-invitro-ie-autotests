package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

public class PhotoAndVideoPage extends PageObject {

    private static final Help_Methods help = Help_Methods.getInstance();
    // Страница Фото и Видео
    private By PhotoAndVideoInBurger = By.xpath("//a[@class='header-menu__link'][contains(text(),'Фото и видео')]");// Кликнуть 'Фото и видео' в бургер меню
    private By PhotoAndVideoAllBlocks = By.xpath("//div[@class='gallery-item']/ancestor-or-self::*[1]");// Все блоки на выбранной странице
    private By PhotoLeftMenuButton = By.xpath("//*[@class='side-bar__items']//*[contains(text(),'Фотогалерея')]");// Кнопка Фотогалерея в левом меню
    private By Photo2018LeftMenuButton = By.xpath("//*[@class='side-bar__items'][position()=1]//*[@class='side-bar-second__items']/a[contains(text(),'2018')]");// Кнопка 2018 раздела Фотогалерея в левом меню
    private By Photo2017LeftMenuButton = By.xpath("//*[@class='side-bar__items'][position()=1]//*[@class='side-bar-second__items']/a[contains(text(),'2017')]");// Кнопка 2017 раздела Фотогалерея в левом меню
    private By Photo2016LeftMenuButton = By.xpath("//*[@class='side-bar__items'][position()=1]//*[@class='side-bar-second__items']/a[contains(text(),'2016')]");// Кнопка 2016 раздела Фотогалерея в левом меню
    private By PhotoAndVideo2018HeadLine = By.xpath("//h1");// Заголовок
    private By VideoLeftMenuButton = By.xpath("//*[@class='side-bar__items']//*[contains(text(),'Видеогалерея')]");// Кнопка Видеогалерея в левом меню
    private By Video2017LeftMenuButton = By.xpath("//*[@class='side-bar__items'][position()=2]//*[@class='side-bar-second__items']/a[contains(text(),'2017')]");// Кнопка 2017 раздела Видеогалерея в левом меню
    private By Video2016LeftMenuButton = By.xpath("//*[@class='side-bar__items'][position()=2]//*[@class='side-bar-second__items']/a[contains(text(),'2016')]");// Кнопка 2016 раздела Видеогалерея в левом меню

    // Методы страницы Фото и Видео

    public void сlickPhotoAndVideoInBurger() {

        help.Click_Method(PhotoAndVideoInBurger);
    }

    public void checkPhotoAndVideoHeadLine() {

        help.Check_Enabled_Element(PhotoAndVideo2018HeadLine);
    }

    public void checkPhotoAndVideoAllBlocks() {

        help.Check_Enabled_Element(PhotoAndVideoAllBlocks);
    }

    public void сlickPhotoLeftMenuButton() {

        help.Click_Method(PhotoLeftMenuButton);
    }

    public void сlickPhoto2018LeftMenuButton() {

        help.Click_Method(Photo2018LeftMenuButton);
    }

    public void сlickPhoto2017LeftMenuButton() {

        help.Click_Method(Photo2017LeftMenuButton);
    }

    public void сlickPhoto2016LeftMenuButton() {

        help.Click_Method(Photo2016LeftMenuButton);
    }

    public void сlickVideoLeftMenuButton() {

        help.Click_Method(VideoLeftMenuButton);
    }

    public void сlickVideo2017LeftMenuButton() {

        help.Click_Method(Video2017LeftMenuButton);
    }

    public void сlickVideo2016LeftMenuButton() {

        help.Click_Method(Video2016LeftMenuButton);
    }

    public void checkPhotoAndVideo2016HeadLine() {

        help.Check_Enabled_Element(PhotoAndVideo2018HeadLine);
    }

    public void checkPhotoAndVideo2017HeadLine() {

        help.Check_Enabled_Element(PhotoAndVideo2018HeadLine);
    }

    public void checkPhotoAndVideo2018HeadLine() {

        help.Check_Enabled_Element(PhotoAndVideo2018HeadLine);
    }
}
