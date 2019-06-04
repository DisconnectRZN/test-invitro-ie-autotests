package testpackage.pages;



import net.serenitybdd.core.SerenityListeners;
import net.serenitybdd.core.SerenityReports;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

import java.util.List;
import java.util.stream.Stream;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;


public class Med_Offices_Page extends PageObject {

    @Managed(uniqueSession = true, clearCookies=BeforeEachTest)

    private static final Help_Methods help = Help_Methods.getInstance();

    private By Address_Page = By.xpath("//a[text()='Адреса']"); // Кнопка Адреса
    private By Nagatinskaya = By.xpath("//a[text()='Нагатинская']"); // Список МО на странице адреса
    private By Head = By.xpath("//h1");
    private By Bread = By.xpath("//div[@class='bread-crumbs']");
    private By Main_MO_But = By.xpath("//a[@class='usefull__link item-center-department']");
    private By Search_Field = By.xpath("//form[@class='search__block']/input");
    private By Search_Btn = By.xpath("//button[@class='search__btn']");
    private By Service_Filter = By.xpath("//div[@class='map-panel__filter-trigger']");
    private By Service = By.xpath("//div[@class='map-panel__subblock-item']");
    private By Blue_Star_Svg = By.xpath("//a[@class='usefull__link item-center-department']/*[name()='svg']");
    private By Baloon_YaMap_Nag = By.xpath("//ymaps[@class='ymaps-2-1-73-balloon__layout']");
    private By Baloon_Nag_Address = By.xpath("//li[@class='partners__address-list-item'][1]");
    private By Baloon_Nag_Phone = By.xpath("//li[@class='partners__address-list-item'][2]");
    private By Get_Detail_Btn = By.xpath("//button[@data-action='get_detail']");
    private By List_Btn = By.xpath("//div[contains(text(), 'Списком')]");
    private By List_Off = By.xpath("//div[@id='mapFilter']");
    private By List_Another_City = By.xpath("//div[@class='offices-list'][15]");
    private By CheckCity = By.xpath("//span[@class='city__name city__btn city__name--label']");
    private By ChangeOtherCity = By.xpath("//div[@class='row row--start']/a");//Выбрать другой
    private By City_Applet = By.xpath("//div[@class='city__label']");
    private By Moscow_City = By.xpath("//div[@class='change-city-wrapper__left']//a[contains(text(), 'Москва')]");
    private By Yes_Btn = By.xpath("//button[@class='btn btn--narrow city__confirm-btn']");
    private By All_Anchor = By.xpath("//ymaps[@class='ymaps-2-1-72-places-pane']//ymaps");
    private By All_MOs = By.xpath("//p[@class='map-panel__result-name']/a");
    private By Sheduled = By.xpath("//a[contains(text(), 'Расписание')]");
    private By Delivery = By.xpath("//div[@class='slick-slide slick-current slick-active']//div[contains(text(), 'Выдача результатов')]");

    public void Verify_Address_Button (){//Проверка, что кнопка Адреса присутствует
        Assertions.assertThat(find(Address_Page).isVisible());
    }

    public void Press_Address_Button() {//Клик на кнопку Адреса
        find(Address_Page).waitUntilClickable().click();
    }


   /* public void Check_URL(){
             //System.out.println(getDriver().getCurrentUrl());
        if (find(CheckCity).getText().contains("Москва")){
            continue;
        }else{}
    }
*/


    public void Check_Bread_Cr(){// Проверка наличия хлебных крошек
        Assertions.assertThat(find(Bread).isVisible());
    }

    public void Check_Header(){// Проверка наличия хэдера
        Assertions.assertThat(find(Head).isVisible());
    }

    public void Check_Main_Office_Btn(){// Проверка наличия кнопки Основного Офиса
        Assertions.assertThat(find(Main_MO_But).isVisible());
    }

    public void Main_Office_Btn_Img(){
        Assertions.assertThat(find(Blue_Star_Svg).isVisible());
    }

    public void Text_Main_Of_Btn(){
        //System.out.println(find(M_B_T).getText());
        Assertions.assertThat(find(Main_MO_But).getText()).isEqualTo("Центральный офис ИНВИТРО");
    }

    public void Click_M_O_B(){
       // find(All_Anchor).waitUntilVisible();
        find(Main_MO_But).waitUntilClickable().click();
    }

    public void Check_Ya_Baloon(){
        Assertions.assertThat(find(Baloon_YaMap_Nag).isVisible());
        //System.out.println(find(Baloon_YaMap_Nag).getText());
    }

    public void Check_Nag_Baloon(){// Проверка, что открылся былон для Нагатинской
        Assertions.assertThat(find(Baloon_YaMap_Nag).getText()).contains("Нагатинская");
    }

    public void Check_Address_Baloon(){//Проверить что адрес присутствует в сплывающем окне
        Assertions.assertThat(find(Baloon_Nag_Address).isVisible());
    }

    public void Equals_Nag_Address(){
        Assertions.assertThat(find(Baloon_Nag_Address).getText()).contains("г. Москва, ул. Нагатинская, д. 1, стр. 1.");
    }

