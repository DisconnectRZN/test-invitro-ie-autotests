package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

import java.util.ArrayList;
import java.util.List;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;


public class AboutCompanyPage extends PageObject {

    private static final Help_Methods help = Help_Methods.getInstance();


    //public ArrayList<String> HistoryRightValues = new ArrayList();
    //public ArrayList<String> HistoryLeftValues = new ArrayList();

    public ArrayList<String> HistoryYearValues = new ArrayList();
    public ArrayList<String> GroupOfCompaniesValues = new ArrayList();

    //public ArrayList<String> SpecialEthicsValues = new ArrayList();

    private By HistoryRightBlock = By.xpath("//div[@class='history-block__container-right']/ancestor-or-self::*[1]//p"); // История компании правого блока
    private By HistoryLeftBlock = By.xpath("//div[@class='history-block__container-left']/ancestor-or-self::*[1]//p"); // История компании левого блока
    private By HistoryYearCompanyText = By.xpath("//div[@class='history-block__year']"); // Текст года 'История компании'
    private By GroupOfCompaniesInvitro = By.xpath("//div[@class='company-group__item']/ancestor-or-self::*[1]//p"); // Группа компании инвитро
   // private By WorkInInvitroInterviewQuestion = By.xpath("//div[@class='greenblock']/ancestor-or-self::*[1]"); // Группа компании инвитро

    //private By SpecialEthicsTextBlock = By.xpath("//div[@class='article ']/ancestor-or-self::*[1]//p");// Блок текста страницы 'Особая этика'

    @Managed(uniqueSession = true, clearCookies=BeforeEachTest)

    //////////////////////////////////// Раздел Об Инвитро(Блоки о компании)\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By AboutCompanyInBurger = By.xpath("//a[@class='header-menu__link header-menu__link--title'][contains(text(),'Об ИНВИТРО')]");// Кликнуть 'Об ИНВИТРО' в бургер меню
    private By AboutCompanyHeadline = By.xpath("//h1[contains(text(),'О компании')]");// Заголовок 'О компании'
    private By AboutInvitroMenu = By.xpath("//*[@class='side-bar side-bar--alt']");// Левое меню раздела 'Об Инвитро.'
    private By AboutInvitroBlock = By.xpath("//div[@class='service-home-about']");// Блок Описание компании
    private By AboutCompanyFoto1 = By.xpath("//*[@src='/upload/medialibrary/5d0/5d00a45dd8d12204ebe8e76b58e35cad.jpg']");// Фото блока о компании
    private By AboutCompanyMore = By.xpath("//div[@class='about-features__item']//parent::*[1]");// Блоки более
    private By AboutCompanyMore2 = By.xpath("//div[@class='about-index__row']");// Блоки более 2
    private By DirectorBlock = By.xpath("//div[@class='about-index-blockquote']");// Блок с фото Александра Юрьевича Островского
    private By DirectorFoto = By.xpath("//*[@src='/local/templates/invitro_main/src/image/content/about/persone.png']");// Фото Александра Юрьевича Островского
    private By PortraitEmployee = By.xpath("//*[@src='/local/templates/invitro_main/src/image/content/about/personal.png']");// Фото Портрет среднестатического сотрудника
    private By PortraitEmployeeTextBlock = By.xpath("//div[@class='about-index-personal']");// Блок 'Портрет среднестатического сотрудника'
    private By PatientsPerYearIcon = By.xpath("//*[@src='/local/templates/invitro_main/src/image/content/services/icon-services-main-1.svg']");// Иконка блока 'Пациентов в год'
    private By MedOfficesIcon = By.xpath("//*[@src='/local/templates/invitro_main/src/image/content/services/icon-services-main-9.svg']");// Иконка блока 'Медицинских офисов'
    private By NumberOfLaboratoriesIcon = By.xpath("//*[@src='/local/templates/invitro_main/src/image/content/services/icon-services-main-12.svg']");// Иконка блока 'Количество лабораторий'
    private By TheNumberOfTestsIcon = By.xpath("//*[@src='/local/templates/invitro_main/src/image/content/services/icon-services-main-13.svg']");// Иконка блока 'Количство тестов'
    private By MileageAvtoParkIcon = By.xpath("//*[@src='/local/templates/invitro_main/src/image/content/services/icon-services-main-17.svg']"); // Иконка блока 'Пробег московского автопарка'
    private By NumberOfCallsProcessedIcon = By.xpath("//*[@src='/local/templates/invitro_main/src/image/content/services/icon-services-main-10.svg']");// Иконка блока 'Количество обработанных звонков'
    private By MedicalServicesIcon = By.xpath("//*[@src='/local/templates/invitro_main/src/image/content/services/icon-services-main-14.svg']");// Иконка блока 'Медицинских услуг'
    private By ProfessionalAwardsIcon = By.xpath("//*[@src='/local/templates/invitro_main/src/image/content/services/icon-services-main-15.svg']"); // Иконка блока 'профессиональных наград'
    private By TrainingProgramsForMedicalIcon = By.xpath("//*[@src='/local/templates/invitro_main/src/image/content/services/icon-services-main-16.svg']"); // Иконка блока 'учебных программ для медицинского персанала'

    ///////////////////////// Блок 'Руководство', 'Пресс-релизы', 'Фото и видео'\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By LeadershipBlock = By.xpath("//section[@class='side-slider side-slider--blocks show-block side-slider--blocks-sm']"); // Блок 'Руководство'
    private By PressReleasesBlock = By.xpath("//section[@class='side-slider side-slider--news show-block side-slider--news-xs']"); // Блок 'Пресс-релизы'
    private By PhotoAndVideoBlock = By.xpath("//section[@class='side-slider side-slider--blocks show-block side-slider--blocks-xs']"); // Блок 'Фото и видео'

