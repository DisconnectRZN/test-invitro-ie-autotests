package testpackage.steps;


import cucumber.api.java.en.When;
import testpackage.pages.PacientLKPage;

import java.util.List;

public class PacientLKSteps {
    PacientLKPage page;

    // шаги сценария создания мед карты

    @When("Ввести логин в поле Авторизации" )
    public void enterLoginFieldAuthorization() {
        page.enterLoginFieldAuthorization();
    }

    @When("Ввести пароль в поле Авторизации" )
    public void enterPasswordFieldAuthorization() {
        page.enterPasswordFieldAuthorization();
    }

    @When("Кликнуть выбрать мед карту" )
    public void сlickChooseMedCart() {
        page.clickChooseMedCart();
    }

    @When("Кликнуть добавить новую мед карту" )
    public void сlickAddNewMedCartPacient() {
        page.clickAddNewMedCartPacient();
    }

    @When("^Проверить отображение кнопки закрыть pop-up ЛК$" )
    public void visibleClosePopUpNewPacient() {
        page.visibleClosePopUpNewPacient();
    }

    @When("^Кликнуть радиобаттон Мужской пол pop-up ЛК$" )
    public void сlickChooseMalePacient() { page.clickChooseMalePacient(); }

    @When("^Кликнуть радиобаттон Женксий пол pop-up ЛК$" )
    public void сlickChooseFemalePacient() {
        page.clickChooseFemalePacient();
    }

    @When("^Ввести Фамилию пациента pop-up ЛК$" )
    public void enterAddSurnameField() {
        page.enterAddSurnameField();
    }

    @When("^Ввести Имя пациента pop-up ЛК$" )
    public void enterAddNameField() {
        page.enterAddNameField();
    }

    @When("^Ввести Отчество пациента pop-up ЛК$" )
    public void enterAddSecondnameField() {
        page.enterAddSecondnameField();
    }

    @When("^Ввести Дату рождения пациента pop-up ЛК$" )
    public void enterAddBirthdayField() {
        page.enterAddBirthdayField();
    }

    @When("^Ввести Телефон пациента pop-up ЛК$" )
    public void enterAddPhoneField() {
        page.enterAddPhoneField();
    }

    @When("^Ввести Email пациента pop-up ЛК$" )
    public void enterNewPacientEmailTField() {
        page.enterNewPacientEmailTField();
    }

    @When("^Кликнуть по кнопке Сохранить pop-up ЛК$" )
    public void сlickNewPacientSaveButton() {
        page.clickNewPacientSaveButton();
    }

    // шаги сценария оформления заказа

    @When("Проверка ввода логина в поле Авторизации" )
    public void enterLoginField() {
        page.enterLoginField();
    }

    @When("Проверка ввода пароля в поле Авторизации" )
    public void enterPasswordField() { page.enterPasswordField(); }

    @When("Кликнуть по кнопке Новый заказ" )
    public void сlickNewOrderButton() {
        page.clickNewOrderButton();
    }

    @When("Добавить в корзину Анализ 1" )
    public void сlickAddFirstAnalysis() {
        page.clickAddFirstAnalysis();
    }

    @When("Добавить в корзину Анализ 2" )
    public void сlickAddSecondClinicalBloodTest() {
        page.clickAddSecondClinicalBloodTest();
    }

    @When("Кликнуть развернуть раздел Гематологические исследования" )
    public void сlickNHematologicalStudies() {
        page.clickNHematologicalStudies();
    }

    @When("Добавить в корзину Анализ 3" )
    public void сlickAddThirdClinicalBloodTest() {
        page.clickAddThirdClinicalBloodTest();
    }

    @When("Добавить в корзину Анализ 4" )
    public void сlickсlickAddFourthClinicalBloodTest() {
        page.clickAddFourthClinicalBloodTest();
    }

    @When("Осуществить переход на страницу Корзины" )
    public void сlickGoToBasketButton() {
        page.clickGoToBasketButton();
    }

    @When("Проверить текст Корзина" )
    public void verifyBasketText() {
        page.verifyBasketText();
    }

    // Шапка Таблицы Корзина

    @When("^Проверка блока 'Заказанные анализы' в корзине$" )
    public void checkOrderedAnalyzesInBasketBlock() { page.checkOrderedAnalyzesInBasketBlock(); }

    @When("^Проверить текст Итого:$" )
    public void verifyTotalText() { page.verifyTotalText(); }

    @When("Проверить отображение Итоговой стоимости заказа")
    public void verifySumResultText() { page.verifySumResultText(); }

    @When("^Кликнуть по радиобаттону пациента 'Петров Петр Петрович'$" )
    public void clickChoosePacientOrderPage() { page.clickChoosePacientOrderPage(); }

