package testpackage.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import testpackage.pages.MainPage;

public class MainPageSteps {

    MainPage page;

    @Given("Открыть главную страницу сайта$")
    public void openPage() { page.open(); }



    @When("^Пролистать страницу вниз$")
    public void scrollPage() {
        page.evaluateJavascript("scroll(0,4000)");
    }



}
