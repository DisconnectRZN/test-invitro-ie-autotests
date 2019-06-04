package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import java.util.List;
import testpackage.help.Help_Methods;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

public class RecordToTheDoctorPage extends PageObject {
    @Managed(uniqueSession = true, clearCookies=BeforeEachTest)
    private static final Help_Methods help = Help_Methods.getInstance();

    private By RecordToTheDoctorLink = By.xpath("//a[@class='header-nav__link'][contains(text(),'Запись к врачу')]"); //переход на страницу Запись ко врачу
    private By GorodRecordToTheDoctorLink = By.xpath("//span[@class='city__name city__btn city__name--label']"); ////проверка города
    private By ZagolovokRecordToTheDoctorLink = By.xpath("//h1[contains(text(),'Врачи в Москве')]"); //заголовок
    private By KrochkiToTheDoctorLink = By.xpath("//ul[@class='bread-crumbs__list']"); //Проверка отображения хлебных крошек на странице Запись к врачу
    private By BlockMenuToTheDoctorLink = By.xpath("//div[contains(@class,'side-bar__block')]"); //Проверка отображение блока с меню
    private By MenuToTheDoctorLink = By.xpath("//ul[@class='side-bar__list']//a"); //все разделы меню
    private By BlockFiltriToTheDoctorLink = By.xpath("//div[contains(@class,'doctor-filter-block')]"); //Проверка отображения блока с фильтрами
    private By BlockVseVrachiToTheDoctorLink = By.xpath("//div[contains(@data-entity,'items-row')]"); //Проверка отображения блока с врачами
    private By KolToTheDoctorLink = By.xpath("//div[@data-entity='container-1']/div/div/div"); //для подсчета врачей
    private By KolToTheDoctorLinkKart = By.xpath("//div[@class='doctor-list-item']"); //для подсчета врачей в разделах
    private By KolIzobrToTheDoctorLink = By.xpath("//div[@data-entity='container-1']/div/div/div/a/img"); //для подсчета количетсва изображений
    private By KolIzobrToTheDoctorLinkRazdel = By.xpath("//div[@class='doctor-list-item']//img"); //для подсчета количетсва изображений в разделах
    private By StagToTheDoctorLink = By.xpath("//div[@class='doctor-list-item__column']//span[1]"); //для подсчета количетсва надписей Врачебный стаж
    private By StagLetToTheDoctorLink = By.xpath("//div[@class='doctor-list-item__column']//span[2]"); //для подсчета количетсва надписей <количество>год,года,лет
    private By KolVrToTheDoctorLink = By.xpath("//div//span[@class='doctors-item__name']"); //для рандома врачей
    private By KolVrToTheDoctorLinkZapis = By.xpath("//div[@class='doctor-list__inner']//div//div[1]//div[2]//a[1]"); //для рандома врачей с записью
    private By ButtonToTheDoctorLink = By.xpath("//span[contains(text(),'Показать еще')]"); //Проверка отображения кнопки "Показать еще"

    //локаторы для фильтров
    private By FiltrToTheDoctorLink = By.xpath("//button[contains(@class,'doctor-filter__btn')]"); //Кнопка Фильтр
    private By FiltrIconsToTheDoctorLink = By.xpath("//*[contains(@class,'icon icon-icon-filter')]"); //Проверка иконки у фильтра
    private By FiltrOpenToTheDoctorLink = By.xpath("//div[@class='doctor-filter-block doctor-filter-block--open']//div[@class='show-block-wrap']"); //Проверка отображения блока при клике на фильтр

