package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;
import java.util.List;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

public class AkciiPage extends PageObject {

    @Managed(uniqueSession = true, clearCookies=BeforeEachTest)

    private static final Help_Methods help = Help_Methods.getInstance();

    private By BlockAkcii = By.xpath("//a[contains(text(),'Акции')]"); //ссылка на раздел акции
    private By AkciiKrochki = By.xpath("//div[@class='bread-crumbs']"); //хлебные крошки
    private By AkciiText = By.xpath("//h1[contains(text(),'')]"); //проверить отображение названия раздела
    private By IzobragenieAkcii = By.xpath("//div[@class='actions__items']//a//img"); //изображение акции
    private By VseAkcii = By.xpath("//div[@class='actions__items']//a[2]"); //все акции прощелкиваться
    //
    //список локаторов когда нажал на акцию
    //
    private By Akcii_krochki = By.xpath("//ul[@class='bread-crumbs__list']"); //Проверка отображения хлебных крошек при раскрытии акции
    private By NameAkcii_krochki = By.xpath("//span[@class='bread-crumbs__current']"); //Название акции в хлебных крошках
    private By NameRazdela_krochki = By.xpath("//ul[@class='bread-crumbs__list']//li[2]"); //Название раздела в хлебных крошках
    private By NameAkcii_Zagolovok = By.xpath("//h1[contains(text(),'')]"); //Заголовок названия акции
    private By NazadAkcii = By.xpath("//a[@class='back-link']"); //Ссылка назад к списку акций
    private By NazadAkciiIkonk = By.xpath("//*[contains(@class,'icon icon-icon-back')]"); //Иконка у ссылки назад к списку акций
    private By BanerAkcii = By.xpath("//img[@class='mobile-hidden']"); //изображение
    //
    //список локаторов блока справа
    //
    private By BlockRight = By.xpath("//div[@class='info-block info-block--learning-detail']"); //блок справа
    private By BlockRightDataText = By.xpath("//div[@class='info-block__section']"); //проверка отображение даты проведения
    private By BlockRighDoks = By.xpath("//div[@class='direct-item']"); //блок с документом правил акций
    private By BlockRighPodelitcia = By.xpath("//div[@class='info-block__section--total']"); // блок с подписью в соц сетях
    //
    //список локаторов после изображение акции
    //
    private By TextAkcii = By.xpath("//*[@style='text-align: justify;']"); //текст после изображения акции
    private By PriniatYcHastie = By.xpath("//div[@class='article article--p0 article--mb0']"); //Заголовок после текста у акции
    private By PriniatYcHastieBlock = By.xpath("//div[@class='content__column--base']/div[3]"); //Блок с инструкцией как принять участие в акции
    private By NaborLabIsled = By.xpath("//div[@class='content__column--base']/div[4]"); //Заголовок после блока с инструкцией
    private By NaborLabIsledBlock = By.xpath("//div[@class='pagination-items']"); //блок набор лабораторных исследований
    private By ProtivopokazaniaText = By.xpath("//div[@class='contraindications']"); //текст Имеются противопоказания. Необходимо получение консультации специалиста.
    //
    //Список методов когда находишь в разделе акций
    //
    public void VeriFyBlockAkcii() throws InterruptedException { //переход в раздел акции

        find(BlockAkcii).waitUntilClickable().click();
        Thread.sleep(5000);
    }

    public void VeriFyAkciiKrochki()  {
        find(AkciiKrochki).isVisible(); } //проверка отображения хлебных крошек

    public void VeriFyAkciiText()  {
        find(AkciiText).isVisible(); } //проверить отображение названия раздела

    public void VeriFyIzobragenieAkcii()  {//проверка отображения изображения у акции
        List<WebElementFacade> massive = findAll(IzobragenieAkcii);
        int count =  massive.size();
        System.out.println("Количество изображений" + count);
        List<WebElementFacade> massive2 = findAll(VseAkcii);
        int count2 =  massive2.size();
        System.out.println("Количество акций" + count2);

        if(count==count2){
            System.out.println("Количество изображений:" + count + ". Количество акций" + count2 + ". Знаения равны. У всех акций есть изображения");
        }
        else {
            assert (false ):  "Не у всех акций есть изображения";
        }
    }


    //выбор рандомной акции на проверку. проверяется только 1 акция
    public void Akcii_Random(){
        if(find(VseAkcii).isVisible()){
            System.out.println("Акции есть на странице");
        }
        else{
            assert (false ):  "Нет акций на странице";
        }

        List<WebElementFacade> massive = findAll(VseAkcii);
        int count =  massive.size();
        System.out.println("количество акций");
        System.out.println(count);

        for (int i = 0; i < massive.size(); i++) {
            int random_number1 = (int) (Math.random() * count); // Генерация 1-го числа
            System.out.println("следующее случайное число, если предыдущее не подошло: " + random_number1);
            if(massive.get(random_number1).getAttribute("href").startsWith("https://www.invitro.ru/ak/"))
            {
                System.out.println("Cсылка на акцию соотв. условию:");
                System.out.println(massive.get(random_number1).getAttribute("href"));
                massive.get(random_number1).click();
                if (find(TextAkcii).isVisible()){
                    System.out.println("Произошел переход в карточку акции");
                }
                else {
                    assert (false ):  "Не произошел переход в карточку акции";
                }
                break;
            } else {
                i++;
            }
        }
    }
    //
    //список методов когда нажал на акцию
    //
    public void VeriFyAkcii_krochki()  {
        find(Akcii_krochki).isVisible(); } //

