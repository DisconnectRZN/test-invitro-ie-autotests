package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.PressCentrPage;



public class PressCentrSteps {
    PressCentrPage page;

    @When("^Кликнуть Пресс-центр в бургер меню$")
    public void сlickPressCentrInBurger () { page.сlickPressCentrInBurger(); }

    @When("^Проверка отображения заголовка 'Пресс-релизы'$")
    public void checkPressCentrHeadLine () { page.checkPressCentrHeadLine(); }

    @When("Проверка отображения блока фильтра")
    public void visiblePressCentrFilterBlock () { page.visiblePressCentrFilterBlock(); }

    @When("^Проверка отображения всех 'Пресс-релизов' на выбранной странице$")
    public void visiblePressCentrBlock () { page.visiblePressCentrBlock(); }

    @When("^Проверка перехода на вторую страницу блока 'Пресс-релизов'$")
    public void сlickPressCentrPageTwo () { page.сlickPressCentrPageTwo(); }

    @When("^Проверка перехода на третью страницу блока 'Пресс-релизов'$")
    public void сlickPressCentrPageThree () { page.сlickPressCentrPageThree(); }

    @When("^Проверка перехода на четвертую страницу блока 'Пресс-релизов'$")
    public void сlickPressCentrPageFour () { page.сlickPressCentrPageFour(); }

    @When("^Проверка перехода на пятую страницу блока 'Пресс-релизов'$")
    public void сlickPressCentrPageFive () { page.сlickPressCentrPageFive(); }

    @When("^Проверка перехода на шестую страницу блока 'Пресс-релизов'$")
    public void сlickPressCentrPageSix () { page.сlickPressCentrPageSix(); }

    @When("^Проверка перехода на первую страницу блока 'Пресс-релизов'$")
    public void сlickPressCentrPageOne () { page.сlickPressCentrPageOne(); }

}
