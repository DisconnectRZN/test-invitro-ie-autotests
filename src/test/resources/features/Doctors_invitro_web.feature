# new feature
# Tags: optional

Feature: Проверка раздела Врачам

Scenario: A scenario
    Given Открыть главную страницу сайта
    When Открыть раздел врачам
    When Проверить блок 'Вопрос от врача'
    When Проверить кнопку в блоке 'Подробнее'
    When Проверить иконку сообщения в блоке 'Вопрос от врача'
    When Проверить блок 'Личный кабинет врача'
    When Проверить кнопку 'Подробнее' в блоке личный кабинет врача
    When Проверить блок 'Инсрукции по правилам сбора БМ для МБ исследований'
    When Проверить кнопку 'Подробнее' в блоке Инсрукции по правилам сбора БМ для МБ исследований
    When Проверить слайдер 'Новости'
    When Проверить кнопку 'Все новости' в слайдере новостей
    When Проверить стрелку 'Следующая' в слайдере новостей
    When Проверить стрелку 'Предыдущая' в слайдере новостей
    When Проверить наличие слайдера со всеми новостями
    When Проверить наличие кнопок 'Подробнее' в овсех новостях слайдера