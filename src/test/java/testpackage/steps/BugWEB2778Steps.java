package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.BugWEB2778Page;

public class BugWEB2778Steps {
    BugWEB2778Page page;

    @When("Проверка видимости города Москва")
    public void verifyCityMosk() {page.verifyCityMosk();}

    @When("Проверка номера телефона 8 800 200-363-0")
    public void verifyTel8800() {page.verifyTel8800();}

    @When("Проверить номер телефона 363-0-363 для Москвы")
    public void verifyTel7495() {page.verifyTel7495();}

    @When("Проверить Номер телефона в шапке 49-68-33 для Магнтогорска")
    public void verifyTel7351() {page.verifyTel7351();}

    @When("Проверить видимость Анализы")
    public void checkAnalizi() {page.checkAnalizi();}

    @When("Проверить видимость Адреса")
    public void checkAdresa() {page.checkAdresa();}

    @When("Проверить видимость Акции")
    public void checkAkcii() {page.checkAkcii();}

    @When("Проверить видимость Выезд на дом")
    public void checkViezdNaDom() {page.checkViezdNaDom();}

    @When("Проверить видимость Запись к врачу")
    public void checkZapisKVrachu() {page.checkZapisKVrachu();}

    @When("Проверить видимость Медецинские услуги")
    public void checkMedUslugi() {page.checkMedUslugi();}

    @When("Проверить видимость Комплексные обследования")
    public void checkKompleksObsltd() {page.checkKompleksObsltd();}

    @When("Клик по названию города")
    public void clickCityLabel() {page.clickCityLabel();}

    @When("Клик Выбрать другой")
    public void clickVibratDrug() {page.clickVibratDrug();}

    @When("Клик по букве М")
    public void clickBukvaM() {page.clickBukvaM();}

    @When("Клик по Магнитогорску")
    public void clickMagnitogorsk() {page.clickMagnitogorsk();}

    @When("Проверить видимость надписи города Магнитогорск")
    public void verifyCityMagnit() {page.verifyCityMagnit();}

    @When("Нажать на логотип Инвитро")
    public void clickLogotip() {page.clickLogotip();}



}
