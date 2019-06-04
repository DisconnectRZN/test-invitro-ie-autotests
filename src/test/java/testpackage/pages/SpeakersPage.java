package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

public class SpeakersPage extends PageObject {

    private static final Help_Methods help = Help_Methods.getInstance();
    // Локаторы
    private By SpeakersInMenu = By.xpath("//a[@class='header-menu__link'][contains(text(),'Спикеры')]");// Спикеры в бургер меню
    private By SpeakersHeadline = By.xpath("//h1[contains(text(),'Спикеры')]");// Заголовок Спикеры
    private By FirstSpeakersBlock = By.xpath("//div[@class='speaker-list-item'][1]");// Блок первого спикера
    private By SecondSpeakersBlock = By.xpath("//div[@class='speaker-list-item'][2]");// Блок второго спикера
    private By ThirdSpeakersBlock = By.xpath("//div[@class='speaker-list-item'][3]");// Блок третьего спикера
    private By FourthSpeakersBlock = By.xpath("//div[@class='speaker-list-item'][4]");// Блок четвертого спикера
    private By DirectorInvitroPhoto = By.xpath("//img[@src='/upload/iblock/568/56878c0d2ea060a3ee465d20a2f7c3f6.png']");// Фото Александра Юрьевича Островского
    private By DeputyDirectorPhoto = By.xpath("//img[@src='/upload/iblock/be1/be18a0ff5181592b24304700f19c6b76.png']");// Фото Левашова Виталина Владимировна
    private By CorporateCommunicationsDirectorPhoto = By.xpath("//img[@src='/upload/iblock/08e/08ec8467bbfeae0c47e5e4319b98403d.png']");// Фото Антон Владимирович Буланов
    private By DirectorOfTechnologyPhoto = By.xpath("//img[@src='/upload/iblock/87f/87fb17748ff0a0631d50827d5fb331fa.png']");// Фото Елена Анатольевна Кондрашева

    public void сlickSpeakersInMenu() {

        help.Click_Method(SpeakersInMenu);
    }

    public void checkSpeakersHeadline() {

        help.Check_Enabled_Element(SpeakersHeadline);
    }

    public void checkFirstSpeakersBlock() {

        help.Check_Enabled_Element(FirstSpeakersBlock);
    }

    public void checkSecondSpeakersBlock() {

        help.Check_Enabled_Element(SecondSpeakersBlock);
    }

    public void checkThirdSpeakersBlock() {

        help.Check_Enabled_Element(ThirdSpeakersBlock);
    }

    public void checkFourthSpeakersBlock() {

        help.Check_Enabled_Element(FourthSpeakersBlock);
    }

    public void visibleDirectorInvitroPhoto() {

        help.Check_Visible_Element(DirectorInvitroPhoto);
    }

    public void visibleDeputyDirectorPhoto() {

        help.Check_Visible_Element(DeputyDirectorPhoto);
    }

    public void visibleCorporateCommunicationsDirectorPhoto() {

        help.Check_Visible_Element(CorporateCommunicationsDirectorPhoto);
    }

    public void visibleDirectorOfTechnologyPhoto() {

        help.Check_Visible_Element(DirectorOfTechnologyPhoto);
    }
}