    private By StanMetroFiltrToTheDoctorLink = By.xpath("//div[contains(@class,'row row--start doctor-filter-settings__inputs-row-wrap')]/div[contains(@class,'row row--start')]/span[1]"); //Проверка отображения блока "Станция метро"
    private By PolFiltrToTheDoctorLink = By.xpath("//div[contains(@class,'row row--start doctor-filter-settings__inputs-row-wrap')]/div[contains(@class,'row row--start')]/span[2]"); //Проверка отображения блока "Пол"
    private By VrachDliaDeteiFiltrToTheDoctorLink = By.xpath("//div[contains(@class,'doctor-filter-settings__others')]"); //Проверка отображения чекбокса "Врач для детей"
    private By PervPriemFiltrToTheDoctorLink = By.xpath("//div[contains(@class,'row row--start doctor-filter-settings__inputs-row-wrap')]/span[1]"); //Проверка отображения блока "Первичиный прием"
    private By VrachStagFiltrToTheDoctorLink = By.xpath("//div[contains(@class,'row row--start doctor-filter-settings__inputs-row-wrap')]/span[2]"); //Проверка отображения блока "Врачебный стаж"
    private By Set_filterToTheDoctorLink = By.xpath("//input[@id='set_filter']"); //Проверка отображения кнопки "Показать"
    private By Del_filterToTheDoctorLink = By.xpath("//input[@id='del_filter']"); //Проверка отображения кнопки "Сбросить"

    private By ActiveMenuToTheDoctorLink = By.xpath("//li[@class='side-bar__items side-bar__items--active']/a"); //активный раздел меню
    private By RazdelKroshkiToTheDoctorLink = By.xpath("//ul[@class='bread-crumbs__list']//li[3]//a[1]"); //наименования раздела в хлебных крошках
    private By RazdelKartToTheDoctorLink = By.xpath("//div[@class='doctor-list__inner']/div/div/div[1]/span[1]"); //название специализации в карточке
    //
    //локаторы при раскрытии карточки врача
    //
    private By KartZagolovokToTheDoctorLink = By.xpath("//h1[contains(text(),'')]"); //Проверка отображения заголовка
    private By KartOpisanieToTheDoctorLink = By.xpath("//div[@class='article']"); //Проверка отображения блока описания врача
    private By KartZagolovokYslugiToTheDoctorLink = By.xpath("//div[@class='article article--mb0']//h2[contains(text(),'')]"); //Проверка отображения заголовка "оказываемые услуги"
    private By KartYslugiToTheDoctorLink = By.xpath("//div[@class='article__slider']"); //Проверка отображения перечня оказываеых услуг
    private By Map = By.xpath("//div[@id='map']"); //Карта сайта
    private By KartBlockRightToTheDoctorLink = By.xpath("//div[@class='content__column content__column--info']"); //Проверка отображения блока справа при раскрытии карточки врача
    private By KartImgToTheDoctorLink = By.xpath("//div[@class='content__column content__column--info']/div/img"); //Проверка отображения врача
    private By KartAdressToTheDoctorLink = By.xpath("//div[@class='info-block__inner']/div[1]"); //Проверка отображения блока Адреса приема
    private By KartStagToTheDoctorLink = By.xpath("//div[@class='info-block__inner']/div[2]"); //Проверка отображения блока Врачебный стаж
    private By KartPovtornPriemToTheDoctorLink = By.xpath("//div[@class='info-block__inner']/div[3]"); //Проверка отображения блока Повторный прием
    private By KartPervPriemToTheDoctorLink = By.xpath("//div[@class='info-block__section--total']"); //Проверка отображения блокаа Первичный прием
    //
    //локаторы для проверки функционала записи к врачу
    //
    private By ButtonZapisToTheDoctorLink = By.xpath("//button[@class='btn-icon btn-icon--fill popupBtn ripple doctor']"); //кнопка "Записаться"
    private By FormaZapisaZagolovokToTheDoctorLink = By.xpath("//div[@class='popup-block popup-block--pb70']//div[@class='h2']"); //заголовок Запись к врачу
    private By FormaZapisToTheDoctorLink = By.xpath("//div[@id='popupEnroll']"); //форма Записаться на прием
    private By FormaZapisYslugaLabelToTheDoctorLink = By.xpath("//label[contains(text(),'Услуга')]"); //название радиобатонов
    private By FormaZapisYslugaToTheDoctorLink = By.xpath("//div[@class='form__field form__field--w33']//div//input"); //адиобатоны
    private By FormaZapisDataLabelToTheDoctorLink = By.xpath("//label[contains(text(),'Желаемая дата визита')]"); //название "желаемая дата визита"
    private By FormaZapisDataToTheDoctorLink = By.xpath("//input[@id='datecallback']"); //желаемая дата визита
    private By FormaZapisAdresLabelToTheDoctorLink = By.xpath("//label[contains(text(),'Адрес приема:')]"); //название "Адрес приема"
    private By FormaZapisAdresToTheDoctorLink = By.xpath("//div[@class='adress_of_appoint']"); //адрес
    private By FormaZapisFLabelsToTheDoctorLink = By.xpath("//label[contains(text(),'Фамилия')]"); //
    private By FormaZapisFToTheDoctorLink = By.xpath("//input[@id='enrollSurname']"); //Фамилия
    private By FormaZapisILabelsToTheDoctorLink = By.xpath("//label[contains(text(),'Имя')]"); //
    private By FormaZapisIToTheDoctorLink = By.xpath("//input[@id='enrollName']"); //Имя
    private By FormaZapisOLabelsToTheDoctorLink = By.xpath("//label[contains(text(),'Отчество')]"); //
    private By FormaZapisOToTheDoctorLink = By.xpath("//input[@id='enrollSecondname']"); //Отчество
    private By FormaLabelPhoneZapisToTheDoctorLink = By.xpath("//label[contains(text(),'Телефон')]"); //название поля
    private By FormaZapisPhoneToTheDoctorLink = By.xpath("//input[@id='enrollPhone']"); //поле для ввода телефона
    private By FormaZapisEmailToTheDoctorLink = By.xpath("//input[@id='enrollMail']"); //
    private By FormaZapisInfoToTheDoctorLink = By.xpath("//div[@class='price_cell_in_appoint_popup']"); //форма отображения стоимости
    private By FormaZapisSoglasieToTheDoctorLink = By.xpath("//label[@for='agree_dc_appoint']"); //элемент согласия
    private By FormaZapisCheckboxSoglasieToTheDoctorLink = By.xpath("//label[@for='agree_dc_appoint']//span[@class='checkbox__item']"); //чекбокс согласия
    private By FormaZapisButtonToTheDoctorLink = By.xpath("//button[@class='btn-icon btn-icon--fill ripple js-button-submit']"); //кнопка Записаться на форме