    ////////////////////////////////////////////////// Страница История\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By HistoryButton = By.xpath("//a[@class='side-bar-second__link'][contains(text(),'История')]"); // Кнопка 'История' в левом меню
    private By HistoryCompanyHeadline = By.xpath("//h1[contains(text(),'История компании')]"); // Текст 'История компании'

    ////////////////////////////////////////////// Страница Руководство\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By LeadershipPageButton = By.xpath("//a[@class='side-bar-second__link'][contains(text(),'Руководство')]"); // Кнопка 'Руководство' в левом меню
    private By LeadershipPageText = By.xpath("//h1[contains(text(),'Руководство')]"); // Текст 'Руководство'
    private By LeadershipPageBlock = By.xpath("//div[@class='manager-list']"); // Проверка блока Руководство
    private By DirectorInvitroPhoto = By.xpath("//*[@src='/upload/iblock/ccd/ccd42bb1c675ee60733366941a966936.jpg']");// Фото Александра Юрьевича Островского
    private By DeputyDirectorPhoto = By.xpath("//*[@src='/upload/iblock/a68/a687ac7358d8546afa43837657a30e80.jpg']");// Фото Левашова Виталина Владимировна
    private By FinancialDirectorPhoto = By.xpath("//*[@src='/upload/iblock/5fa/5fae7732b33e9cc61c8c28cd8b1a9d7d.jpg']");// Фото Наталья Ивановна Баранова
    private By DirectorOfTechnologyPhoto = By.xpath("//*[@src='/upload/iblock/235/235b29f6b827f3c9bdcf637b54c6e5f2.jpg']");// Фото Елена Анатольевна Кондрашева
    private By CorporateCommunicationsDirectorPhoto = By.xpath("//*[@src='/upload/iblock/aac/aacd6a3e73992e6ef6dbf9c03c25cfc6.jpg']");// Фото Антон Владимирович Буланов
    private By StrategyCommitteeMemberNamePhoto = By.xpath("//*[@src='/upload/iblock/347/3478ca05ff355d95a871bd1534d7764f.jpg']"); // Фото Евгений Васильевич Печковский
    private By DirectorOfInvitroUralPhoto = By.xpath("//*[@src='/upload/iblock/739/739c2ba8bbd8ee3693965c2851510de3.jpg']");// Фото Андрей Николаевич Тарасов
    private By DirectorOfInvitroSiberiaPhoto = By.xpath("//*[@src='/upload/iblock/c71/c71d8119c667e1bfb339b07de57377c1.jpg']");// Фото Александр Сергеевич Хамидулин
    private By DirectorInvitroNorthWestPhoto = By.xpath("//*[@src='/upload/iblock/f40/f40a050d23fb3f3556c6d50f805a5e10.jpg']");// Фото Елена Леонидовна Чернер
    private By DirectorInvitroSamaraPhoto = By.xpath("//*[@src='/upload/iblock/bd1/bd1b7101a5d578896136576cfc5727fd.jpg']");// Фото Андрей Андреевич Логвин

    ///////////////////////////////////// Страница Группа компаний ИНВИТРО\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By GroupOfCompaniesButton = By.xpath("//a[@class='side-bar-second__link'][contains(text(),'Группа компаний ИНВИТРО')]");// Кнопка 'Группа компании Инвитро' в левом меню
    private By GroupOfCompaniesText = By.xpath("//h1[contains(text(),'Группа компаний ИНВИТРО')]");// Заголовок 'Группа компании Инвитро'
    private By InvitroBrandText = By.xpath("//p[@class='main']");// Текст 'Инвитро Бренд'
    private By HigherMedicalSchoolIcon = By.xpath("//img[@src='/upload/iblock/d71/d713cfb1868dab01db8606de86f6b9aa.png']");// Иконка блока Высшая медицинская школа
    private By DoctorIsNearIcon = By.xpath("//img[@src='/upload/iblock/ed8/ed885f52e615d18b7e89745989d48233.png']");// Иконка блока Доктор рядом
    private By Doctor24Icon = By.xpath("//img[@src='/upload/iblock/1fb/1fb8fcc7850a1e86b7763e96a95266b1.png']");// Иконка блока Доктор 24
    private By Med2MedIcon = By.xpath("//img[@src='/upload/iblock/1a9/1a94455bb50b79ee280bfd9ffdc83260.png']");// Иконка блока MED2MED
    private By UnicumIcon = By.xpath("//img[@src='/upload/iblock/0e6/0e6fcf2941fcfc21395b366c1ec3bb8e.png']"); // Иконка блока UNICUM
    private By BioprintingSolutionsIcon = By.xpath("//img[@src='/upload/iblock/7d1/7d17ed998008529f1d26a32635da1f85.png']");// Иконка блока 3dBIO
    private By ArchmedstroyIcon = By.xpath("//img[@src='/upload/iblock/76c/76cf434de2c8ca44ad6a100c7d7fb500.png']");// Иконка блока Архмедстрой
    private By VetUnionIcon = By.xpath("//img[@src='/upload/iblock/91e/91e27cc1836a79587c5ad3fe4853d40d.png']");// Иконка блока VetUnion
    private By LechuIcon = By.xpath("//img[@src='/upload/iblock/b8a/b8a8c875dbef9ee1e25593ca28b6b671.png']");// Иконка блока Лечу.ru

