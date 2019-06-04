package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

import java.util.List;

public class CertificatePage extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance(); // help метод
    private By License = By.xpath("//a[@class='ft-sm-list__link'][contains(text(),'Лицензии и сертификаты')]"); // xptah на вкладку Сертификаты и Лицензии с главной страницы
    private By checkYears = By.xpath("//ul[@class='sertificates__tabs'] //li[contains(text(),'')]"); // xpath на каждый год
    private By checkLicense = By.xpath("//div[@class='sertificates__block active']//img[@class='sertificates__img']"); // xpath на лицензию во вкладке года

    public void clickLicense() { // метод выбора раздела в слайд баре Сертификаты и Лицензии
        help.Click_Method(License); // вызов клик метода через класс help с указанием на раздел Сертификаты и Лицензии
    }

    public void checkLicensesByYears() { // метод проверки наличия лицензий по годам
        List<WebElementFacade> years = help.findAll(checkYears); // Создаем массив из найденных по икспатчу ссылок на года
        for(int i=0; i<years.size(); i++){ // проходимся по массиву из найденных годов и проверяем их наличие
            years.get(i).click(); // кликаем найденный элемент по индексу
            List<WebElementFacade>licenses = help.findAll(checkLicense); // Создаем массив из найденных по икспатчу ссылок на лицензии

            if(licenses.size() > 0) { // если массив лицензий больше 0 то проверяем каждую лицензию
                System.out.println("Количество лиценщий " + licenses.size());
                for (int j = 0; j < licenses.size(); j++) { // проходимся по массиву из найденных лицензий и проверяем их наличие
                    if (licenses.get(j).isVisible()) { // если найденная лицензия по индексу видима то указываем что она есть
                        System.out.println("Лицензия присутствует!");
                        Assertions.assertThat(licenses.get(j).find(checkLicense).isVisible());
                    } else { // если она есть но не видима то казываем что она есть но не видима.
                        System.out.println("Лицензия указанно но ее нет");
                        Assertions.assertThat(licenses.get(j).find(checkLicense).isVisible()).as("Лицензия указанна но ее нет!");
                    }
                }
            }else{ // если масив равен нулю то указываем на отсутствие лицензий
                System.out.println("НЕТ НИ ОДНОЙ ЛИЦЕНЗИИ");
                Assertions.assertThat(find(checkLicense).isVisible()).as("В этом году нет не одной лицензии.");
            }
        }
    }
}