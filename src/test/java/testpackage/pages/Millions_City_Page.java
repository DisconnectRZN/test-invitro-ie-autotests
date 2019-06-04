package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

public class Millions_City_Page extends PageObject {

    @Managed(uniqueSession = true, clearCookies=BeforeEachTest)

    private static final Help_Methods help = Help_Methods.getInstance();

    private static final List<String> MAIN_MENU_BUTTONS =
            Arrays.asList("анализы", "адреса", "акции", "выезд на дом", "запись к врачу", "медицинские услуги", "комплексные обследования");

    ///////////////////////////////////////////// Регион апплет \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By City_Applet = By.xpath("//div[@class='city__label']");
    private By Check_CA = By.xpath("//div[@class='city__change']");
    private By Check_CWAY = By.xpath("//span[@class='city__change-label']");
    private By Yes_Btn = By.xpath("//button[@class='btn btn--narrow city__confirm-btn']");
    private By ChangeOtherCity = By.xpath("//a[@class='btn btn--narrow btn--empty city__change-btn']");//Выбрать другой

    ///////////////////////////////////////////// Окно выбора города \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private By Header_Reg_Win = By.xpath("//div[contains(text(),'Выбор города')]"); // Текст выбор города
    private By Close_Btn = By.xpath("//button[@title='Close (Esc)']");// Кнопка закрыть
    private By Search_Row = By.xpath("//input[@id='change-city-search-input']");// Строка поиска
    private By Search_Btn = By.xpath("//span[@class='change-city-search-icon']");// Кнопка поиска
    private By Countries = By.xpath("//div[@class='change-city-countries']"); //Список стран
    private By Big_City = By.xpath("//div[@class='change-city-wrapper__title']");
    private By Big_Cyties = By.xpath("//div[@class='change-city-block']//a");
    private By ABC = By.xpath("//div[@class='change-city-nav']");
    private By All_ABC = By.xpath("//div[@class='change-city-nav']//span");
    private By Cyties = By.xpath("//div[@class='change-city-block change-city-block--active']");
    private By All_Act_Cities = By.xpath("//div[contains(@class,'change-city-block--active')]//a");
    private By Current_City = By.xpath("//span[@class='city__name city__btn city__name--label']"); // Текущий город
    private By All_Elems = By.xpath("//li[@class = 'header-nav__item']/a");//Все верхнее меню

