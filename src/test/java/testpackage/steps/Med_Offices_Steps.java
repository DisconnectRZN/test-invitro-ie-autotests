package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.Med_Offices_Page;

import java.util.List;

public class Med_Offices_Steps {

    Med_Offices_Page page;

    @When("Смена города на Москву")
    public void Change_to_MSK(){
        page.Change_City_to_Moscow();
    }

    @When("Проверить отображение кнопки Адреса")
    public void V_A_B () {
        page.Verify_Address_Button();
    }


    @When("Нажать на кнопку Адреса")
    public void P_A_B () {
        page.Press_Address_Button();
    }

   /*
       @When("Проверить корректность URL")
    public void URL_Check(){
        page.Check_URL();
    }
    */


    @When("Проверить наличие Хлебных крошек")
    public void Check_Bread(){
        page.Check_Bread_Cr();
    }

    @When("Проверить наличие хедера Медицинские офисы в Москве")
    public void Check_Header(){
        page.Check_Header();
    }

    @When("Проверить наличие кнопки Центральный офис ИНВИТРО")
    public void Main_MO_Btn(){
        page.Check_Main_Office_Btn();
    }

    @When("Проверить наличие поискового поля")
    public void Src_Field(){
        page.Check_Src_Field();
    }

    @When("Ввести в поисковое поле Нагатинская")
    public void Find_Nag(){
        page.Find_Nag();
    }

    @When("Проверка наличия кнопки поиска")
    public void Src_Bnt(){
        page.Check_Src_Btn();
    }

    @When("Найти МО Нагатинская")
    public void Press_Src_Bnt(){
        page.Press_Src_Btn();
    }

    @When("Проверить наличие МО Нагатинская")
    public void Check_Nag_MO() {
        page.Check_Nag_Visible();
    }

    @When("Проверить что наименование МО корректно")
    public void Check_Nagat_Name(){
        page.Check_Nag_Name();
    }

    @When("Провалиться в МО, проверить что хэдере адреса название МО - Нагатинская")
    public void Click_Nag_MO(){
        page.Click_Nag_MO();
    }

    @When("Проверить наличие Фильтра по услугам")
    public void Check_Serv_Filter(){
        page.Service_Filter();
    }

    @When("Открыть фильтр по услугам")
    public void Click_Serv_Filter(){
        page.Click_Serv_Filter();
    }

    @When("Проверить наличие списка услуг")
    public void Check_Serv_List(){
        page.Check_Servs_Massive();
    }

    @When("Проверить что иконка для кнопки Центральный офис присутствует")
    public void Check_Svg_Icon(){
        page.Main_Office_Btn_Img();
    }

    @When("Проверить текст кнопки Центрального офиса")
    public void Check_Text_MB(){
        page.Text_Main_Of_Btn();
    }

    @When("Нажать на кнопку Центральный офис")
    public void Click_CMO(){
        page.Click_M_O_B();
    }

    @When("Проверить наличие всплывающего окна на карте")
    public void Check_Y_M_B(){
        page.Check_Ya_Baloon();
    }

    @When("Проверить что окно для Нагатинской")
    public void Check_Y_M_B_N(){
        page.Check_Nag_Baloon();
    }

    @When("Проверить что адрес присутствует в сплывающем окне")
    public void Check_Address_In_Baloon(){
        page.Check_Address_Baloon();
    }

    @When("Проверить что адрес соответствует для МО Нагатинская")
    public void Eq_Address_In_Baloon(){
        page.Equals_Nag_Address();
    }

    @When("Проверить что телефон присутствует в сплывающем окне")
    public void Check_Phone_Baloon(){
        page.Check_Phone_Baloon();
    }

    @When("Проверить что кнопка Детальная информация присутствует")
    public void Check_Get_Detail_Btn(){
        page.Check_Get_Detail_Btn();
    }

    @When("Проверить что кнопка называется Детальная информация")
    public void Eq_Get_Detail_Btn(){
        page.Eq_Get_Detail_Btn();
    }

    @When("Проверить наличие кнопки Списком")
    public void Check_List_Btn(){
        page.Check_List_Btn();
    }

    @When("Перейти на список МО")
    public void Click_On_LB(){
        page.Click_On_List_Btn();
    }

    @When("Проверить, что список МО присутствует")
    public void Check_Offices_List(){
        page.Check_List_Off();
    }

    @When("Проверить, что присутствует список городов Московской области")
    public void Check_Another_City_List(){
        page.Another_City_List();
    }

    @When("Проверка наполненности расписания МО")
    public void Random_Office_Check_Ras(){page.Random_Office_Check_Ras();}

}
