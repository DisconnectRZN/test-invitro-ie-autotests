package testpackage.steps;


import cucumber.api.java.en.When;
import testpackage.pages.HeaderPage;

public class HeaderPageSteps  {
    HeaderPage hpage;

    @When("Проверить раздел Пациентам в шапке сайта")
    public void HeaderEnablePacient() {
        hpage.HpPacient();
    }

    @When("Проверить раздел Врачам в шапке сайта")
    public void HeaderEnableDoctor() {
        hpage.HpDoctor();
    }

    @When("Проверить раздел Франчайзинг в шапке сайта")
    public void HeaderEnableFranch() {
        hpage.HpFranch();
    }

    @When("Проверить раздел Корпоративным клиентам в шапке сайта")
    public void HeaderEnableCorpClient() {
        hpage.HpCorpClient();
    }

    @When("Проверить раздел Журналистам в шапке сайта")
    public void HeaderCorpClient() {
        hpage.HPress();
    }
    @When("Проверить кнопку Вход в кабинет пациента в шапке сайта")
    public void HeaderEnterinSite() {
        hpage.EnterInSite();
    }

    @When("Проверить надпись Ваш город:")
    public void HeaderCityLabel() {
        hpage.CityLabel();
    }

    @When("Проверить меню выбора города")
    public void HeaderCity() {
        hpage.City();
    }

    @When("Проверить иконку замок")
    public void HeaderIconZamok() {
        hpage.IconZamok();
    }
    @When("Проверить иконку карты")
    public void IconMap() {
        hpage.IconMap();
    }

    @When("Проверить что выбран город азов")
    public void verifyCityNameAzov() {
        hpage.verifyCityNameAzov();
    }

    @When("Проверить что выбран город Москва")
    public void verifyCityNameMoscow() {
        hpage.verifyCityNameMoscow();
    }

}
