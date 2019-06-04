package testpackage.pages;

import org.openqa.selenium.By;
import testpackage.help.Help_Methods;
import net.thucydides.core.pages.PageObject;

public class NotMedicalOrganizationsPage extends PageObject{
    private static final Help_Methods help = Help_Methods.getInstance();
    private By NOTCorporativeClientsNOT = By.xpath("//*[contains(@class,'header-top-nav__item')][4]");// Ссылка Корпоративным клиентам
    private By NotMedicalOrganizationsNOT = By.xpath("//*[contains(@class,'header-nav__item')][2]");// Ссылка Немедицинским организациям
    private By HeaderNOT = By.xpath("//*[contains(@class,'title-block')]");// Заголовок Немедицинским организациям

    private By BlockPartnerNOT = By.xpath("//*[contains(@class,'service-home-block')]");//Блок Вниманию HR-директоров и руководителей компаний
    private By ReliableBlockNOT = By.xpath("//*[contains(@class,'service-home-row pb0')][1]");//Гарантии качества ИНВИТРО
    private By LaboratoryBlockNOT = By.xpath("//*[contains(@class,'service-home-row pb0')][2]");// Блок Что вы приобретаете
    private By DiscoverBlockNOT = By.xpath("//div[contains(@class,'subscribe')]");//Блок Заинтересовала программа
   private By NOTAffiliateBlock = By.xpath("//div[contains(@class,'service-home-row')][3]");//Блок Выберите удобную схему сотрудничества
    private By NOTBenefitsBlock = By.xpath("//div[contains(@class,'content list-actuials content-block pb0')]");//Блок Хранение биоматериала в лаборатори
    private By NOTEquipmentBlock = By.xpath("//div[contains(@class,'show-block-wrap')][2]");//Блок Нам доверяют своих сотрудников компании
    private By NOTQuestionsBlock = By.xpath("//div[contains(@class,'subscribe')]");//Блок Остались вопросы?


    public void clickNOTCorporativeClientsNOT() {// Клик Ссылка Корпоративным клиентам
        help.Click_Method(NOTCorporativeClientsNOT); }
    public void clickNotMedicalOrganizationsNOT() {// Клик Ссылка Немедицинским организациям
        help.Click_Method(NotMedicalOrganizationsNOT); }
    public void checkHeaderNOT() { // Проверить Видимость Заголовка Немедицинским организациям
        help.Check_Enabled_Element(HeaderNOT); }
    public void checkBlockPartnerNOT() { // Проверить Видимость Блок Вниманию HR-директоров и руководителей компаний
        help.Check_Enabled_Element(BlockPartnerNOT); }
    public void checkReliableBlockNOT() { // Проверить Блок Гарантии качества ИНВИТРО
        help.Check_Enabled_Element(ReliableBlockNOT); }
    public void checkLaboratoryBlockNOT() {  help.Check_Enabled_Element(LaboratoryBlockNOT); }// Блок Немедицинским Что вы приобретаете
    public void checkDiscoverBlockNOT() { help.Check_Enabled_Element(DiscoverBlockNOT); }//Блок Немедицинским Заинтересовала программа
    public void checkNOTAffiliateBlock() { // Проверить Немедицинским Выберите удобную схему сотрудничества
        help.Check_Enabled_Element(NOTAffiliateBlock); }
    public void checkNOTBenefitsBlock() { // Проверить Немедицинским Блок Хранение биоматериала в лаборатори
        help.Check_Enabled_Element(NOTBenefitsBlock); }
    public void checkNOTEquipmentBlock() { // Проверить Немедицинским Блок Нам доверяют своих сотрудников компании
        help.Check_Enabled_Element(NOTEquipmentBlock); }
    public void checkNOTQuestionsBlock() {  help.Check_Enabled_Element(NOTQuestionsBlock); }//Проверить Немедицинским Блок Остались вопросы
    
}
