package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import java.util.List;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;
import testpackage.help.Help_Methods;

public class CheckupPage extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();

    @Managed(uniqueSession = true, clearCookies=BeforeEachTest)
    //
    //локаторы для блочной проверки
    //
    private By Checkup = By.xpath("//a[@class='header-nav__link'][contains(text(),'Комплексные обследования')]"); // //Переход на страницу Комплексные обследования
    private By GorodCheckup = By.xpath("//span[@class='city__name city__btn city__name--label']"); // //Проверка города в шапке
    private By KroshkiCheckup = By.xpath("//ul[@class='bread-crumbs__list']"); //Проверка отображения хлебных крошек на странице Комплексные обследования
    private By ZagolovokCheckup = By.xpath("//h1[contains(text(),'')]"); //Проверка отображения заголовка на странице Комплексные обследования
    private By MenuCheckup = By.xpath("//div[@class='side-bar__block']"); //Проверить отображение блока меню в разделе Комплексные обследования
    private By MenuIconsCheckup = By.xpath("//ul[@class='side-bar__list']//img"); //Проверка отображение иконак в менюшке
    private By ImgCheckup = By.xpath("//div[@class='content-header__column-slider']//parent::*/preceding-sibling::*//img"); //Проверить отображение чекапов
    private By BlockRightCheckup = By.xpath("//div[@class='chess-item__row row--wrap']"); //Проверить отображение блока рядом с отображением чекапов
    private By SpisokCheckup = By.xpath("//div[@class='pagination-items']"); //Проверить отображение блока со списоком чекапов
    private By VrachiCheckup = By.xpath("//div[@class='content__row']//div[5]//div[5]"); //Проверить отображение блока с врачами на странице комплексные обследования
    private By BesplZvon = By.xpath("//span[contains(@class,'header-phone__disrcipt')][contains (text(),'Бесплатный звонок по России')]"); // Проверить отображение надписи Бесплатный звонок по России в Хедер меню
    //
    //остальные локаторы
    //
    private By ImgClickCheckup = By.xpath("//div[@class='main-slider__item-inner']//a"); //для клика на изображение
    private By ImgZaglushkaClickCheckup = By.xpath("//ul[@class='slick-dots']//li[2][@class='slick-active']"); //для пропуска клика на заглушку

    private By ErrorCheckup = By.xpath("//div[@class='empty-page']"); //для проверки появления 404 ошибки
    private By ButtonZapisCheckup = By.xpath("//a[@class='btn-icon']"); //кнопка записаться
    private By ButtonZapisCheckupKart = By.xpath("//div[@class='info-block__section--total']//button"); //кнопка записаться при раскрытии чекапа
    //
    //локаторы при нажатии на кнопку "Записаться"
    //
    private By BlockZapisCheckup = By.xpath("//div[@class='popup-block popup-block--pb70']"); //Проверка отображения формы для записи на программу
    private By BlockZapisHCheckup = By.xpath("//div[@class='popup-block popup-block--pb70']//div[@class='h2']"); //Проверка отображения заголовка на форме записи на программу
    private By BlockFIOCheckup = By.xpath("//div[@class='popup-block popup-block--pb70']//input[@id='form_text_21']"); //Поле для ввода ФИО
    private By BlockPhoneCheckup = By.xpath("//div[@class='popup-block popup-block--pb70']//input[@id='form_text_23']"); //Поле для ввода Телефона
    private By BlockEmailCheckup = By.xpath("//div[@class='popup-block popup-block--pb70']//input[@id='form_email_22']"); //Поле для ввода емейла
    private By BlockNazvanieCheckup = By.xpath("//div[@class='popup-block popup-block--pb70']//input[@id='form_text_25']"); //Поле для воода названия комплекса
    private By BlockKommentCheckup = By.xpath("//div[@class='popup-block popup-block--pb70']//textarea[@id='form_textarea_26']"); //Поле для ввода комментария
    private By BlockZapisButtonCheckup = By.xpath("//div[@class='popup-block popup-block--pb70']//input[@type='submit']"); //Проверка наличия кнопки
    //
    //локаторы при просмотре чекапа
    //
    private By VseCheckup = By.xpath("//div[@class='pagination-items']//div//div//div//div[1]//a"); //все чекапы
    private By InfBlockCheckupKart = By.xpath("//div[@class='article__slider']"); //информационный блок чекапа
    private By BlockZapicCheckupKart = By.xpath("//div[@class='info-block__inner']"); //Блок подписи
    private By BlockVrachiCheckupKart = By.xpath("//section[@class='side-slider side-slider--doctors side-slider--blocks show-block side-slider--blocks-sm show-block--active']"); //блок с врачами
    private By VkladkiCheckup = By.xpath("//ul[@class='slick-dots']"); //
    //
    //локаторы для проверки что разделы не пустые
    //
    private By MenuCheckupUp = By.xpath("//span[@class='side-bar__link side-bar__link--icon side-bar__link--second']"); //для нажатия по Check-up и раскрытия меню\
    private By MenuRaskritoCheckupUp = By.xpath("//div[@class='side-bar-second']"); //для проверки что меню Check-up раскрыто
    private By MenuKrochkiCheckupUp = By.xpath("//ul[@class='bread-crumbs__list']//li[3]//a[1]"); //название раздела в хлебный крошках
    private By MenuActivCheckupUp = By.xpath("//li[contains(@class,'side-bar-second__items side-bar__items--active')]//a"); //название активного раздела меню
    private By MenuActivDiabetCheckupUp = By.xpath("//li[@class='side-bar__items side-bar__items--active']"); //актив для диабета под контролем
    private By MenuVseCheckup = By.xpath("//ul[@class='side-bar-second__list']//li//a"); //все разделы меню при нажатии на Check-up
    private By Menu2Checkup = By.xpath("//ul[@class='side-bar__list']/li[2]"); //нажатие на "Диабет под контролем"
    //
    //методы
    //
    public void VeriFyCheckup()  { //Переход на страницу Комплексные обследования
        if (find(Checkup).isVisible()) {
            find(Checkup).waitUntilClickable().click();
        } else {
            assert (false):  "Отсуствует раздел меню: Комплексные обследования";
        }
    }

    public void VeriFyGorodCheckup(){
        //проверка что город не переключился
        String gorod = "Москва";
        String gorod_na_site = find(GorodCheckup).getText();
        if (gorod.equals(gorod_na_site)){
            System.out.println("При переходе в раздел не поменялся город");
        }
        else {
            assert (false):  "При переходе в раздел поменялся город";
        }
    }

    public void VeriFyBesplatnZvon(){
        if (find(BesplZvon).isVisible()){
            System.out.println("Элемент отображается");
        }
        else {
            assert (false):  "Элемент НЕ отображается";
        }
    }

    public void VeriFyKroshkiCheckup()  {
        find(KroshkiCheckup).isVisible(); } //Проверка отображения хлебных крошек на странице Комплексные обследования

    public void VeriFyZagolovokCheckup()  {
        find(ZagolovokCheckup).isVisible(); } //Проверка отображения заголовка на странице Комплексные обследования

    public void VeriFyMenuCheckup()  {
        find(MenuCheckup).isVisible(); } ///Проверить отображение блока меню в разделе Комплексные обследования

    public void VeriFyMenuIconsCheckup()  {
        find(MenuIconsCheckup).isVisible(); } ///Проверить отображение иконок в блоке меню в разделе Комплексные обследования

    public void VeriFyImgCheckup()  {
        boolean sravn = find(ImgCheckup).isVisible();
        if (sravn) {
            System.out.println("отображаются банеры");
        } else {
            assert (false) : "Нет банеров на странице";
        }
    } //Проверить отображение чекапов

    public void VeriFyBlockRightCheckup()  {
        find(BlockRightCheckup).isVisible(); } //Проверить отображение блока рядом с отображением чекапов

    public void VeriFySpisokCheckup()  {//Проверить отображение блока со списоком чекапов
        boolean sravn = find(SpisokCheckup).isVisible();
        if (sravn) {
            System.out.println("отображается список чекапов");
        } else {
            assert (false) : "Нет чекапов на странице";
        }

    }

    public void VeriFyVrachiCheckup()  {
        find(VrachiCheckup).isVisible(); } //Проверить отображение блока с врачами на странице комплексные обследования

    //метод проверки появления 404 ошибки при нажатии на банер
    public void VeriFyImgClickCheckup() throws InterruptedException {
        VeriFyImgCheckup();
        while (!find(ImgZaglushkaClickCheckup).isVisible()){
            Thread.sleep(1000);
        }
        find(ImgClickCheckup).click();
        boolean er= find(ErrorCheckup).isVisible();
        if(er){
            Assertions.assertThat(er)
                    .as("Ошибка 404 при нажатии на изображение").isEqualTo(er);
        }
        else{
            System.out.println("нету ошибки при переходе");
        }
    }

    //выбор рандомного анализа для клика на "Записаться"
    public void VeriFyButtonZapisCheckup(){
        List<WebElementFacade> massive = findAll(ButtonZapisCheckup);
        int count = massive.size();
        System.out.println("количество комплексных обслежований: " + count);
        int random_number = (int) (Math.random() * count); // Генерация 1-го числа
        System.out.println("случайное число: " + random_number);
        System.out.println(massive.get(random_number).getText());
        massive.get(random_number).click();
    }

    public void VeriFyButtonZapisCheckupKart(){
        find(ButtonZapisCheckupKart).waitUntilClickable().click();
    }

    //для проверки, когда поля не заполнены
    public void VeriFyBlockZapisButtonClickCheckup(){
        find(BlockZapisButtonCheckup).waitUntilClickable().click();
        boolean sravn = find(BlockZapisCheckup).isVisible();
        if(sravn){
            System.out.println("Нельзя записаться, если не заполнены обязательные поля. Ограничение сработало");
        }
        else{
            assert (false ):  "Были не заполнены обязательные поля, но можно было записаться";
        }
    }

    //Проверка отображения формы для записи на программу
    public void VeriFyBlockZapisCheckup()  {
        boolean a = find(BlockZapisCheckup).isVisible();
        if(a){
            System.out.println("Кнопка записаться работает, форма открылась");
        }
        else{
            assert (false ):  "Не работает кнопка записаться у чекапа";
        }
    }

    public void VeriFyBlockZapisHCheckup()  {
        find(BlockZapisHCheckup).isVisible(); } //

    public void VeriFyBlockFIOCheckup()  {// Заполнение ФИО
        find(BlockFIOCheckup).isVisible();
        find(BlockFIOCheckup).sendKeys("Тестирование Тест Тестович");
    }

    public void VeriFyBlockEmailCheckup()  {// Заполнение Телефона
        find(BlockEmailCheckup).isVisible();
        find(BlockEmailCheckup).sendKeys("test@mail.ru");
    }

    public void VeriFyBlockBlockNazvanieCheckup()  {// Заполнение названия комплекса
        find(BlockNazvanieCheckup).isVisible();
        find(BlockNazvanieCheckup).sendKeys("тест123456");
    }

    public void VeriFyBlockKommentCheckup()  {// Заполнение комментария
        find(BlockKommentCheckup).isVisible();
        find(BlockKommentCheckup).sendKeys("тестовый комментарий");
    }

    public void VeriFyBlockPhoneCheckup()  {// Заполнение телефона
        find(BlockPhoneCheckup).isVisible();
        find(BlockPhoneCheckup).sendKeys("9998887766");
    }

    public void VeriFyBlockZapisButtonCheckup()  {// Проверка отображения кнопки записать на форме записи
        find(BlockZapisButtonCheckup).isVisible();

    }
    //
    //методы проверки при просмотре чекапа
    //
    //Выбор рандомного чекапа
    public void VeriFyRandomCheckup(){
        List<WebElementFacade> massive = findAll(VseCheckup);
        int count = massive.size();
        System.out.println("количество чекапов: " + count);
        int random_number = (int) (Math.random() * count); // Генерация 1-го числа
        System.out.println("случайное число: " + random_number);
        System.out.println(massive.get(random_number).getText());
        massive.get(random_number).click();
    }

    public void VeriFyInfBlockCheckupKart()  {
        find(InfBlockCheckupKart).isVisible(); } //Проверка отображения информационного блока при раскрытии чекапа

    public void VeriFyBlockZapicCheckupKart()  {
        find(BlockZapicCheckupKart).isVisible(); } //Проверка отображения блока записи при раскрытии чекапа

    public void VeriFyBlockVrachiCheckupKart()  {
        find(BlockVrachiCheckupKart).isVisible(); } //Проверка отображения блока с врачами при раскрытии чекапа

    public void VeriFyVkladkiCheckup()  {
        find(VkladkiCheckup).isVisible(); } //Проверка отображения вкладок Какие проблемы решает, Консультации специалистов, Состав комплекса


    //метод проверки разделов, что там не пусто
    public void VseRazdelCheckup()  {
        List<WebElementFacade> massive = findAll(MenuVseCheckup);
        for (int i = 0; i < massive.size(); i++) {
            massive = findAll(MenuVseCheckup);
            System.out.println(massive.get(i).getAttribute("href"));

            if(find(SpisokCheckup).isVisible()){
                System.out.println("отображается хотя бы 1 чекап");
            }
            else {
                Assertions.assertThat(find(SpisokCheckup).isVisible())
                        .as("В разделе: '"+ massive.get(i).getText() + "' нет чекапов. раздел не должен отображаться").isEqualTo(!find(SpisokCheckup).isVisible());
            }
            massive.get(i).click();
        }
        find(Menu2Checkup).waitUntilClickable().click();
        if(find(SpisokCheckup).isVisible()){
            System.out.println("отображается хотя бы 1 чекап");
        }
        else {
            Assertions.assertThat(find(SpisokCheckup).isVisible())
                    .as("В разделе: '"+ find(Menu2Checkup).getText() + "' нет чекапов. раздел не должен отображаться").isEqualTo(!find(SpisokCheckup).isVisible());
        }
    }

    public void MenuCheckup(){
        String a = find(MenuKrochkiCheckupUp).getText().trim();
        String b = "Диабет под контролем";
        boolean c = a.equals(b);

        if (c){
            System.out.println("проверка для раздела Диабет под контролем");
            boolean sravnenie2 =  find(MenuActivDiabetCheckupUp).isVisible();
            if (sravnenie2){
                System.out.println("Все ок. Подсвечивается раздел при раскрытии чекапа: " + find(ZagolovokCheckup).getText());
            }
            else {
                Assertions.assertThat(sravnenie2)
                        .as("Нет подсветки у раздела при раскрытии чекапа: " + find(ZagolovokCheckup).getText()).isEqualTo(!sravnenie2);
            }
        }
        else {
            System.out.println("подходит чекап");
            boolean sravnenie1 =  find(MenuActivCheckupUp).isVisible();
            if (sravnenie1){
                System.out.println("Все ок. Подсвечивается раздел при раскрытии чекапа: " + find(ZagolovokCheckup).getText());
            }
            else {
                Assertions.assertThat(sravnenie1)
                        .as("Нет подсветки у раздела при раскрытии чекапа: " + find(ZagolovokCheckup).getText()).isEqualTo(!sravnenie1);
            }
            String MKCU = find(MenuKrochkiCheckupUp).getText();
            String subStr = MKCU.substring(9, 19);
            System.out.println("Название в хлебных крошках " +subStr);
            String MACU = find(MenuActivCheckupUp).getText();
            System.out.println("Название в активном меню " + MACU);

            boolean sravnenie3 =  subStr.equalsIgnoreCase(MACU);
            System.out.println(sravnenie3);

            if (sravnenie3){
                System.out.println("Все ок. Наименование раздела из меню соответствует наименованию раздела в хлебных крошках");
            }
            else {
                Assertions.assertThat(sravnenie3)
                        .as("Неверно подсвечивается раздел у чекапа: " + find(ZagolovokCheckup).getText()).isEqualTo(!sravnenie3);
            }
        }
    }
}
