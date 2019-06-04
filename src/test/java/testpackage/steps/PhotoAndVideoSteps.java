package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.PhotoAndVideoPage;


public class PhotoAndVideoSteps {
    PhotoAndVideoPage page;


    @When("^Кликнуть 'Фото и Видео' в бургер меню$")
    public void сlickPhotoAndVideoInBurger () { page.сlickPhotoAndVideoInBurger(); }

    @When("^Проверка отображения заголовка 'Фото и Видео'$")
    public void checkPhotoAndVideoHeadLine () { page.checkPhotoAndVideoHeadLine(); }

    @When("^Проверка отображения блоков на странице 'Фото и Видео'$")
    public void checkPhotoAndVideoAllBlocks () { page.checkPhotoAndVideoAllBlocks(); }

    @When("^Кликнуть 'Фотогалерея' в левом меню$")
    public void сlickPhotoLeftMenuButton () { page.сlickPhotoLeftMenuButton(); }

    @When("^Кликнуть '2017' в левом меню, раздела 'Фотогалерея'$")
    public void сlickPhoto2017LeftMenuButton () { page.сlickPhoto2017LeftMenuButton(); }

    @When("^Проверка отображения заголовка '2017'$")
    public void checkPhotoAndVideo2017HeadLine () { page.checkPhotoAndVideo2017HeadLine(); }

    @When("^Кликнуть '2016' в левом меню, раздела 'Фотогалерея'$")
    public void сlickPhoto2016LeftMenuButton () { page.сlickPhoto2016LeftMenuButton(); }

    @When("^Проверка отображения заголовка '2016'$")
    public void checkPhotoAndVideo2016HeadLine () { page.checkPhotoAndVideo2016HeadLine(); }

    @When("^Кликнуть '2018' в левом меню, раздела 'Фотогалерея'$")
    public void сlickPhoto2018LeftMenuButton () { page.сlickPhoto2018LeftMenuButton(); }

    @When("^Проверка отображения заголовка '2018'$")
    public void checkPhotoAndVideo2018HeadLine () { page.checkPhotoAndVideo2018HeadLine(); }

    @When("^Кликнуть 'Видеогалерея' в левом меню$")
    public void сlickVideoLeftMenuButton () { page.сlickVideoLeftMenuButton(); }

    @When("^Кликнуть '2016' в левом меню, раздела 'Видеогалерея'$")
    public void сlickVideo2016LeftMenuButton () { page.сlickVideo2016LeftMenuButton(); }

    @When("^Кликнуть '2017' в левом меню, раздела 'Видеогалерея'$")
    public void сlickVideo2017LeftMenuButton () { page.сlickVideo2017LeftMenuButton(); }

}
