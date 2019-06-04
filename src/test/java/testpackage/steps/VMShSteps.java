package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.VMShPage;

public class VMShSteps {

    VMShPage page;

    @When("Переход в раздел Врачам")
    public void VeriFyClickVrachamLink() {
        page.VeriFyClickVrachamLink();
    }

    @When("Переход в подраздел Высшая мед.школа")
    public void clickVMShLink() {
        page.сlickVMShLink();
    }

    @When("Проверяем наличие хлебных крошек на странице ВМШ")
    public void KroshkiVMSh() {
        page.visiblekroshkivmsh();
    }

    @When("Проверяем наличие заголовка на странице ВМШ")
    public void VMShName() {
        page.visiblevmshname();
    }

    @When("Проверка отображения блока меню")
    public void BlockMenu() {
        page.visibleBlockMenu();
    }
    
    @When("Проверка видимости блока 'шахматы'")
    public void Shahmat() {
        page.visibleShahmat();
    }
    
    @When("Проверка блока со списком курсов")
    public void List_Courses() {
        page.visibleSpisokKursov();
    }

    @When("Проверка видимости кнопки Показать еще")
    public void Check_Button_Show() {
        page.visibleKnopkaPokazat();
    }

    @When("Кликаем на кнопку Показать еще пока она присутствует")
    public void VeriFyClickButtonPokazat() {
        page.VeriFyClickButtonPokazat();
    }

    @When("Проверка блока с врачами на главной странице ВМШ")
    public void visibleBlockDoc() {
        page.visibleBlockDoc();
    }

    @When("Выбираем рандомный курс для проверки детальной страницы")
    public void VeriFyRandomCourses() {
        page.VeriFyRandomCourses();
    }


    @When("Проверяем наличие заголовка на детальной странице курса")
    public void visibleDetailCoursesPageName() {
        page.visibleDetailCoursesPageName();
    }

    @When("Проверка блока с основной информацией по курсу")
    public void visibleDetailCoursesPage() {
        page.visibleDetailCoursesPage();
    }

    @When("Проверка наличия блока слева с телефонами и кнопкой Записаться")
    public void visibleDetailCoursesPageBlock() {
        page.visibleDetailCoursesPageBlock();
    }

    @When("Нажатие на кнопку Записаться на детальной странице курса")
    public void ClickDetailCoursesButtonZapis() {
        page.ClickDetailCoursesButtonZapis();
    }


    @When("Проверка наличия первого номера телефона в блоке справа")
    public void vizibleTelefonZapis1() {
        page.vizibleTelefonZapis1();
    }

    @When("Проверка наличия второго номера телефона в блоке справа")
    public void vizibleTelefonZapis2() {
        page.vizibleTelefonZapis2();
    }


    @When("Проверка блока с дополнительной информацией")
    public void AdditionalInfo() {
        page.visibleAdditionalInfo();
    }

    @When("Проверка наличия карты")
    public void visibleMap() {
        page.visibleMap();
    }

    @When("Проверка меню курсов для врачей на их наличие")
    public void Verify_Menu_VMSh_Page() throws InterruptedException {
        page.VeriFyMenuVMShPage();
    }

    @When("Проверка меню курсов для мед.сестер на их наличие")
    public void Sisters_VMH_Page() {
        page.BlockKursiSistersVMShPage();
    }

    @When("Проверка меню курсов по лабораторной диагностике на их наличие")
    public void Verify_Menu_Diagnostic() {
        page.VeriFyMenuDiagnostic();
    }

    @When("Проверка наличия курсов по организации здравоохранения")
    public void Verify_Menu_Zdr() {
        page.VeriFyMenuZdravoohr();
    }

    @When("Нажатие на кнопку Записаться на форме для записи на курсы")
    public void Verify_Button_Courses() {
        page.VeriFyButtonZapisKursi();
    }

    @When("Проверка заполнения обязательности полей на форме для записи на курсы")
    public void Verify_Block_Cour() {
        page.VeriFyBlockZapisButtonClickKursi();
    }

    @When("Проверка отображения формы для записи на курсы")
    public void Verify_Form_To_Z_Cour() {
        page.VeriFyFormaZapisKursi();
    }

    @When("Проверка отображения заголовка на форме записи на курсы")
    public void Verify_Name_Zap_Courses() {
        page.VeriFyNameZapisKursi();
    }

    @When("Заполнение ФИО на форме записи на курсы")
    public void Verify_IO_Courses() {
        page.VeriFyBlockFIOKursi();
    }

    @When("Заполнение Телефона на форме записи на курсы")
    public void Verify_Phone_Courses() {
        page.VeriFyBlockPhoneKursi();
    }

    @When("Заполнение емэйл на форме записи на курсы")
    public void Verify_Email_Courses() {
        page.VeriFyBlockEmailKursi();
    }


    @When("Заполнение названия курса на форме записи на курсы")
    public void Verify_Name_Courses() {
        page.VeriFyBlockBlockNazvanieKursi();
    }

    @When("Заполнение комментария на форме записи на курсы")
    public void Verify_Comm_Courses() {
        page.VeriFyBlockKommentKursi();
    }

    @When("Наличие кнопки для загрузки файла")
    public void visibleBlockUploadFailKursi() {
        page.visibleBlockUploadFailKursi();
    }

    @When("Проверка отображения кнопки Записаться на форме")
    public void Verify_Button_Course() {
        page.VeriFyBlockZapisButtonKursi();
    }







}