    //////////////////////////////////////////////// Страница Качество\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By QualityButton = By.xpath("//a[@class='side-bar-second__link'][contains(text(),'Качество')]");// Кнопка 'Качество' в левом меню
    private By QualityText = By.xpath("//h1[contains(text(),'Качество')]");// Заголовок 'Качество'
    private By QualityBlock = By.xpath("//div[@class='service-home-block service-home-block--intro-alt']");// Блок 'Качество подтверждено'
    private By QualityPicture1 = By.xpath("//img[@src='/local/templates/invitro_main/src/image/content/about/about-quality-bg.jpg']");// Картинка Лауриат премии
    private By QualityIcon1 = By.xpath("//img[@src='/local/templates/invitro_main/src/image/icons/quality.svg']");// Иконка Лауриат премии в области качества
    private By GovernmentPrizesBlock = By.xpath("//div[@class='article article--first']");// Блок 'Вручении премии Правительства РФ в области качества'
    private By QualityPhotoAndVideoBlock = By.xpath("//section[@class='side-slider side-slider--blocks show-block side-slider--blocks-sm']");// Блок фото и видео
    private By QualityPoliticBlock = By.xpath("//div[@class='article article--first']");// Блок Политика в области качества
    private By QualityFlagsBlock = By.xpath("//div[@class='about-quality-flags']");// Блок с флагами
    private By QualityInvitroBlock = By.xpath("//section[@class='about-quality-steps']");// Блок ИНВИТРО обеспечивает максимальную точность
    private By QualitySixthSigmsBlock = By.xpath("//section[@class='about-quality__block']");// Блок Шесть сигм
    private By QualityInvitroPartnersBlock = By.xpath("//div[@class='about-quality__text-acc']");// Блок ИНВИТРО развивает партнерские отношения
    private By QualityInvitroVideoBlock = By.xpath("//div[@class='video-overlay']");// Блок Видео Росскачество подтвердило успех компании
    private By QualityLaboratoryBlock = By.xpath("//section[@class='about-quality-video']");// Блок Лаборатория ИНВИТРО + Видео
    private By QualityHistory = By.xpath("//section[@class='about-quality-success-history']");// Блок История успеха
    private By QualityIcon2 = By.xpath("//img[@src='/local/templates/invitro_main/src/image/icons/flag-ru.svg']");// Иконка Флаг РФ
    private By QualityIcon3 = By.xpath("//img[@src='/local/templates/invitro_main/src/image/icons/flag-uk.svg']");// Иконка Флаг UK
    private By QualityIcon4 = By.xpath("//img[@src='/local/templates/invitro_main/src/image/icons/flag-usa.svg']");// Иконка Флаг USA
    private By QualityIcon5 = By.xpath("//img[@src='/local/templates/invitro_main/src/image/content/about/sigma-icon.png']");// Иконка Сигма
    private By QualityIcon6 = By.xpath("//img[@src='/local/templates/invitro_main/src/image/content/about/about-quality-reagents-1.jpg']");// Картинка Оборудование и реагенты 1
    private By QualityIcon7 = By.xpath("//img[@src='/local/templates/invitro_main/src/image/content/about/about-quality-reagents-2.jpg']");// Картинка Оборудование и реагенты 2
    private By QualityIcon8 = By.xpath("//img[@src='/local/templates/invitro_main/src/image/icons/cup.svg']");// Иконка кубок
    private By QualityIcon9 = By.xpath("//img[@src='/local/templates/invitro_main/src/image/icons/medal.svg']");// Иконка медаль

    ///////////////////////////////////////////////// Страница Особая этика\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By SpecialEthicsButton = By.xpath("//a[@class='side-bar-second__link'][contains(text(),'Особая этика')]");// Кнопка 'Особая этика' в левом меню
    private By SpecialEthicsHeadline = By.xpath("//h1[contains(text(),'Особая этика')]");// Заголовок 'Особая этика' в левом меню
    private By SpecialEthicsAllTextBlock = By.xpath("//div[@class='content__inner']");// Блок всего текста страницы 'Особая этика'

    //////////////////////////////////////////// Страница Инновационная политика\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By InnovativePolicyButton = By.xpath("//a[@class='side-bar-second__link'][contains(text(),'Инновационная политика')]");// Кнопка 'Инновационная политика' в левом меню
    private By InnovativePolicyHeadline = By.xpath("//h1[contains(text(),'Инновационная политика')]");// Заголовок 'Инновационная политика' в левом меню
    private By InnovativePolicyAllTextBlock = By.xpath("//div[@class='article']");// Блок всего текста страницы 'Инновационная политика'

    ////////////////////////////////////////// Страница Социальная ответственность\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By SocialResponsibilityButton = By.xpath("//a[@class='side-bar-second__link'][contains(text(),'Социальная ответственность')]");// Кнопка 'Социальная ответственность' в левом меню
    private By SocialResponsibilityHeadline = By.xpath("//h1[contains(text(),'Социальная ответственность')]");// Заголовок 'Социальная ответственность' в левом меню
    private By SocialResponsibilityAllTextBlock = By.xpath("//div[@class='article']");// Блок всего текста страницы 'Социальная ответственность'

