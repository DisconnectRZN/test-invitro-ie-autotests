package testpackage.steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.Cookie;
import testpackage.pages.FooterPage;

import java.util.ArrayList;
import java.util.List;


public class FooterPageSteps {
    FooterPage fpage;

    @Given("Открыть главную страницу сайта$")
    public void openPage() { fpage.open(); }

    @When("Проверить раздел Пациентам в футере сайта")
    public void FooterEnablePacient() {
        fpage.FpPacient();
    }

    @When("Проверить раздел Врачам в футере сайта")
    public void FooterEnableDoctor() {
        fpage.FpDoctor();
    }

    @When("Проверить раздел Франчайзинг в футере сайта")
    public void FooterEnableFranch() {
        fpage.FpFranch();
    }

    @When("Проверить раздел Корпоративным клиентам в футере сайта")
    public void FooterEnableCorpClient() {
        fpage.FpCorpClient();
    }

    @When("Проверить раздел Пресс-центр в футере сайта")
    public void FooterCorpClient() {
        fpage.FPress();
    }

    @When("Проверить кнопку телефон в футере сайта")
    public void FooterPhone() {
        fpage.FPhone();
    }

    @When("Проверить надпись Бесплатно по России")
    public void FooterRussia() {
        fpage.FRussia();
    }


    @When("Проверить раздел Услуги для пациентов")
    public void FooterServices() {
        fpage.FServices();
    }

    @When("Проверить раздел Анализы")
    public void FooterAnalys() {
        fpage.FAnalys();
    }

    @When("Проверить раздел Медицинские услуги")
    public void FooterMedicservice() {
        fpage.FMedicservice();
    }

    @When("Проверить раздел Комплексные обследования")
    public void FooterComplex() {
        fpage.FComplex();
    }

    @When("Проверить раздел Запись к врачу")
    public void FSigndoctor() {
        fpage.FSigndoctor();
    }

    @When("Проверить раздел Выезд на дом")
    public void FVnd() {
        fpage.FVnd();
    }

    @When("Проверить раздел Адреса медицинских офисов")
    public void FMoadres() {
        fpage.FMoadres();
    }

    @When("Проверить раздел Горячие акции")
    public void FActions() {
        fpage.FActions();
    }

}