    public void VeriFyNameAkcii_Zagolovok()  {
        find(NameAkcii_Zagolovok).isVisible(); } //Проверка отображения заголовка

    //метод на проверку правильности заголовка по задаче https://jira.invitro.ru/browse/WEB-2141
    public void VeriFyProverkaZagolovka(){
        String NameAkciiZagolovok = find(NameAkcii_Zagolovok).getText().trim();
        String NameAkciikrochki = find(NameAkcii_krochki).getText().trim();
        String NameRazdelakrochki = find(NameRazdela_krochki).getText().trim();
        boolean sravnenie = NameAkciiZagolovok.equals(NameAkciikrochki) & !NameAkciikrochki.equals(NameRazdelakrochki);
        System.out.println(sravnenie);
        if (sravnenie){
            System.out.println("Указан верный заголовок");
        }
        else {
            System.out.println("Указан неверный заголовок");
            assert (false ):  "При раскрытии акции отображается неверный заголовок. Должно отображаться название акции";
        }
    }

    public void VeriFyNazadAkcii(){ //Проверить текст Назад к списку акций
        Assertions.assertThat(find(NazadAkcii).getText()).isEqualTo("Назад к списку акций"); }

    public void VeriFyNazadAkciiIkonk()  {
        find(NazadAkciiIkonk).isVisible(); } //Проверить иконку у ссылки Назад к списку акций

    public void VeriFyBanerAkcii()  {//проверка отображения изображения у акции
        find(BanerAkcii).isVisible();
    }

    public void VeriFyBlockRight(){ //Проверить наличие блока справа
        find(BlockRight).isVisible();
    }

    public void VeriFyBlockRightDataText(){ //Проверка наличия в блоке справа блока с датой проведения
        find(BlockRightDataText).isVisible();
    }

    public void VeriBlockRighDoks()  {
        find(BlockRighDoks).isVisible(); } //Проверка наличия в блоке справа блока с документами правил

    public void VeriFyBlockRighPodelitcia()  {
        find(BlockRighPodelitcia).isVisible(); } //Проверка наличия в блоке справа блока поделиться в соц сетях

    public void VeriFyTextAkcii()  {//Проверка отображения текста после изображения
        find(TextAkcii).isVisible(); }

    public void VerifyPriniatYcHastie()  {//Проверка отображения заголовка после текста
        String a = find(NameAkcii_Zagolovok).getText().trim();;
        if(a.startsWith("Скидка") && !find(PriniatYcHastie).isVisible()){
            System.out.println("Акция по ДЦ. Для нее не должно быть этого элемента");
        }
        else {
            find(PriniatYcHastie).isVisible();
        }
    }

    public void VeriFyPriniatYcHastieBlock()  {//Проверка блока с инструкцией как принять участие в акции
        String a = find(NameAkcii_Zagolovok).getText().trim();
        if(a.startsWith("Скидка") && !find(PriniatYcHastieBlock).isVisible()){
            System.out.println("Акция по ДЦ. Для нее не должно быть этого элемента");
        }
        else {
            find(PriniatYcHastieBlock).isVisible();
        }
    }

    public void VerifyNaborLabIsled()  {//Проверка заголовка после блока с инструкцией как принять участие в акции
        String a = find(NameAkcii_Zagolovok).getText().trim();
        if(a.startsWith("Скидка") && !find(NaborLabIsled).isVisible()){
            System.out.println("Акция по ДЦ. Для нее не должно быть этого элемента");
        }
        else {
            find(NaborLabIsled).isVisible();
        }
    }

    public void VeriFyNaborLabIsledBlock()  {//Проверка отображения блока набор лабораторных исследований
        String a = find(NameAkcii_Zagolovok).getText().trim();
        if(a.startsWith("Скидка") && !find(NaborLabIsledBlock).isVisible()){
            System.out.println("Акция по ДЦ. Для нее не должно быть этого элемента");
        }
        else {
            find(NaborLabIsledBlock).isVisible();
        }
    }

    public void VerifyProtivopokazaniaText()  {
        find(ProtivopokazaniaText).isVisible(); } //Проверка отображения текста ИМЕЮТСЯ ПРОТИВОПОКАЗАНИЯ НЕОБХОДИМО ПОЛУЧЕНИЕ КОНСУЛЬТАЦИИ СПЕЦИАЛИСТА
}





