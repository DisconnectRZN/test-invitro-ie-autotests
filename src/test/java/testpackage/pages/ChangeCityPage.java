package testpackage.pages;

import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;

public class ChangeCityPage extends PageObject {
        //при нажатии на город окошко выбора

    private By CheckCity = By.xpath("//div[@class='city__label']"); //открыть окошко выбора
    private By ChangeYesOk = By.xpath("//button[@class='btn btn--narrow city__confirm-btn']"); //Да верно
    private By ChengeOtherCity = By.xpath("//a[@class='btn btn--narrow btn--empty city__change-btn']");//Выбрать другой
    private By ValuePricePayLabel = By.xpath("//div[@class='city__small']");//От выбранного города зависят цены и способы оплаты.
    private By FindacityLabel = By.xpath("//span[@class='city__change-label']");//Вы находитесь в городе
    private By CityOnLabel = By.xpath("//span[@class='city__name city__name--main']");//Здесь само название города
        //описание при выбрать другой
        private By CitysClick = By.xpath("//div[@id='city']"); //нажать на выбор города
        private By LabelChangeCity = By.xpath("//div[contains(text(),'Выбор города')]"); //надпись выбор города
        private By CloseChangeCityButton = By.xpath("//button[@title='Close (Esc)']"); //кнопка закрыть
        private By NameCityInput = By.xpath("//input[@id='change-city-search-input']"); //ввод названия города
        private By IconFindCity = By.xpath("//span[@class='change-city-search-icon']"); //иконка поиска города
        private By GovRus = By.xpath("//a[contains(text(),'Россия')]"); //государство Россия
        private By GovBy = By.xpath("//a[contains(text(),'Беларусь')]"); //государство Беларусь
        private By GovKz = By.xpath("//a[contains(text(),'Казахстан')]"); //государство Казахстан
        private By GovArm = By.xpath("//a[contains(text(),'Армения')]"); //государство Армения
        private By GovKgs = By.xpath("//a[contains(text(),'Кыргызстан')]"); //государство Кыргыстан
        private By BigCityLabel = By.xpath("//div[@class='change-city-wrapper__title']"); //надпись крупные города
        private By BigCityMoscow = By.xpath("//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Москва')]"); //надпись крупные города Москва
        private By BigCitySPB = By.xpath("//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Санкт-Петербург')]"); //надпись крупные города Санкт-Петербург
        private By BigCityVoronej = By.xpath("//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Воронеж')]"); //надпись крупные город Воронеж
        private By BigCityEkaterinburg = By.xpath("//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Екатеринбург')]"); //надпись крупные город Екатеринбург
        private By BigCityKazan = By.xpath("//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Казань')]"); //надпись крупные город Казань
        private By BigCityKrasnoyarsk = By.xpath("//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Красноярск')]"); //надпись крупные город Красноярск
        private By BigCityNN = By.xpath("//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Нижний Новгород')]"); //надпись крупные город Нижний Новгород
        private By BigCityNV = By.xpath("//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Новосибирск')]"); //надпись крупные город Новосибирск
        private By BigCityOM = By.xpath("//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Омск')]"); //надпись крупные город Омск
        private By BigCityRND = By.xpath("//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Ростов-на-Дону')]"); //надпись крупные город Ростов-на-Дону
        private By BigCitySMR = By.xpath("//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Самара')]"); //надпись крупные город Самара
        private By BigCityUFA = By.xpath("//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Уфа')]"); //надпись крупные город Уфа
        private By BigCityChe = By.xpath("//div[@class='change-city-wrapper__left']//a[@class='change-city-block__item bold'][contains(text(),'Челябинск')]"); //надпись крупные город Челябинск
        private By SubStringAzovCity = By.xpath("//a[contains(text(),'Азов')]"); //выбрать азов

    /////////////////////////////

    public void  openMenuChangeCity() {
        if (find(ChangeYesOk).isVisible()) {
        }else{
            find(CheckCity).waitUntilClickable().click();
        }
    }
//////////////////////Описание элементов город окошко выбора///////////////////////////////
    public void verifyChangeYesOk(){ //Проверить надпись Да, верно
        if (!find(ChengeOtherCity).isVisible()) {
            find(CitysClick).click();
        }
            Assertions.assertThat(find(ChangeYesOk).getText()).isEqualTo("Да, верно");
        }

    public void verifyChengeThercity(){ //Проверить надпись Выбрать другой
        Assertions.assertThat(find(ChengeOtherCity).getText()).isEqualTo("Выбрать другой");
    }

    public void verifyvaluepricepaylabel(){ //Проверить надпись От выбранного города зависят цены и способы оплаты.
        Assertions.assertThat(find(ValuePricePayLabel).getText()).isEqualTo("От выбранного города зависят цены и способы оплаты.");
    }

    public void verifyfindacitylabel(){ //Проверить надпись Вы находитесь в городе
        Assertions.assertThat(find(FindacityLabel).getText()).isEqualTo("Вы находитесь в городе ");
    }

