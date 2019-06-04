package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.NewsPage;



public class NewsSteps {
    NewsPage page;

    @When("^Кликнуть Новости в бургер меню$")
    public void clickNewsInBurger () throws InterruptedException { page.clickNewsInBurger(); }

    @When("^Проверка отображения заголовка 'Новости'$")
    public void checkNewsHeadLine () { page.checkNewsHeadLine(); }

    @When("^Проверка отображения всех 'Новостей' на выбранной странице$")
    public void visibleNewsBlock () { page.visibleNewsBlock(); }

    @When("^Проверка отображения блока 'Контакты'$")
    public void visibleNewsContactsBlock () { page.visibleNewsContactsBlock(); }

    @When("^Проверка отображения номера телефона в блоке 'Контакты'$")
    public void checkNewsPhoneNumber () { page.checkNewsPhoneNumber(); }

    @When("^Проверка отображения Email для СМИ в блоке 'Контакты'$")
    public void checkNewsEmailSMI () { page.checkNewsEmailSMI(); }

    @When("^Проверка отображения Email для Комерческих предложений в блоке 'Контакты'$")
    public void checkNewsEmailAdvertising () { page.checkNewsEmailAdvertising(); }

    @When("^Кликнуть по кнопке 'Показать еще'$")
    public void clickNewsShowMoreButton () { page.clickNewsShowMoreButton(); }

    @When("^Проверка отображения блока 'Мероприятия' - содержащую кнопку 'Все мероприятия'$")
    public void visibleNewsActivityBlock1 () { page.visibleNewsActivityBlock1(); }

    @When("^Проверка отображения кнопки 'Все мероприятия'$")
    public void visibleNewsAllActivityButton () { page.visibleNewsAllActivityButton(); }

    @When("^Проверка отображения блока 'Мероприятия'$")
    public void visibleNewsActivityBlock2 () { page.visibleNewsActivityBlock2(); }

    @When("^Кликнуть по кнопке '2018'$")
    public void clickNews2018Year () { page.clickNews2018Year(); }

    @When("^Кликнуть по кнопке '2017'$")
    public void clickNews2017Year () { page.clickNews2017Year(); }

    @When("^Кликнуть по кнопке '2016'$")
    public void clickNews2016Year () { page.clickNews2016Year(); }

}
