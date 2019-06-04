package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

public class DoctorsPage extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();

    //Шапка меню
    private By Doctors = By.xpath("//ul[@class='header-top-nav']//li[2]");

    //Блок вопрос от врача
    private By QuestionFromTheDoctor = By.xpath("//div[@class='services__item services__item--double']");
    private By ButtonMore = By.xpath("//button[@class='btn']");
    private By Image = By.xpath("//div[@class='services__item--inner services-ask']//img[@class='services__img']");

    //Блок личный кабинет врача
    private By PersonalAccountDoctors = By.xpath("//div[@class='services show-block-wrap']/a[1]");
    private By LinkMoreOne = By.xpath("//div[@class='services show-block-wrap']//a[1]//div[@class='services__link']");

    //Блок инструкции по правилам сбора БМ для МБ исследований
    private By Instructions = By.xpath("//div[@class='services show-block-wrap']/a[2]");
    private By LinkMoreTwo = By.xpath("//div[@class='services show-block-wrap']//a[2]//div[@class='services__link']");

    //Слайдер новости
    private By News = By.xpath("//div[@class='side-nav__block']");
    private By ButtonsAllNews = By.xpath("//a[@class='btn btn--empty']");
    private By NextArrow = By.xpath("/div[@class='side-nav__btn side-nav__btn--next slick-arrow']");
    private By PrevArrow = By.xpath("//div[@class='side-nav__btn side-nav__btn--prev slick-arrow']");
    private By SliderBlock = By.xpath("//div[@class='side-slider__list-wrap']");
    private By SliderLink = By.xpath("//a[@class='side-slider__link']");

    public void clickDoctors() {
        help.Click_Method(Doctors);
    }
    public void VerifyQuestionFromTheDoctor(){
        Assertions.assertThat(find(QuestionFromTheDoctor).isVisible());
    }

    public void VerifyButtonMore(){
        Assertions.assertThat(find(ButtonMore).isVisible());
    }

    public void VerifyImage(){
        Assertions.assertThat(find(Image).isVisible());
    }

    public void VerifyPersonalAccountDoctors(){
        Assertions.assertThat(find(PersonalAccountDoctors).isVisible());
    }

    public void VerifyLinkMoreOne(){
        Assertions.assertThat(find(LinkMoreOne).isVisible());
    }

    public void VerifyInstructions(){
        Assertions.assertThat(find(Instructions).isVisible());
    }

    public void VerifyLinkMoreTwo(){
        Assertions.assertThat(find(LinkMoreTwo).isVisible());
    }

    public void VerifyNews(){
        Assertions.assertThat(find(News).isVisible());
    }

    public void VerifyButtonsAllNews(){
        Assertions.assertThat(find(ButtonsAllNews).isVisible());
    }

    public void VerifyNextArrow(){
        Assertions.assertThat(find(NextArrow).isVisible());
    }

    public void VerifyPrevArrow(){
        Assertions.assertThat(find(PrevArrow).isVisible());
    }

    public void VerifySliderBlock(){
        Assertions.assertThat(find(SliderBlock).isVisible());
    }

    public void VerifySliderLink(){
        Assertions.assertThat(find(SliderLink).isVisible());
    }
}