    ///////////////////////////////////////// Страница Технологическая политика\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By Tech_Policy = By.xpath("//a[@class='side-bar-second__link side-bar__link--third'][contains(text(),'Технологическая политика')]");
    private By Enviroment = By.xpath("//a[@class='side-bar-third__link'][contains(text(),'Оборудование')]");
    private By Travle = By.xpath("//a[@class='side-bar-third__link'][contains(text(),'Путешествие')]");
    private By TP_Bread = By.xpath("//div[@class = 'bread-crumbs']");// Воспользоваться на странице Тех. политики и Оборудование
    private By TP_Header = By.xpath("//h1");// Воспользоваться на странице Тех. политики и Оборудование
    private By TP_Side_Bar = By.xpath("//ul[@class = 'side-bar__list']"); // Воспользоваться на странице Тех. политики и Оборудование
    private By TP_Text = By.xpath("//div[@class = 'article']");
    private By TP_SB_Inv = By.xpath("//a[contains(text(), 'Оборудование')]");
    private By TP_Inv_Items = By.xpath("//div[@class = 'content__inner']");
    private By TP_II_MoreBtn = By.xpath("//div[@class='content__inner']//a");
    private By TP_Inv_Name_Out = By.xpath("//div[@class='caption_equip']");
    private By TP_Back = By.xpath("//a[contains(text(), 'Назад')]");
    private By TP_Travle = By.xpath("//a[contains(text(), 'Путешествие')]");
    private By TP_Teavle_Text = By.xpath("//div[@class='text_block_equip']");


    //////////////////////////////////////////// Страница Работа в Инвитро\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By WorkInInvitroButton = By.xpath("//a[@class='side-bar-second__link'][contains(text(),'Работа в ИНВИТРО')]");// Кнопка 'Работа в ИНВИТР' в левом меню
    private By WorkInInvitroHeadline = By.xpath("//h1[contains(text(),'Работа в ИНВИТРО')]");// Заголовок 'Работа в ИНВИТРО'
    private By WorkInInvitroBlock1 = By.xpath("//div[@class='service-home-block service-home-block--intro-alt']");// Блок Описание компании
    private By WorkInInvitroFoto1 = By.xpath("//*[@src='/upload/iblock/734/7348f03e2b2acb41ef871286f3955f45.jpg']");// Фото блока о компании
    private By WorkInInvitroBlock2 = By.xpath("//div[@class='article']");// Блоки 'Постоянное развитие персонала' и 'ИНВИТРО - лауреат премий в области HR'
    private By WorkInInvitroInterviewBlock = By.xpath("//div[@class='vacancy-index__interview interview-block']");// Блок 'Интервью с Виталиной Левашовой'
    private By WorkInInvitroInterviewButton = By.xpath("//a[@class='btn-icon interview-block__btn']");// Кнопка 'Читать полностью'
    private By WorkInInvitroCurrentVacanciesBlock = By.xpath("//section[@class='side-slider side-slider--news show-block side-slider--news-sm side-slider--bb']");// Блок 'Актуальные вакансии для врачей'
    private By WorkInInvitroVacanciesButton = By.xpath("//a[@class='btn btn--empty']");// Кнопка 'Все вакансии'
    private By WorkInInvitroInterviewAnswersBlocks = By.xpath("//a[@class='btn btn--empty']");// Блок ответы  'Интервью с Виталиной Левашовой'
    private By WorkInInvitroInterviewQuestionsBlocks = By.xpath("//a[@class='btn btn--empty']");// Блок Вопросы  'Интервью с Виталиной Левашовой'
    private By WorkInInvitroInterviewHeadline = By.xpath("//h1[contains(text(),'Сотрудник - это наш внутренний клиент')]");// Заголовок "Сотрудник - это наш внутренний клиент" Интервью В. Левашовой
    private By WorkInInvitroInterviewHeadlineBlock = By.xpath("//div[@class='block_levashova']");// Блок 'Интервью с Виталиной Левашовой'

    //////////////////////////////////////////////// Страница Обратная связь\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By FeedbackButton = By.xpath("//a[@class='side-bar-second__link'][contains(text(),'Обратная связь')]");// Кнопка 'Обратная связь' в левом меню
    private By FeedbackHeadline = By.xpath("//h1[contains(text(),'Обратная связь')]");// Заголовок 'Обратная связь'
    private By FeedbackText = By.xpath("//div[@class='mb0']");// Блок текста Обратная связь
    private By FeedbackNameField = By.xpath("//input[@id='user_name']");// Поле ввода имени
    private By FeedbackEmailField = By.xpath("//input[@id='user_email']");// Поле ввода Email
    private By FeedbackMesageField = By.xpath("//textarea[@id='MESSAGE']");// Поле ввода сообщения
    private By FeedbackCapchaField = By.xpath("//input[@name='captcha_word']");// Поле ввода капчи
    private By FeedbackCapchaIcon = By.xpath("//img[@src='/bitrix/tools/captcha.php?captcha_sid=0ca1adc4c77ea4e76eb5f403b4b7be6f']");// Иконка первого Журнала
    private By FeedbackSendButton = By.xpath("//input[@class='btn-icon btn-icon--fill']");// Кнопка отправить

    //////////////////////////////////////////// Страница Журнал Лабораторная работа\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By JournalButton = By.xpath("//a[@class='side-bar-second__link'][contains(text(),'Журнал «Лабораторная работа»')]");// Кнопка 'Обратная связь' в левом меню
    private By JournalHeadline = By.xpath("//h1[contains(text(),'Журнал «Лабораторная работа»')]");// Заголовок 'Обратная связь'
    private By JournalHeadlineText = By.xpath("//div[@class='magazines__title']");// Заголовок текста Островского Александра Юрьевича
    private By JournalBlockText = By.xpath("//div[@class='magazines__text']");// Блок текста Островского Александра Юрьевича
    private By JournalLinkMore = By.xpath("//span[@class='magazines__link-more']");// Кнопка 'Читать полностью'
    private By JournalDirectorPhoto = By.xpath("//img[@class='magazines__boss']");// Фото Островского Александра Юрьевича
    private By JournalItems = By.xpath("//div[@class = 'magazines__items']//img");// Все журналы на странице
    //private By embed = By.xpath("//embed[@id='plugin']"); // Страница открытого журнала
  
