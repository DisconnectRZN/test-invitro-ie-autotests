package testpackage.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

@DefaultUrl("https://www.invitro.ru/")

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



    public void FpPacient() { Assertions.assertThat(find(PacientamInFooter).getText()).isEqualTo("Пациентам"); }
    public void FpDoctor() { Assertions.assertThat(find(DoctorsInFooter).getText()).isEqualTo("Врачам"); }
    public void FpFranch() { Assertions.assertThat(find(FranchInFooter).getText()).isEqualTo("Франчайзинг"); }
    public void FpCorpClient() { Assertions.assertThat(find(CorpClientInFooter).getText()).isEqualTo("Корпоративным клиентам"); }
    public void FPress() { Assertions.assertThat(find(PressInFooter).getText()).isEqualTo("Пресс-центр"); }
    public void FPhone() {  Assertions.assertThat(find(PhoneInFooter).getText()).isEqualTo("8 (800) 200-363-0");}
    public void FRussia() {  help.Check_Visible_Element(RussiaInFooter); }

    public void FServices() {  Assertions.assertThat(find(ServicesInFooter).getText()).isEqualTo("Услуги для пациентов"); }
    public void FAnalys() {  Assertions.assertThat(find(AnalizesInFooter).getText()).isEqualTo("Анализы"); }
    public void FMedicservice() {  Assertions.assertThat(find(MedServiceInFooter).getText()).isEqualTo("Медицинские услуги"); }
    public void FComplex() {  Assertions.assertThat(find(ComplexInFooter).getText()).isEqualTo("Комплексные обследования"); }
    public void FSigndoctor() {  Assertions.assertThat(find(SignDoctorInFooter).getText()).isEqualTo("Запись к врачу"); }
    public void FVnd() {  Assertions.assertThat(find(VndInFooter).getText()).isEqualTo("Выезд на дом"); }
    public void FMoadres() {  Assertions.assertThat(find(MoAddressInFooter).getText()).isEqualTo("Адреса медицинских офисов"); }
    public void FActions() {  Assertions.assertThat(find(HotActionsInFooter).getText()).isEqualTo("Горячие акции"); }


}
