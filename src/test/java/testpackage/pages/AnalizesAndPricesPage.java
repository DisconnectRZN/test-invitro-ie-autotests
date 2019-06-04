package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;
import java.util.List;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;


public class AnalizesAndPricesPage extends PageObject {

    @Managed(uniqueSession = true, clearCookies=BeforeEachTest)

    private static final Help_Methods help = Help_Methods.getInstance();

    private By Analize_Menu = By.xpath("//ul[contains(@class,'header-nav__list')]//li[1]"); //наименование раздела в меню
    private By Analize_Krochki = By.xpath("//div[contains(@class,'bread-crumbs')]"); //хлебные крошки
    private By NameRazdelaAnalize_Krochki = By.xpath("//ul[contains(@class,'bread-crumbs__list')]//li[2]"); //название раздела в хлебных крошках
    private By SdatAnalizesInMoscow = By.xpath("//div[@class='title-block']//h1"); //Заголовок на странице анализы
    private By LeftBlock = By.xpath("//*[@class='side-bar__box open']"); //блок слева
    private By ComplexAnalize = By.xpath("//a[@class='sidebar_no_js side-bar__link side-bar__link--icon side-bar__link--second']"); //комплексные анализы
    private By ComplexAnalizeOpen = By.xpath("//a[@class='sidebar_no_js side-bar__link side-bar__link--icon side-bar__link--second side-bar__link--open']"); //блок комплексные анализы после нажатия на него
    private By Analize = By.xpath("//a[@class='side-bar__link side-bar__link--icon side-bar__link--open side-bar__link--second']"); //анализы
    private By DopMenuAnalize = By.xpath("//div[contains(@class,'side-bar__box open is_stuck')]//div[3]"); //блок с дополнительным меню

    private By BlockAnalisi = By.xpath("//div[contains(@data-entity,'items-row')]"); //блок под банером
    private By SpisokAnalisi = By.xpath("//div[@class='pagination-items']//div[@class='result-item__title']//a"); //список всех иследований

    private By StoimsotAnalizovText = By.xpath("//div[@class='side-bar__description row']/span"); //Проверка текста после всех блоков слева
    private By StoimsotAnalizovIkonk = By.xpath("//div[@class='side-bar__description row']/img"); //Проверка наличия иконки у текста после всех блоков слева
    private By Analises = By.xpath("//img[@alt='logo']/parent::*//following::nav//*[contains(text(),'Анализы')]"); //Блок анализы
    private By PokazatEche = By.xpath("//div[contains(@class,'btn-icon btn-icon--fill ripple')]"); //кнопка показать еще
    private By PokazatEcheIcons = By.xpath("//*[contains(@class,'icon icon-icon-btn-reload')]"); //иконка у кнопки показать еще
    //
    //локаторы при нажатии на анлиз
    //
    private By BlockRightKartAnalisi = By.xpath("//div[@class='info-block__inner']"); //Блок справа
    private By VseVkldkiKartAnalisi = By.xpath("//ul[@class='slick-dots']"); //Вкладка
    private By TextKartAnalisi = By.xpath("//div[@id='slick-slide10']"); //Текст в первой вкладке
    private By PodgotovkaKartAnalisi = By.xpath("//button[@class='article__slider__btn'][contains(text(),'Подготовка')]"); //Вкладка Подготовка
    private By PodgotovkatextKartAnalisi = By.xpath("//div[@id='slick-slide11']"); //текст на вкладке подготовка
    private By PokazaniaKartAnalisi = By.xpath("//button[@class='article__slider__btn'][contains(text(),'Показания')]"); //Вкладка Показания
    private By PokazaniaTextKartAnalisi = By.xpath("//div[@id='slick-slide12']"); //текст на вкладке Показания
    private By InterpretaciaKartAnalisi = By.xpath("//button[@class='article__slider__btn'][contains(text(),'Интерпретация результатов')]"); //Вкладка Интерпретация результатов
    private By InterpretaciaTextKartAnalisi = By.xpath("//div[@id='slick-slide13']"); //текст на вкладке Интерпретация результатов

