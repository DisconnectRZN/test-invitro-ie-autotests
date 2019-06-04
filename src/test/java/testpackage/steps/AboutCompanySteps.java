package testpackage.steps;



import cucumber.api.java.en.When;
import testpackage.pages.AboutCompanyPage;

import java.util.List;


public class AboutCompanySteps {
    AboutCompanyPage page;


    //////////////////////////////////// Раздел Об Инвитро(Блоки о компании)\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("Кликнуть Об Инвитро в бургер меню")
    public void clickAboutCompanyInBurger () { page.clickAboutCompanyInBurger(); }

    @When("^Проверка отображения заголовка 'О компании'$")
    public void checkAboutCompanyHeadline () { page.checkAboutCompanyHeadline(); }

    @When("^Проверка отображения левого меню Страницы 'Об ИНИВТРО'$")
    public void checkAboutInvitroMenu () { page.checkAboutInvitroMenu(); }

    @When("^Проверка блока 'О компании'$")
    public void checkAboutInvitroBlock () { page.checkAboutInvitroBlock(); }

    @When("^Фото блока 'О компании'$")
    public void visibleAboutCompanyFoto1 () { page.visibleAboutCompanyFoto1(); }

    @When("^Проверить все блоки 'БОЛЕЕ' на странице$")
    public void checkAboutCompanyMore () { page.checkAboutCompanyMore(); }

    @When("^Проверить второй блок 'БОЛЕЕ'$")
    public void checkAboutCompanyMore2 () { page.checkAboutCompanyMore2(); }

    @When("Проверка блока с фото Александра Юрьевича Островского")
    public void checkDirectorBlock () { page.checkDirectorBlock(); }

    @When("Проверка отображения Фото Александра Юрьевича Островского")
    public void visibleDirectorFoto () { page.visibleDirectorFoto(); }

    @When("Проверка отображения Фото Портрет среднестатического сотрудника")
    public void visiblePortraitEmployee () { page.visiblePortraitEmployee(); }

    @When("Проверка блока Портрет среднестатического сотрудника")
    public void checkPortraitEmployeeTextBlock () { page.checkPortraitEmployeeTextBlock(); }

    @When("^Проверка отображения иконки блока 'Пациентов в год'$")
    public void visiblePatientsPerYearIcon () { page.visiblePatientsPerYearIcon(); }

    @When("^Проверка отображения иконки блока 'Количество МО'$")
    public void visibleMedOfficesIcon () { page.visibleMedOfficesIcon(); }

    @When("^Проверка отображения иконки блока 'Количество лабораторий'$")
    public void visibleNumberOfLaboratoriesIcon () { page.visibleNumberOfLaboratoriesIcon(); }

    @When("^Проверка отображения иконки блока 'Количество тестов'$")
    public void visibleTheNumberOfTestsIcon () { page.visibleTheNumberOfTestsIcon(); }

    @When("^Проверка отображения иконки блока 'Пробег Московского автопарка'$")
    public void visibleMileageAvtoParkIcon () { page.visibleMileageAvtoParkIcon(); }

    @When("^Проверка отображения иконки 'Количество принятых звонков'$")
    public void visibleNumberOfCallsProcessedIcon () { page.visibleNumberOfCallsProcessedIcon(); }

    @When("^Проверка отображения иконки 'Количество Медицинских услуг'$")
    public void visibleMedicalServicesIcon () { page.visibleMedicalServicesIcon(); }

    @When("^Проверка отображения иконки 'Количество профессиональных наград'$")
    public void visibleProfessionalAwardsIcon () { page.visibleProfessionalAwardsIcon(); }

    @When("^Проверка отображения иконки 'Количество Учебных программ'$")
    public void visibleTrainingProgramsForMedicalIcon () { page.visibleTrainingProgramsForMedicalIcon(); }

    ///////////////////////// Блок 'Руководство', 'Пресс-релизы', 'Фото и видео'\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("^Проверка блока 'Руководство'$")
    public void checkLeadershipBlock () { page.checkLeadershipBlock(); }

    @When("^Проверка блока 'Пресс-релизы'$")
    public void checkPressReleasesBlock () { page.checkPressReleasesBlock(); }

    @When("^Проверка блока 'Фото и Видео'$")
    public void checkPhotoAndVideoBlock () { page.checkPhotoAndVideoBlock(); }

