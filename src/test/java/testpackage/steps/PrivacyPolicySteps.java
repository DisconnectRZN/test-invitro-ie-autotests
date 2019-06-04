package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.PrivacyPolicyPage;


public class PrivacyPolicySteps {
    PrivacyPolicyPage page;
    @When("Клик Ссылка Условия конфиденциальности")
    public void сlickPrivacyPolicyPage() {page.сlickPrivacyPolicyPage();}
    @When("Проверить 2 Видимость Заголовка Условия конфиденциальности")
    public void checkHeadlinePrivacyPolicy() {page.checkHeadlinePrivacyPolicy();}
    @When("Проверить 2 Видимость Сайт-бар слева Условия конфиденциальности")
    public void checkSideBarPrivacyPolicy() {page.checkSideBarPrivacyPolicy();}
    @When("Проверить 2 Видимость Центральный информационный блок Условия конфиденциальности")
    public void checkInformationBlockPrivacyPolicy() {page.checkInformationBlockPrivacyPolicy();}

}


