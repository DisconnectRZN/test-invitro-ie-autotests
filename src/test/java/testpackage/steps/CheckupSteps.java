package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.CheckupPage;

public class CheckupSteps {

    CheckupPage page;

    @When("Переход на страницу Комплексные обследования")
    public void VeriFyCheckup() {
        page.VeriFyCheckup();
    }

    @When("Проверка надписи Бесплатный звонок по России в Хедер меню")
    public void VeriFyBesplatnZvon(){
        page.VeriFyBesplatnZvon();
    }

    @When("Проверить что при переходе в раздел не поменялся сам город")
    public void VeriFyGorodCheckup() {
        page.VeriFyGorodCheckup();
    }

    @When("Проверка отображения хлебных крошек на странице Комплексные обследования")
    public void VeriFyKroshkiCheckup() {
        page.VeriFyKroshkiCheckup();
    }

    @When("Проверка отображения заголовка на странице Комплексные обследования")
    public void VeriFyZagolovokCheckup() {
        page.VeriFyZagolovokCheckup();
    }

    @When("Проверить отображение блока меню в разделе Комплексные обследования")
    public void VeriFyMenuCheckup() {
        page.VeriFyMenuCheckup();
    }

    @When("Проверить отображение иконок в блоке меню в разделе Комплексные обследования")
    public void VeriFyMenuIconsCheckup() {
        page.VeriFyMenuIconsCheckup();
    }

    @When("Проверить отображение банеров у чекапов")
    public void VeriFyImgCheckup() {
        page.VeriFyImgCheckup();
    }

    @When("Проверить отображение блока рядом с отображением чекапов")
    public void VeriFyBlockRightCheckup() {
        page.VeriFyBlockRightCheckup();
    }

    @When("Проверить отображение блока со списоком чекапов")
    public void VeriFySpisokCheckup() {
        page.VeriFySpisokCheckup();
    }

    @When("Проверить отображение блока с врачами на странице комплексные обследования")
    public void VeriFyVrachiCheckup() {
        page.VeriFyVrachiCheckup();
    }

    @When("Нажатие на банер и проверка появления 404")
    public void VeriFyImgClickCheckup() throws InterruptedException {
        page.VeriFyImgClickCheckup() ;
    }

    @When("Нажатие на кнопку Записаться на форме для записи на программу")
    public void VeriFyButtonZapisCheckup() {
        page.VeriFyButtonZapisCheckup();
    }


    @When("При раскрытии чекапа нажать на кнопку Записаться")
    public void VeriFyButtonZapisCheckupKart() {
        page.VeriFyButtonZapisCheckupKart();
    }

    @When("Проверка заполнения обязательности полей на форме для записи на программу")
    public void VeriFyBlockZapisButtonClickCheckup() {
        page.VeriFyBlockZapisButtonClickCheckup();
    }

    @When("Проверка отображения формы для записи на программу")
    public void VeriFyBlockZapisCheckup() {
        page.VeriFyBlockZapisCheckup();
    }

    @When("Проверка отображения заголовка на форме записи на программу")
    public void VeriFyBlockZapisHCheckup() {
        page.VeriFyBlockZapisHCheckup();
    }

    @When("Заполнение ФИО на форме записи на программу")
    public void VeriFyBlockFIOCheckup() {
        page.VeriFyBlockFIOCheckup();
    }

    @When("Заполнение почты на форме записи на программу")
    public void VeriFyBlockEmailCheckup() {
        page.VeriFyBlockEmailCheckup();
    }

    @When("Заполнение названия комплекса на форме записи на программу")
    public void VeriFyBlockBlockNazvanieCheckup() {
        page.VeriFyBlockBlockNazvanieCheckup();
    }

    @When("Заполнение телефона на форме записи на программу")
    public void VeriFyBlockPhoneCheckup() {
        page.VeriFyBlockPhoneCheckup();
    }

    @When("Заполнение комментария на форме записи на программу")
    public void VeriFyBlockKommentCheckup() {
        page.VeriFyBlockKommentCheckup();
    }

    @When("Проверка отображения кнопки записать на форме записи на программу")
    public void VeriFyBlockZapisButtonCheckup() {
        page.VeriFyBlockZapisButtonCheckup();
    }

    @When("Выбор рандомного чекапа")
    public void VeriFyRandomCheckup() {
        page.VeriFyRandomCheckup();
    }


    @When("Проверка отображения информационного блока при раскрытии чекапа")
    public void VeriFyInfBlockCheckupKart() {
        page.VeriFyInfBlockCheckupKart();
    }

    @When("Проверка отображения блока записи при раскрытии чекапа")
    public void VeriFyBlockZapicCheckupKart() {
        page.VeriFyBlockZapicCheckupKart();
    }

    @When("Проверка отображения блока с врачами при раскрытии чекапа")
    public void VeriFyBlockVrachiCheckupKart() {
        page.VeriFyBlockVrachiCheckupKart();
    }

    @When("Проверка отображения вкладок Какие проблемы решает, Консультации специалистов, Состав комплекса")
    public void VeriFyVkladkiCheckup() {
        page.VeriFyVkladkiCheckup();
    }

    @When("Проверка отображения хотя бы по одному чекапу в каждом разделе")
    public void VseRazdelCheckup() {
        page.VseRazdelCheckup();
    }

    @When("При раскрытии чекбокса проверка правильности указания активного меню")
    public void MenuCheckup() {
        page.MenuCheckup();
    }



}
