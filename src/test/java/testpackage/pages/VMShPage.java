package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;
import java.util.List;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

public class VMShPage extends PageObject {

    @Managed(uniqueSession = true, clearCookies=BeforeEachTest)
    private static final Help_Methods help = Help_Methods.getInstance();

    //локаторы для блочной проверки

    private By VrachamLink = By.xpath("//ul[@class='header-top-nav']//li[2]"); // Ссылка в шапке сайта на раздел Врачам
    private By VMShLink = By.xpath("//div[@class='header-bottom']//li[4]"); // Ссылка на ВМШ
    private By KroshkiVMSh = By.xpath("//div[@class='bread-crumbs']"); // Проверяем наличие хлебных крошек на странице ВМШ
    private By VMShName = By.xpath("//h1[contains(text(),'')]"); // Проверяем наличие заголовка на странице ВМШ
    private By BlockMenu = By.xpath("//div[@class='side-bar side-bar--inner']//div[@class='side-bar__box']"); // Проверка отображения блока меню
    //private By Banner = By.xpath("//div//a[@class='main-slider__img-wrap']//img"); // Проверка баннера
    private By Shahmat = By.xpath("//div[@class='content-header__column-chess']"); // Проверка видимости блока "шахматы"
    private By SpisokKursov = By.xpath("//div[@data-entity='items-row']"); // Проверка блока со списком курсов
    private By KnopkaPokazat = By.xpath("//div[@class='doctor-list__footer result-list__wrap--pagination']"); //Проверка наличия кнопки Показать еще
    private By ClickButtonPokazat = By.xpath("//div[contains(@class,'btn-icon btn-icon--fill ripple')]"); //Проверка нажатия на кнопку "Показать еще"
    private By AllCourses = By.xpath("//div[@class='result-item__col result-item__col--lg']//a"); // Проверка списка всех курсов по заголовкам на странице ВМШ
    private By BlockDoc = By.xpath("//div[@class='show-block-wrap']/section"); // Проверка блока с врачами на главной странице ВМШ


    private By DetailCoursesPageName = By.xpath("//body/div[contains(@class,'container-content show')]/div/div[2]"); // Проверка заголовка на детальной странице курса
    private By DetailCoursesPage = By.xpath("//div[@class='content__column--base']//div"); // Проверка блока с основной информацией по курсу
    private By DetailCoursesPageBlock = By.xpath("//body/div[contains(@class,'container-content show')]/div/div[2]"); // Проверка наличия блока справа с телефонами и кнопкой Записаться
    private By DetailCoursesButtonZapis = By.xpath("//a[@class='btn-icon btn-icon--fill popupBtn ripple']"); // Проверка кнопки Записаться на детальной странице курса
    private By TelefonZapis1 = By.xpath("//a[@class='content__phone'][1]"); //Проверка кликабельности первого номера телефона в блоке справа
    private By TelefonZapis2 = By.xpath("//a[@class='content__phone'][2]"); //Проверка кликабельности второго номера телефона в блоке справа


    private By AdditionalInfo = By.xpath("//div[@class='article article--inner article--no-mb']"); // Проверка блока с дополнительной информацией
    private By Map = By.xpath("//div[@class='map-block show-block']"); //Проверка наличия карты

    //меню

    private By KursiVrachVMShPage = By.xpath("//div[@style='display: block;']//ul//li/a"); // Проверка развернутого меню Курсов для врачей
    private By KursiVrachVMShPage1 = By.xpath(" //li[@class='side-bar-second__items side-bar__items--active']//li[1]//a"); // для клика в первый раздел меню
    private By BlockKursovVMShPage = By.xpath("//div[contains(@class,'pagination-items')]"); // Блок курсов внутри раздела
    private By KursiSistersVMShPage = By.xpath("//ul[@class='side-bar-second__list']//li[2][@class='side-bar-second__items']//a"); // Проверка меню Курсы для медицинских сестер
    private By KursiSistersVMShPage2 = By.xpath("//ul[@class='side-bar-second__list']//li[2]//div[1]//ul[1]//a"); //
    private By KursiDiagnosticVMShPage = By.xpath("//ul[@class='side-bar-second__list']/li[3]"); // Проверка меню Курсы по лабораторной диагностике
    private By KursiZdravoohrVMShPage = By.xpath("//ul[@class='side-bar-second__list']/li[4]"); // Проверка меню курсов по организации здравоохранения

    //локаторы, используемые при нажатии на кнопку "Записаться"

    private By ButtonZapisKursi = By.xpath("//div[@class='pagination-items']//div[1]//div[1]//div[1]//div[2]//a[1]//span[1]"); //кнопка Записаться

