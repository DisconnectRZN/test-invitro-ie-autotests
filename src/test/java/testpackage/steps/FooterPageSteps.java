package testpackage.steps;
import cucumber.api.java.en.When;
import testpackage.pages.FooterPage;


public class FooterPageSteps {
    FooterPage fpage;

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

    @When("Проверить иконку Facebook")
    public void FooterIconFb() {
        fpage.FIconFb();
    }

    @When("Проверить иконку OK")
    public void FooterIconOk() {
        fpage.FIconOk();
    }

    @When("Проверить иконку VK")
    public void FooterIconVk() {
        fpage.FIconVk();
    }

    @When("Проверить иконку Instagram")
    public void FooterIconInst() {
        fpage.FIconInst();
    }

    @When("Проверить иконку YouTube")
    public void FooterIconYoutube() {
        fpage.FIconYoutube();
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

    @When("Проверить раздел Программа лояльности")
    public void Floyalty() {
        fpage.FLoyalty();
    }

    @When("Проверить раздел ИНВИТРО-детям")
    public void FChildren() {
        fpage.FChildren();
    }

    @When("Проверить раздел Об Инвитро")
    public void FAbout() {
        fpage.FAbout();
    }

    @When("Проверить раздел История компании")
    public void FHistory() {
        fpage.FHistory();
    }

    @When("Проверить раздел Перавые лица")
    public void FFaces() {
        fpage.FFaces();
    }

    @When("Проверить раздел Социальная ответственность")
    public void FSocial() {
        fpage.FSocial();
    }

    @When("Проверить раздел Инновационная политика")
    public void FInnovations() {
        fpage.FInnovations();
    }

    @When("Проверить раздел Технологическая политика")
    public void FTechnologe() {
        fpage.FTechnology();
    }

    @When("Проверить раздел Журнал «Лабораторная работа»")
    public void FMagazine() {
        fpage.FMagazine();
    }

    @When("Проверить раздел Трудоустройство")
    public void FJob() {
        fpage.FJob();
    }

    @When("Проверить раздел Контакты")
    public void FContacts() {
        fpage.FContacts();
    }


    @When("Проверить раздел Высшая медицинская школа")
    public void FSchool() {
        fpage.FSchool();
    }

    @When("Проверить раздел Клинические исследования")
    public void FKi() {
        fpage.FKi();
    }

    @When("Проверить раздел Пресс-центр")
    public void FPresscentr() {
        fpage.FPresscentr();
    }

    @When("Проверить раздел Новости")
    public void FNews() {
        fpage.FNews();
    }

    @When("Проверить раздел Пресс-релизы")
    public void FPressrelease() {
        fpage.FPressrelease();
    }

    @When("Проверить раздел Юридическая информация")
    public void FUrinfo() {
        fpage.FUrinfo();
    }

    @When("Проверить раздел Лицензии и сертификаты")
    public void FLicense() {
        fpage.FLicense();
    }

    @When("Проверить раздел Политика в отношении персональных данных")
    public void FPolitics() {
        fpage.FPolitics();
    }

    @When("Проверить раздел Условия конфиденциальности")
    public void FConfident() {
        fpage.FConfident();
    }

    @When("Проверить раздел Справка для ФНС")
    public void FFns() {
        fpage.FFns();
    }

    @When("Проверить раздел Электронная форма кассового чека")
    public void FCheck() {
        fpage.FCheck();
    }

    @When("Проверить раздел 54-ФЗ")
    public void FFz() {
        fpage.FFz();
    }


    @When("Проверить логотип Группа компаний Инвитро")
    public void FGroupcompany() {
        fpage.FGroupcompany();
    }

    @When("Проверить логотип 3dbio")
    public void FIcon3dbio() {
        fpage.FIcon3dbio();
    }

    @When("Проверить логотип Лечу")
    public void FIconLechu() {
        fpage.FIconLechu();
    }

    @When("Проверить логотип ВМШ")
    public void FIconVmsh() {
        fpage.FIconVmsh();
    }

    @When("Проверить логотип Ветюнион")
    public void FIconVetunion() {
        fpage.FIconVetunion();
    }

    @When("Проверить логотип Med2Med")
    public void FIconMed() {
        fpage.FIconMed();
    }

    @When("Проверить логотип Архмедстрой")
    public void FIconArhmed() {
        fpage.FIconArhmed();
    }

    @When("Проверить логотип Премии качества")
    public void FIconquality() {
        fpage.FIconquality();
    }

    @When("Проверить описание Премии качества")
    public void FQualitydiscription() {
        fpage.FQualitydiscription();
    }






}
