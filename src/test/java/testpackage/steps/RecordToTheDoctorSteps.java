package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.RecordToTheDoctorPage;

public class RecordToTheDoctorSteps {
    RecordToTheDoctorPage page;

    @When("Переход на страницу Запись ко врачу" )
    public void VeriFyRecordToTheDoctorLink() {
        page.VeriFyRecordToTheDoctorLink();
    }

    @When("Проверка что город не поменялся" )
    public void VeriFyGorodRecordToTheDoctorLink() {
        page.VeriFyGorodRecordToTheDoctorLink();
    }

    @When("Проверка отображения хлебных крошек на странице Запись к врачу" )
    public void VeriFyKrochkiToTheDoctorLink() {
        page.VeriFyKrochkiToTheDoctorLink();
    }

    @When("Проверка отображение блока с меню" )
    public void VeriFyBlockMenuToTheDoctorLink() {
        page.VeriFyBlockMenuToTheDoctorLink();
    }

    @When("Проверка отображения блока с фильтрами" )
    public void VeriFyBlockFiltriToTheDoctorLink() {
        page.VeriFyBlockFiltriToTheDoctorLink();
    }

    @When("Проверка отображения блока с врачами" )
    public void VeriFyBlockVseVrachiToTheDoctorLink() {
        page.VeriFyBlockVseVrachiToTheDoctorLink();
    }

    @When("Проверка отображения кнопки \"Показать еще\"" )
    public void VeriFyButtonToTheDoctorLink() {
        page.VeriFyButtonToTheDoctorLink();
    }

    @When("Проверка иконки у фильтра")
    public void VeriFyFiltrIconsToTheDoctorLink() {
        page.VeriFyFiltrIconsToTheDoctorLink();
    }

    @When("Проверка открытия фильтра")
    public void VeriFyFiltrToTheDoctorLink() {
        page.VeriFyFiltrToTheDoctorLink();
    }

    @When("Проверка в фильтре отображения блока Станция метро")
    public void VeriFyStanMetroFiltrToTheDoctorLink() {
        page.VeriFyStanMetroFiltrToTheDoctorLink();
    }

    @When("Проверка в фильтре отображения блока Пол")
    public void VeriFyPolFiltrToTheDoctorLink() {
        page.VeriFyPolFiltrToTheDoctorLink();
    }

    @When("Проверка в фильтре отображения чекбокса Врач для детей")
    public void VeriFyVrachDliaDeteiFiltrToTheDoctorLink() {
        page.VeriFyVrachDliaDeteiFiltrToTheDoctorLink();
    }

    @When("Проверка в фильтре отображения блока Первичиный прием")
    public void VeriFyPervPriemFiltrToTheDoctorLink() {
        page.VeriFyPervPriemFiltrToTheDoctorLink();
    }

    @When("Проверка в фильтре отображения блока Врачебный стаж")
    public void VeriFyVrachStagFiltrToTheDoctorLink() {
        page.VeriFyVrachStagFiltrToTheDoctorLink();
    }

    @When("Проверка в фильтре отображения кнопки Показать")
    public void VeriFySet_filterToTheDoctorLink() {
        page.VeriFySet_filterToTheDoctorLink();
    }

    @When("Проверка в фильтре отображения кнопки Сбросить")
    public void VeriFyDel_filterToTheDoctorLink() {
        page.VeriFyDel_filterToTheDoctorLink();
    }

    @When("Прохождение по всем разделам врачей и проверка что разделы не пустые")
    public void VeriFyMassivToTheDoctorLink() {
        page.VeriFyMassivToTheDoctorLink();
    }

    @When("Кликаем на кнопку показать еще пока она отображается")
    public void VeriFyClickToTheDoctorLink() throws InterruptedException {
        page.VeriFyClickToTheDoctorLink();
    }

    @When("Выбираем рандомного врача для проверки карточки")
    public void VeriFyRandomVrach() { page.VeriFyRandomVrach(); }

    @When("Проверяем что у всех врачей отображается изображение/заглушка, текст Врачебный стаж, <количетсво> лет/год/года")
    public void VeriFyIzobrVrachToTheDoctorLink() {
        page.VeriFyIzobrVrachToTheDoctorLink();
    }

    @When("Проверка отображение карты при раскрытии карточки врача")
    public void VeriFyMapToTheDoctorLink() {
        page.VeriFyMapToTheDoctorLink();
    }

    @When("Проверка отображения заголовка при ракскрыти карточки врача")
    public void VeriFyKartZagolovokToTheDoctorLink() {
        page.VeriFyKartZagolovokToTheDoctorLink();
    }

    @When("Проверка отображения блока описания врача при ракскрыти карточки врача")
    public void VeriFyKartOpisanieToTheDoctorLink() {
        page.VeriFyKartOpisanieToTheDoctorLink();
    }

    @When("Проверка отображения заголовка \"оказываемые услуги\" при ракскрыти карточки врача")
    public void VeriFyKartZagolovokYslugiToTheDoctorLink() {
        page.VeriFyKartZagolovokYslugiToTheDoctorLink();
    }

    @When("Проверка отображения перечня оказываеых услуг при ракскрыти карточки врача")
    public void VeriFyKartYslugiToTheDoctorLink() {
        page.VeriFyKartYslugiToTheDoctorLink();
    }