    public void Check_Phone_Baloon(){
        Assertions.assertThat(find(Baloon_Nag_Phone).isVisible());
    }

    public void Check_Get_Detail_Btn(){
        Assertions.assertThat(find(Get_Detail_Btn).isVisible());
    }

    public void Eq_Get_Detail_Btn(){
        Assertions.assertThat(find(Get_Detail_Btn).getText()).contains("Детальная информация");
    }

    public void Check_Src_Field(){// Проверка наличия поля поиска
        Assertions.assertThat(find(Search_Field).isVisible());
    }

    public void Find_Nag(){// Поиск нагатинской
        find(Search_Field).sendKeys("Нагатинская");
    }

    public void Check_Src_Btn(){// Проверка наличия кнопка поиска
        Assertions.assertThat(find(Search_Btn).isVisible());
    }

    public void Press_Src_Btn(){// Нажатие на кнопку поиска, поиск всех МО с наименованием Нагатинская
        find(Search_Btn).waitUntilVisible().waitUntilClickable().click();
    }

    public void Check_Nag_Visible() {//Проверка отображения Нагатинской в списке МО
        Assertions.assertThat(find(Nagatinskaya).isVisible());
    }

    public void Check_Nag_Name() {// Проверка, что офис Нагатинской присутствует
        Assertions.assertThat(find(Nagatinskaya).getText()).isEqualTo("Нагатинская");
    }

    public void Click_Nag_MO (){
        find(Nagatinskaya).waitUntilClickable().click();
        Assertions.assertThat( find(Head).getText()).contains("Нагатинская");
        find(Address_Page).waitUntilClickable().click();
    }

    public void Service_Filter(){
        Assertions.assertThat(find(Service_Filter).isVisible());
    }

    public void Click_Serv_Filter(){
        find(Service_Filter).waitUntilClickable().click();
    }

    public void Check_Servs_Massive(){
        Assertions.assertThat(find(Service).isVisible());
    }

    public void Check_List_Btn(){
        Assertions.assertThat(find(List_Btn).isVisible());
    }

    public void Click_On_List_Btn(){
        find(Service_Filter).waitUntilClickable().click();
    }

    public void Check_List_Off(){
        Assertions.assertThat(find(List_Off).isVisible());
    }

    public void Another_City_List(){
        Assertions.assertThat(find(List_Another_City).isVisible());
    }

    public void Change_City_to_Moscow(){
        find(CheckCity).waitUntilVisible();
        if (find(CheckCity).getText().equals("Москва")){
            if (find(Yes_Btn).isVisible()){
            find(Yes_Btn).waitUntilClickable().click();
            } else {
                help.Click_Method(ChangeOtherCity);
                find(Yes_Btn).waitUntilClickable().click();
            }
        } else {
            if(find(ChangeOtherCity).isVisible()){
                help.Click_Method(ChangeOtherCity);
                help.Click_Method(Moscow_City);
            } else{
                help.Click_Method(City_Applet);
                help.Click_Method(ChangeOtherCity);
                help.Click_Method(Moscow_City);
            }
            if (find(Yes_Btn).isVisible()){
                find(Yes_Btn).waitUntilClickable().click();
            } else {
                help.Click_Method(ChangeOtherCity);
                find(Yes_Btn).waitUntilClickable().click();
            }
        }
    }

    public void Random_Office_Check_Ras(){
        List<WebElementFacade> massive = findAll(All_MOs);

        int count = Stream.of(massive).mapToInt(m -> m.size()).sum();
        System.out.println("количество мед. офисов: " + count);
        int a = 0; // Начальное значение диапазона для рандома- "от"
        int random_number = a + (int) (Math.random() * count); // Генерация 1-го числа
        System.out.println("случайное число: " + random_number);
        System.out.println(massive.get(random_number).getText());
        //String MO_Name = massive.get(random_number).getText();
        massive.get(random_number).click();
        help.Click_Method(Sheduled);
        Assertions.assertThat(find(Delivery).getText()).isEqualTo("Выдача результатов");


    }













           /* На всякий оставлю прокликивание всех МО, нужно будет потом хpath дописать и вставить название переменной All_MO_Names

        List<WebElementFacade> massive = findAll(All_MO_Names);
                for (int i = 0; i <massive.size()-1; i++) {
            massive = findAll(All_MO_Names);
            massive.get(i).waitUntilVisible();
            massive.get(i).click();
           // find(By.xpath("//h1")).getText().indexOf(massive.get(i).getText());
            help.Click_Method(Address_Page);
            if (find(CheckCity).getText().equals("Москва")){
                continue;
            } else {
                if(find(ChengeOtherCity).isVisible()){
                    help.Click_Method(ChengeOtherCity);
                    help.Click_Method(Moscow_City);
                } else{
                    help.Click_Method(City_Applet);
                    help.Click_Method(ChengeOtherCity);
                    help.Click_Method(Moscow_City);
                }
                help.Click_Method(Address_Page);}
        }
         */











}