    private By PriceKartAnalisi = By.xpath("//span[@class='info-block__price info-block__price--total']"); //Стоимость анализа
    private By ButtonKartAnalisi = By.xpath("//span[contains(text(),'В корзину')]"); //Кнопка в корзину до нажатия
    private By ButtonClickKartAnalisi = By.xpath("//span[contains(text(),'Добавлено')]"); //Кнопка в корзину после нажатия

    private By ZagolovorKartAnalisi = By.xpath("//div[contains(@class,'title-block--narrow')]//h1"); //Кнопка в корзину после нажатия
    //
    //локаторы для корзины
    //
    private By GoToBasketButton = By.xpath("//div[@class='header-cart__icon']");// Открыть Корзину
    private By PriceAnalisiKorzina = By.xpath("//span[contains(@class,'result-item__price--sum')]"); //Стоимость анализа в корзине
    private By NamrAnalisiKorzina = By.xpath("//div[@class='content-block']//div[3]//div[1]//p[1]"); //Название анализа

    private By YdalenieAnalisiKorzina = By.xpath("//a[@class='link cart-page__clean-cart']"); //для удаления добавленных тестов
    private By YdalenieProverkaAnalisiKorzina = By.xpath("//div[@class='cart-empty__title']"); //для проверки что корзина пустая
    //
    //
    //
    public void VeriFyAnalize_Krochki()  {
        find(Analize_Krochki).isVisible(); } //Проверить отображение хлебных крошек на странице анализы

    //метод проверки отображения наименование раздела в хлебных крошках
    public void VeriFyNameRazdelaAnalize_Krochki()  { //Проверить правильность указания раздела в хлебных крошках

        String NameRazdelaAnalizeKrochki1 = find(NameRazdelaAnalize_Krochki).getText().trim();
        String AnalizeMenu1 = find(Analize_Menu).getText().trim();

        boolean sravnenie = NameRazdelaAnalizeKrochki1.equalsIgnoreCase(AnalizeMenu1);
        System.out.println(sravnenie);

        if (sravnenie){
            System.out.println("Все ок. Наименование раздела из меню соответствует наименованию раздела в хлебных крошках");
        }
        else {
            System.out.println("Наименование раздела из меню не соответствует наименованию раздела в хлебных крошках!");
            assert (false):  "Наименование раздела из меню не соответствует наименованию раздела в хлебных крошках";
        }
    }

    public void VeriFysdatanalizesinmoscow()  {
        find(SdatAnalizesInMoscow).isVisible(); } //Проверить отображение заголовка на странице анализы

    public void VeriFyleftblock(){ //Проверить блок слева
        find(LeftBlock).isVisible();
    }

    public void VeriFyComplexAnalize()  {
        find(ComplexAnalize).isVisible(); } //Проверить отображение раздела меню Комплексные анализы

    //провреить кликаемость, раскрытие блока компл анализы + скрытие блока анализы
    public void VeriFyComplexAnalizeOpen()  { //Проверить кликаемость и раскрытие блока
        find(ComplexAnalize).waitUntilClickable().click();
        find(ComplexAnalizeOpen).isVisible();
    }

    public void VeriFyAnalize()  {
        find(Analize).isVisible(); } //Проверить отображение раздела меню Анализы

    public void VeriFyDopMenuAnalize()  {
        find(DopMenuAnalize).isVisible(); } //Проверить отображение дополнительного меня в анализах

    public void VeriFyBlockAnalisi()  {
        find(BlockAnalisi).isVisible(); } //Проверить отображение блока под банером

    public void VeriFyStoimsotAnalizovText()  {
        find(StoimsotAnalizovText).isVisible(); } //Проверить отображение текста в блоке слева после все блоков

    public void VeriFyStoimsotAnalizovIkonk()  {
        find(StoimsotAnalizovIkonk).isVisible(); } //Проверить отображение иконки у текста в блоке слева после все блоков

    public void VeriFyPokazatEche(){ //Проверить кнопку Показать еще
        find(PokazatEche).isVisible();
    }

    public void VeriFyPokazatEcheIcons(){ //Проверить иконку у кнопку Показать еще
        find(PokazatEcheIcons).isVisible();
    }
    public void gotoanalizes() {
        find(Analises).waitUntilClickable().click();
    }

//рандомный клик на анализ
    public void RandomAnalizes() {
        List<WebElementFacade> massive = findAll(SpisokAnalisi);
        int count = massive.size();
        System.out.println("количество анализов: " + count);
        int random_number = (int) (Math.random() * count); // Генерация 1-го числа
        System.out.println("случайное число: " + random_number);
        System.out.println(massive.get(random_number).getText());
        massive.get(random_number).click();
    }