    private By FormaZapisKursi = By.xpath("//div[@class='popup-block popup-block--pb70']"); //Проверка отображения формы для записи на курсы
    private By NameZapisKursi = By.xpath("//h2[contains(text(),'Записаться на обучение')]"); //Проверка отображения заголовка на форме записи на курсы
    private By BlockFIOKursi = By.xpath("//input[@id='form_text_4']"); //Поле для ввода ФИО
    private By BlockPhoneKursi = By.xpath("//input[@id='form_text_5']"); //Поле для ввода Телефона
    private By BlockEmaiKursi = By.xpath("//input[@id='form_email_6']"); //Поле для ввода емейла
    private By BlockNazvanieKursi = By.xpath("//input[@id='form_text_7']"); //Поле для ввода темы курса
    private By BlockKommentKursi = By.xpath("//div[@class='form__field form__field--w66']//textarea[@id='form_textarea_8']"); //Поле для ввода комментария
    private By BlockUploadFailKursi = By.xpath("//span[contains(text(), 'Прикрепить файл')]"); //Возможность добавления файла
    private By BlockZapisButtonKursi = By.xpath("//div[@class='popup-block popup-block--pb70']//input[@type='submit']"); //Проверка наличия кнопки
    private By BlockZapisButtonValidaciaKursi = By.xpath("//div[@class='form__field form__field--w33 _error']"); //Если нажата кнопка Записаться, а поля не заполнены

    public void VeriFyClickVrachamLink() {// Клик Ссылка в шапке сайта на раздел Врачам
      find(VrachamLink).waitUntilClickable().click();
      help.getSlow();
    }

    public void сlickVMShLink() {// Клик Ссылка в шапке сайта на раздел Высшая медицинская школа
        find(VMShLink).waitUntilClickable().click();
        help.getSlow();
    }

    public void visiblekroshkivmsh() { //Проверить наличие хлебных крошек на странице ВМШ
        find(KroshkiVMSh).isVisible();}

    public void visiblevmshname() { //Проверяем наличие заголовка на странице ВМШ
        find(VMShName).isVisible();}

    public void visibleBlockMenu() { //Проверка отображения блока меню
        find(BlockMenu).isVisible();}

    public void visibleShahmat() { //Проверка видимости блока "шахматы"
        find(Shahmat).isVisible();}

    public void visibleSpisokKursov() { //Проверка блока со списком курсов
        find(SpisokKursov).isVisible();}

    public void visibleKnopkaPokazat() { //Проверка видимости кнопки Показать еще
        find(KnopkaPokazat).isVisible();}

    //метод раскрытия всех курсов, нажатием Показать еще
    public void VeriFyClickButtonPokazat(){
        while(find(ClickButtonPokazat).isVisible()){
            find(ClickButtonPokazat).waitUntilClickable().waitUntilVisible().click();
        }
    }

    public void visibleBlockDoc() { //Проверка блока с врачами на главной странице ВМШ
        find(BlockDoc).isVisible();}

    //выбор рандомного курса
    public void VeriFyRandomCourses(){
        help.getSlow();
        List<WebElementFacade> massive = findAll(AllCourses);
        help.getSlow();
        int count = massive.size();
        System.out.println("количество курсов: " + count);
        int random_number = (int) (Math.random() * count); // Генерация 1-го числа
        System.out.println("случайное число: " + random_number);
        System.out.println(massive.get(random_number).getText());
        massive.get(random_number).click();
        help.getSlow();
    }
 //Проверка детальной страницы курса

    public void visibleDetailCoursesPageName() { //Проверяем наличие заголовка на детальной странице курса
        find(DetailCoursesPageName).isVisible();}

    public void visibleDetailCoursesPage() { //Проверка блока с основной информацией по курсу
        find(DetailCoursesPage).isVisible();}

    public void visibleDetailCoursesPageBlock() { //Проверка наличия блока справа с телефонами и кнопкой Записаться
        find(DetailCoursesPageBlock).isVisible();}

    public void ClickDetailCoursesButtonZapis(){ //Нажатие на кнопку Записаться
        find(DetailCoursesButtonZapis).waitUntilClickable().click();
    }

    public void vizibleTelefonZapis1(){ //Проверка наличия первого номера телефона в блоке справа
        find(TelefonZapis1).isVisible();
    }


    public void vizibleTelefonZapis2(){ //Проверка наличия второго номера телефона в блоке справа
        find(TelefonZapis2).isVisible();
    }




    public void visibleAdditionalInfo() { //Проверка блока с дополнительной информацией
        find(AdditionalInfo).isVisible();}

    public void visibleMap() { //Проверка наличия карты
        find(Map).isVisible();}


    //метод прокликивания всех курсов для врачей и проверки что там не пусто
    public void VeriFyMenuVMShPage() throws InterruptedException {
        help.getSlow();
        List<WebElementFacade> massive = findAll(KursiVrachVMShPage);
        help.getSlow();
        find(KursiVrachVMShPage1).click();
        for (int i = 0; i < massive.size(); i++) {
            help.getSlow();
            massive = findAll(KursiVrachVMShPage);
            Thread.sleep(3000);
            System.out.println(massive.get(i).getAttribute("href"));
            Thread.sleep(3000);
            if(find(BlockKursovVMShPage).isVisible()){
                System.out.println("отображается хотя бы 1 курс");
            }
            else {
                Assertions.assertThat(find(BlockKursovVMShPage).isVisible())
                        .as("В разделе: '"+ massive.get(i).getText() + "' нет курсов. раздел не должен отображаться").isEqualTo(!find(BlockKursovVMShPage).isVisible());
            }
            help.getSlow();
            massive.get(i).click();
        }
    }

