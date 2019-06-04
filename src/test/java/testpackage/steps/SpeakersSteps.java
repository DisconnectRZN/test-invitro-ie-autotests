package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.SpeakersPage;


public class SpeakersSteps {
    SpeakersPage page;

    @When("Кликнуть Спикеры в бургер меню")
    public void сlickSpeakersInMenu () { page.сlickSpeakersInMenu(); }

    @When("^Проверка отображения заголовка 'Спикеры'$")
    public void checkSpeakersHeadline () { page.checkSpeakersHeadline(); }

    @When("^Проверка отображения блока 'Островского Александра Юрьевича'$")
    public void checkFirstSpeakersBlock () { page.checkFirstSpeakersBlock(); }

    @When("^Проверка отображения блока 'Левашовой Виталины Владимировны'$")
    public void checkSecondSpeakersBlock () { page.checkSecondSpeakersBlock(); }

    @When("^Проверка отображения блока 'Антона Владимировича Буланова'$")
    public void checkThirdSpeakersBlock () { page.checkThirdSpeakersBlock(); }

    @When("^Проверка отображения блока 'Елены Анатольевны Кондрашевой'$")
    public void checkFourthSpeakersBlock () { page.checkFourthSpeakersBlock(); }

    @When("^Проверка отображения фото 'Островского Александра Юрьевича'$")
    public void visibleDirectorInvitroPhoto () { page.visibleDirectorInvitroPhoto(); }

    @When("^Проверка отображения фото 'Левашовой Виталины Владимировны'$")
    public void visibleDeputyDirectorPhoto () { page.visibleDeputyDirectorPhoto(); }

    @When("^Проверка отображения фото 'Антона Владимировича Буланова'$")
    public void visibleCorporateCommunicationsDirectorPhoto () { page.visibleCorporateCommunicationsDirectorPhoto(); }

    @When("^Проверка отображения фото 'Елены Анатольевны Кондрашевой'$")
    public void visibleDirectorOfTechnologyPhoto () { page.visibleDirectorOfTechnologyPhoto(); }

}
