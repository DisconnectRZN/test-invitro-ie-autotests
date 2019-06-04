package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

public class BugWEB2778Page extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();

    private By Logotip = By.xpath("//img[@class='header-logo']"); //Логотип Инвитро
    private By City = By.xpath("//span[@class='city__name city__btn city__name--label']"); // Город в шапке сайта
    private By Tel8800 = By.xpath("//a[@href='tel:88002003630'][@class='header-phone__link']"); // Номер телефона в шапке 8 (800) 200-363-0
    private By Tel7495 = By.xpath("//a[@href='tel:74953630363'][@class='header-phone__link']"); // Номер телефона в шапке +7 (495) 363-0-363 для Москвы
    private By Tel7351 = By.xpath("//a[@href='tel:73519496833'][@class='header-phone__link']"); // Номер телефона в шапке +7 (3519) 49-68-33 для Магнтогорска
    private By Analizi = By.xpath("//a[@class='header-nav__link'][contains(text(),'Анализы')]"); // Анализы
    private By Adresa = By.xpath("//a[@class='header-nav__link'][contains(text(),'Адреса')]"); // Адреса
    private By Akcii = By.xpath("//a[@class='header-nav__link'][contains(text(),'Акции')]"); // Акции
    private By ViezdNaDom = By.xpath("//a[@class='header-nav__link'][contains(text(),'Выезд')]"); // Выезд на дом
    private By ZapisKVrachu = By.xpath("//a[@class='header-nav__link'][contains(text(),'Запись')]"); // Запись к врачу
    private By MedUslugi = By.xpath("//a[@class='header-nav__link'][contains(text(),'Медиц')]"); // Медецинские услуги
    private By KompleksObsltd = By.xpath("//a[@class='header-nav__link'][contains(text(),'Комплексн')]"); // Комплексные обследования
    private By CityLabel = By.xpath("//div[@class='city__label']"); // Выбор города
    private By VibratDrug = By.xpath("//a[@class='btn btn--narrow btn--empty city__change-btn']"); // Кнопка Выбрать другой
    //private By PoleVvodaGor = By.xpath("//input[@class='change-city-search-input']"); // Поле ввода названия города
    private By BukvaM = By.xpath("//div[@class='change-city-nav']/div[13]"); //Буква М
    private By Magnitogorsk = By.xpath("//a[@href='/changeregion.php?&REGION=magnitogorsk']"); // Магнитогорск


    public void verifyCityMosk() {// Проверка видимости города Москва
        help.Verify_Text(City,"Москва"); }

     public void verifyCityMagnit() {
        help.Verify_Text(City, "Магнитогорск");
     }

    public void verifyTel8800() {// Проверка номера телефона 8 (800) 200-363-0
        help.Verify_Text(Tel8800, "8 (800) 200-363-0"); }

    public void verifyTel7495() { // Проверить номер телефона +7 (495) 363-0-363 для Москвы
        help.Verify_Text(Tel7495, "+7 (495) 363-0-363"); }

    public void verifyTel7351() { //Проверить Номер телефона в шапке +7 (3519) 49-68-33 для Магнтогорска
        help.Verify_Text(Tel7351, "+7 (3519) 49-68-33"); }

    public void checkAnalizi() {//Проверить видимость Анализы
        help.Check_Enabled_Element(Analizi); }

    public void checkAdresa() {//Проверить видимость Адреса
        help.Check_Enabled_Element(Adresa); }

    public void checkAkcii() {//Проверить видимость Акции
        help.Check_Enabled_Element(Akcii); }

    public void checkViezdNaDom() {//Проверить видимость Выезд на дом
        help.Check_Enabled_Element(ViezdNaDom); }

    public void checkZapisKVrachu() {//Проверить видимость Запись к врачу
        help.Check_Enabled_Element(ZapisKVrachu); }

    public void checkMedUslugi() {//Проверить видимость Медецинские услуги
        help.Check_Enabled_Element(MedUslugi); }

    public void checkKompleksObsltd() {//Проверить видимость Комплексные обследования
        help.Check_Enabled_Element(KompleksObsltd); }


    public void clickCityLabel() { // Клик по названию города
        help.Click_Method(CityLabel); }

    public void clickVibratDrug() { // Клик Выбрать другой
        help.Click_Method(VibratDrug); }

    public void clickBukvaM() { // Клик по букве М
        help.Click_Method(BukvaM); }

    public void clickMagnitogorsk() { // Клик по Магнитогорску
        help.Click_Method(Magnitogorsk); }

    public void clickLogotip() { // Клик по Магнитогорску
        help.Click_Method(Logotip); }

}
