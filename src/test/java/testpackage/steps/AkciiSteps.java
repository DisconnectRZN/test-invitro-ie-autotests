package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.AkciiPage;

public class AkciiSteps {

    AkciiPage page;


    @When("Перейти в раздел Акции")
    public void VeriFyBlockAkcii() throws InterruptedException {
        page.VeriFyBlockAkcii();
    }

    @When("Проверить отображение хлебных крошек на главной странице раздела Акций" )
    public void VeriFyAkciiKrochki() {
        page.VeriFyAkciiKrochki(); }

    @When("Проверить отображение названия раздела у Акций" )
    public void VerifyAkciiText() {
        page.VeriFyAkciiText(); }
    @When("Проверить отображение картинок у всех акций" )
    public void VeriFyIzobragenieAkcii() {
        page.VeriFyIzobragenieAkcii(); }

    @When("Выбор рандомной акции для проверки" )
    public void Akcii_Random() {
        page.Akcii_Random() ;
    }

    @When("Проверка отображения хлебных крошек при раскрытии акции" )
    public void VeriFyAkcii_krochki() {
        page.VeriFyAkcii_krochki() ;
    }
    @When("Проверка отображения заголовка при раскрытии акции" )
    public void VeriFyNameAkcii_Zagolovok() {
        page.VeriFyNameAkcii_Zagolovok() ;
    }
    @When("Проверка правильности указания заголовка при раскрытии акции" )
    public void VeriFyProverkaZagolovka() {
        page.VeriFyProverkaZagolovka() ;
    }
    @When("Проверить текст Назад к списку акций")
    public void VeriFyNazadAkcii(){
        page.VeriFyNazadAkcii();
    }

    @When("Проверить иконку у ссылки Назад к списку акций")
    public void VeriFyNazadAkciiIkonk(){
        page.VeriFyNazadAkciiIkonk();
    }

    @When("Проверить отображение изображения у акции")
    public void VeriFyBanerAkcii(){
        page.VeriFyBanerAkcii();
    }

    @When("Проверить наличие блока справа")
    public void VeriFyBlockRight(){
        page.VeriFyBlockRight();
    }

    @When("Проверка наличия в блоке справа блока с датой проведения")
    public void VeriFyBlockRightDataText(){
        page.VeriFyBlockRightDataText();
    }

    @When("Проверка наличия в блоке справа блока с документами правил")
    public void VeriBlockRighDoks(){
        page.VeriBlockRighDoks();
    }

    @When("Проверка наличия в блоке справа блока поделиться в соц сетях")
    public void VeriFyBlockRighPodelitcia(){
        page.VeriFyBlockRighPodelitcia();
    }

    @When("Проверка отображения текста после изображения")
    public void VeriFyTextAkcii(){
        page.VeriFyTextAkcii();
    }

    @When("Проверка отображения заголовка после текста")
    public void VerifyPriniatYcHastie(){
        page.VerifyPriniatYcHastie();
    }

    @When("Проверка блока с инструкцией как принять участие в акции")
    public void VeriFyPriniatYcHastieBlock(){
        page.VeriFyPriniatYcHastieBlock();
    }

    @When("Проверка заголовка после блока с инструкцией как принять участие в акции")
    public void VerifyNaborLabIsled(){
        page.VerifyNaborLabIsled();
    }

    @When("Проверка отображения блока набор лабораторных исследований")
    public void VeriFyNaborLabIsledBlock(){
        page.VeriFyNaborLabIsledBlock();
    }

    @When("Проверка отображения текста ИМЕЮТСЯ ПРОТИВОПОКАЗАНИЯ НЕОБХОДИМО ПОЛУЧЕНИЕ КОНСУЛЬТАЦИИ СПЕЦИАЛИСТА")
    public void VerifyProtivopokazaniaText(){
        page.VerifyProtivopokazaniaText();
    }
}