    ////////////////////////////////////////////////// Страница История\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("Кликнуть по кнопке История")
    public void clickHistoryButton () { page.clickHistoryButton(); }

    @When("^Проверить отображение блока 'История компании'$")
    public void checkHistoryCompanyHeadline () { page.checkHistoryCompanyHeadline(); }

    @When("^Проверить года истории компании$")
    public void проверитьГодаИсторииКомпании(List<String> lstSt){
        for(int i =0 ; i<lstSt.size(); i++){
            page.HistoryYearValues.add(lstSt.get(i));
        }
        page.verifyHistoryYear();
    }

    @When("^Проверить отображение левого блока 'История компании'$")
    public void checkHistoryLeftBlock () { page.checkHistoryLeftBlock(); }

    @When("^Проверить отображение правого блока 'История компании'$")
    public void checkHistoryRightBlock () { page.checkHistoryRightBlock(); }
/*
    @When("^Проверить Историю компании правого блока$")
    public void verifyHistoryRightBlock(List<String> lstSt){
        for(int i =0 ; i<lstSt.size(); i++){
            page.HistoryRightValues.add(lstSt.get(i));
        }
        page.verifyHistoryRightBlock();
    }

    @When("^Проверить Историю компании левого блока$")
    public void verifyHistoryLeftBlock(List<String> lstSt){
        for(int i =0 ; i<lstSt.size(); i++){
            page.HistoryLeftValues.add(lstSt.get(i));
        }
        page.verifyHistoryLeftBlock();
    }
*/

    ////////////////////////////////////////////// Страница Руководство\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("Кликнуть по кнопке Руководство")
    public void clickLeadershipPageButton () { page.clickLeadershipPageButton(); }

    @When("Проверка отображения заголовка Руководство")
    public void checkLeadershipPageText () { page.checkLeadershipPageText(); }

    @When("^Проверка всего блока 'Руководство'$")
    public void checkLeadershipPageBlock () { page.checkLeadershipPageBlock(); }

    @When("^Проверка отображения Фото 'Островского Александра Юрьевича'$")
    public void visibleDirectorInvitroPhoto () { page.visibleDirectorInvitroPhoto(); }

    @When("^Проверка отображения Фото 'Левашовой Виталины Владимировны'$")
    public void visibleDeputyDirectorPhoto () { page.visibleDeputyDirectorPhoto(); }

    @When("^Проверка отображения Фото 'Натальи Ивановны Барановой'$")
    public void visibleFinancialDirectorPhoto () { page.visibleFinancialDirectorPhoto(); }

    @When("^Проверка отображения Фото 'Елены Анатольевны Кондрашевой'$")
    public void visibleDirectorOfTechnologyPhoto () { page.visibleDirectorOfTechnologyPhoto(); }

    @When("^Проверка отображения Фото 'Антона Владимировича Буланова'$")
    public void visibleCorporateCommunicationsDirectorPhoto () { page.visibleCorporateCommunicationsDirectorPhoto(); }

    @When("^Проверка отображения Фото 'Евгения Васильевича Печковского'$")
    public void visibleStrategyCommitteeMemberNamePhoto () { page.visibleStrategyCommitteeMemberNamePhoto(); }

    @When("^Проверка отображения Фото 'Андрея Николаевича Тарасова'$")
    public void visibleDirectorOfInvitroUralPhoto () { page.visibleDirectorOfInvitroUralPhoto(); }

    @When("^Проверка отображения Фото 'Александра Сергеевича Хамидулина'$")
    public void visibleDirectorOfInvitroSiberiaPhoto () { page.visibleDirectorOfInvitroSiberiaPhoto(); }

    @When("^Проверка отображения Фото 'Елены Леонидовны Чернер'$")
    public void visibleDirectorInvitroNorthWestPhoto () { page.visibleDirectorInvitroNorthWestPhoto(); }

    @When("^Проверка отображения Фото 'Андрея Андреевича Логвина'$")
    public void visibleDirectorInvitroSamaraPhoto () { page.visibleDirectorInvitroSamaraPhoto(); }

    ///////////////////////////////////// Страница Группа компаний ИНВИТРО\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("Кликнуть по кнопке Группа компаний Инвитро")
    public void сlickGroupOfCompaniesButton () { page.clickGroupOfCompaniesButton(); }