    private By KrochkiVrachiToTheDoctorLink = By.xpath("//span[contains(text(),'Врачи')]"); //для возрата обратно на весь список врачей
    //
    //методы
    //
    public void VeriFyRecordToTheDoctorLink() { //Переход на страницу Запись ко врачу
        if (find(RecordToTheDoctorLink).isVisible()) {
            find(RecordToTheDoctorLink).waitUntilClickable().click();
        } else {
            assert (false):  "Отсуствует раздел меню: ЗАПИСЬ К ВРАЧУ";
        }
    }

    public void VeriFyGorodRecordToTheDoctorLink(){
        //проверка что город не переключился
        String gorod = "Москва";
        String gorod_na_site = find(GorodRecordToTheDoctorLink).getText();
        if (gorod.equals(gorod_na_site)){
            System.out.println("При переходе в раздел не поменялся город");
        }
        else {
            assert (false):  "При переходе в раздел поменялся город";
        }

        //в шапке может остаться москва, но переключится на другой город. будет видно по заголовку
        String zagolovok = "Врачи в Москве";
        String zagolovok_na_site = find(ZagolovokRecordToTheDoctorLink).getText().trim();
        help.getSlow();

        if (zagolovok.equals(zagolovok_na_site)){
            System.out.println("При переходе в раздел указан заголовк для москвы и отображаются данные по москве");
        }
        else {
            assert (false):  "При переходе в раздел отображается заголовок не для москвы. Отображаются данные не для Москвы";
        }
    }

    public void VeriFyKrochkiToTheDoctorLink()  {
        find(KrochkiToTheDoctorLink).isVisible(); } //Проверка отображения хлебных крошек на странице Запись к врачу