    public void VeriFyBlockRightKartAnalisi(){ //При раскрытии карточки анализа проверить блок справа
        help.Check_Visible_Element(BlockRightKartAnalisi);
        //find(BlockRightKartAnalisi).isVisible();
    }

    public void VeriFyVseVkldkiKartAnalisi(){ //При раскрытии карточки анализа проверить что отображется блок со вкладками
        help.Check_Visible_Element(VseVkldkiKartAnalisi);
        //find(VseVkldkiKartAnalisi).isVisible();
    }

    public void VeriFyTextKartAnalisi(){ //При раскрытии карточки анализа проверить отображение текста на вкладке Описание
        help.Check_Visible_Element(TextKartAnalisi);
        //find(TextKartAnalisi).isVisible();
    }

    public void VeriFyPodgotovkaKartAnalisi(){ //При раскрытии карточки анализа кликнуть на вкладку Подготовка и проверить отображение текста
        find(PodgotovkaKartAnalisi).waitUntilClickable().click();
        //help.Click_Method(PodgotovkaKartAnalisi);
        //find(PodgotovkatextKartAnalisi).isVisible();
    }

    public void VeriFyPokazaniaKartAnalisi(){ //При раскрытии карточки анализа кликнуть на вкладку Показания и проверить отображение текста
        find(PokazaniaKartAnalisi).waitUntilClickable().click();
        //find(PokazaniaTextKartAnalisi).isVisible();
    }

    public void VeriFyInterpretaciaKartAnalisi(){ //При раскрытии карточки анализа кликнуть на вкладку Интерпретация результатов и проверить отображение текста
        find(InterpretaciaKartAnalisi).waitUntilClickable().click();
        //find(InterpretaciaTextKartAnalisi).isVisible();
    }

    //Добавление анализа в корзину и проверка правильности отображения цены и прайса в корзине
    public void VeriFyDobavlenieAnalisi(){ //
        find(ButtonKartAnalisi).isVisible();
        find(ButtonKartAnalisi).waitUntilClickable().click();
        find(ButtonClickKartAnalisi).isVisible();

        String price = find(PriceKartAnalisi).getText();
        System.out.println("Цена в карточка анализа" +price);

        String name = find(ZagolovorKartAnalisi).getText();
        System.out.println("Название в карточке анализа" +name);

        find(GoToBasketButton).waitUntilClickable().click();

        boolean sravneniePrice = price.equals(find(PriceAnalisiKorzina).getText());
        System.out.println("Значение сравнения прайса " + sravneniePrice);
        boolean sravnenieName = name.equals(find(NamrAnalisiKorzina).getText());
        System.out.println("Значение сравнения названия " + sravneniePrice);

        if (sravneniePrice==sravnenieName)
        {
            System.out.println("Все ок. Стоимость и название в разделе анализы и в корзине совпадают");
        }
        else if (!sravneniePrice)
        {
            System.out.println("Ошибка. Прайс в корзине не равен прайсу в разделе анализы");
            Assertions.assertThat(sravneniePrice)
                    .as("Ошибка. Прайс в корзине " + find(PriceAnalisiKorzina).getText() + " не равен прайсу в разделе анализы " + price).isEqualTo(!sravneniePrice);
        }
        else if (!sravnenieName)
        {
            System.out.println("Ошибка. Наименование анализы в корзине не равен прайсу в разделе анализы");
            Assertions.assertThat(sravnenieName)
                    .as("Ошибка. Наименование анализа в корзине " + find(NamrAnalisiKorzina).getText() + " не равен прайсу в разделе анализы " + name).isEqualTo(!sravnenieName);
        }

    }

    public void VeriFyYdalenieAnalisi(){
        help.
        find(YdalenieAnalisiKorzina).waitUntilClickable().click();
        if(find(YdalenieProverkaAnalisiKorzina).isVisible()){
            System.out.println("Корзина очистилась");
        }
        else {
            assert (false): "Не очистилась корзина";
        }
    }

}