    @When("Кликнуть по кнопке Оформить заказ" )
    public void сlickCheckoutOrderButton() { page.clickCheckoutOrderButton(); }

    @When("Проверить текст Оформление заказа" )
    public void verifyCheckoutOrderText() { page.verifyCheckoutOrderText(); }

    @When("Проверить текст Состав заказа" )
    public void verifyOrderListText() { page.verifyOrderListText(); }

    @When("^Проверка блока 'Заказанные анализы' на этапе оформления$" )
    public void checkOrderedAnalyzesBlock() { page.checkOrderedAnalyzesBlock(); }

    @When("Проверить текст Личные данные" )
    public void verifyPersonalDataText() { page.verifyPersonalDataText(); }

    @When("Проверить отображение блока Добавленного пациента" )
    public void checkAddNewMedCartPacientBlock() { page.checkAddNewMedCartPacientBlock(); }
/*
    @When("Кликнуть по кнопке Добавить пациента" )
    public void сlickAddNewMedCartPacientInBasket() { page.сlickAddNewMedCartPacientInBasket(); }

    @When("^Проверить текст Данные пациента pop-up Оформление заказа$" )
    public void verifyAddNewMedCartPacientText() { page.verifyAddNewMedCartPacientText(); }

    @When("^Проверить отображение кнопки закрыть pop-up Оформление заказа$" )
    public void visibleCloseButton() { page.visibleCloseButton(); }

    @When("^Проверить текст Пол pop-up Оформление заказа$" )
    public void verifyAddNewMedCartPolPacientText() { page.verifyAddNewMedCartPolPacientText(); }

    @When("^Кликнуть по радиобаттону Пациент мужского пола pop-up Оформление заказа$" )
    public void сlickAddNewMedCartMalePacient() { page.сlickAddNewMedCartMalePacient(); }

    @When("^Кликнуть по радиобаттону Пациент женского пола pop-up Оформление заказа$" )
    public void сlickAddNewMedCartFemalePacient() { page.сlickAddNewMedCartFemalePacient(); }

    @When("^Проверить текст Мужской pop-up Оформление заказа$" )
    public void verifyAddNewMedCartMalePacientText() { page.verifyAddNewMedCartMalePacientText(); }

    @When("^Проверить текст Женский pop-up Оформление заказа$" )
    public void verifyAddNewMedCartFemalePacientText() { page.verifyAddNewMedCartFemalePacientText(); }

    @When("^Проверить текст Фамилия pop-up Оформление заказа$" )
    public void verifyAddNewMedCartSurnameText() { page.verifyAddNewMedCartSurnameText(); }

    @When("^Ввести Фамилию пациента pop-up Оформление заказа$" )
    public void enterAddNewMedCartSurnameField() { page.enterAddNewMedCartSurnameField(); }

    @When("^Проверить текст Имя pop-up Оформление заказа$" )
    public void verifyAddNewMedCartNameText() { page.verifyAddNewMedCartNameText(); }

    @When("^Ввести Имя пациента pop-up Оформление заказа$" )
    public void enterAddNewMedCartNameField() { page.enterAddNewMedCartNameField(); }

    @When("^Проверить текст Отчество pop-up Оформление заказа$" )
    public void verifyAddNewMedCartSecondnameText() { page.verifyAddNewMedCartSecondnameText(); }

    @When("^Ввести Отчество пациента pop-up Оформление заказа$" )
    public void enterAddNewMedCartSecondnameField() { page.enterAddNewMedCartSecondnameField(); }

    @When("^Проверить текст Дата рождения pop-up Оформление заказа$" )
    public void verifyAddNewMedCartBirthdayText() { page.verifyAddNewMedCartBirthdayText(); }

    @When("^Ввести Дату рождения пациента pop-up Оформление заказа$" )
    public void enterAddNewMedCartBirthdayField() { page.enterAddNewMedCartBirthdayField(); }

    @When("^Проверить текст Телефон pop-up Оформление заказа$" )
    public void verifyAddNewMedCartPhoneText() { page.verifyAddNewMedCartPhoneText(); }

    @When("^Ввести Телефона пациента pop-up Оформление заказа$" )
    public void enterAddNewMedCartPhoneField() { page.enterAddNewMedCartPhoneField(); }

    @When("^Проверить текст E-mail pop-up Оформление заказа$" )
    public void verifyAddNewMedCartEmailText() { page.verifyAddNewMedCartEmailText(); }

    @When("^Ввести E-mail пациента pop-up Оформление заказа$" )
    public void enterAddNewMedCartEmailField() { page.enterAddNewMedCartEmailField(); }

    @When("^Кликнуть по кнопке Добавить pop-up Оформление заказа$" )
    public void сlickAddNewMedCartSaveButton() { page.сlickAddNewMedCartSaveButton(); }

    @When("Проверить отображение Иконки попапа пациент добавлен" )
    public void visibleAddNewMedCartIcon() { page.visibleAddNewMedCartIcon(); }

    @When("Проверить текст Новый пациент добавлен" )
    public void verifyAddPacientText() { page.verifyAddPacientText(); }

    @When("Кликнуть по кнопке Продолжить" )
    public void сlickContinueButton() { page.сlickContinueButton(); }
*/
    @When("Проверить текст Оплата" )
    public void verifyPaymentText() { page.verifyPaymentText(); }