    public void VeriFyBlockMenuToTheDoctorLink()  {
        find(BlockMenuToTheDoctorLink).isVisible(); } //Проверка отображение блока с меню

    public void VeriFyBlockFiltriToTheDoctorLink()  {
        find(BlockFiltriToTheDoctorLink).isVisible(); } //Проверка отображения блока с фильтрами

    public void VeriFyBlockVseVrachiToTheDoctorLink()  {
        find(BlockVseVrachiToTheDoctorLink).isVisible(); } //Проверка отображения блока с врачами

    public void VeriFyButtonToTheDoctorLink()  {
        find(ButtonToTheDoctorLink).isVisible(); } //Проверка отображения кнопки "Показать еще"

    //метод прокликивания всех разделов врачей и проверки что не пусто там
    public void VeriFyMassivToTheDoctorLink(){
        List<WebElementFacade> massive = findAll(MenuToTheDoctorLink);

        for (int i = 0; i < massive.size(); i++) {
            massive = findAll(MenuToTheDoctorLink);
            System.out.println(massive.get(i).getAttribute("href"));

            if(find(BlockVseVrachiToTheDoctorLink).isVisible()){
                System.out.println("В разделе: '"+ massive.get(i).getText() + "' отображается хотя бы 1 врач");
            }
            else {
                Assertions.assertThat(find(BlockVseVrachiToTheDoctorLink).isVisible())
                        .as("В разделе: '"+ massive.get(i).getText() + "' нет врачей. раздел не должен отображаться").isEqualTo(!find(BlockVseVrachiToTheDoctorLink).isVisible());
            }
            massive.get(i).click();
        }
    }

    //метод прокликивания всех разделов врачей и проверки отображения краткой карточки
    public void VeriFyMassivToTheDoctorLinkKart() throws InterruptedException {
        List<WebElementFacade> massive2 = findAll(MenuToTheDoctorLink);
        for (int i = 1; i < massive2.size(); i++) {
            massive2 = findAll(MenuToTheDoctorLink);
            System.out.println(massive2.get(i).getAttribute("href"));
            if(find(BlockVseVrachiToTheDoctorLink).isVisible())
            {
                if (find(ButtonToTheDoctorLink).isVisible()) {
                    VeriFyClickToTheDoctorLink();
                }

                List<WebElementFacade> massive = findAll(KolToTheDoctorLinkKart);
                System.out.println(massive);

                for (int ii = 0; ii < massive.size(); ii++) {
                    massive = findAll(KolToTheDoctorLinkKart);
                    boolean sravn = find(KolIzobrToTheDoctorLinkRazdel).isVisible() == find(StagToTheDoctorLink).isVisible() == find(StagLetToTheDoctorLink).isVisible();

                    boolean sravn1 = find(KolIzobrToTheDoctorLinkRazdel).isVisible();
                    boolean sravn2 = find(StagToTheDoctorLink).isVisible();
                    boolean sravn3 = find(StagLetToTheDoctorLink).isVisible();

                    if (sravn)
                        System.out.println("У врача: '" + massive.get(ii).getText() + "' отображается изображение/заглушка, текст 'Врачебный стаж', <количетсво> лет/год/года");
                    else if (!sravn1)
                        Assertions.assertThat(sravn1)
                                .as("У врача: '" + massive.get(ii).getText() + "' не отображается изображение/заглушка").isEqualTo(!sravn1);
                    else if (!sravn2)
                        Assertions.assertThat(sravn2)
                                .as("У врача: '" + massive.get(ii).getText() + "' не отображается текст 'Врачебный стаж").isEqualTo(!sravn2);
                    else if (!sravn3)
                        Assertions.assertThat(sravn3)
                                .as("У врача: '" + massive.get(ii).getText() + "' не отображается <количетсво> лет/год/года").isEqualTo(!sravn3);
                    else
                        break;
                }
            }
            else {
                Assertions.assertThat(find(BlockVseVrachiToTheDoctorLink).isVisible())
                        .as("В разделе: '"+ massive2.get(i).getText() + "' нет врачей. раздел не должен отображаться").isEqualTo(!find(BlockVseVrachiToTheDoctorLink).isVisible());
            }
            massive2.get(i).click();
            Thread.sleep(3000);
        }
    }

