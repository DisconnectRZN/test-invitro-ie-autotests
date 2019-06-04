package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.assertj.core.api.Assertions;

import java.util.List;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;




public class ClinicalReseachesPage extends PageObject {

    //локаторы для блочной проверки

    private By ClinicalReseachFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Клинические исследования\")]"); //Переход на страницу Клинические исследования из подвала
    private By KroshkiClinicalReseach = By.xpath("//ul[@class='bread-crumbs__list']"); //Проверка отображения хлебных крошек на страницах Клинические исследования
    private By ClinicalNameSection = By.xpath("//h1[contains(text(),'')]"); // Проверяем наличие заголовка на страницах Клинические исследования
    private By ClinicalMenu = By.xpath("//div[@class='side-bar__block']//li"); //Проверка отображения блока меню в разделе Клинические исследования
    private By SectionDescription = By.xpath("//div[@class='content__inner']"); //Проверка наличия блока с описанием раздела
    private By NameRazdelaAnalize_Krochki = By.xpath("//ul[contains(@class,'bread-crumbs__list')]//li[3]"); //название раздела в хлебных крошках



    public void ClickClinicalReseachFooter()  { //Переход на страницу Клинические исследования
        find(ClinicalReseachFooter).waitUntilClickable().click(); }

    public void VeriFyKroshkiClinicalReseach()  {
        find(KroshkiClinicalReseach).isVisible(); } //Проверить наличие хлебных крошек на странице

    public void VeriFyClinicalNameSection()  {
        find(ClinicalNameSection).isVisible(); } //Проверить наличие заголовка на странице

    //метод сравнения наименование раздела в хлебных крошках и заголовка на странице
    public void VeriFyNameRazdelaClinRes_Krochki() { //Проверить правильность указания раздела в хлебных крошках
        List<WebElementFacade> massive = findAll(ClinicalMenu);
        for (int i = 0; i < massive.size(); i++) {
            massive = findAll(ClinicalMenu);
            massive.get(i).click();
            String NameRazdelaClinResKrochki1 = find(NameRazdelaAnalize_Krochki).getText().trim();
            String ClinNameSection1 = find(ClinicalNameSection).getText().trim();

            boolean sravnenie = NameRazdelaClinResKrochki1.equalsIgnoreCase(ClinNameSection1);
            System.out.println(sravnenie);

            if (sravnenie) {
                System.out.println("Верно. Заголовок раздела соответствует наименованию раздела в хлебных крошках");
            } else {
                System.out.println("Заголовок раздела не соответствует наименованию раздела в хлебных крошках!");
                assert (false) : "Заголовок раздела не соответствует наименованию раздела в хлебных крошках";
            }
        }
    }


//метод прокликивания разделов страницы Клинические исследования и проверки что там не пусто

    public void AllClinicalMenu()  {
        List<WebElementFacade> massive = findAll(ClinicalMenu);
        for (int i = 0; i < massive.size(); i++) {
            massive = findAll(ClinicalMenu);
            massive.get(i).click();

            if(find(SectionDescription).isVisible()){
                System.out.println("Описание раздела присутствует");
            }
            else {
                Assertions.assertThat(find(SectionDescription).isVisible())
                        .as("В разделе: '"+ massive.get(i).getText() + "' описание отсутствует.").isEqualTo(!find(SectionDescription).isVisible());
            }

        }


    }


}
