package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;

public class HeaderPage extends PageObject {

    private By HPacientam = By.xpath("//*[@class = 'header-top-nav__item']//*[@data-user = 'PATIENTS']"); //header Пациентам
    private By HDoctor = By.xpath("//*[@class = 'header-top-nav__item']//*[@data-user = 'DOCTOR']");//header Врачам
    private By HFranch = By.xpath("//*[@class = 'header-top-nav__item']//*[@data-user = 'FRANCHCHISING']");//header Франчайзинг
    private By HCorpclient = By.xpath("//*[@class = 'header-top-nav__item']//*[@data-user = 'CORP_CLIENT']");//header Корпоративным клиентам
    private By HPress = By.xpath("//*[@class = 'header-top-nav__item']//*[@data-user = 'PRESS']");//header Журналистам
    private By EnterInSite = By.xpath("//*[@id='header_button_login']");//войти
    private By CityLabel = By.xpath("//span[@class='city__label-text']"); //надпись ваш город
    private By City = By.xpath("//span[@class='city__name city__btn city__name--label']"); //сам город
    private By IconZamok = By.xpath("//*[contains(@class,'icon icon-icon-lock')]"); //иконка замок
    private By IconMap = By.xpath("//*[contains(@class,'icon icon-header-map-bullet')]"); //иконка зкарты


    public void HpPacient()  {
        Assertions.assertThat(find(HPacientam).getText()).isEqualTo("Пациентам");
    }


    public void HpDoctor() {
        Assertions.assertThat(find(HDoctor).getText()).isEqualTo("Врачам");
    }

    public void HpFranch() {
        Assertions.assertThat(find(HFranch).getText()).isEqualTo("Франчайзинг");
    }

    public void HpCorpClient()  {
        Assertions.assertThat(find(HCorpclient).getText()).isEqualTo("Корпоративным клиентам");
    }

    public void HPress() {
        Assertions.assertThat(find(HPress).getText()).isEqualTo("Пресс-центр");
    }

    public void EnterInSite() {
        Assertions.assertThat(find(EnterInSite).getText()).isEqualTo("Вход в кабинет пациента");
    }

    public void CityLabel() {
        Assertions.assertThat(find(CityLabel).getText()).isEqualTo("Ваш город: ");
    }

    public void City() {
        Assertions.assertThat(find(City).isEnabled());
    }

    public void IconZamok() {
        Assertions.assertThat(find(IconZamok).isEnabled());
    }

    public void IconMap() {
        Assertions.assertThat(find(IconMap).isEnabled());
    }

    public void verifyCityNameAzov() {
        Assertions.assertThat(find(City).getText()).isEqualTo("Азов");
    }
    public void verifyCityNameMoscow() {
        Assertions.assertThat(find(City).getText()).isEqualTo("Москва");
    }
}