    //метод раскрытия всех врачей, нажатием показать еще
    public void VeriFyClickToTheDoctorLink() throws InterruptedException {
        while(find(ButtonToTheDoctorLink).isVisible()){
            Thread.sleep(2000);
            System.out.println(find(ButtonToTheDoctorLink).isVisible());
            Thread.sleep(2000);
            find(ButtonToTheDoctorLink).waitUntilClickable().click();
            Thread.sleep(7000);
        }
    }

    //выбор рандомного раздела и проверки
    public void VeriFyRandomRazdelVrach(){
        List<WebElementFacade> massive = findAll(MenuToTheDoctorLink);
        int count = massive.size();
        System.out.println("количество разделов: " + count);
        int random_number = (int) (Math.random() * count); // Генерация 1-го числа
        System.out.println("случайное число: " + random_number);
        System.out.println(massive.get(random_number).getText());
        massive.get(random_number).click();
    }

   /* public void VeriFyRandomRazdelSr1Vrach(){
        String ActiveMenuToTheDoctorLink2 = find(ActiveMenuToTheDoctorLink).getText().trim();
        String RazdelKartToTheDoctorLink2 = find(RazdelKartToTheDoctorLink).getText().trim();

        boolean sravnenie1 = ActiveMenuToTheDoctorLink2.equals(RazdelKartToTheDoctorLink2);
        if (sravnenie1){
            System.out.println("Раздел в меню и в краткой карточке врача " + find(KolVrToTheDoctorLink).getText() + " совпадают");
        }
        else {
            System.out.println("Не совпадает");
            assert (false ):  "Раздел в меню и в краткой карточке врача " + find(KolVrToTheDoctorLink).getText() + " не совпадают";
        }
    }*/

    public void VeriFyRandomRazdelSr2Vrach(){
        String ActiveMenuToTheDoctorLink2 = find(ActiveMenuToTheDoctorLink).getText().trim();
        String RazdelKroshkiToTheDoctorLink2 = find(RazdelKroshkiToTheDoctorLink).getText().trim();
        boolean sravnenie2 = ActiveMenuToTheDoctorLink2.equals(RazdelKroshkiToTheDoctorLink2);
        if (sravnenie2){
            System.out.println("Раздел в меню и в хлебных крошках в карточке врача совпадают");
        }
        else {
            System.out.println("Не совпадает");
            assert (false ):  "Раздел в меню и в хлебных крошках  в карточке врача не совпадают";
        }
    }


    //выбор рандомного врача для проверки
    public void VeriFyRandomVrach(){
        List<WebElementFacade> massive = findAll(KolVrToTheDoctorLink);
        int count = massive.size();
        System.out.println("количество врачей: " + count);
        int random_number = (int) (Math.random() * count); // Генерация 1-го числа
        System.out.println("случайное число: " + random_number);
        System.out.println(massive.get(random_number).getText());
        massive.get(random_number).click();
    }

    //метод проверки отображения изображений у всех врачей
    public void VeriFyIzobrVrachToTheDoctorLink(){
        List<WebElementFacade> massive = findAll(KolToTheDoctorLink);

        for (int i = 0; i < massive.size(); i++) {
            massive = findAll(KolToTheDoctorLink);
            boolean sravn = find(KolIzobrToTheDoctorLink).isVisible() == find(StagToTheDoctorLink).isVisible() == find(StagLetToTheDoctorLink).isVisible();

            boolean sravn1 = find(KolIzobrToTheDoctorLink).isVisible();
            boolean sravn2 = find(StagToTheDoctorLink).isVisible();
            boolean sravn3 = find(StagLetToTheDoctorLink).isVisible();

            if (sravn)
                System.out.println("У врача: '"+ massive.get(i).getText() + "' отображается изображение/заглушка, текст 'Врачебный стаж', <количетсво> лет/год/года");
            else if (!sravn1)
                Assertions.assertThat(sravn1)
                        .as("У врача: '"+ massive.get(i).getText() + "' не отображается изображение/заглушка").isEqualTo(!sravn1);
            else if (!sravn2)
                Assertions.assertThat(sravn2)
                        .as("У врача: '"+ massive.get(i).getText() + "' не отображается текст 'Врачебный стаж").isEqualTo(!sravn2);
            else if (!sravn3)
                Assertions.assertThat(sravn3)
                        .as("У врача: '"+ massive.get(i).getText() + "' не отображается <количетсво> лет/год/года").isEqualTo(!sravn3);
            else
                break;
        }
    }

