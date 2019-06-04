package testpackage.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

@DefaultUrl("https://www-test.invitro.ru/")

public class MainPage extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();
    private By HeaderMenu = By.xpath("//ul[@class='header-top-nav']");// Блок Header меню: Пациентам, Врачам, Франчайзинг, Корпоративным клиентам, Журналистам
    private By HeaderCity = By.xpath("//div[@class='city__label']");// Блок выбранного города в Header меню
    private By HeaderChangeCityPopUp = By.xpath("//div[@class='city__change']");// Pop-up выбора города(выпадашка)
    private By HeaderEnterInLK = By.xpath("//div[@class='header__login login']");// Кнопка 'Вход в кабинет пациента'
    private By InvitroLogo = By.xpath("//img[@src='/local/templates/invitro_main/src/image/elements/main-logo.svg']");// Логотип Инвитро
    private By HeaderPhoneBlock = By.xpath("//div[@class='header-phone']");// Блок номера телефонов
    private By Basket = By.xpath("//div[@class='header-cart__icon']");// Корзина
    private By OpenMainMenu = By.xpath("//div[@class='header-menu__btn-inner']");// Открытие меню бургер
    private By BurgerMenuBlock = By.xpath("//div[@class='row row--wrap row--start']"); // Блок Бургер меню
    private By CloseMainMenu = By.xpath("//button[@class='header-menu__btn ripple header-menu__btn--open']"); // Закрытие меню бургер
    private By MainMenuBlock = By.xpath("//ul[@class='header-nav__list nav-scroller-content']");// Блок основного меню: Анализы, Адреса, Акции, Выезд на дом, Запись к врачу, Медицинские услуги, Комплексные обследования
    private By GetTheTestResults = By.xpath("//button[@class='header-nav__get-result popupBtn']");// Форма получить результат анализов
    private By SearchInput = By.xpath("//*[@class='search__input']");// Строка поиска анализов
    private By SearchButton = By.xpath("//button[@name='s']");// Кнопка поиска
    private By ResultText = By.xpath("//div[@class='search-page__subtitle search-page__subtitle--color']");// Текст Количество найденных результатов
    private By AnalyzesText = By.xpath("//h2[contains(text(),'Анализы')]");// Текст Анализы
    private By ResultAfterSearchPage = By.xpath("//div[@class='result-item show-block show-block--active']");// Результат поиска
    private By Slider = By.xpath("//div[@class='main-slider slider-numeric show-block-wrap show']");// Слайдер с акциями
    private By DirectionsCompanyBlock = By.xpath("//div[@class = 'directions show-block']");// Блок направления компании
    private By DirectionsAnalyzesIcon = By.xpath("//img[@src='/upload/iblock/2eb/2ebc320961fea4cd4e3228805fb08a04.svg']");// Иконка Анализы
    private By DirectionsMedicalServicesIcon = By.xpath("//img[@src='/upload/iblock/8f6/8f68bfb300d3971284432f4d87f33f23.svg']");// Иконка Медицинские услуги
    private By DirectionsComplexIcon = By.xpath("//img[@src='/upload/iblock/474/474f7a1d59d79400968ade24bcb88fcb.svg']");// Иконка Комплексные обследования
    private By DirectionsDoctorServicesIcon = By.xpath("//img[@src='/upload/iblock/2db/2db82380661e1e42a2174682975b03a9.png']");// Иконка Услуги врачей
    private By FAQBlock = By.xpath("//div[@class = 'container container--no-border']");// Блок статьи
    private By NewsBlock = By.xpath("//section[@class='side-slider side-slider--news show-block side-slider--news-lg']");// Блок Новости
    private By AllNewsButton = By.xpath("//div[@class='side-nav__block']//a[@class = 'btn btn--empty']");// Кнопка Все новости
    private By DoctorsBlock = By.xpath("//section[@class='side-slider side-slider--doctors side-slider--blocks show-block side-slider--blocks-lg show-block--active']");// Блок Врачи-специалисты
    private By AllDoctorsButton = By.xpath("//div[@class='column--side side-nav__block']//a[@class = 'btn btn--empty']");// Кнопка Все врачи
    private By AboutCompanyBlock = By.xpath("//div[@class='count__inner']");// Блок коротко о компании
    private By AboutCompanyPlanetIcon = By.xpath("//img[@src='/local/templates/invitro_main/src/image/content/count-block/icon-count-1.svg']");// Иконка Планета
    private By AboutCompanyMicroscopeIcon = By.xpath("//img[@src='/local/templates/invitro_main/src/image/content/count-block/icon-count-2.svg']");// Иконка Микроскоп
    private By AboutCompanyMedicalOfficeIcon = By.xpath("//img[@src='/local/templates/invitro_main/src/image/content/count-block/icon-count-3.svg']");// Иконка МО
    private By AboutCompanyDoctorPhoto = By.xpath("//img[@src='/local/templates/invitro_main/src/image/content/count-block/count-bg.png']");// Иконка МО
    private By UpButton = By.xpath("//div[@class='up-button']");// Кнопка Наверх
    private By FooterMenuBlock = By.xpath("//div[@class='row ft__row']");// Блок футтер меню
    private By PrizeWinnerIcon = By.xpath("//img[@src='/local/templates/invitro_main/src/image/icons/quality.svg']");// Иконка МО
    private By IconFBinFooter = By.xpath("//a[@class = 'ft-social__link ft-social__link--fb']");//footer иконка Facebook
    private By IconOKinFooter = By.xpath("//a[@class = 'ft-social__link ft-social__link--ok']");//footer иконка Одноклассники
    private By IconVKinFooter = By.xpath("//a[@class = 'ft-social__link ft-social__link--vk']");//footer иконка VK
    private By IconYoutubeInFooter = By.xpath("//a[@class = 'ft-social__link ft-social__link--youtube']");//footer иконка YouTube
    private By IconInstInFooter = By.xpath("//a[@class = 'ft-social__link ft-social__link--instagram']");//footer иконка Instagram
    private By GroupOfCompaniesBlock = By.xpath("//div[@class = 'ft-partners--wrap']");// Блок Группа компаний ИНВИТРО
    private By LicenseBlock = By.xpath("//div[@class='ft-bottom__col']");// Блок Лицензия компании
    private By WorldIcon = By.xpath("//img[@src='/local/templates/invitro_main/src/image/content/footer/mir.svg']");// Иконка Мир
    private By MasterCardIcon = By.xpath("//img[@src='/local/templates/invitro_main/src/image/content/footer/mc.svg']");// Иконка MasterCard
    private By VisaIcon = By.xpath("//img[@src='/local/templates/invitro_main/src/image/content/footer/visa.svg']");// Иконка Visa
    private By AgeIcon = By.xpath("//div[@class='ft-bottom__age']");// Иконка Планета

    ////////////////////////////////////////////////Кнопки главной страницы\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By CheckCity = By.xpath("//span[@class='city__name city__btn city__name--label']");
    private By AnalyzesBtnMP = By.xpath("//a[@class='header-nav__link'][text() = 'Анализы']");
    private By AdressesBtnMP = By.xpath("//a[@class='header-nav__link'][text() = 'Адреса']");
    private By AqBtnMP = By.xpath("//a[@class='header-nav__link'][text() = 'Акции']");
    private By VNDBtnMP = By.xpath("//a[@class='header-nav__link'][text() = 'Выезд на дом']");
    private By ToDoctorBtnMP = By.xpath("//a[@class='header-nav__link'][text() = 'Запись к врачу']");
    private By MedServBtnMP = By.xpath("//a[@class='header-nav__link'][text() = 'Медицинские услуги']");
    private By ComplexResBtnMP = By.xpath("//a[@class='header-nav__link'][text() = 'Комплексные обследования']");

    private By AppCookie = By.xpath("//button[contains(@class,'attention-close-button')]");




    //поиск
    public MainPage Search(String search) {
        find(SearchInput).sendKeys(search);
        find(SearchButton).waitUntilClickable().click();
        return this;
    }
    
    public void checkResultText() {

        help.Check_Enabled_Element(ResultText);
    }

    public void checkAnalyzesText() {

        help.Check_Enabled_Element(AnalyzesText);
    }

    public void checkResultAfterSearchPage() {

        help.Check_Enabled_Element(ResultAfterSearchPage);
    }

    public void checkHeaderMenu() {

        help.Check_Enabled_Element(HeaderMenu);
    }

    public void checkHeaderCity() {

        help.Check_Enabled_Element(HeaderCity);
    }

    public void checkHeaderChangeCityPopUp() {

        help.Check_Enabled_Element(HeaderChangeCityPopUp);
    }

    public void checkHeaderEnterInLK() {

        help.Check_Enabled_Element(HeaderEnterInLK);
    }

    public void visibleInvitroLogo() {

        help.Check_Visible_Element(InvitroLogo);
    }

    public void checkHeaderPhoneBlock() {

        help.Check_Enabled_Element(HeaderPhoneBlock);
    }

    public void checkBasket() {

        help.Check_Enabled_Element(Basket);
    }

    public void сlickOpenMainMenu() throws InterruptedException {

        help.Click_Method(OpenMainMenu);
        Thread.sleep(3000);
        if (find(BurgerMenuBlock).isVisible()){
            System.out.println("Раскрылось бургер меню");
        }
        else {
            assert (false ):  "Не раскрылось бургер меню";
        }

    }

    public void checkBurgerMenuBlock() {
        help.Check_Enabled_Element(BurgerMenuBlock);
    }

    public void сlickCloseMainMenu() throws InterruptedException {

        help.Click_Method(CloseMainMenu);
        Thread.sleep(3000);
    }

    public void checkMainMenuBlock() {

        help.Check_Enabled_Element(MainMenuBlock);
    }

    public void checkGetTheTestResults() {

        help.Check_Enabled_Element(GetTheTestResults);
    }

    public void checkSearchInput() {

        help.Check_Enabled_Element(SearchInput);
    }

    public void checkSearchButton() {

        help.Check_Enabled_Element(SearchButton);
    }

    public void checkSlider() {

        help.Check_Enabled_Element(Slider);
    }

    public void checkDirectionsCompanyBlock() {

        help.Check_Enabled_Element(DirectionsCompanyBlock);
    }

    public void visibleDirectionsAnalyzesIcon() {

        help.Check_Visible_Element(DirectionsAnalyzesIcon);
    }

    public void visibleDirectionsMedicalServicesIcon() {

        help.Check_Visible_Element(DirectionsMedicalServicesIcon);
    }

    public void visibleDirectionsComplexIcon() {

        help.Check_Visible_Element(DirectionsComplexIcon);
    }

    public void visibleDirectionsDoctorServicesIcon() {

        help.Check_Visible_Element(DirectionsDoctorServicesIcon);
    }

    public void checkFAQBlock() {

        help.Check_Enabled_Element(FAQBlock);
    }

    public void checkNewsBlock() {

        help.Check_Enabled_Element(NewsBlock);
    }

    public void checkAllNewsButton() {

        help.Check_Enabled_Element(AllNewsButton);
    }

    public void checkDoctorsBlock() {

        help.Check_Enabled_Element(DoctorsBlock);
    }

    public void checkAllDoctorsButton() {

        help.Check_Enabled_Element(AllDoctorsButton);
    }

    public void checkAboutCompanyBlock() {

        help.Check_Enabled_Element(AboutCompanyBlock);
    }

    public void visibleAboutCompanyPlanetIcon() {

        help.Check_Visible_Element(AboutCompanyPlanetIcon);
    }

    public void visibleAboutCompanyMicroscopeIcon() {

        help.Check_Visible_Element(AboutCompanyMicroscopeIcon);
    }

    public void visibleAboutCompanyMedicalOfficeIcon() {

        help.Check_Visible_Element(AboutCompanyMedicalOfficeIcon);
    }

    public void visibleAboutCompanyDoctorPhoto() {

        help.Check_Visible_Element(AboutCompanyDoctorPhoto);
    }

    public void checkUpButton() {

        help.Check_Enabled_Element(UpButton);
    }

    public void checkFooterMenuBlock() {

        help.Check_Enabled_Element(FooterMenuBlock);
    }

    public void visiblePrizeWinnerIcon() {

        help.Check_Visible_Element(PrizeWinnerIcon);
    }

    public void visibleIconFBinFooter() {

        help.Check_Visible_Element(IconFBinFooter);
    }

    public void visibleIconOKinFooter() {

        help.Check_Visible_Element(IconOKinFooter);
    }

    public void visibleIconVKinFooter() {

        help.Check_Visible_Element(IconVKinFooter);
    }

    public void visibleIconYoutubeInFooter() {

        help.Check_Visible_Element(IconYoutubeInFooter);
    }

    public void visibleIconInstInFooter() {

        help.Check_Visible_Element(IconInstInFooter);
    }

    public void checkGroupOfCompaniesBlock() {

        help.Check_Enabled_Element(GroupOfCompaniesBlock);
    }


    public void checkLicenseBlock() {

        help.Check_Enabled_Element(LicenseBlock);
    }

    public void visibleWorldIcon() {

        help.Check_Visible_Element(WorldIcon);
    }

    public void visibleMasterCardIcon() {

        help.Check_Visible_Element(MasterCardIcon);
    }

    public void visibleVisaIcon() {

        help.Check_Visible_Element(VisaIcon);
    }

    public void visibleAgeIcon() {

        help.Check_Visible_Element(AgeIcon);
    }

    ///////////////////////////////////////////////Жесткая проверка кнопок города Москва\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void checkAnalyzesBtn() {
        if (find(CheckCity).getText().equals("Москва")) {
            if (isElementVisible(AnalyzesBtnMP)){
                System.out.println("Кнопка отображается");
            } else {
                assert (false) : ("Кнопка не отображается");
            }
        } else {
            assert (false) : ("Был выбран город " + find(CheckCity).getText() + ", вместо Москвы");
        }
    }


    public void checkAdressesBtnMP() {
        if (find(CheckCity).getText().equals("Москва")) {
            if (isElementVisible(AdressesBtnMP)){
                System.out.println("Кнопка отображается");
            } else {
                assert (false) : ("Кнопка не отображается");
            }
        } else {
            assert (false) : ("Был выбран город " + find(CheckCity).getText() + ", вместо Москвы");
        }
    }

    public void checkAqBtnMP() {
        if (find(CheckCity).getText().equals("Москва")) {
            if (isElementVisible(AqBtnMP)){
                System.out.println("Кнопка отображается");
            } else {
                assert (false) : ("Кнопка не отображается");
            }
        } else {
            assert (false) : ("Был выбран город " + find(CheckCity).getText() + ", вместо Москвы");
        }
    }

    public void checkVNDBtnMP() {
        if (find(CheckCity).getText().equals("Москва")) {
            if (isElementVisible(VNDBtnMP)){
                System.out.println("Кнопка отображается");
            } else {
                assert (false) : ("Кнопка не отображается");
            }
        } else {
            assert (false) : ("Был выбран город " + find(CheckCity).getText() + ", вместо Москвы");
        }
    }

    public void checkToDoctorBtnMP() {
        if (find(CheckCity).getText().equals("Москва")) {
            if (isElementVisible(ToDoctorBtnMP)){
                System.out.println("Кнопка отображается");
            } else {
                assert (false) : ("Кнопка не отображается");
            }
        } else {
            assert (false) : ("Был выбран город " + find(CheckCity).getText() + ", вместо Москвы");
        }
    }

    public void checkMedServBtnMP() {
        if (find(CheckCity).getText().equals("Москва")) {
            if (isElementVisible(MedServBtnMP)){
                System.out.println("Кнопка отображается");
            } else {
                assert (false) : ("Кнопка не отображается");
            }
        } else {
            assert (false) : ("Был выбран город " + find(CheckCity).getText() + ", вместо Москвы");
        }
    }

    public void checkComplexResBtnMP() {
        if (find(CheckCity).getText().equals("Москва")) {
            if (isElementVisible(ComplexResBtnMP)){
                System.out.println("Кнопка отображается");
            } else {
                assert (false) : ("Кнопка не отображается");
            }
        } else {
            assert (false) : ("Был выбран город " + find(CheckCity).getText() + ", вместо Москвы");
        }
    }

    public void AcceptCookie() {
        if(find(AppCookie).isVisible()){
            find(AppCookie).waitUntilClickable().click();
        }
    }



}



