package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.Medical_Service_Page;

public class Medical_Service_Steps {

    Medical_Service_Page page;

    @When("Проверка, что кнопка Мед услуги присутствует")
    public void V_M_S_B () {
        page.Verify_Med_Serv_Button();
    }

    @When("Клик на кнопку Мед услуги")
    public void C_M_S_B () {
        page.Press_Med_Serv_Button();
    }

    @When("Проверка, что кнопка Хлебные крошки присутствуют")
    public void C_B_Crumps () {
        page.Verify_Bread_Crum();
    }

    @When("Проверка наличия хэдера на Мед услугах")
    public void Check_Header () {
        page.Check_Header();
    }

    @When("Проверка наличия списка кнопок Мед услуг")
    public void Check_Serv_List () {
        page.Check_Serv_List();
    }

    @When("Проверка наличия списка под кнопками Мед услуг")
    public void Check_Other_List () {
        page.Check_Other_List();
    }

    @When("Проверка наличия картинки для подсказки")
    public void Check_Img_Disc () {
        page.Check_Img_Disc();
    }

    @When("Проверка наличия отображения элемента подсказки под списком")
    public void Check_Disc () {
        page.Check_Disc();
    }

    @When("Проверка наличия соответствия текста подсказки")
    public void Check_Text_Disc () {
        page.Check_Text_Disc();
    }

    @When("Проверка наличия кнопки Показать ещё")
    public void Check_Button_Show_More () {
        page.Check_Button_Show_More();
    }

    @When("Проверка наличия ссылки Наверх")
    public void Check_Up_Btn () {
        page.Check_Up_Btn();
    }

    @When("Проверка наличия Слайдера")
    public void Check_Slider () {
        page.Check_Slider();
    }

    @When("Проверка наличия Шахматки")
    public void Check_Chees () {
        page.Check_Chees();
    }

    @When("Проверка наличия списка Мед услуг")
    public void Check_Med_Serv_List () {
        page.Check_Med_Serv_List();
    }

    // Методы для проверки услуг в городах и наличия/отсутствия сообщения "В данном городе услуга не предоставляется"

    @When("Проверка ввода города Нальчик")
    public void enterCityNal () {
        page.enterCityNal();
    }

    @When("Нажатие на букву Н на форме выбора города")
    public void clickLetterN () {
        page.clickLetterN();
    }

    @When("Выбор города Нальчик из списка")
    public void clickCityNal () {
        page.clickCityNal();
    }

    @When("Проверка наличия хотя бы одной услуги в каждом разделе")
    public void verifyList_Serv () { page.verifyList_Serv();    }

    @When("Проверка заголовка Медицинские услуги в Москве")
    public void VerifyHeadServ () {
        page.VerifyHeadServ();
    }

    @When("Проверка заголовка Медицинские услуги в Нальчике")
    public void VerifyHeadServ2 () {
        page.VerifyHeadServ2();
    }

    @When("Выбор услуги Денситометрия")
    public void clickDensitom () {
        page.clickDensitom();
    }

    @When("Проверка наличия надписи о непредоставлении услуги в данном городе")
    public void VerifyWithoutServ () {
        page.VerifyWithoutServ();
    }


}