    public void VeriFyFiltrIconsToTheDoctorLink(){
        find(FiltrIconsToTheDoctorLink).isVisible(); } ////Проверка иконки у фильтра

    public void VeriFyFiltrToTheDoctorLink(){ //Проверка открытия фильтра
        find(FiltrToTheDoctorLink).waitUntilClickable().click();
        find(FiltrOpenToTheDoctorLink).isVisible();
    }

    public void VeriFyStanMetroFiltrToTheDoctorLink(){
        find(StanMetroFiltrToTheDoctorLink).isVisible(); } //Проверка отображения блока "Станция метро"

    public void VeriFyPolFiltrToTheDoctorLink(){
        find(PolFiltrToTheDoctorLink).isVisible(); } //Проверка отображения блока "Пол"

    public void VeriFyVrachDliaDeteiFiltrToTheDoctorLink(){
        find(VrachDliaDeteiFiltrToTheDoctorLink).isVisible(); } //Проверка отображения чекбокса "Врач для детей"

    public void VeriFyPervPriemFiltrToTheDoctorLink(){
        find(PervPriemFiltrToTheDoctorLink).isVisible(); } ////Проверка отображения блока Первичиный прием

    public void VeriFyVrachStagFiltrToTheDoctorLink(){
        find(VrachStagFiltrToTheDoctorLink).isVisible(); } //Проверка отображения блока Врачебный стаж

    public void VeriFySet_filterToTheDoctorLink(){
        find(Set_filterToTheDoctorLink).isVisible(); } //Проверка отображения кнопки Показать

    public void VeriFyDel_filterToTheDoctorLink(){
        find(Del_filterToTheDoctorLink).isVisible(); } //Проверка отображения кнопки Сбросить
    //
    //методы для проверки карточки врача
    //
    public void VeriFyMapToTheDoctorLink(){ //Проверить отображение карты при раскрытии карточки врача
        find(Map).isVisible();
    }

    public void VeriFyKartZagolovokToTheDoctorLink(){ //Проверка отображения заголовка при ракскрыти карточки врача
        find(KartZagolovokToTheDoctorLink).isVisible(); //Проверка отображения блока описания врача при ракскрыти карточки врача
    }

    public void VeriFyKartOpisanieToTheDoctorLink(){
        find(KartOpisanieToTheDoctorLink).isVisible(); //Проверка отображения блока описания врача при ракскрыти карточки врача
    }

    public void VeriFyKartZagolovokYslugiToTheDoctorLink(){ //Проверка отображения заголовка "оказываемые услуги" при ракскрыти карточки врача
        find(KartZagolovokYslugiToTheDoctorLink).isVisible();
    }

    public void VeriFyKartYslugiToTheDoctorLink(){ //Проверка отображения перечня оказываеых услуг при ракскрыти карточки врача
        find(KartYslugiToTheDoctorLink).isVisible();
    }

    public void VeriFyKartBlockRightToTheDoctorLink(){ //Проверка отображения блока справа при раскрытии карточки врача при ракскрыти карточки врача
        find(KartBlockRightToTheDoctorLink).isVisible();
    }

    public void VeriFyKartImgToTheDoctorLink(){ //Проверка отображения изображения врача при раскрытии карточки врача
        find(KartImgToTheDoctorLink).isVisible();
    }

    public void VeriFyKartAdressToTheDoctorLink(){ //Проверка отображения блока Адреса приема при раскрытии карточки врача
        find(KartAdressToTheDoctorLink).isVisible();
    }