    @When("Проверка отображения блока справа при раскрытии карточки врача")
    public void VeriFyKartBlockRightToTheDoctorLink() {
        page.VeriFyKartBlockRightToTheDoctorLink();
    }

    @When("Проверка отображения изображения врача при раскрытии карточки врача")
    public void VeriFyKartImgToTheDoctorLink() {
        page.VeriFyKartImgToTheDoctorLink();
    }

    @When("Проверка отображения блока Адреса приема при раскрытии карточки врача")
    public void VeriFyKartAdressToTheDoctorLink() {
        page.VeriFyKartAdressToTheDoctorLink();
    }

    @When("Проверка отображения блока Врачебный стаж при раскрытии карточки врача")
    public void VeriFyKartStagToTheDoctorLink() {
        page.VeriFyKartStagToTheDoctorLink();
    }

    @When("Проверка отображения блока Повторный прием при раскрытии карточки врача")
    public void VeriFyKartPovtornPriemToTheDoctorLink() {
        page.VeriFyKartPovtornPriemToTheDoctorLink();
    }

    @When("Проверка отображения блока Первичный прием при раскрытии карточки врача")
    public void VeriFyKartPervPriemToTheDoctorLink() {
        page.VeriFyKartPervPriemToTheDoctorLink();
    }

    @When("Выбор рандомного раздела меню на странице запись к врачу")
    public void VeriFyRandomRazdelVrach() {
        page.VeriFyRandomRazdelVrach();
    }

    /*@When("Сравнение названия меню и название в краткой карточке врача")
    public void VeriFyRandomRazdelSr1Vrach() {
        page.VeriFyRandomRazdelSr1Vrach();
    }*/

    @When("Сравнение названия меню и название в карточке врача")
    public void VeriFyRandomRazdelSr2Vrach() {
        page.VeriFyRandomRazdelSr2Vrach();
    }

    @When("Прокликивание всех разделов врачей и проверки отображения краткой карточки")
    public void VeriFyMassivToTheDoctorLinkKart() throws InterruptedException {
        page.VeriFyMassivToTheDoctorLinkKart();
    }

    @When("Поиск врача с возможностью записи")
    public void VeriFyPoiskZapisToTheDoctorLink() {
        page.VeriFyPoiskZapisToTheDoctorLink();
    }

    @When("Проверка отображения формы записи на прием при клике на Записаться")
    public void VeriFyFormaZapisToTheDoctorLink() {
        page.VeriFyFormaZapisToTheDoctorLink();
    }

    @When("Проверка отображения заголовка на форме Записи на прием")
    public void VeriFyFormaZapisaZagolovokToTheDoctorLink() {
        page.VeriFyFormaZapisaZagolovokToTheDoctorLink();
    }

    @When("Проверка отображения кнопки ЗАПИСАТЬСЯ на форме записи на прием")
    public void VeriFyFormaZapisButtonToTheDoctorLink() {
        page.VeriFyFormaZapisButtonToTheDoctorLink();
    }

    @When("Проверить отображение блока УСЛУГИ на форме записи к врачу")
    public void VeriFyFormaZapisYslugaLabelToTheDoctorLink() {
        page.VeriFyFormaZapisYslugaLabelToTheDoctorLink();
    }

    @When("Проверить отображение блока Желаемая дата визита на форме записи к врачу")
    public void VeriFyFormaZapisDataLabelToTheDoctorLink() {
        page.VeriFyFormaZapisDataLabelToTheDoctorLink();
    }

    @When("Проверить отображение блока АДРЕС ПРИЕМА на форме записи к врачу")
    public void VeriFyFormaZapisAdresLabelToTheDoctorLink() {
        page.VeriFyFormaZapisAdresLabelToTheDoctorLink();
    }

    @When("Проверить отображение и заполнение блока ФАМИЛИЯ визита на форме записи к врачу")
    public void VeriFyFormaZapisFLabelsToTheDoctorLink() {
        page.VeriFyFormaZapisFLabelsToTheDoctorLink();
    }

    @When("Проверить отображение и заполнение блока ИМЯ визита на форме записи к врачу")
    public void VeriFyFormaZapisILabelsToTheDoctorLink() {
        page.VeriFyFormaZapisILabelsToTheDoctorLink();
    }

    @When("Проверить отображение и заполнение блока ОТЧЕСТВО визита на форме записи к врачу")
    public void VeriFyFormaZapisOLabelsToTheDoctorLink() {
        page.VeriFyFormaZapisOLabelsToTheDoctorLink();
    }

    @When("Проверить отображение и заполнение блока Телефон на форме записи к врачу")
    public void VeriFyFormaLabelPhoneZapisToTheDoctorLink() {
        page.VeriFyFormaLabelPhoneZapisToTheDoctorLink();
    }

    @When("Проверить отображение и заполнение блока EMAIL на форме записи к врачу")
    public void VeriFyFormaZapisEmailToTheDoctorLink() {
        page.VeriFyFormaZapisEmailToTheDoctorLink();
    }

    @When("Проверить отображение блока со стоимостью услуги на форме записи к врачу")
    public void VeriFyFormaZapisInfoToTheDoctorLink() {
        page.VeriFyFormaZapisInfoToTheDoctorLink();
    }

    @When("Проверить отображение блока согдласия с условими предоставления услуг на форме записи к врачу")
    public void VeriFyFormaZapisSoglasieToTheDoctorLink() {
        page.VeriFyFormaZapisSoglasieToTheDoctorLink();
    }

}
