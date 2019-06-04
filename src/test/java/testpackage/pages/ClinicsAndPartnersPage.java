package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

import java.util.List;

public class ClinicsAndPartnersPage extends PageObject {

    private static final Help_Methods help = Help_Methods.getInstance();

    private By AllClinicsAndPartners = By.xpath("//ol//p");// Все парнеры компании
    private By Map = By.xpath("//*[@class='ymaps-2-1-72-inner-panes']");// Все парнеры компании
    private By KKPage = By.xpath("//li[@class='header-top-nav__item']/a[contains(text(),'Корпоративным клиентам')]");// Корпоративным клиентам в Header меню
    private By ClinicsAndParnersPage = By.xpath("//a[@class='header-nav__link'][contains(text(),'Клиники-партнеры')]");// Клиники-партнеры меню
    private By ClinicsAndParnersText = By.xpath("//h1[contains(text(),'Клиники-партнеры')]");// Заголовок Клиники-партнеры
    private By ClinicsAndParnersBlockText = By.xpath("//p[contains(text(),'В данном разделе размещена информация о медицинских')]");// Блок текста Клиники-партнеры
    private By ClinicsAndParnersBaloon = By.xpath("//div[@class='balloon__title']");// Балон выбранного партнера
    private By CheckCity = By.xpath("//span[@class='city__name city__btn city__name--label']"); // Город для проверки
    private By ChangeOtherCity = By.xpath("//a[@class='btn btn--narrow btn--empty city__change-btn']");//Выбрать другой
    private By Moscow_City = By.xpath("//div[@class='change-city-wrapper__left']//a[1]"); // Город Москва
    private By City_Applet = By.xpath("//div[@class='city__label']");
    private By MapBallons = By.xpath("//*[@class='ymaps-2-1-72-places-pane']");
    private By Clinic = By.xpath("//div[@class='map__panel map-panel']"); //Клиники и партнеры блок

    public void сlickKKPage() {

        help.Click_Method(KKPage);
    }

    public void сlickClinicsAndParnersPage() {

        help.Click_Method(ClinicsAndParnersPage);
    }


    public void сlickClinicsAndParnersText() {

        help.Check_Visible_Element(ClinicsAndParnersText);
    }


    public void сlickClinicsAndParnersBlockText() {

        help.Check_Visible_Element(ClinicsAndParnersBlockText);
    }


    public void visibleMap() {

        help.Check_Visible_Element(Map);
    }

    public void VisibleClinic() {
        help.Check_Enabled_Element(Clinic);
    }

//    public void Another_City_List(){
//        find(MapBallons).waitUntilVisible();
//        List<WebElementFacade> massive = findAll(AllClinicsAndPartners);
//        for (int i = 0; i <massive.size(); i++) {
//            massive = findAll(AllClinicsAndPartners);
//            massive.get(i).waitUntilVisible();
//            massive.get(i).click();
//             // find(By.xpath("//h1")).getText().indexOf(massive.get(i).getText());
//            //help.Click_Method(KK);
//           // help.Click_Method(CP);
//            String CP_Name = massive.get(i).getText();
//            String Baloon_Name = find(ClinicsAndParnersBaloon).getText();
//            Assertions.assertThat(CP_Name).contains(Baloon_Name);

            /*if (CP_Name.equals(Baloon_Name)){

                continue;
            } else {
                if(find(ChangeOtherCity).isVisible()){
                    help.Click_Method(ChangeOtherCity);
                    help.Click_Method(Moscow_City);
                } else{
                    help.Click_Method(City_Applet);
                    help.Click_Method(ChangeOtherCity);
                    help.Click_Method(Moscow_City);
                }
                help.Click_Method(KK);
                help.Click_Method(CP);}*/
        }


