package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import testpackage.help.WebPage;

@DefaultUrl("https://only.digital/")

public class MainPage extends WebPage {

//----------------------------------------------------- X'path -------------------------------------------------------//

    /**
     * Блок выбранного города в меню в шапке сайта
     */
    @FindBy(xpath = "//div[@class='city__label']")
    private WebElementFacade headerCity;

//------------------------------------------------ Шапка сайта -------------------------------------------------------//



    /** Проверка видимости элемента сайта*/
    public void checkVisibleElementFooter() {
        checkVisibleElement((By) headerCity,
                "Выбранный элемент отображается");
    }

}