    //метод проверки меню курсов для медицинских сестер, что там не пусто
    public void BlockKursiSistersVMShPage() {
        find(KursiSistersVMShPage).waitUntilClickable().click();
        List<WebElementFacade> massive = findAll(KursiSistersVMShPage2);
        for (int i = 0; i < massive.size(); i++) {
            massive = findAll(KursiSistersVMShPage2);
            System.out.println(massive.get(i).getAttribute("href"));

            if(find(SpisokKursov).isVisible()){
                System.out.println("отображается хотя бы 1 курс");
            }
            else {
                Assertions.assertThat(find(SpisokKursov).isVisible())
                        .as("В разделе: '"+ massive.get(i).getText() + "' нет курсов. Раздел не должен отображаться").isEqualTo(!find(SpisokKursov).isVisible());
            }
            massive.get(i).click();
        }

        find(KursiDiagnosticVMShPage).waitUntilClickable().click();
        if(find(SpisokKursov).isVisible()){
            System.out.println("отображается хотя бы 1 курс");
        }
        else {
            Assertions.assertThat(find(SpisokKursov).isVisible())
                    .as("В разделе: '"+ find(KursiDiagnosticVMShPage).getText() + "' нет курсов. Раздел не должен отображаться").isEqualTo(!find(SpisokKursov).isVisible());
        }
    }

    //метод проверки наличия курсов по лабораторной диагностике
    public void VeriFyMenuDiagnostic(){
            find(KursiDiagnosticVMShPage).waitUntilClickable().click();

        if(find(SpisokKursov).isVisible()){
                System.out.println("отображается хотя бы 1 курс");
            }
            else{
                Assertions.assertThat(find(SpisokKursov).isVisible())
                        .as("В разделе: '"+ find(KursiDiagnosticVMShPage).getText() + "' нет курсов. Раздел не должен отображаться").isEqualTo(!find(SpisokKursov).isVisible());

            }
        }

    //метод проверки наличия курсов по организации здравоохранения
    public void VeriFyMenuZdravoohr(){
        find(KursiZdravoohrVMShPage).waitUntilClickable().click();

        if(find(SpisokKursov).isVisible()){
            System.out.println("отображается хотя бы 1 курс");
        }
        else{
            Assertions.assertThat(find(SpisokKursov).isVisible())
                    .as("В разделе: '"+ find(KursiZdravoohrVMShPage).getText() + "' нет курсов. Раздел не должен отображаться").isEqualTo(!find(SpisokKursov).isVisible());

        }
    }

    public void VeriFyButtonZapisKursi(){
        help.getSlow();
        find(ButtonZapisKursi).waitUntilClickable().click();
    }

    //для проверки, когда поля не заполнены и нажата кнопка Записаться
    public void VeriFyBlockZapisButtonClickKursi(){
        find(BlockZapisButtonKursi).waitUntilClickable().click();

        if(find(BlockZapisButtonValidaciaKursi).getAttribute("class").contains("form__field form__field--w33 _error")){
            System.out.println("Нельзя записаться, если не заполнены обязательные поля");
        }
        else{
            Assertions.assertThat(find(BlockZapisButtonValidaciaKursi).isVisible())
                    .as("Обязательные поля не заполнены, но можно было записаться").isEqualTo(find(BlockZapisButtonValidaciaKursi).isVisible());

        }
    }

    public void VeriFyFormaZapisKursi()  {
        find(FormaZapisKursi).isVisible(); } //Проверка отображения формы для записи на программу

    public void VeriFyNameZapisKursi()  {
        find(NameZapisKursi).isVisible(); } //Проверка отображения заголовка на форме записи на курсы

    public void VeriFyBlockFIOKursi()  {// Заполнение ФИО
        find(BlockFIOKursi).isVisible();
        find(BlockFIOKursi).sendKeys("Тестовая Тестер Тестировна");
    }

    public void VeriFyBlockPhoneKursi()  {// Заполнение телефона
        find(BlockPhoneKursi).isVisible();
        find(BlockPhoneKursi).sendKeys("1231231212");
    }

    public void VeriFyBlockEmailKursi()  {// Заполнение емэйла
        find(BlockEmaiKursi).isVisible();
        find(BlockEmaiKursi).sendKeys("test132@mail.ru");
    }

    public void VeriFyBlockBlockNazvanieKursi()  {// Заполнение названия курса
        find(BlockNazvanieKursi).isVisible();
        find(BlockNazvanieKursi).sendKeys("тест123456");
    }

    public void VeriFyBlockKommentKursi()  {// Заполнение комментария
        find(BlockKommentKursi).isVisible();
        find(BlockKommentKursi).sendKeys("тестовый комментарий");
    }
    public void visibleBlockUploadFailKursi() {// Возможность добавления файла
        help.Check_Visible_Element(BlockUploadFailKursi);}

    public void VeriFyBlockZapisButtonKursi()  {// Проверка отображения кнопки записать на форме записи
        find(BlockZapisButtonKursi).isVisible();
    }

    }









