package testpackage.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;


@DefaultUrl("https://client-login.sandbox.gboteam.ru/")
public class AuthorizationAndLKPage extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();
    @Managed(uniqueSession = true, clearCookies = BeforeEachTest)
    // Локаторы окна авторизации
    private final By EnterInSite = By.xpath("//*[@id='header_button_login']");// Кнопка 'Вход в кабинет пациента(открыть окно Авторизации)'
    private final By EnterInLKPage = By.xpath("//div[contains(text(),'Войти')]");// Вкладка 'Войти'
    private final By EnterInLKText = By.xpath("//div[contains(text(),'Вход в личный кабинет')]");//Текст 'Вход в личный кабинет'
    private final By EnterInLKBlock = By.xpath("//div[@class='tab-block']");// Блок формы 'Войти'
    private final By LoginFieldAuthorization = By.xpath("//*[@id='login']");// Поле ввода Логина
    private final By PasswordFieldAuthorization = By.xpath("//*[@id='password']");// Поле ввода Пароля
    private final By ViewPasswordAuthorization = By.xpath("//*[@class='form__pass-visible']");// Отобразить пароль Авторизации'
    private final By ForgotYourPasswordLink = By.xpath("//a[@class='autorisation__link-forgot link']");// Ссылка 'Забыли пароль?'
    private final By LKallowsYouBlock = By.xpath("//*[@class='popup-enter__right']");// Блок 'Личный кабинет дает возможность'
    private final By IconTestTube = By.xpath("//*[contains(@class,'icon icon-enter-1')]");// Иконка пробирка
    private final By IconPrivilege = By.xpath("//*[contains(@class,'icon icon-enter-3')]");// Иконка привелегии
    private final By IconBook = By.xpath("//*[contains(@class,'icon icon-enter-4')]]");// Иконка книга
    private final By EnterInLK = By.xpath("//*[@value='Войти']");// Кнопка 'Войти в ЛК'
    private final By LoginAfterAvtorization = By.xpath("//button[contains(text(),'autotest.invitro@gmail.com')]");// Текст логина под которым прошла авторизация''
    private final By ExitAfterAvtorization = By.xpath("//*[@id='header_logout_button']");// Кнопка 'Выйти' из учетной записи

    // Локаторы окна Забыли пароль?
    private final By LoginFieldInForgotYourPassword = By.xpath("//*[@id='loginForgot']");// Поле ввода Email или телефон
    private final By BackToTheAuthorizationPage = By.xpath("//*[contains(text(),'Авторизация')]");// Вернуться на вкладку 'Авторизация'
    private final By RestorePasswordButton = By.xpath("//*[@name='Forgot']");// Кнопка 'Востановить пароль'

    // Локаторы окна регистрации
    private final By SignUpInLKPage = By.xpath("//div[contains(text(),'Зарегистрироваться')]");// Вкладка 'Регистрация'
    private final By SignUpInLKBlock = By.xpath("//div[@class='article__tab']");// Блок формы 'Зарегистрироваться'
    private final By LoginFieldCheckIn = By.xpath("//*[@id='loginReg']");// Поле ввода Логина
    private final By PasswordFieldCheckIn = By.xpath("//*[@id='passwordReg']");// Поле ввода Пароля
    private final By RepeatPasswordFieldCheckIn = By.xpath("//*[@id='passwordRepeat']");// Поле ввода Повторить пароль
    private final By ConsentUslugi = By.xpath("//*[@class='checkbox__item']");// Поле согласия с Условиями предоставления услуг
    private final By TermsOfService = By.xpath("//*[@class='link link--inv']");// Ссылка 'Условия предоставления услуг'
    private final By SubmitButton = By.xpath("//*[@class='btn-icon btn-icon--fill btn--full js-button-submit']");// Кнопка 'Зарегистрироваться'


    // Методы окна Авторизации

    public void сlickEnterInSite() {

        help.Click_Method(EnterInSite);
    }

    public void checkEnterInLKPage() {

        help.Check_Enabled_Element(EnterInLKPage);
    }

    public void checkEnterInLKText() {

        help.Check_Enabled_Element(EnterInLKText);
    }

    public void checkEnterInLKBlock() {

        help.Check_Enabled_Element(EnterInLKBlock);
    }

    public void enterLoginFieldAuthorization() {

        help.Enter_Text(LoginFieldAuthorization, "autotest.invitro@gmail.com");
    }

    public void enterPasswordFieldAuthorization() {

        help.Enter_Text(PasswordFieldAuthorization, "12345");
    }

    public void сlickViewPasswordAuthorization() {

        help.Click_Method(ViewPasswordAuthorization);
    }

    public void checkForgotYourPasswordLink() {

        help.Check_Enabled_Element(ForgotYourPasswordLink);
    }


    public void сlickForgotYourPasswordLink() {

        help.Click_Method(ForgotYourPasswordLink);
    }

    public void checkLKallowsYouBlock() {

        help.Check_Enabled_Element(LKallowsYouBlock);
    }

    public void visibleIconTestTube() {

        help.Check_Visible_Element(IconTestTube);
    }

    public void visibleIconPrivilege() {

        help.Check_Visible_Element(IconPrivilege);
    }

    public void visibleIconBook() {

        help.Check_Visible_Element(IconBook);
    }

    public void сlickEnterInLK() {

        help.Click_Method(EnterInLK);
    }

    public void checkLoginAfterAvtorization() {

        help.Check_Enabled_Element(LoginAfterAvtorization);
    }


    public void сlickExitAfterAvtorization() {

        help.Click_Method(ExitAfterAvtorization);
    }


    // Методы окна Востановить пароль

    public void enterLoginFieldInForgotYourPassword() {

        help.Enter_Text(LoginFieldInForgotYourPassword, "autotest.invitro@gmail.com");
    }

    public void сlickBackToTheAuthorizationPage() {

        help.Click_Method(BackToTheAuthorizationPage);
    }


    public void сlickRestorePasswordButton() {

        help.Click_Method(RestorePasswordButton);
    }

    // Методы окна Зарегистрироваться


    public void сlickSignUpInLKPage() {

        help.Click_Method(SignUpInLKPage);
    }

    public void checkSignUpInLKBlock() {

        help.Check_Enabled_Element(SignUpInLKBlock);
    }

    public void enterLoginFieldCheckIn() {

        help.Enter_Text(LoginFieldCheckIn, "autotest.invitro@gmail.com");
    }

    public void enterPasswordFieldCheckIn() {

        help.Enter_Text(PasswordFieldCheckIn, "12345");
    }

    public void enterRepeatPasswordFieldCheckIn() {

        help.Enter_Text(RepeatPasswordFieldCheckIn, "12345");
    }

    public void сlickConsentUslugi() {

        help.Click_Method(ConsentUslugi);
    }

    public void сlickTermsOfService() {

        help.Click_Method(TermsOfService);
    }

    public void сlickSubmitButton() {

        help.Click_Method(SubmitButton);
    }


}
