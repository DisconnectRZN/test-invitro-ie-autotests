package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.LibraryPage;

public class LibrarySteps {
    LibraryPage page;

    @When("Открыть раздел библиотека")
    public void clickLibrary() { page.clickLibrary();}

    @When("Проверка наличия блоков в разделе Библиотека")
    public void VerifyCheckBlocks() { page.VerifyCheckBlocks();}
}