    ///////////////////////////////////////////////// Страница Контакты\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By ContactsButton = By.xpath("//ul[@class='side-bar-second__list']//*[contains(text(),'Контакты')]");// Кнопка 'Контакты' в левом меню
    private By ContactsHeadline = By.xpath("//h1[contains(text(),'Контакты')]");// Заголовок 'Контакты'
    private By ContactsHeadlineText = By.xpath("//h2[contains(text(),'Как добраться')]");// Заголовок 'Как добраться'
    private By ContactsBlockText = By.xpath("//div[@class='article']");// Блок текста, страницы Контакты
    private By ContactsMenuLeft = By.xpath("//div[@class='side-bar-second__list']");// Блок меню слева
    private By ContactsMap = By.xpath("//*[@class='ymaps-2-1-72-map']");// Карта маршрута

    ////////////////////////////////////////////Исполняемый код\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    //////////////////////////////////// Раздел Об Инвитро(Блоки о компании)\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void clickAboutCompanyInBurger() {
        help.Click_Method(AboutCompanyInBurger);
        help.getSlow();
    }

    public void checkAboutCompanyHeadline() {
        help.Check_Enabled_Element(AboutCompanyHeadline);
    }

    public void checkAboutInvitroMenu() {
        help.Check_Enabled_Element(AboutInvitroMenu);
    }

    public void checkAboutInvitroBlock() {
        help.Check_Enabled_Element(AboutInvitroBlock);
    }

    public void visibleAboutCompanyFoto1() {
        help.Check_Visible_Element(AboutCompanyFoto1);
    }

    public void checkAboutCompanyMore() {
        help.Check_Enabled_Element(AboutCompanyMore);
    }

    public void checkAboutCompanyMore2() {
        help.Check_Enabled_Element(AboutCompanyMore2);
    }

    public void checkDirectorBlock() {
        help.Check_Enabled_Element(DirectorBlock);
    }

    public void visibleDirectorFoto() {
        help.Check_Visible_Element(DirectorFoto);
    }

    public void visiblePortraitEmployee() {
        help.Check_Visible_Element(PortraitEmployee);
    }

    public void checkPortraitEmployeeTextBlock() {
        help.Check_Enabled_Element(PortraitEmployeeTextBlock);
    }

    public void visiblePatientsPerYearIcon() {
        help.Check_Visible_Element(PatientsPerYearIcon);
    }

    public void visibleMedOfficesIcon() {
        help.Check_Visible_Element(MedOfficesIcon);
    }

    public void visibleNumberOfLaboratoriesIcon() {
        help.Check_Visible_Element(NumberOfLaboratoriesIcon);
    }

    public void visibleTheNumberOfTestsIcon() {
        help.Check_Visible_Element(TheNumberOfTestsIcon);
    }

    public void visibleMileageAvtoParkIcon() {
        help.Check_Visible_Element(MileageAvtoParkIcon);
    }

    public void visibleNumberOfCallsProcessedIcon() {
        help.Check_Visible_Element(NumberOfCallsProcessedIcon);
    }

    public void visibleMedicalServicesIcon() {
        help.Check_Visible_Element(MedicalServicesIcon);
    }

    public void visibleProfessionalAwardsIcon() {
        help.Check_Visible_Element(ProfessionalAwardsIcon);
    }

    public void visibleTrainingProgramsForMedicalIcon() {
        help.Check_Visible_Element(TrainingProgramsForMedicalIcon);
    }

    ///////////////////////// Блок 'Руководство', 'Пресс-релизы', 'Фото и видео'\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void checkLeadershipBlock() {
        help.Check_Enabled_Element(LeadershipBlock);
    }

    public void checkPressReleasesBlock() {
        help.Check_Enabled_Element(PressReleasesBlock);
    }

    public void checkPhotoAndVideoBlock() {
        help.Check_Enabled_Element(PhotoAndVideoBlock);
    }

    ////////////////////////////////////////////////// Страница История\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void clickHistoryButton() {
        help.Click_Method(HistoryButton);
    }

    public void checkHistoryCompanyHeadline() {
        help.Check_Enabled_Element(HistoryCompanyHeadline);
    }

    public void checkHistoryLeftBlock() {
        help.Check_Visible_Element(HistoryLeftBlock);
    }

    public void checkHistoryRightBlock() {
        help.Check_Visible_Element(HistoryRightBlock);
    }

    /*
    // Страница история
    public void verifyHistoryRightBlock() {
        ArrayList<String> lst = new ArrayList<>();
        List<WebElementFacade> history = findAll(HistoryRightBlock); //Получаем список xpath всей Истории компании
        for(WebElementFacade we : history) {//запускаем цикл//запускаем цикл
            lst.add(we.getText());//добавляем текст истории компании в лист
            System.out.println(we.getText());
        }
        for(int i =0; i< HistoryRightValues.size(); i++){
            Assertions.assertThat(lst.contains(HistoryRightValues.get(i))).as("Текст " +HistoryRightValues.get(i)+ " отсутствует").isEqualTo(true);

        }
    }

    public void verifyHistoryLeftBlock() {
        ArrayList<String> lst = new ArrayList<>();
        List<WebElementFacade> history = findAll(HistoryLeftBlock); //Получаем список xpath всей Истории компании
        for(WebElementFacade we : history) {//запускаем цикл//запускаем цикл
            lst.add(we.getText());//добавляем текст истории компании в лист
            System.out.println(we.getText());
        }
        for(int i =0; i< HistoryLeftValues.size(); i++){
            Assertions.assertThat(lst.contains(HistoryLeftValues.get(i))).as("Текст " +HistoryLeftValues.get(i)+ " отсутствует").isEqualTo(true);

        }
    }
*/
    public void verifyHistoryYear() {
        ArrayList<String> lst = new ArrayList<>();
        List<WebElementFacade> history = findAll(HistoryYearCompanyText); //Получаем список xpath всей Истории компании
        for(WebElementFacade we : history) {//запускаем цикл//запускаем цикл
            lst.add(we.getText());//добавляем текст истории компании в лист
            System.out.println(we.getText());
        }
        for(int i =0; i< HistoryYearValues.size(); i++){
            Assertions.assertThat(lst.contains(HistoryYearValues.get(i))).as("Текст " +HistoryYearValues.get(i)+ " отсутствует").isEqualTo(true);

        }
    }

    ////////////////////////////////////////////// Страница Руководство\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void clickLeadershipPageButton() {
        help.Click_Method(LeadershipPageButton);
    }

    public void checkLeadershipPageText() {
        help.Check_Enabled_Element(LeadershipPageText);
    }

    public void checkLeadershipPageBlock() {
        help.Check_Enabled_Element(LeadershipPageBlock);
    }

    public void visibleDirectorInvitroPhoto() {
        help.Check_Visible_Element(DirectorInvitroPhoto);
    }

    public void visibleDeputyDirectorPhoto() {
        help.Check_Visible_Element(DeputyDirectorPhoto);
    }

    public void visibleFinancialDirectorPhoto() {
        help.Check_Visible_Element(FinancialDirectorPhoto);
    }

    public void visibleDirectorOfTechnologyPhoto() {
        help.Check_Visible_Element(DirectorOfTechnologyPhoto);
    }

    public void visibleCorporateCommunicationsDirectorPhoto() {
        help.Check_Visible_Element(CorporateCommunicationsDirectorPhoto);
    }

    public void visibleStrategyCommitteeMemberNamePhoto() {
        help.Check_Visible_Element(StrategyCommitteeMemberNamePhoto);
    }

    public void visibleDirectorOfInvitroUralPhoto() {
        help.Check_Visible_Element(DirectorOfInvitroUralPhoto);
    }

    public void visibleDirectorOfInvitroSiberiaPhoto() {
        help.Check_Visible_Element(DirectorOfInvitroSiberiaPhoto);
    }

    public void visibleDirectorInvitroNorthWestPhoto() {
        help.Check_Visible_Element(DirectorInvitroNorthWestPhoto);
    }

    public void visibleDirectorInvitroSamaraPhoto() {
        help.Check_Visible_Element(DirectorInvitroSamaraPhoto);
    }

    ///////////////////////////////////// Страница Группа компаний ИНВИТРО\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void clickGroupOfCompaniesButton() {
        help.Click_Method(GroupOfCompaniesButton);
    }

    public void checkGroupOfCompaniesText() {
        help.Check_Visible_Element(GroupOfCompaniesText);
    }

    public void checkInvitroBrandText() {
        help.Check_Enabled_Element(InvitroBrandText);
    }

    public void verifyGroupOfCompaniesInvitro() {
        ArrayList<String> lst = new ArrayList<>();
        List<WebElementFacade> history = findAll(GroupOfCompaniesInvitro); //Получаем список xpath всей Истории компании
        for(WebElementFacade we : history) {//запускаем цикл//запускаем цикл
            lst.add(we.getText());//добавляем текст истории компании в лист
            System.out.println(we.getText());
        }
        for(int i =0; i< GroupOfCompaniesValues.size(); i++){
            Assertions.assertThat(lst.contains(GroupOfCompaniesValues.get(i))).as("Текст " +GroupOfCompaniesValues.get(i)+ " отсутствует").isEqualTo(true);

        }
    }

    public void visibleHigherMedicalSchoolIcon() {
        help.Check_Visible_Element(HigherMedicalSchoolIcon);
    }

    public void visibleDoctorIsNearIcon() {
        help.Check_Visible_Element(DoctorIsNearIcon);
    }

    public void visibleDoctor24Icon() {
        help.Check_Visible_Element(Doctor24Icon);
    }

    public void visibleMed2MedIcon() {
        help.Check_Visible_Element(Med2MedIcon);
    }

    public void visibleUnicumIcon() {
        help.Check_Visible_Element(UnicumIcon);
    }

    public void visibleBioprintingSolutionsIcon() {
        help.Check_Visible_Element(BioprintingSolutionsIcon);
    }

    public void visibleArchmedstroyIcon() {
        help.Check_Visible_Element(ArchmedstroyIcon);
    }

    public void visibleVetUnionIcon() {
        help.Check_Visible_Element(VetUnionIcon);
    }

    public void visibleLechuIcon() {
        help.Check_Visible_Element(LechuIcon);
    }