    @When("Проверка отображения заголовка Группа компаний Инвитро")
    public void checkGroupOfCompaniesText () { page.checkGroupOfCompaniesText(); }

    @When("^Проверка текста 'Инвитро бренд'$")
    public void checkInvitroBrandText () { page.checkInvitroBrandText(); }

    @When("^Проверка всех блоков страницы Группа компаний Инвитро$")
    public void verifyGroupOfCompaniesInvitro(List<String> lstSt){
        for(int i =0 ; i<lstSt.size(); i++){
            page.GroupOfCompaniesValues.add(lstSt.get(i));
        }
        page.verifyGroupOfCompaniesInvitro();
    }

    @When("^Проверка отображения иконки блока 'Высшая медицинская школа'$")
    public void visibleHigherMedicalSchoolIcon () { page.visibleHigherMedicalSchoolIcon(); }

    @When("^Проверка отображения иконки блока 'Доктор рядом'$")
    public void visibleDoctorIsNearIcon () { page.visibleDoctorIsNearIcon(); }

    @When("^Проверка отображения иконки блока 'Доктор 24'$")
    public void visibleDoctor24Icon () { page.visibleDoctor24Icon(); }

    @When("^Проверка отображения иконки блока 'MED2MED'$")
    public void visibleMed2MedIcon () { page.visibleMed2MedIcon(); }

    @When("^Проверка отображения иконки блока 'UNICUM'$")
    public void visibleUnicumIcon () { page.visibleUnicumIcon(); }

    @When("^Проверка отображения иконки блока '3dBIO'$")
    public void visibleBioprintingSolutionsIcon () { page.visibleBioprintingSolutionsIcon(); }

    @When("^Проверка отображения иконки блока 'Архмедстрой'$")
    public void visibleArchmedstroyIcon () { page.visibleArchmedstroyIcon(); }

    @When("^Проверка отображения иконки блока 'VetUnion'$")
    public void visibleVetUnionIcon () { page.visibleVetUnionIcon(); }

    @When("^Проверка отображения иконки блока 'ЛечуRU'$")
    public void visibleLechuIcon () { page.visibleLechuIcon(); }

    //////////////////////////////////////////////// Страница Качество\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("Кликнуть по кнопке Качество")
    public void clickQualityButton () { page.clickQualityButton(); }

    @When("^Проверка отображения заголовка 'Качество'$")
    public void checkQualityText () { page.checkQualityText(); }

    @When("^Проверка отображения блока 'Инвитро - Лауриат премии'$")
    public void checkQualityBlock () { page.checkQualityBlock(); }

    @When("^Проверка отображения фото кубка блока 'Инвитро - Лауриат премии'$")
    public void visibleQualityPicture1 () { page.visibleQualityPicture1(); }

    @When("^Проверка отображения иконки блока 'Инвитро - Лауриат премии'$")
    public void visibleQualityIcon1 () { page.visibleQualityIcon1(); }

    @When("^Проверка отображения блока 'О вручении премии Правительства РФ в области качества'$")
    public void checkGovernmentPrizesBlock () { page.checkGovernmentPrizesBlock(); }

    @When("^Проверка отображения блока 'Фото и видео'$")
    public void checkQualityPhotoAndVideoBlock () { page.checkQualityPhotoAndVideoBlock(); }

    @When("^Проверка отображения блока 'Политика в области качества'$")
    public void checkQualityPoliticBlock () { page.checkQualityPoliticBlock(); }

    @When("^Проверка отображения блока с флагами РФ, UK, USA$")
    public void checkQualityFlagsBlock () { page.checkQualityFlagsBlock(); }

    @When("^Проверка отображения блока 'ИНВИТРО обеспечивает максимальную точность'$")
    public void checkQualityInvitroBlock () { page.checkQualityInvitroBlock(); }

    @When("^Проверка отображения блока 'Шесть сигм'$")
    public void checkQualitySixthSigmsBlock () { page.checkQualitySixthSigmsBlock(); }

    @When("^Проверка отображения блока 'ИНВИТРО развивает партнерские отношения'$")
    public void checkQualityInvitroPartnersBlock () { page.checkQualityInvitroPartnersBlock(); }

    @When("^Проверка отображения видео 'Росскачество подтвердило успех компании'$")
    public void checkQualityInvitroVideoBlock () { page.checkQualityInvitroVideoBlock(); }

