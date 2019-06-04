package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;
import testpackage.help.Help_Methods;

import java.util.List;

public class Medical_Service_Page extends PageObject {

    @Managed(uniqueSession = true, clearCookies=BeforeEachTest)

    private static final Help_Methods help = Help_Methods.getInstance();

    private By Med_Serv_Btn = By.xpath("//a[@class='header-nav__link'][text() = 'Медицинские услуги']");
    private By Bread = By.xpath("//div[@class='bread-crumbs']");
    private By Head = By.xpath("//h1");
    private By List_Serv = By.xpath("//ul[@class='side-bar-second__list']/li/a");
    private By Other_List = By.xpath("//div[@class='side-bar__block']");
    private By Image_Disc = By.xpath("//img[@class='icon icon-icon-side-discription']");
    private By Discription_Tip = By.xpath("//span[contains(text(),'Cтоимость анализов указана')]");
    private By Button_Show_More = By.xpath("//span[contains(text(),'Показать еще')]");
    private By Up_Btn = By.xpath("//span[@class='up-button__text']");
    private By Slider = By.xpath("//div[@class='main-slider__item-inner']");
    private By Chees = By.xpath("//div[@class='chess-item__row row--wrap']");
    private By Med_Serv_List = By.xpath("//div[@class='pagination-items']");



    // Локаторы для проверки услуг в городах и наличия/отсутствия сообщения "В данном городе услуга не предоставляется"
    private By CityField = By.xpath("//input[@id='change-city-search-input']"); // Поле для ввода города
    private By CityFieldSecond = By.xpath("//div[@id='eac-container-change-city-search-input']"); // Выбор найденного города Нальчик
    private By LetterN = By.xpath("//div[@class='change-city-nav']//div[14]"); // Выбор города на букву Н
    private By CityNal = By.xpath("//a[contains(text(),'Нальчик')]"); // Выбор Нальчика из списка
    private By Mini_List_Serv = By.xpath("//div[@style='display: block;']//ul//li/a"); // Развернутый список услуг в меню слева
    private By Densitom = By.xpath("//li[@class='side-bar-second__items'][4]"); // Выбор услуги Денситометрия
    private By WithoutServ = By.xpath("//section[@data-section='main']"); //Проверка наличия надписи о непредоставлении услуги в данном городе

    public void Verify_Med_Serv_Button (){//Проверка, что кнопка Мед услуги присутствует
        Assertions.assertThat(find(Med_Serv_Btn).isVisible());
    }

    public void Press_Med_Serv_Button() {//Клик на кнопку Мед услуги
        find(Med_Serv_Btn).waitUntilClickable().click();
    }

    public void Verify_Bread_Crum (){//Проверка, что кнопка Хлебные крошки присутствуют
        Assertions.assertThat(find(Bread).isVisible());
    }

    public void Check_Header(){// Проверка наличия хэдера на Мед услугах
        Assertions.assertThat(find(Head).isVisible());
    }

    public void Check_Serv_List(){// Проверка наличия списка кнопок Мед услуг
        Assertions.assertThat(find(List_Serv).isVisible());
    }

    public void Check_Other_List(){// Проверка наличия списка под кнопками Мед услуг
        Assertions.assertThat(find(Other_List).isVisible());
    }

    public void Check_Img_Disc(){// Проверка наличия картинки для подсказки
        Assertions.assertThat(find(Image_Disc).isVisible());
    }

    public void Check_Disc(){// Проверка наличия отображения элемента подсказки под списком
        Assertions.assertThat(find(Discription_Tip).isVisible());
    }

    public void Check_Text_Disc(){// Проверка наличия соответствия текста подсказки
        Assertions.assertThat(find(Discription_Tip).getText()).isEqualTo("Cтоимость анализов указана без учета взятия биоматериала");
    }

    public void Check_Button_Show_More(){// Проверка наличия кнопки Показать ещё
        Assertions.assertThat(find(Button_Show_More).isVisible());
    }//div[@class='change-city-nav']//div[14]

    public void Check_Up_Btn(){// Проверка наличия ссылки Наверх
        Assertions.assertThat(find(Up_Btn).isVisible());
    }

    public void Check_Slider(){// Проверка наличия Слайдера
        Assertions.assertThat(find(Slider).isVisible());
    }

    public void Check_Chees(){// Проверка наличия Шахматки http://prntscr.com/lwdbrc
        Assertions.assertThat(find(Chees).isVisible());
    }