//////////////////////////////////////////////// Страница Качество\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void clickQualityButton() {
        help.Click_Method(QualityButton);
    }

    public void checkQualityText() {
        help.Check_Enabled_Element(QualityText);
    }

    public void checkQualityBlock() {
        help.Check_Enabled_Element(QualityBlock);
    }

    public void visibleQualityPicture1() {
        help.Check_Visible_Element(QualityPicture1);
    }

    public void visibleQualityIcon1() {
        help.Check_Visible_Element(QualityIcon1);
    }

    public void checkGovernmentPrizesBlock() {
        help.Check_Enabled_Element(GovernmentPrizesBlock);
    }

    public void checkQualityPhotoAndVideoBlock() {
        help.Check_Enabled_Element(QualityPhotoAndVideoBlock);
    }

    public void checkQualityPoliticBlock() {
        help.Check_Enabled_Element(QualityPoliticBlock);
    }

    public void checkQualityFlagsBlock() {
        help.Check_Enabled_Element(QualityFlagsBlock);
    }

    public void checkQualityInvitroBlock() {
        help.Check_Enabled_Element(QualityInvitroBlock);
    }

    public void checkQualitySixthSigmsBlock() {
        help.Check_Enabled_Element(QualitySixthSigmsBlock);
    }

    public void checkQualityInvitroPartnersBlock() {
        help.Check_Enabled_Element(QualityInvitroPartnersBlock);
    }

    public void checkQualityInvitroVideoBlock() {
        help.Check_Visible_Element(QualityInvitroVideoBlock);
    }

    public void checkQualityLaboratoryBlock() {
        help.Check_Enabled_Element(QualityLaboratoryBlock);
    }

    public void checkQualityHistory() {
        help.Check_Enabled_Element(QualityHistory);
    }

    public void checkQualityIcon2() {
        help.Check_Visible_Element(QualityIcon2);
    }

    public void checkQualityIcon3() {
        help.Check_Visible_Element(QualityIcon3);
    }

    public void checkQualityIcon4() {
        help.Check_Visible_Element(QualityIcon4);
    }

    public void checkQualityIcon5() {
        help.Check_Visible_Element(QualityIcon5);
    }

    public void checkQualityIcon6() {
        help.Check_Visible_Element(QualityIcon6);
    }

    public void checkQualityIcon7() {
        help.Check_Visible_Element(QualityIcon7);
    }

    public void checkQualityIcon8() {
        help.Check_Visible_Element(QualityIcon8);
    }

    public void checkQualityIcon9() {
        help.Check_Visible_Element(QualityIcon9);
    }