    public void verifycityonlabel(){ //Проверить видимость элемента город
        Assertions.assertThat(find(CityOnLabel).isVisible());
    }

    public void clickChangeYesOk(){ //Кликнуть на Да, верно
        find(ChangeYesOk).waitUntilClickable().click();
    }

    public void clickchengeothercity(){ //Кликнуть на Выбрать другой
        if (!find(ChengeOtherCity).isVisible()) {
            find(CitysClick).click() ;
        }
        find(ChengeOtherCity).waitUntilClickable().click();
    }
    //////////////////////////////////////

    public void   verifylabelchangecity(){ //проверить надпись выбор города
        Assertions.assertThat(find(LabelChangeCity).getText()).isEqualTo("Выбор города");
    }

    public void   verifygovrus(){ //проверить надпись страна Россия
        Assertions.assertThat(find(GovRus).getText()).isEqualTo("Россия");
    }

    public void   verifygovby(){ //проверить надпись страна Беларусь
        Assertions.assertThat(find(GovBy).getText()).isEqualTo("Беларусь");
    }

    public void   verifygovkz(){ //проверить надпись страна Казахстан
        Assertions.assertThat(find(GovKz).getText()).isEqualTo("Казахстан");
    }

    public void   verifygovkgs(){ //проверить надпись страна Кыргыстан
        Assertions.assertThat(find(GovKgs).getText()).isEqualTo("Кыргызстан");
    }

    public void   verifygovarm(){ //проверить надпись страна Армения
        Assertions.assertThat(find(GovArm).getText()).isEqualTo("Армения");
    }

    public void   verifybigcitylabel(){ //проверить надпись Крупные города
        Assertions.assertThat(find(BigCityLabel).getText()).isEqualTo("Крупные города");
    }

    public void   verifybigcityMoscow(){ //проверить надпись Крупные города Москва
        Assertions.assertThat(find(BigCityMoscow).getText()).isEqualTo("Москва");
    }

    public void   verifybigcitySpiter(){ //проверить надпись Крупные города Санкт-Петербург
        Assertions.assertThat(find(BigCitySPB).getText()).isEqualTo("Санкт-Петербург");
    }

    public void   verifybigcityVoronej(){ //проверить надпись Крупные города Воронеж
        Assertions.assertThat(find(BigCityVoronej).getText()).isEqualTo("Воронеж");
    }

    public void   verifybigcityEkaterinburg(){ //проверить надпись Крупные города Екатеринбург
        Assertions.assertThat(find(BigCityEkaterinburg).getText()).isEqualTo("Екатеринбург");
    }

    public void   verifybigcityKazan(){ //проверить надпись Крупные города Казань
        Assertions.assertThat(find(BigCityKazan).getText()).isEqualTo("Казань");
    }

    public void   verifybigcitybigcityKrasnoyarsk(){ //проверить надпись Крупные города Красноярск
        Assertions.assertThat(find(BigCityKrasnoyarsk).getText()).isEqualTo("Красноярск");
    }

    public void   verifybigcityNN(){ //проверить надпись Крупные города Нижний Новгород
        Assertions.assertThat(find(BigCityNN).getText()).isEqualTo("Нижний Новгород");
    }

    public void   verifybigcityNV(){ //проверить надпись Крупные города Новосибирск
        Assertions.assertThat(find(BigCityNV).getText()).isEqualTo("Новосибирск");
    }

    public void   verifybigcityOM(){ //проверить надпись Крупные города Омск
        Assertions.assertThat(find(BigCityOM).getText()).isEqualTo("Омск");
    }

    public void   verifybigcityRND(){ //проверить надпись Крупные города Ростов-на-Дону
        Assertions.assertThat(find(BigCityRND).getText()).isEqualTo("Ростов-на-Дону");
    }

    public void   verifybigcitySMR(){ //проверить надпись Крупные города Самара
        Assertions.assertThat(find(BigCitySMR).getText()).isEqualTo("Самара");
    }

    public void   verifybigcityUFA(){ //проверить надпись Крупные города Уфа
        Assertions.assertThat(find(BigCityUFA).getText()).isEqualTo("Уфа");
    }

    public void   verifybigcityChe(){ //проверить надпись Крупные города Челябинск
        Assertions.assertThat(find(BigCityChe).getText()).isEqualTo("Челябинск");
    }

    public void closechangecitybutton(){ //Проверить кнопку крестик
        Assertions.assertThat(find(CloseChangeCityButton).isVisible());
    }

    public void namecityinput(){ //Проверить ввод названия города
        Assertions.assertThat(find(NameCityInput).isVisible());
    }

    public void iconfinderpic(){ //Проверить иконка поиска города
        Assertions.assertThat(find(IconFindCity).isVisible());
    }

    public void addazovCity(){
            find(SubStringAzovCity).click();
    }

    public void addmoscowCity(){
        find(BigCityMoscow).click();
    }







}