    @When("^Проверка отображения блока 'Лаборатория ИНВИТРО и Видео'$")
    public void checkQualityLaboratoryBlock () { page.checkQualityLaboratoryBlock(); }

    @When("^Проверка отображения блока 'История успеха'$")
    public void checkQualityHistory () { page.checkQualityHistory(); }

    @When("^Проверка отображения иконки Флага 'РФ'$")
    public void checkQualityIcon2 () { page.checkQualityIcon2(); }

    @When("^Проверка отображения иконки Флага 'UK'$")
    public void checkQualityIcon3 () { page.checkQualityIcon3(); }

    @When("^Проверка отображения иконки Флага 'USA'$")
    public void checkQualityIcon4 () { page.checkQualityIcon4(); }

    @When("^Проверка отображения иконки блока 'Шесть сигм'$")
    public void checkQualityIcon5 () { page.checkQualityIcon5(); }

    @When("^Проверка отображения первой картинки 'Оборудование и реагенты'$")
    public void checkQualityIcon6 () { page.checkQualityIcon6(); }

    @When("^Проверка отображения второй картинки 'Оборудование и реагенты'$")
    public void checkQualityIcon7 () { page.checkQualityIcon7(); }

    @When("^Проверка отображения иконки кубок блока 'История успеха'$")
    public void checkQualityIcon8 () { page.checkQualityIcon8(); }

    @When("^Проверка отображения иконки медаль блока 'История успеха'$")
    public void checkQualityIcon9 () { page.checkQualityIcon9(); }

    ///////////////////////////////////////////////// Страница Особая этика\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("Кликнуть по кнопке Особая этика")
    public void clickSpecialEthicsButton () { page.clickSpecialEthicsButton(); }

    @When("^Проверка отображения заголовка 'Особая этика'$")
    public void checkSpecialEthicsText () { page.checkSpecialEthicsText(); }

/*
    @When("^Проверка всего текста страницы 'Особая этика'$")
    public void verifySpecialEthicsTextBlock(List<String> lstSt){
        for(int i =0 ; i<lstSt.size(); i++){
            page.SpecialEthicsValues.add(lstSt.get(i));
        }
        page.verifySpecialEthicsTextBlock();
    }
*/

    @When("^Проверка отображения всего текста страницы 'Особая этика'$")
    public void visibleSpecialEthicsAllTextBlock () { page.visibleSpecialEthicsAllTextBlock(); }

    //////////////////////////////////////////// Страница Инновационная политика\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("Кликнуть по кнопке Инновационная политика")
    public void clickInnovativePolicyButton () { page.clickInnovativePolicyButton(); }

    @When("^Проверка отображения заголовка 'Инновационная политика'$")
    public void checkInnovativePolicyHeadline () { page.checkInnovativePolicyHeadline(); }

    @When("^Проверка отображения всего текста страницы 'Инновационная политика'$")
    public void visibleInnovativePolicyAllTextBlock () { page.visibleInnovativePolicyAllTextBlock(); }

    ////////////////////////////////////////// Страница Социальная ответственность\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("Кликнуть по кнопке Социальная ответственность")
    public void clickSocialResponsibilityButton () { page.clickSocialResponsibilityButton(); }

    @When("^Проверка отображения заголовка 'Социальная ответственность'$")
    public void checkSocialResponsibilityHeadline () { page.checkSocialResponsibilityHeadline(); }

    @When("^Проверка отображения всего текста страницы 'Социальная ответственность'$")
    public void visibleSocialResponsibilityAllTextBlock () { page.visibleSocialResponsibilityAllTextBlock(); }

    ///////////////////////////////////////// Страница Технологическая политика\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("Кликнуть по кнопке Технологическая политика")
    public void Go_To_Tech_Policy () { page.Get_Tech_Policy(); }

    @When("Проверить наличия раскрываемого списка Оборудование")
    public void Check_Envent () { page.Check_Env(); }

    @When("Проверить наличия раскрываемого списка Путшествие пробирки")
    public void Check_Travle () { page.Check_Travle(); }

  /*  @When("Перейти на страницу Оборудование")
    public void Go_To_Env () { page.Go_To_Env(); }*/

    @When("Проверить наличие хлебных крошек на Тех. политике")
    public void TP_Bread () { page.Check_Bread_Crms_TP(); }