///////////////////////////////////////////////// Страница Особая этика\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void clickSpecialEthicsButton() {
        help.Click_Method(SpecialEthicsButton);
    }

    public void checkSpecialEthicsText() {
        help.Check_Enabled_Element(SpecialEthicsHeadline);
    }

/*
    public void verifySpecialEthicsTextBlock() {
        ArrayList<String> lst = new ArrayList<>();
        List<WebElementFacade> history = findAll(SpecialEthicsTextBlock); //Получаем список xpath всей Истории компании
        for (WebElementFacade we : history) {//запускаем цикл//запускаем цикл
            lst.add(we.getText());//добавляем текст истории компании в лист
            System.out.println(we.getText());
        }
        for (int i = 0; i < SpecialEthicsValues.size(); i++) {
            Assertions.assertThat(lst.contains(SpecialEthicsValues.get(i))).as("Текст " + SpecialEthicsValues.get(i) + " отсутствует").isEqualTo(true);

        }
    }

*/

    public void visibleSpecialEthicsAllTextBlock() {
        help.Check_Visible_Element(SpecialEthicsAllTextBlock);
    }

    //////////////////////////////////////////// Страница Инновационная политика\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void clickInnovativePolicyButton() {
        help.Click_Method(InnovativePolicyButton);
        help.getSlow();
    }

    public void checkInnovativePolicyHeadline() {
        help.Check_Enabled_Element(InnovativePolicyHeadline);
    }

    public void visibleInnovativePolicyAllTextBlock() {
        help.Check_Visible_Element(InnovativePolicyAllTextBlock);
    }

    ////////////////////////////////////////// Страница Социальная ответственность\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void clickSocialResponsibilityButton() {
        help.Click_Method(SocialResponsibilityButton);
    }

    public void checkSocialResponsibilityHeadline() {
        help.Check_Enabled_Element(SocialResponsibilityHeadline);
    }

    public void visibleSocialResponsibilityAllTextBlock() {
        help.Check_Visible_Element(SocialResponsibilityAllTextBlock);
    }

    ///////////////////////////////////////// Страница Технологическая политика\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void Get_Tech_Policy () {
        help.Click_Method(Tech_Policy);
    }

    public void Check_Env () {
        help.Check_Visible_Element(Enviroment);
    }

    public void Check_Travle () {
        help.Check_Visible_Element(Travle);
    }

