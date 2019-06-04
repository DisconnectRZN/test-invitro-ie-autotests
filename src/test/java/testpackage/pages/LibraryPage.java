package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

import java.util.Arrays;
import java.util.List;

public class LibraryPage extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();

    //Раздел с главной страницы в футере
    private By Library = By.xpath("//a[@class='ft-sm-list__link'][contains(text(),'Библиотека')]");

   /* //Страница раздела библиотека
    private By CrumbsLibrary = By.xpath("//ul[@class='bread-crumbs__list']");
    private By HeadlineLibrary = By.xpath("//h1[contains(text(),'Библиотека')]");
    private By BannerLibrary = By.xpath("//div[contains(@class,'service-home-banner--library show')]");
    private By SlidersLibrary = By.xpath("//div[contains(@class,'service-home-about--library')]");
    private By BlockUsefulArticles = By.xpath("//div[contains(@class,'directions--five')]/div[1]");
    private By BlockTheSimptoms = By.xpath("//div[contains(@class,'directions--five')]/div[2]");
    private By BlockLaboratoryDiagnostics = By.xpath("//div[contains(@class,'directions--five')]/div[3]");*/

    private List<By> checkBlocks = Arrays.asList(
            By.xpath("//ul[@class='bread-crumbs__list']"),
            By.xpath("//h1[contains(text(),'Библиотека')]"),
            By.xpath("//div[contains(@class,'service-home-banner--library show')]"),
            By.xpath("//div[contains(@class,'service-home-about--library')]"),
            By.xpath("//div[contains(@class,'directions--five')]/div[1]"),
            By.xpath("//div[contains(@class,'directions--five')]/div[2]"),
            By.xpath("//div[contains(@class,'directions--five')]/div[3]")
    );

    public void clickLibrary() {
        help.Click_Method(Library);
    }

    public void VerifyCheckBlocks() {
        for(int i=0; i<checkBlocks.size(); i++){
            help.Check_Visible_Element(checkBlocks.get(i));
        }
    }
}