    @When("Проверить наличие хэдера для Тех. политики")
    public void Check_Header_TP () { page.Check_Header_TP(); }

    @When("Проверить наличие сайд-бар меню для Тех. политики")
    public void Check_SB_Menu_TP () { page.Check_SB_Menu_TP(); }

    @When("Проверить наличие текста для Тех. политики")
    public void Check_Text_TP () { page.Check_Text_TP(); }

    @When("Переход на Оборудовние из сайд-бар меню")
    public void Click_On_Invent_TP () { page.Click_On_Invent_TP(); }

    @When("Проверка наличия хлебных крошек на Оборудовании")
    public void Check_Bread_Invent () { page.Check_Bread_Invent(); }

    @When("Проверка наличия хэдера на Оборудовании")
    public void Check_Header_Invent () { page.Check_Header_Invent(); }

    @When("Проверка наличия сайд-бар меню на Оборудовании")
    public void Check_SBM_Invent () { page.Check_SBM_Invent(); }

    @When("Проверка наличия элементов для Оборудования")
    public void Check_All_Invent () { page.Check_All_Invent(); }

    @When("Выбор одного случаянного элемента для оборудования")
    public void Click_On_Each_Invent () { page.Click_On_Each_Invent(); }

    @When("Переход на страницу Путешествие пробирки")
    public void Click_On_Travle () {
        page.Click_On_Travle();
    }

    @When("Проверка наличия хлебных крошек на Путешествии пробирки")
    public void Check_Bread_Travle (){
        page.Check_Bread_Travle();
    }

    @When("Проверка наличия хэдера на Путешествии пробирки")
    public void Check_Header_Travle () {
        page.Check_Header_Travle();
    }

    @When("Проверка наличия сайд-бар меню на Путешествии пробирки")
    public void Check_SBM_Travle () {
        page.Check_SBM_Travle();
    }

    @When("Проверка наличия блоков с текстом на Путешествии пробирки")
    public void Check_Text_Travle () {
        page.Check_Text_Travle();
    }

    //////////////////////////////////////////// Страница Работа в Инвитро\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("Кликнуть по кнопке Работа в ИНВИТРО")
    public void clickWorkInInvitroButton () { page.clickWorkInInvitroButton(); }

    @When("^Проверка отображения заголовка 'Работа в ИНВИТРО'$")
    public void checkWorkInInvitroHeadline () { page.checkWorkInInvitroHeadline(); }

    @When("^Проверка отображения блока о работе в компании 'ИНВИТРО'$")
    public void visibleWorkInInvitroBlock1 () { page.visibleWorkInInvitroBlock1(); }

    @When("^Проверка отображения Фото блока о работе в компании 'ИНВИТРО'$")
    public void visibleWorkInInvitroFoto1 () { page.visibleWorkInInvitroFoto1(); }

    @When("^Проверка отображения блоков 'Постоянное развитие персонала' и 'ИНВИТРО - лауреат премий в области HR'$")
    public void visibleWorkInInvitroBlock2 () { page.visibleWorkInInvitroBlock2(); }

    @When("^Проверка отображения блока интервью с 'Виталиной Левашовой'$")
    public void visibleWorkInInvitroInterviewBlock () { page.visibleWorkInInvitroInterviewBlock(); }

    @When("^Кликнуть по кнопке 'Читать полностью' в блоке интервью с 'Виталиной Левашовой'$")
    public void clickWorkInInvitroInterviewButton () { page.clickWorkInInvitroInterviewButton(); }

    @When("^Проверка отображения блока 'Актуальные вакансии для врачей'$")
    public void visibleWorkInInvitroCurrentVacanciesBlock () { page.visibleWorkInInvitroCurrentVacanciesBlock(); }

    @When("^Проверка отображения кнопки 'Все вакансии' в блоке 'Актуальные вакансии для врачей'$")
    public void visibleWorkInInvitroVacanciesButton () { page.visibleWorkInInvitroVacanciesButton(); }

    @When("^Проверка отображения заголовка 'Сотрудник - это наш внутренний клиент'$")
    public void visibleWorkInInvitroInterviewHeadline () { page.visibleWorkInInvitroInterviewHeadline(); }

    @When("^Проверка главного блока интервью с 'Виталиной Левашовой'$")
    public void visibleWorkInInvitroInterviewHeadlineBlock () { page.visibleWorkInInvitroInterviewHeadlineBlock(); }