    public void VeriFyKartStagToTheDoctorLink(){ //Проверка отображения блока Врачебный стаж при раскрытии карточки врача
        find(KartStagToTheDoctorLink).isVisible();
    }

    public void VeriFyKartPovtornPriemToTheDoctorLink(){ //Проверка отображения блока Повторный прием при раскрытии карточки врача
        find(KartPovtornPriemToTheDoctorLink).isVisible();
    }

    public void VeriFyKartPervPriemToTheDoctorLink(){ //Проверка отображения блока Первичный прием при раскрытии карточки врача
        find(KartPervPriemToTheDoctorLink).isVisible();
    }

    //метод поиска врача с возможностью записаться на прием
    public void VeriFyPoiskZapisToTheDoctorLink(){
        List<WebElementFacade> massive = findAll(KolVrToTheDoctorLinkZapis);
        massive.get(1).click();
    }

    public void VeriFyFormaZapisToTheDoctorLink(){ //
        find(FormaZapisToTheDoctorLink).isVisible();
    }

    public void VeriFyFormaZapisaZagolovokToTheDoctorLink(){ //
        find(FormaZapisaZagolovokToTheDoctorLink).isVisible();
    }

    public void VeriFyFormaZapisYslugaLabelToTheDoctorLink(){ //
        find(FormaZapisYslugaLabelToTheDoctorLink).isVisible();
        find(FormaZapisYslugaToTheDoctorLink).isVisible();
    }

    public void VeriFyFormaZapisDataLabelToTheDoctorLink(){ //
        find(FormaZapisDataLabelToTheDoctorLink).isVisible();
        find(FormaZapisDataToTheDoctorLink).isVisible();
        //find(FormaZapisDataToTheDoctorLink).sendKeys("12.12.2019");
    }

    public void VeriFyFormaZapisAdresLabelToTheDoctorLink(){ //
        find(FormaZapisAdresLabelToTheDoctorLink).isVisible();
        find(FormaZapisAdresToTheDoctorLink).isVisible();
    }

    public void VeriFyFormaZapisFLabelsToTheDoctorLink(){ //
        find(FormaZapisFLabelsToTheDoctorLink).isVisible();
        find(FormaZapisFToTheDoctorLink).isVisible();
        find(FormaZapisFToTheDoctorLink).sendKeys("Тестовый");
    }

    public void VeriFyFormaZapisILabelsToTheDoctorLink(){ //
        find(FormaZapisILabelsToTheDoctorLink).isVisible();
        find(FormaZapisIToTheDoctorLink).isVisible();
        find(FormaZapisIToTheDoctorLink).sendKeys("Имятест");
    }

    public void VeriFyFormaZapisOLabelsToTheDoctorLink(){ //
        find(FormaZapisOLabelsToTheDoctorLink).isVisible();
        find(FormaZapisOToTheDoctorLink).isVisible();
        find(FormaZapisOToTheDoctorLink).sendKeys("Отчествотест");
    }

    public void VeriFyFormaLabelPhoneZapisToTheDoctorLink(){ //
        find(FormaLabelPhoneZapisToTheDoctorLink).isVisible();
        find(FormaZapisPhoneToTheDoctorLink).isVisible();
        find(FormaZapisPhoneToTheDoctorLink).sendKeys("9998887766");
    }

    public void VeriFyFormaZapisEmailToTheDoctorLink(){ //
        find(FormaZapisEmailToTheDoctorLink).isVisible();
    }

    public void VeriFyFormaZapisInfoToTheDoctorLink(){ //
        find(FormaZapisInfoToTheDoctorLink).isVisible();
    }

    public void VeriFyFormaZapisSoglasieToTheDoctorLink(){ //
        find(FormaZapisSoglasieToTheDoctorLink).isVisible();
        find(FormaZapisCheckboxSoglasieToTheDoctorLink).isVisible();
    }

    public void VeriFyFormaZapisButtonToTheDoctorLink(){ //
        find(FormaZapisButtonToTheDoctorLink).isVisible();
    }

}