    ///////////////////////////////////////////// Регион апплет \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void Check_City_App (){// Проверка отображения апплета
        Assertions.assertThat(find(City_Applet).isVisible());
    }

    public void Click_City_App () {//Нажатие на регион апплет
          if (find(Check_CA).isVisible()) {
                System.out.println("Апплет выбора города отображается");
            } else {
                help.Click_Method(City_Applet);
                }
    }

    public void Check_Text_App_Where () {// Проверка текста Вы находитесь в городе
        Assertions.assertThat(find(Check_CWAY).getText()).contains("Вы находитесь в городе");
    }

    public void Check_Button_Yes (){// Проверка наличия кнопки Да, верно
        Assertions.assertThat(find(Yes_Btn).isVisible());
    }

    public void Check_Button_Change (){// Проверка наличия кнопки Выбрать другой
        Assertions.assertThat(find(ChangeOtherCity).isVisible());
    }

    public void Click_Button_Change (){//Нажатие на кнопку Выбрать другой
        find(ChangeOtherCity).waitUntilVisible().click();
    }
    ///////////////////////////////////////////// Проверка окна выбора города \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void Check_Header_Window (){// Проверка хедера Выбор города
        Assertions.assertThat(find(Header_Reg_Win).isVisible());
    }

    public void Check_Close_Btn (){// Проверка наличия кнопки закрытия окна Выбор города
        Assertions.assertThat(find(Close_Btn).isVisible());
    }

    public void Check_Search_Row (){// Проверка наличия Поисковой строки
        Assertions.assertThat(find(Search_Row).isVisible());
    }

    public void Check_Search_Btn () {// Проверка наличия Поисковой кнопки
        Assertions.assertThat(find(Search_Btn).isVisible());
    }

    public void Check_Counties_Line (){// Проверка наличия Строки стран
        Assertions.assertThat(find(Countries).isVisible());
    }

    public void Check_Big_City (){// Проверка отображения наличия Крупные города
        Assertions.assertThat(find(Big_City).isVisible());
    }

    public void Check_Big_City_Text (){// Проверка текста Крупные города
        Assertions.assertThat(find(Big_City).getText()).contains("Крупные города");
    }

    public void Check_Big_Cyties (){// Проверка отображения списка больших городов
        Assertions.assertThat(find(Big_Cyties).isVisible());
    }

    public void Check_ABC (){// Проверка отображения алфавита для выбора города
        Assertions.assertThat(find(ABC).isVisible());
    }

    public void Check_All_ABC () {// Проверка случайно выбранного города из алфавитного меню
        List<WebElementFacade> mass = findAll(All_ABC); // Создание массива по буквам алфавита
        int count = mass.size(); // Генерация 1-го числа
        System.out.println("Количество букв в массиве: " + count); // Количество элементов в массиве
        int random_number1 = (int) (Math.random() * count); // Генерация 1-го числа
        System.out.println("случайное число: " + random_number1); // Вывод первого рандомного числа
        System.out.println(mass.get(random_number1).getText()); // Вывод значния соответствующего рандомному числу №1
        mass.get(random_number1).waitUntilClickable().click(); // Клик на выбранную Букву из массива
        List<WebElementFacade> massive = findAll(All_Act_Cities); // Создание второго массива из активных городов
        int count1 = massive.size(); // Генерация 2-го числа
        System.out.println("количество городов: " + count1); // Количество городов в массиве
        int random_number2 = (int) (Math.random() * count1); // Генерация 2-го числа
        System.out.println("случайное число: " + random_number2); // Вывод второго рандомного числа
        System.out.println(mass.get(random_number1).getText()); // Вывод значения соответствующего рандомному числа №2
        mass.get(random_number1).waitUntilVisible().click(); // Клик на выбранную Букву из массива
        System.out.println(massive.get(random_number2).getText()); // Вывод значния соответствующего рандомному числу №1
        String City_App = massive.get(random_number2).getText(); // Объявленеие переменной
                                                                 // для сравнения (Выбирается нажимаемый город)
        massive.get(random_number2).waitUntilVisible().click(); // Клик на выбранный город выше
        String Curr_City = find(Current_City).waitUntilVisible().getText(); // Объявление второй переменной для
                                                                            // сравнения с первой (Выбирается текущий город)
        boolean Check_City = City_App.equals(Curr_City); // Объявление булевой переменной для придания значений true и false
        if (Check_City) { // Объявления условия для вывода
            System.out.println("Был выбран город - " + City_App
                    + ". Переход выполнен в город - " + Curr_City + ".");
        } else {
            Assertions.assertThat(City_App).as("Был выбран город " + City_App +
                    ". Переход был выполнен в " + Curr_City).isEqualTo(Curr_City);
        }

        final List<String> buttons = new ArrayList<>(); // Объявление массива, в котором будут содержаться кнопки
        for (WebElementFacade button : findAll(All_Elems)) { // Объявление цикла foreach (использовать только для сравнения)
            Assertions.assertThat(MAIN_MENU_BUTTONS).contains(button.getText().toLowerCase()); // Проверка значений кнопок, относительно массива
            buttons.add(button.getText()); // Добавлние обнаруженных кнопок в массив final
        }
        System.out.println("На главной странице для города " + Curr_City + ". Отображены следующие кнопки: "
                + String.join(", ", buttons)); // Вывод кнопок которые были найдены на определенном городе
    }



    public void Check_Cyties (){// Проверка отображения списка городов
        Assertions.assertThat(find(Cyties).isVisible());
    }

///////////////////////////////////////////// Проверка городов миллионников \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void Get_All_Big_Cyties () throws InterruptedException {// Проверка наименования городов миллионников
        List<WebElementFacade> massive = findAll(Big_Cyties);
        for (int i = 0; i < massive.size(); i++) {
            massive = findAll(Big_Cyties);
            System.out.println(massive.get(i).getText());
            String City_App = massive.get(i).getText();
            massive.get(i).waitUntilVisible().click();
            Thread.sleep(3000);
            String Curr_City = find(Current_City).waitUntilVisible().getText();
            find(ChangeOtherCity).waitUntilVisible().click();
            Thread.sleep(3000);
            System.out.println("Был выбран город - " + City_App
                    + ". Переход выполнен в город - " + Curr_City + ".");
            Assertions.assertThat(City_App).as("Был выбран город " + City_App +
                    ". Переход был выполнен в " + Curr_City).isEqualTo(Curr_City);
            final List<String> buttons = new ArrayList<>(); // Объявление массива, в котором будут содержаться кнопки
            for (WebElementFacade button : findAll(All_Elems)) { // Объявление цикла foreach (использовать только для сравнения)
                Assertions.assertThat(MAIN_MENU_BUTTONS).contains(button.getText().toLowerCase()); // Проверка значений кнопок, относительно массива
                buttons.add(button.getText()); // Добавлние обнаруженных кнопок в массив final
            }
            System.out.println("На главной странице для города " + Curr_City + ". Отображены следующие кнопки: "
                    + String.join(", ", buttons)); // Вывод кнопок которые были найдены на определенном городе
        }
    }
}