    @When("^Проверка блока вопросов, заданных 'Виталине Левашовой'$")
    public void visibleWorkInInvitroInterviewQuestionsBlocks () { page.visibleWorkInInvitroInterviewQuestionsBlocks(); }

    @When("^Проверка блока ответы, данные 'Виталиной Левашовой'$")
    public void visibleWorkInInvitroInterviewAnswersBlocks () { page.visibleWorkInInvitroInterviewAnswersBlocks(); }

    //////////////////////////////////////////////// Страница Обратная связь\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("Кликнуть по кнопке Обратная связь")
    public void clickFeedbackButton () { page.clickFeedbackButton(); }

    @When("^Проверка отображения заголовка 'Обратная связь'$")
    public void checkFeedbackHeadline () { page.checkFeedbackHeadline(); }

    @When("^Проверка отображения блока текста на странице 'Обратная связь'$")
    public void visibleFeedbackText () { page.visibleFeedbackText(); }

    @When("^Проверка ввода текста в поле 'Имя'$")
    public void enterFeedbackNameField () { page.enterFeedbackNameField(); }

    @When("^Проверка ввода почты в поле 'Email'$")
    public void enterFeedbackEmailField () { page.enterFeedbackEmailField(); }

    @When("^Проверка ввода сообщения в поле 'Message'$")
    public void enterFeedbackMesageField () { page.enterFeedbackMesageField(); }

    @When("^Проверка отображения поля ввода капчи на странице 'Обратная связь'$")
    public void visibleFeedbackCapchaField () { page.visibleFeedbackCapchaField(); }

    @When("^Проверка отображения картинки капчи на странице 'Обратная связь'$")
    public void visibleFeedbackCapchaIcon () { page.visibleFeedbackCapchaIcon(); }

    @When("^Проверка отображения кнопки 'Отправить' на странице 'Обратная связь'$")
    public void visibleFeedbackSendButton () { page.visibleFeedbackSendButton(); }

    //////////////////////////////////////////// Страница Журнал Лабораторная работа\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("^Кликнуть по кнопке 'Журнал «Лабораторная работа»'$")
    public void clickJournalButton () { page.clickJournalButton(); }

    @When("^Проверка отображения заголовка 'Журнал «Лабораторная работа»'$")
    public void checkJournalHeadline () { page.checkJournalHeadline(); }

    @When("^Проверка отображения заголовка для блока текста на странице 'Журнал «Лабораторная работа»'$")
    public void visibleJournalHeadlineText () { page.visibleJournalHeadlineText(); }

    @When("^Проверка отображения блока текста на странице 'Журнал «Лабораторная работа»'$")
    public void visibleJournalBlockText () { page.visibleJournalBlockText(); }

    @When("^Кликнуть по кнопке 'Читать полностью' на странице 'Журнал «Лабораторная работа»'$")
    public void clickJournalLinkMore () { page.clickJournalLinkMore(); }

    @When("^Проверка отображения фото 'Островского Александра Юрьевича' на странице 'Журнал «Лабораторная работа»'$")
    public void visibleJournalDirectorPhoto () { page.visibleJournalDirectorPhoto(); }


/*    @When("Проверка всех доступных журналов")
    public void JournalCycle () { page.JournalCycle(); }*/

    @When("Проверка всех доступных журналов")
    public void visibleJournalItems () { page.visibleJournalItems(); }

    ///////////////////////////////////////////////// Страница Контакты\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @When("Кликнуть по кнопке Контакты")
    public void visibleContactsButton () { page.visibleContactsButton(); }

    @When("Проверка Заголовок Контакты")
    public void visibleContactsHeadline () { page.visibleContactsHeadline(); }

    @When("^Проверка Заголовок 'Как добраться'$")
    public void visibleContactsHeadlineText () { page.visibleContactsHeadlineText(); }

    @When("^Проверка Блок текста, страницы Контакты$")
    public void visibleContactsBlockText () { page.visibleContactsBlockText(); }

    @When("^Проверка Контакты Блок меню слева$")
    public void visibleContactsMenuLeft () { page.visibleContactsMenuLeft(); }

    @When("^Проверка Контакты Карта маршрута$")
    public void visibleContactsMap () { page.visibleContactsMap(); }
}

