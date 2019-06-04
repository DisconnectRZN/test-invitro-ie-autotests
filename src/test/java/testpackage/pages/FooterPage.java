package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

public class FooterPage extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();

    private By PacientamInFooter = By.xpath("//*[@class = 'ft__col']//*[@data-user = 'PATIENTS']"); //footer Пациентам
    private By DoctorsInFooter = By.xpath("//*[@class = 'ft__col']//*[@data-user = 'DOCTOR']");//footer Врачам
    private By FranchInFooter = By.xpath("//*[@class = 'ft__col']//*[@data-user = 'FRANCHCHISING']");//footer Франчайзинг
    private By CorpClientInFooter = By.xpath("//*[@class = 'ft__col']//*[@data-user = 'CORP_CLIENT']");//footer Корпоративным клиентам
    private By PressInFooter = By.xpath("//*[@class = 'ft__col']//*[@data-user = 'PRESS']");//footer Журналистам
    private By PhoneInFooter = By.xpath("//*[@class = 'ft-phone__link']");//footer Телефон
    private By RussiaInFooter = By.xpath("//span[@class = 'ft-phone__disrcipt']");//footer Бесплатно по России
    private By ServicesInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Услуги для пациентов\")]");//footer Услуги для пациентов
    private By AnalizesInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Анализы\")]");//footer Анализы
    private By MedServiceInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Медицинские услуги\")]\n");//footer Медицинские услуги
    private By ComplexInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Комплексные обследования\")]\n");//footer Комплексные обследования
    private By SignDoctorInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Запись к врачу\")]\n");//footer Запись к врачу
    private By VndInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Выезд на дом\")]\n");//footer Выезд на дом
    private By MoAddressInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Адреса медицинских офисов\")]\n");//footer Адреса медицинских офисов
    private By HotActionsInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Горячие акции\")]\n");//footer Горячие акции

    private By LoyaltyInFooter = By.xpath("//*[@class = 'ft-sm-list']//following::*[contains(text(),\"Программа «ИНВИТРО Здоровый плюс»\")]");//footer Программа лояльности
    private By ChildrensInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"ИНВИТРО-детям\")]\n");//footer ИНВИТРО-детям
    private By AboutInvitroInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Об Инвитро\")]\n");//footer Об Инвитро
    private By HistoryCompanyInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"История компании\")]\n");//footer История компании
    private By FirstFacesInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Первые лица\")]\n");//footer Первые лица
    private By SocialInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Социальная ответственность\")]\n");//footer Социальная ответственность
    private By InnovationsInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Инновационная политика\")]\n");//footer Инновационная политика
    private By TechnologyInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Технологическая политика\")]\n");//footer Технологическая политика
    private By JournalInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Журнал «Лабораторная работа»\")]\n");//footer Журнал «Лабораторная работа»
    private By EmploymentInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Трудоустройство\")]\n");//footer Трудоустройство
    private By ContactsInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Контакты\")]\n");//footer Контакты
    private By MedSchoolInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Высшая медицинская школа\")]\n");//footer Высшая медицинская школа
    private By ClinicalInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Клинические исследования\")]\n");//footer Клинические исследования
    private By PressCentrInFooter = By.xpath("//a[@class='ft-sm-block__title'][contains(text(),'Пресс-центр')]");//footer Пресс-центр
    private By NewsInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Новости\")]\n");//footer Новости
    private By PressReleasesInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Пресс-релизы\")]\n");//footer Пресс-релизы
    private By LegalInfoInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Юридическая информация\")]\n");//footer Юридическая информация
    private By LicenseInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Лицензии и сертификаты\")]\n");//footer Лицензии и сертификаты
    private By PoliticsInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Политика в отношении персональных данных\")]\n");//footer Политика в отношении персональных данных
    private By PrivacyInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Условия конфиденциальности\")]\n");//footer Условия конфиденциальности
    private By FnsInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Справка для ФНС\")]\n");//footer Справка для ФНС
    private By ElectronicFormInFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"Электронная форма кассового чека\")]\n");//footer Электронная форма кассового чека
    private By F3InFooter = By.xpath("//*[@class = 'ft-sm-block']//following::*[contains(text(),\"54-ФЗ\")]\n");//footer 54-ФЗ
    private By IconQualityInFooter = By.xpath("//*[@class = 'qr-code__block']");//footer иконка Премия качества
    private By QualityDiscriptionInFooter = By.xpath("//*[@class = 'qr-code__disrcipt']");//footer описание прмии качества



    private By IconFBinFooter = By.xpath("//*[@class = 'ft-social__link ft-social__link--fb'][@href='https://www.facebook.com/invitro.ru/']");//footer иконка Facebook
    private By IconOKinFooter = By.xpath("//*[@class = 'ft-social__link ft-social__link--ok'][@href='https://ok.ru/invitrolab']");//footer иконка Одноклассники
    private By IconVKinFooter = By.xpath("//*[@class = 'ft-social__link ft-social__link--vk'][@href='https://vk.com/invitro']");//footer иконка VK
    private By IconYoutubeInFooter = By.xpath("//*[@class = 'ft-social__link ft-social__link--youtube'][@href='https://www.youtube.com/user/invitro1club/']");//footer иконка youtube
    private By IconInstInFooter = By.xpath("//*[@class = 'ft-social__link ft-social__link--instagram'][@href='https://instagram.com/invitro.ru/']");//footer иконка instagram
    private By GroupCompanyInFooter = By.xpath("//*[@class = 'ft-partners--wrap']//following::*[contains(text(),\"Группа компаний ИНВИТРО\")]");//footer Группа компаний ИНВИТРО
    private By Icon3dBioInFooter = By.xpath("//*[@class = 'ft-partners__item']/a[@href='http://www.bioprinting.ru']//*[@title = '3dbio']");//footer иконка 3dbio
    private By IconLechuInFooter = By.xpath("//*[@class = 'ft-partners__item']/a[@href='http://lechy.ru']//*[@title = 'Лечу']");//footer иконка Лечу
    private By IconVMSHinFooter = By.xpath("//*[@class = 'ft-partners__item']/a[@href='http://www.vmsh.ru']//*[@title = 'ВМШ']");//footer иконка ВМШ
    private By IconVetUnionInFooter = By.xpath("//*[@class = 'ft-partners__item']/a[@href='http://vetunion.ru']//*[@title = 'Vet.invitro']");//footer иконка VET UNION
    private By IconMed2MedInFooter = By.xpath("//*[@class = 'ft-partners__item']/a[@href='http://med2med.ru']//*[@title = 'med2med']");//footer иконка med2med
    private By IconArhMedStroyInFooter = By.xpath("//*[@class = 'ft-partners__item']/a[@href='http://arhmedstroy.ru']//*[@title = 'Архмедстрой']");//footer иконка Архмедстрой





    public void FpPacient() { Assertions.assertThat(find(PacientamInFooter).getText()).isEqualTo("Пациентам"); }
    public void FpDoctor() { Assertions.assertThat(find(DoctorsInFooter).getText()).isEqualTo("Врачам"); }
    public void FpFranch() { Assertions.assertThat(find(FranchInFooter).getText()).isEqualTo("Франчайзинг"); }
    public void FpCorpClient() { Assertions.assertThat(find(CorpClientInFooter).getText()).isEqualTo("Корпоративным клиентам"); }
    public void FPress() { Assertions.assertThat(find(PressInFooter).getText()).isEqualTo("Пресс-центр"); }
    public void FPhone() {  Assertions.assertThat(find(PhoneInFooter).getText()).isEqualTo("8 (800) 200-363-0");}
    public void FRussia() {  help.Check_Visible_Element(RussiaInFooter); }
    public void FIconFb() {
        Assertions.assertThat(find(IconFBinFooter).isEnabled());
    }
    public void FIconOk() {
        Assertions.assertThat(find(IconOKinFooter).isEnabled());
    }
    public void FIconVk() {
        Assertions.assertThat(find(IconVKinFooter).isEnabled());
    }
    public void FIconYoutube() {
        Assertions.assertThat(find(IconYoutubeInFooter).isEnabled());
    }
    public void FIconInst() {
        Assertions.assertThat(find(IconInstInFooter).isEnabled());
    }

    public void FServices() {  Assertions.assertThat(find(ServicesInFooter).getText()).isEqualTo("Услуги для пациентов"); }
    public void FAnalys() {  Assertions.assertThat(find(AnalizesInFooter).getText()).isEqualTo("Анализы"); }
    public void FMedicservice() {  Assertions.assertThat(find(MedServiceInFooter).getText()).isEqualTo("Медицинские услуги"); }
    public void FComplex() {  Assertions.assertThat(find(ComplexInFooter).getText()).isEqualTo("Комплексные обследования"); }
    public void FSigndoctor() {  Assertions.assertThat(find(SignDoctorInFooter).getText()).isEqualTo("Запись к врачу"); }
    public void FVnd() {  Assertions.assertThat(find(VndInFooter).getText()).isEqualTo("Выезд на дом"); }
    public void FMoadres() {  Assertions.assertThat(find(MoAddressInFooter).getText()).isEqualTo("Адреса медицинских офисов"); }
    public void FActions() {  Assertions.assertThat(find(HotActionsInFooter).getText()).isEqualTo("Горячие акции"); }
    public void FLoyalty() { help.Check_Visible_Element(LoyaltyInFooter);}
    public void FChildren() {  Assertions.assertThat(find(ChildrensInFooter).getText()).isEqualTo("ИНВИТРО-детям"); }
    public void FAbout() {  Assertions.assertThat(find(AboutInvitroInFooter).getText()).isEqualTo("Об Инвитро"); }
    public void FHistory() {  Assertions.assertThat(find(HistoryCompanyInFooter).getText()).isEqualTo("История компании"); }
    public void FFaces() {  Assertions.assertThat(find(FirstFacesInFooter).getText()).isEqualTo("Первые лица"); }
    public void FSocial() {  Assertions.assertThat(find(SocialInFooter).getText()).isEqualTo("Социальная ответственность"); }
    public void FInnovations() {  Assertions.assertThat(find(InnovationsInFooter).getText()).isEqualTo("Инновационная политика"); }
    public void FTechnology() {  Assertions.assertThat(find(TechnologyInFooter).getText()).isEqualTo("Технологическая политика"); }
    public void FMagazine() {  Assertions.assertThat(find(JournalInFooter).getText()).isEqualTo("Журнал «Лабораторная работа»"); }
    public void FJob() {  Assertions.assertThat(find(EmploymentInFooter).getText()).isEqualTo("Трудоустройство"); }
    public void FContacts() {  Assertions.assertThat(find(ContactsInFooter).getText()).isEqualTo("Контакты"); }
    public void FSchool() {  Assertions.assertThat(find(MedSchoolInFooter).getText()).isEqualTo("Высшая медицинская школа"); }
    public void FKi() {  Assertions.assertThat(find(ClinicalInFooter).getText()).isEqualTo("Клинические исследования"); }
    public void FPresscentr() {  Assertions.assertThat(find(PressCentrInFooter).getText()).isEqualTo("Пресс-центр"); }
    public void FNews() {  Assertions.assertThat(find(NewsInFooter).getText()).isEqualTo("Новости"); }
    public void FPressrelease() {  Assertions.assertThat(find(PressReleasesInFooter).getText()).isEqualTo("Пресс-релизы"); }
    public void FUrinfo() {  Assertions.assertThat(find(LegalInfoInFooter).getText()).isEqualTo("Юридическая информация"); }
    public void FLicense() {  Assertions.assertThat(find(LicenseInFooter).getText()).isEqualTo("Лицензии и сертификаты"); }
    public void FPolitics() {  Assertions.assertThat(find(PoliticsInFooter).getText()).isEqualTo("Политика в отношении персональных данных"); }
    public void FConfident() {  Assertions.assertThat(find(PrivacyInFooter).getText()).isEqualTo("Условия конфиденциальности"); }
    public void FFns() {  Assertions.assertThat(find(FnsInFooter).getText()).isEqualTo("Справка для ФНС"); }
    public void FCheck() {  Assertions.assertThat(find(ElectronicFormInFooter).getText()).isEqualTo("Электронная форма кассового чека"); }
    public void FFz() {  Assertions.assertThat(find(F3InFooter).getText()).isEqualTo("54-ФЗ"); }
    public void FQualitydiscription() {  Assertions.assertThat(find(QualityDiscriptionInFooter).getText()).isEqualTo("ИНВИТРО – лауреат Премии Правительства Российской Федерации 2017 года в области качества"); }
    public void FIconquality() {
        Assertions.assertThat(find(IconQualityInFooter).isEnabled());
    }

    public void FGroupcompany() {
        Assertions.assertThat(find(GroupCompanyInFooter).isEnabled());
    }
    public void FIcon3dbio() {
        Assertions.assertThat(find(Icon3dBioInFooter).isEnabled());
    }
    public void FIconLechu() {
        Assertions.assertThat(find(IconLechuInFooter).isEnabled());
    }
    public void FIconVmsh() {
        Assertions.assertThat(find(IconVMSHinFooter).isEnabled());
    }
    public void FIconVetunion() {
        Assertions.assertThat(find(IconVetUnionInFooter).isEnabled());
    }
    public void FIconMed() {
        Assertions.assertThat(find(IconMed2MedInFooter).isEnabled());
    }
    public void FIconArhmed() {
        Assertions.assertThat(find(IconArhMedStroyInFooter).isEnabled());
    }








}
