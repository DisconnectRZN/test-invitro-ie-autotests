package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.DoctorsPage;

public class DoctorsSteps {
    DoctorsPage page;

    @When("Открыть раздел врачам")
    public void clickDoctors() {
        page.clickDoctors();
    }

    @When("Проверить блок 'Вопрос от врача'")
    public void VerifyQuestionFromTheDoctor() { page.VerifyQuestionFromTheDoctor(); }

    @When("Проверить кнопку в блоке 'Подробнее'")
    public void VerifyButtonMore() { page.VerifyButtonMore(); }

    @When("Проверить иконку сообщения в блоке 'Вопрос от врача'")
    public void VerifyImage() { page.VerifyImage(); }

    @When("Проверить блок 'Личный кабинет врача'")
    public void VerifyPersonalAccountDoctors() { page.VerifyPersonalAccountDoctors(); }

    @When("Проверить кнопку 'Подробнее' в блоке личный кабинет врача")
    public void VerifyLinkMoreOne() { page.VerifyLinkMoreOne(); }

    @When("Проверить блок 'Инсрукции по правилам сбора БМ для МБ исследований'")
    public void VerifyInstructions() { page.VerifyInstructions(); }

    @When("Проверить кнопку 'Подробнее' в блоке Инсрукции по правилам сбора БМ для МБ исследований")
    public void VerifyLinkMoreTwo() { page.VerifyLinkMoreTwo(); }

    @When("Проверить слайдер 'Новости'")
    public void VerifyNews() { page.VerifyNews(); }

    @When("Проверить кнопку 'Все новости' в слайдере новостей")
    public void VerifyButtonsAllNews() { page.VerifyButtonsAllNews(); }

    @When("Проверить стрелку 'Следующая' в слайдере новостей")
    public void VerifyNextArrow() { page.VerifyNextArrow(); }

    @When("Проверить стрелку 'Предыдущая' в слайдере новостей")
    public void VerifyPrevArrow() { page.VerifyPrevArrow(); }

    @When("Проверить наличие слайдера со всеми новостями")
    public void VerifySliderBlock() { page.VerifySliderBlock(); }

    @When("Проверить наличие кнопок 'Подробнее' в овсех новостях слайдера")
    public void VerifySliderLink() { page.VerifySliderLink(); }


}

