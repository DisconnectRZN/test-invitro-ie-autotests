package testpackage.steps;


import cucumber.api.java.en.When;
import testpackage.pages.AuthorizationAndLKPage;

public class AuthorizationAndLKSteps {
    AuthorizationAndLKPage page;

    // Вкладка Авторизации(Входа)

    @When("^Кликнуть по кнопке 'Вход в кабинет пациента'$")
    public void сlickEnterInSite () { page.сlickEnterInSite(); }

    @When("^Проверка отображения вкладки 'Войти'$")
    public void checkEnterInLKPage () { page.checkEnterInLKPage(); }

    @When("^Проверка отображения заголовка 'Вход в личный кабинет'$")
    public void checkEnterInLKText () { page.checkEnterInLKText(); }

    @When("^Проверка блока 'Вход в личный кабинет'$")
    public void checkEnterInLKBlock () { page.checkEnterInLKBlock(); }

    @When("^Проверка ввода логина в поле 'Логин'$")
    public void enterLoginFieldAuthorization () { page.enterLoginFieldAuthorization(); }

    @When("^Проверка ввода пароля в поле 'Пароль'$")
    public void enterPasswordFieldAuthorization () { page.enterPasswordFieldAuthorization(); }

    @When("^Кликнуть по кнопке 'Отобразить пароль'$")
    public void сlickViewPasswordAuthorization () { page.сlickViewPasswordAuthorization(); }

    @When("^Проверка отображения формы 'Забыли пароль'$")
    public void checkForgotYourPasswordLink () { page.checkForgotYourPasswordLink(); }

    @When("^Проверка отображения блока 'Личный кабинет дает возможность'$")
    public void checkLKallowsYouBlock () { page.checkLKallowsYouBlock(); }

    @When("^Проверка отображения иконки 'Пробирка'$")
    public void visibleIconTestTube () { page.visibleIconTestTube(); }

    @When("^Проверка отображения иконки 'Привелегии'$")
    public void visibleIconPrivilege () { page.visibleIconPrivilege(); }

    @When("^Проверка отображения иконки 'Книга'$")
    public void visibleIconBook () { page.visibleIconBook(); }

    @When("^Кликнуть по кнопке 'Войти'$")
    public void сlickEnterInLK () { page.сlickEnterInLK(); }

    @When("Проверка учетки под которой осуществленна авторизация")
    public void checkLoginAfterAvtorization () { page.checkLoginAfterAvtorization(); }

    @When("^Кликнуть по кнопке 'Выйти'$")
    public void сlickExitAfterAvtorization () { page.сlickExitAfterAvtorization(); }

    // Шаги окна Востановить пароль

    @When("^Кликнуть по кнопке 'Забыли пароль'$")
    public void сlickForgotYourPasswordLink () { page.сlickForgotYourPasswordLink(); }

    @When("^Кликнуть по кнопке возврата к окну 'Авторизация'$")
    public void сlickBackToTheAuthorizationPage () { page.сlickBackToTheAuthorizationPage(); }

    @When("^Проверка ввода логина в поле 'Логин' в форме 'Забыли пароль'$")
    public void enterLoginFieldInForgotYourPassword () { page.enterLoginFieldInForgotYourPassword(); }

    @When("^Кликнуть по кнопке 'Востановить пароль'$")
    public void сlickRestorePasswordButton () { page.сlickRestorePasswordButton(); }


    @When("^Кликнуть по вкладке 'Зарегистрироваться'$")
    public void сlickSignUpInLKPage () { page.сlickSignUpInLKPage(); }

    @When("^Проверка блока окна 'Регистрации'$")
    public void checkSignUpInLKBlock () { page.checkSignUpInLKBlock(); }

    @When("^Проверка ввода логина в поле 'Логин' окна 'Регистрации'$")
    public void enterLoginFieldCheckIn () { page.enterLoginFieldCheckIn(); }

    @When("^Проверка ввода пароля в поле 'Пароль' окна 'Регистрации'$")
    public void enterPasswordFieldCheckIn () { page.enterPasswordFieldCheckIn(); }

    @When("^Проверка ввода пароля в поле 'Повторить пароль' окна 'Регистрации'$")
    public void enterRepeatPasswordFieldCheckIn () { page.enterRepeatPasswordFieldCheckIn(); }

    @When("^Кликнуть по полю 'Согласия с Условиями предоставления услуг'$")
    public void сlickConsentUslugi () { page.сlickConsentUslugi(); }

    @When("^Кликнуть по ссылке 'Условия предоставления услуг'$")
    public void сlickTermsOfService () { page.сlickTermsOfService(); }

    @When("^Кликнуть по кнопке 'Зарегистрироваться'$")
    public void сlickSubmitButton () { page.сlickSubmitButton(); }

}
