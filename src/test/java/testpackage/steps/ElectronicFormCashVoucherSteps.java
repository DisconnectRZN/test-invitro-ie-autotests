package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.ElectronicFormCashVoucherPage;

public class ElectronicFormCashVoucherSteps {
    ElectronicFormCashVoucherPage page;
    @When("Клик Ссылка на Юридическую информацию")
    public void clickUrInfoFuterMenu() {page.clickUrInfoFuterMenu();}
    @When("Клик Ссылка Электронная форма кассового чека")
    public void clickElectronicFormPage() {page.clickElectronicFormPage();}
    @When("Проверить Видимость Электронная форма кассового чека Заголовка")
    public void checkHeadlineElectronicForm() {page.checkHeadlineElectronicForm();}
    @When("Проверить Видимость Электронная форма кассового чека Сайт-бар слева")
    public void checkSideBarElectronicForm() {page.checkSideBarElectronicForm();}
    @When("Проверить Видимость Электронная форма кассового чека Центральный информационный блок")
    public void checkInformationBlockInformationBlockElectronicForm() {page.checkInformationBlockInformationBlockElectronicForm();}

}