    public void Check_Med_Serv_List(){// Проверка наличия списка Мед услуг
        Assertions.assertThat(find(Med_Serv_List).isVisible());
    }


    // Методы для проверки услуг в городах и наличия/отсутствия сообщения "В данном городе услуга не предоставляется"

    public void enterCityNal() { //ввод названия города Нальчик

        help.Enter_Text(CityField,"Нальчик");

    }

    public void clickLetterN() {//Клик на букву Н
        find(LetterN).waitUntilClickable().click();
    }

    public void clickCityNal() {// Выбор города Нальчик из списка
        find(CityNal).waitUntilClickable().click();
    }

    //метод прокликивания списка услуг и проверки что там не пусто

    public void verifyList_Serv() {
        List<WebElementFacade> massive = findAll(List_Serv);
        for (int i = 0; i < massive.size(); i++) {
            massive = findAll(List_Serv);
            System.out.println(massive.get(i).getText());
            massive.get(i).click();
            boolean inServ = find(Mini_List_Serv).isVisible();
            if (inServ) {
                System.out.println("Если значение переменной равно - " + inServ
                        + ", то значит раздел имеет вложенный список услуг.");
                List<WebElementFacade> massMini = findAll(Mini_List_Serv);
                for (int a = 0; a < massMini.size(); a++) {
                    massMini = findAll(Mini_List_Serv);
                    System.out.println("Вложенный список имеет следующие значения: " + massMini.get(a).getText() + ".");

                    boolean showUsl = find(Med_Serv_List).isVisible();
                    if (showUsl) {
                        System.out.println("Учитывая, что значение переменной showServs " + showUsl + ". В разделе " + massMini.get(a).getText() + ", отображаются услуги");
                    } else {
                        Assertions.assertThat(find(Med_Serv_List).isVisible())
                                .as("В разделе: '" + massive.get(i).getText() + "' нет услуг.").isEqualTo(!find(Med_Serv_List).isVisible());
                    }
                    massMini.get(a).click();
                }
            } else {
                System.out.println("Если значение переменной равно - " + inServ
                        + ", то значит раздел не имеет вложенного списка услуг.");
            }
        }
    }


        public void VerifyHeadServ(){ //Проверка заголовка Медицинские услуги в Нальчике
            Assertions.assertThat(find(Head).getText().trim()).isEqualTo("Медицинские услуги в Москве");
        }

        public void VerifyHeadServ2(){ //Проверка заголовка Медицинские услуги в Москве
            Assertions.assertThat(find(Head).getText().trim()).isEqualTo("Медицинские услуги в Нальчике"); }

    public void clickDensitom() {// Выбор услуги Денситометрия из списка
        find(Densitom).waitUntilClickable().click();
    }

    public void VerifyWithoutServ(){ //Проверка наличия надписи о непредоставлении услуги в данном городе
        Assertions.assertThat(find(WithoutServ).getText().trim()).isEqualTo("В данном городе услуга не предоставляется"); }

        
       /* List<WebElementFacade> massive = findAll(List_Serv);
        for(int i = 0; i < massive.size(); i++){
            massive = findAll(List_Serv);
            System.out.println(massive.get(i).getText());
            massive.get(i).click();
            boolean inUsl = find(Mini_List_Serv).isVisible();
            System.out.println(inUsl);
            if(inUsl){
                List<WebElementFacade> massMini = findAll(Mini_List_Serv);
                for(int a = 0; a < massMini.size(); a++){
                    massMini = findAll(Mini_List_Serv);
                    System.out.println(massive.get(a).getText());
                    massMini.get(a).click();
                  if(find(Med_Serv_List).isVisible()){
                        System.out.println("Отображается хотя бы 1 услуга");
                    }
                    else {
                        Assertions.assertThat(find(Med_Serv_List).isVisible())
                                .as("В разделе: '"+ massMini.get(a).getText() + "' нет услуг.").isEqualTo(!find(Med_Serv_List).isVisible());
                    }
                }
            }else {
               if(find(Med_Serv_List).isVisible()){
                    System.out.println("Отображаются следующие услуги: " + find(Med_Serv_List).getText());
                } else {
                Assertions.assertThat(find(Med_Serv_List).isVisible())
                        .as("В разделе: '"+ massive.get(i).getText() + "' нет услуг.").isEqualTo(!find(Med_Serv_List).isVisible());
                }
            }
        }*/
    }