    @When("Проверить отображение радиобаттона в Медицинском офисе" )
    public void visiblePaymentRadioButton() { page.visiblePaymentRadioButton(); }

    @When("Проверить текст В медицинском офисе" )
    public void verifyInTheMedicalOfficeText() { page.verifyInTheMedicalOfficeText(); }

    @When("Кликнуть по чекбоксу Я даю свое согласие на обработку персональных данных" )
    public void сlickCheckBoxPersonalData() { page.clickCheckBoxPersonalData(); }

    @When("Кликнуть ссылке Я даю свое согласие на обработку персональных данных" )
    public void сlickCheckBoxPersonalDataButton() { page.clickCheckBoxPersonalDataButton(); }

    @When("Проверить текст Итого страница Оформления заказа" )
    public void verifyAllTotalText() { page.verifyAllTotalText(); }

    @When("Проверить текст Итоговая стоимость страница Оформления заказа" )
    public void verifyAllSumResultText() { page.verifyAllSumResultText(); }

    @When("Проверка ввода логина")
    public void enterLoginFieldAuthorizations () { page.enterLoginFieldAuthorizations(); }

    @When("Проверка ввода пароля")
    public void enterPasswordFieldAuthorizations () { page.enterPasswordFieldAuthorizations(); }

    @When("Кликнуть Подтвердить заказ" )
    public void сlickConfirmOrder() { page.clickConfirmOrder(); }

    @When("Проверить текст Спасибо" )
    public void verifyThankText() { page.verifyThankText(); }

    @When("^Проверить текст Благодарим Вас за доверие, оказанное нашей компании$" )
    public void verifyThankText2() { page.verifyThankText2(); }

    @When("Проверить отображение Иконки скачать результат" )
    public void visibleDownloadOrderIcon() { page.visibleDownloadOrderIcon(); }

    @When("Кликнуть Скачать заказ" )
    public void сlickDownloadOrder() { page.clickDownloadOrder(); }

    @When("Проверить текст Заказ № на общую сумму успешно оформлен" )
    public void verifyOrderCreateText() { page.verifyOrderCreateText(); }

    @When("Кликнуть по учетной записи ЛК" )
    public void сlickReturnInLK() { page.clickReturnInLK(); }


    @When("^Проверить блок советы по изменению заказа$")
    public void проверитьБлокСоветыПоИзменениюЗаказа(List<String> lstSt) {
        for(int i =0 ; i<lstSt.size(); i++){
            page.TheBoardValues.add(lstSt.get(i));
        }
        page.verifyTheBoardBlock();
    }

    // Проверка создания предзаказа для неавторизованного пациента

    /*@When("Ввод логина на форме авторизации" )
    public void enterLoginAuthorization() { page.enterLoginAuthorization(); }

    @When("Ввод пароля на форме авторизации" )
    public void enterPasswordAuthorization() { page.enterPasswordAuthorization(); }*/

    @When("^Проверка авторизации, ввод Логина$" )
    public void enterLogin() { page.enterLogin(); }

    @When("^Проверка авторизации, ввод Пароля$" )
    public void enterPassword() { page.enterPassword(); }

    @When("Проверка наличия блока Личные данные" )
    public void VeriFyPersonalData() { page.verifyPersonalData(); }

    @When("Нажатие на кнопку Войти в блоке Личные данные" )
    public void enterLoginAuthorization() { page.clickButtonEnter(); }

    // Проверка оформления заказа с медкарты пациента у которого уже есть заказы

    @When("Перейти в раздел Оформление заказа")
    public void VeriFyBlockAnalises() {
        page.VeriFyBlockAnalises();
    }

    @When("^Кликнуть по медкарте пациента 'Петров Петр Петрович'$" )
    public void clickChoosePacientMedCart() { page.clickChoosePacientMedCart(); }