/*    public void Go_To_Env(){
        help.Click_Method(Enviroment);
    }*/

    public void Check_Bread_Crms_TP () {
        help.Check_Visible_Element(TP_Bread);
    }

    public void Check_Header_TP () {
        help.Check_Visible_Element(TP_Header);
    }

    public void Check_SB_Menu_TP () {
        help.Check_Visible_Element(TP_Side_Bar);
    }

    public void Check_Text_TP () {
        help.Check_Visible_Element(TP_Text);
    }

    public void Click_On_Invent_TP () {
        help.Click_Method(TP_SB_Inv);
    }

    public void Check_Bread_Invent () {
        help.Check_Visible_Element(TP_Bread);
    }

    public void Check_Header_Invent () {
        help.Check_Visible_Element(TP_Header);
    }

    public void Check_SBM_Invent () {
        help.Check_Visible_Element(TP_Side_Bar);
    }

    public void Check_All_Invent () {
        help.Check_Visible_Element(TP_Inv_Items);
    }

    public void Click_On_Each_Invent () {
        List<WebElementFacade> mass = findAll(TP_II_MoreBtn); // Создание массива по буквам алфавита
        int count = mass.size(); // Генерация 1-го числа
        System.out.println("Количество оборудования в массиве: " + count); // Количество элементов в массиве
        int random_number1 = (int) (Math.random() * count); // Генерация 1-го числа
        System.out.println("Случайное число: " + random_number1); // Вывод первого рандомного числа
        mass.get(random_number1).waitUntilClickable().click(); // Клик на случаянное оборудование
        System.out.println("Было выбрано обороудование: " + find(TP_Header).getText());
        help.Click_Method(TP_Back); //TP_Inv_Name_Out
    }

    public void Click_On_Travle () {
        help.Click_Method(TP_Travle);
    }

    public void Check_Bread_Travle () {
        help.Check_Visible_Element(TP_Bread);
    }

    public void Check_Header_Travle () {
        help.Check_Visible_Element(TP_Header);
    }

    public void Check_SBM_Travle () {
        help.Check_Visible_Element(TP_Side_Bar);
    }

    public void Check_Text_Travle () {
        help.Check_Visible_Element(TP_Teavle_Text);
    }

    //////////////////////////////////////////// Страница Работа в Инвитро\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void clickWorkInInvitroButton() {
        help.Click_Method(WorkInInvitroButton);
        help.getSlow();
    }

    public void checkWorkInInvitroHeadline() {
        help.Check_Enabled_Element(WorkInInvitroHeadline);
    }

    public void visibleWorkInInvitroBlock1() {
        help.Check_Visible_Element(WorkInInvitroBlock1);
    }

    public void visibleWorkInInvitroFoto1() {
        help.Check_Visible_Element(WorkInInvitroFoto1);
    }

    public void visibleWorkInInvitroBlock2() {
        help.Check_Visible_Element(WorkInInvitroBlock2);
    }

    public void visibleWorkInInvitroInterviewBlock() {
        help.Check_Visible_Element(WorkInInvitroInterviewBlock);
    }

    public void clickWorkInInvitroInterviewButton() {
        help.Click_Method(WorkInInvitroInterviewButton);
        help.getSlow();
    }

    public void visibleWorkInInvitroCurrentVacanciesBlock() {
        help.Check_Visible_Element(WorkInInvitroCurrentVacanciesBlock);
    }

    public void visibleWorkInInvitroVacanciesButton() {
        help.Check_Visible_Element(WorkInInvitroVacanciesButton);
    }

    public void visibleWorkInInvitroInterviewQuestionsBlocks() {
        help.Check_Visible_Element(WorkInInvitroInterviewQuestionsBlocks);
    }

    public void visibleWorkInInvitroInterviewAnswersBlocks() {
        help.Check_Visible_Element(WorkInInvitroInterviewAnswersBlocks);
    }

    public void visibleWorkInInvitroInterviewHeadline() {
        help.Check_Visible_Element(WorkInInvitroInterviewHeadline);
    }

    public void visibleWorkInInvitroInterviewHeadlineBlock() {
        help.Check_Visible_Element(WorkInInvitroInterviewHeadlineBlock);
    }


    //////////////////////////////////////////////// Страница Обратная связь\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void clickFeedbackButton() {
        help.Click_Method(FeedbackButton);
    }

    public void checkFeedbackHeadline() {
        help.Check_Enabled_Element(FeedbackHeadline);
    }

    public void visibleFeedbackText() {
        help.Check_Visible_Element(FeedbackText);
    }

    public void enterFeedbackNameField() {
        help.Enter_Text(FeedbackNameField,"Test1");
    }

    public void enterFeedbackEmailField() {
        help.Enter_Text(FeedbackEmailField,"test@test.com");
    }

    public void enterFeedbackMesageField() {
        help.Enter_Text(FeedbackMesageField,"Проверка ввода текста в поле message в форме 'Обратная свзяь'");
    }

    public void visibleFeedbackCapchaField() {
        help.Check_Visible_Element(FeedbackCapchaField);
    }

    public void visibleFeedbackCapchaIcon() {
        help.Check_Visible_Element(FeedbackCapchaIcon);
    }

    public void visibleFeedbackSendButton() {
        help.Check_Visible_Element(FeedbackSendButton);
    }

    //////////////////////////////////////////// Страница Журнал Лабораторная работа\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void clickJournalButton() {
        help.Click_Method(JournalButton);
    }

    public void checkJournalHeadline() {
        help.Check_Enabled_Element(JournalHeadline);
    }

    public void visibleJournalHeadlineText() {
        help.Check_Visible_Element(JournalHeadlineText);
    }

    public void visibleJournalBlockText() {
        help.Check_Visible_Element(JournalBlockText);
    }

    public void clickJournalLinkMore() {
        help.Click_Method(JournalLinkMore);
    }

    public void visibleJournalDirectorPhoto() {
        help.Check_Visible_Element(JournalDirectorPhoto);
    }

/*    public void JournalCycle (){
        List<WebElementFacade> massive = findAll(JournalItems);
        for (int i = 0; i < massive.size(); i++) {
            massive = findAll(JournalItems);
            System.out.println(massive.get(i).getAttribute("src"));
            massive.get(i).waitUntilVisible().click();
        }
    }*/

    public void visibleJournalItems() {
        help.Check_Visible_Element(JournalItems);
    }
    ///////////////////////////////////////////////// Страница Контакты\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void visibleContactsButton() {
        help.Click_Method(ContactsButton);
        help.getSlow();
    }

    public void visibleContactsHeadline() {
        help.Check_Visible_Element(ContactsHeadline);
    }

    public void visibleContactsHeadlineText() {
        help.Check_Visible_Element(ContactsHeadlineText);
    }

    public void visibleContactsBlockText() {
        help.Check_Visible_Element(ContactsBlockText);
    }

    public void visibleContactsMenuLeft() {
        help.Check_Visible_Element(ContactsMenuLeft);
    }

    public void visibleContactsMap() {
        help.Check_Visible_Element(ContactsMap);
    }
}


