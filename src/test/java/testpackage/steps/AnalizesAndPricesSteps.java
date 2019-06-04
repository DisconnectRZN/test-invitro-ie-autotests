package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.AnalizesAndPricesPage;


public class AnalizesAndPricesSteps {
    AnalizesAndPricesPage page;

    @When("Проверить отображение хлебных крошек на странице анализы")
    public void VeriFyAnalize_Krochki() {
        page.VeriFyAnalize_Krochki();
    }

    @When("Проверить правильность указания раздела в хлебных крошках")
    public void VeriFyNameRazdelaAnalize_Krochki() {
        page.VeriFyNameRazdelaAnalize_Krochki();
    }

    @When("Проверить отображение заголовка на странице анализы" )
    public void VeriFysdatanalizesinmoscow() {
        page.VeriFysdatanalizesinmoscow();
    }

    @When("Проверить блок слева на странице анализы" )
    public void VeriFyleftblock() {
        page.VeriFyleftblock();
    }

    @When("Проверить отображение раздела меню Комплексные анализы" )
    public void VeriFyComplexAnalize() {
        page.VeriFyComplexAnalize();
    }

    @When("Проверить раскрытие блока при нажатии на Комплексные анализы" )
    public void VeriFyComplexAnalizeOpen() {
        page.VeriFyComplexAnalizeOpen();
    }

    @When("Проверить отображение раздела меню Анализы" )
    public void VeriFyAnalize() {
        page.VeriFyAnalize();
    }

    @When("Проверить отображение дополнительного меня в анализах" )
    public void VeriFyDopMenuAnalize() {
        page.VeriFyDopMenuAnalize();
    }

    @When("Проверить отображение блока со списком анализов" )
    public void VeriFyBlockAnalisi() {
        page.VeriFyBlockAnalisi();
    }

    @When("Проверить отображение текста в блоке слева после все блоков" )
    public void VeriFyStoimsotAnalizovText() {
        page.VeriFyStoimsotAnalizovText();
    }

    @When("Проверить отображение иконки у текста в блоке слева после все блоков" )
    public void VeriFyStoimsotAnalizovIkonk() {
        page.VeriFyStoimsotAnalizovIkonk();
    }

    @When("Проверить кнопку Показать еще" )
    public void VeriFyPokazatEche() {
        page.VeriFyPokazatEche();
    }

    @When("Проверить иконку у кнопку Показать еще" )
    public void VeriFyPokazatEcheIcons() {
        page.VeriFyPokazatEcheIcons();
    }

    @When("Перейти на анализы и цены")
    public void gotoanalizes(){
        page.gotoanalizes();
    }


    @When("Открытие рандомного анализа на проверку")
    public void RandomAnalizes(){
        page.RandomAnalizes();
    }

    @When("При раскрытии карточки анализа проверить блок справа")
    public void VeriFyBlockRightKartAnalisi(){
        page.VeriFyBlockRightKartAnalisi();
    }

    @When("При раскрытии карточки анализа проверить что отображется блок со вкладками")
    public void VeriFyVseVkldkiKartAnalisi(){
        page.VeriFyVseVkldkiKartAnalisi();
    }

    @When("При раскрытии карточки анализа проверить отображение текста на вкладке Описание")
    public void VeriFyTextKartAnalisi(){
        page.VeriFyTextKartAnalisi();
    }

    @When("При раскрытии карточки анализа кликнуть на вкладку Подготовка и проверить отображение текста")
    public void VeriFyPodgotovkaKartAnalisi(){
        page.VeriFyPodgotovkaKartAnalisi();
    }

    @When("При раскрытии карточки анализа кликнуть на вкладку Показания и проверить отображение текста")
    public void VeriFyPokazaniaKartAnalisi(){
        page.VeriFyPokazaniaKartAnalisi();
    }

    @When("При раскрытии карточки анализа кликнуть на вкладку Интерпретация результатов и проверить отображение текста")
    public void VeriFyInterpretaciaKartAnalisi(){
        page.VeriFyInterpretaciaKartAnalisi();
    }

    @When("В карточке анализа добавление анализа в корзину и проверка правильности отображения цены и прайса в корзине")
    public void VeriFyDobavlenieAnalisi(){
        page.VeriFyDobavlenieAnalisi();
    }

    @When("Удаление анализов в корзине")
    public void VeriFyYdalenieAnalisi() {
        page.VeriFyYdalenieAnalisi();
    }

}