    @When("^Проверка Фамилии 'Петров' выбранной мед карты$" )
    public void verifyPacientSurnameText() { page.verifyPacientSurnameText(); }

    @When("^Проверка Имени 'Петр' выбранной мед карты$" )
    public void verifyPacientNameText() { page.verifyPacientNameText(); }

    @When("^Проверка Отчества 'Петрович' выбранной мед карты$" )
    public void verifyPacientSecondnameText() { page.verifyPacientSecondnameText(); }

    @When("^Проверка текста 'Дата рождения: 13.12.1988 - 30 лет' выбранной мед карты$" )
    public void verifyPacientBirthdayText() { page.verifyPacientBirthdayText(); }

    @When("Проверка отображения иконки блока лояльности" )
    public void visibleLoyaltyIcon() { page.visibleLoyaltyIcon(); }

    @When("^Проверка текста 'Вы не являетесь участником программы ИНВИТРО Здоровый плюс'$" )
    public void verifyConnectToLoyalty() { page.verifyConnectToLoyalty(); }

    @When("^Проверка текста 'Узнать подробности о программе и способе вступления'$" )
    public void verifyLearnMoreToLoyaltyProgrammText() { page.verifyLearnMoreToLoyaltyProgrammText(); }

    @When("^Кликнуть по ссылке 'Узнать подробности о программе и способе вступления'$" )
    public void clickLearnMoreToLoyaltyProgrammLink() { page.clickLearnMoreToLoyaltyProgrammLink(); }

    @When("^Проверка отображения блока 'Помогите нам стать лучше'$" )
    public void checkSubstrateInHelpToTheBest() { page.checkSubstrateInHelpToTheBest(); }

    @When("^Проверка отображения иконки блока 'Помогите нам стать лучше'$" )
    public void visibleIconHelpToTheBest() { page.visibleIconHelpToTheBest(); }

    @When("^Проверка отображения кнопки 'Перейти' в блоке 'Помогите нам стать лучше'$" )
    public void visibleGoToInHelpToTheBest() { page.visibleGoToInHelpToTheBest(); }

    @When("^Проверка ввода номера заказа 'LK000313882' в поле ввода поиска заказа$" )
    public void enterSearchInzPacientField() { page.enterSearchInzPacientField(); }

    @When("Кликнуть по кнопке поиска по номеру заказа" )
    public void clickSearchButton() { page.clickSearchButton(); }

    @When("Кликнуть по кнопке сброса фильтра" )
    public void clickClearFilter() { page.clickClearFilter(); }

    @When("^Кликнуть по кнопке закрыть Pop-up$" )
    public void clickCloseButton() { page.clickCloseButton(); }

    @When("^Кликнуть по фильтру 'Показать за период'$" )
    public void clickOpenFilterForPeriod() { page.clickOpenFilterForPeriod(); }

    @When("^Кликнуть по фильтру 'Показать за период - Месяц'$" )
    public void clickChooseFilterMonthPeriod() { page.clickChooseFilterMonthPeriod(); }

    @When("^Кликнуть по фильтру 'Статус заказа'$" )
    public void clickOpenFilterStatus() { page.clickOpenFilterStatus(); }

    @When("^Кликнуть по фильтру 'Статус заказа - Черновик'$" )
    public void clickChooseFilterStatus() { page.clickChooseFilterStatus(); }

    @When("^Кликнуть по кнопке 'Добавить результат'$" )
    public void clickAddResultButton() { page.clickAddResultButton(); }

    @When("^Проверка отображения поля ввода '№ заказа - ИНЗ в чеке'$" )
    public void visibleNumberINZField() { page.visibleNumberINZField(); }

    @When("^Проверка отображения поля ввода 'Дата рождения'$" )
    public void visibleAddResultBirthdayField() { page.visibleAddResultBirthdayField(); }

    @When("^Проверка отображения поля ввода 'Фамилия пациента'$" )
    public void visibleAddResultSurnameField() { page.visibleAddResultSurnameField(); }

    @When("^Проверка отображения кнопки 'Добавить'$" )
    public void visibleAddResultButtonInPopUp() { page.visibleAddResultButtonInPopUp(); }

/*    @When("Добавление анализа в корзину")
    public void ADDRandomAnalize(){ page.ADDRandomAnalize();    }*/

    @When("^Кликнуть по кнопке 'Новый заказ' с медкарты пациента уже имеющего заказы$" )
    public void clickAddNewOrderLK() { page.clickAddNewOrderLK(); }

    @When("^Проверка отображения блока 'Вопросы и Ответы'$" )
    public void visibleQuestionsAndAnswersBlock() { page.visibleQuestionsAndAnswersBlock(); }

}




