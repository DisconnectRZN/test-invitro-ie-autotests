package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.ChangeCityPage;

public class HeaderCitySteps {
    ChangeCityPage page;

    @When("Открыть меню выбора города" )
    public void OpenMenuChangeCity() {
        page.openMenuChangeCity();
    }
    @When ("Проверить надпись Да, верно")
    public void VerifyChangeYesOk(){
        page.verifyChangeYesOk();
    }
    @When ("Проверить надпись Выбрать другой")
    public void VerifyChengeThercity(){
        page.verifyChengeThercity();
    }
    @When ("Проверить надпись От выбранного города зависят цены и способы оплаты.")
    public void VerifyValuePricePayLabel(){
        page.verifyvaluepricepaylabel();
    }
    @When ("Проверить надпись Вы находитесь в городе")
    public void VerifyFindaCityLabel(){
        page.verifyfindacitylabel();
    }
    @When ("Проверить видимость элемента город")
    public void VerifyCityOnLabel(){
        page.verifycityonlabel();
    }
    @When ("Кликнуть на Да, верно")
    public void ClickChangeYesOk(){
        page.clickChangeYesOk();
    }
    @When ("Кликнуть на выбрать другой")
    public void clickChengeOtherCity(){
        page.clickchengeothercity();
    }
    //////////////////////////////////////////////////Окно выбора города//////////////////////////////////
    @When ("проверить надпись выбор города")
    public void verifyLabelChangeCity(){
        page.verifylabelchangecity();
    }
    @When ("проверить надпись страна Россия")
    public void verifyGovRus(){
        page.verifygovrus();
    }
    @When ("проверить надпись страна Беларусь")
    public void verifyGovBy(){
        page.verifygovby();
    }
    @When ("проверить надпись страна Казахстан")
    public void verifyGovKz(){
        page.verifygovkz();
    }
    @When ("проверить надпись страна Армения")
    public void verifyGovarm(){
        page.verifygovarm();
    }
    @When ("проверить надпись страна Кыргыстан")
    public void verifyGovKgs(){
        page.verifygovkgs();
    }
    @When ("проверить надпись крупные города")
    public void verifyBigCityLabel(){
        page.verifybigcitylabel();
    }
    @When ("проверить город Москва")
    public void verifyBigCityMoscow(){
        page.verifybigcityMoscow();
    }
    @When ("проверить город Санкт-Петербург")
    public void verifyBigCitySpiter(){
        page.verifybigcitySpiter();
    }
    @When ("проверить город Воронеж")
    public void verifyBigCityVoronej(){
        page.verifybigcityVoronej();
    }
    @When ("проверить город Екатеринбург")
    public void verifyBigCityEkaterinburg(){
        page.verifybigcityEkaterinburg();
    }
    @When ("проверить город Казань")
    public void verifyBigCityKazan(){
        page.verifybigcityKazan();
    }

    @When ("проверить город Красноярск")
    public void verifyBigcityBigcityKrasnoyarsk(){
        page.verifybigcitybigcityKrasnoyarsk();
    }

    @When ("проверить город Нижний Новгород")
    public void verifyBigCityNN(){
        page.verifybigcityNN();
    }

    @When ("проверить город Новосибирск")
    public void verifyBigCityNV(){
        page.verifybigcityNV();
    }

    @When ("проверить город Омск")
    public void verifyBigCityOM(){
        page.verifybigcityOM();
    }

    @When ("проверить город Ростов-на-Дону")
    public void verifyBigCityRND(){
        page.verifybigcityRND();
    }

    @When ("проверить город Самара")
    public void verifyBigCitySMR(){
        page.verifybigcitySMR();
    }

    @When ("проверить город Уфа")
    public void verifybigcityUFA(){
        page.verifybigcityUFA();
    }

    @When ("проверить город Челябинск")
    public void verifybigcityChe(){
        page.verifybigcityChe();
    }

    @When ("Проверить кнопку крестик")
    public void closecChangeCityButton(){
        page.closechangecitybutton();
    }

    @When ("Проверить ввод названия города")
    public void nameCityInput(){
        page.namecityinput();
    }

    @When ("Проверить иконку поиска города")
    public void iconFinderPic(){
        page.iconfinderpic();
    }

    @When("Выбрать город Азов")
    public void addCityAzov(){
        page.addazovCity();
    }

    @When("Выбрать город Москва")
    public void addCityMoscow(){
        page.addmoscowCity();
    }




}
