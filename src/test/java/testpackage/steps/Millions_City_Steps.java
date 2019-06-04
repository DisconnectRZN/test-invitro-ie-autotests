package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.Millions_City_Page;

public class Millions_City_Steps {

    Millions_City_Page page;

    ///////////////////////////////////////////// Регион апплет \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("Проверить отображение апплета с городом")
    public void CheckCityAppStep () {
        page.Check_City_App();
    }

    @When("Нажать на апплет с городом")
    public void ClickCityAppStep () {
        page.Click_City_App();
    }

    @When("Проверка текста Вы находитесь в городе")
    public void CheckTextAppWhereStep () {
        page.Check_Text_App_Where();
    }

    @When("Проверка наличия кнопки Да, верно")
    public void CheckButtonYesStep () {
        page.Check_Button_Yes();
    }

    @When("Проверка наличия кнопки Выбрать другой")
    public void CheckButtonChangeStep () {
        page.Check_Button_Change();
    }


    ///////////////////////////////////////////// Проверка окна выбора города \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("Нажатие на кнопку Выбрать другой")
    public void ClickButtonChangeStep () {
        page.Click_Button_Change();
    }

    @When("Проверка хедера Выбор города")
    public void CheckHeaderWindowStep () {
        page.Check_Header_Window();
    }

    @When("Проверка наличия кнопки закрытия окна Выбор города")
    public void CheckCloseBtnStep () {
        page.Check_Close_Btn();
    }

    @When("Проверка наличия Поисковой строки")
    public void CheckSearchRowStep () {
        page.Check_Search_Row();
    }

    @When("Проверка наличия Поисковой кнопки")
    public void CheckSearchBtnStep () {
        page.Check_Search_Btn();
    }

    @When("Проверка наличия Строки стран")
    public void CheckCountiesLineStep () {
        page.Check_Counties_Line();
    }

    @When("Проверка отображения наличия Крупные города")
    public void CheckBigCityStep () {
        page.Check_Big_City();
    }

    @When("Проверка текста Крупные города")
    public void CheckBigCityTextStep () {
        page.Check_Big_City_Text();
    }

    @When("Проверка отображения списка больших городов")
    public void CheckBigCytiesStep () {
        page.Check_Big_Cyties();
    }

    @When("Проверка отображения алфавита для выбора города")
    public void CheckABCStep () {
        page.Check_ABC();
    }

    @When("Выбор одного случаянного города при выборе случаянной буквы и проверка наличия кнопок главного меню")
    public void CheckABCStep_2 () {
        page.Check_All_ABC();
    }

    @When("Проверка отображения списка городов")
    public void CheckCytiesStep () {
        page.Check_Cyties();
    }
///////////////////////////////////////////// Проверка городов миллионников \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("Проверка наименования городов миллионников")
    public void GetAllBigCytiesStep () throws InterruptedException {
        page.Get_All_Big_Cyties();
    }



}
