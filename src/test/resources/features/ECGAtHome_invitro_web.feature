# new feature
# Tags: optional
    
Feature: Проверка страницы ЭКГ на дому

Scenario: Проверить Страницу ЭКГ на дому
    Given Открыть главную страницу сайта
    When Открыть меню выбора города
    When Кликнуть на выбрать другой
    When Выбрать город Москва
    When Кликнуть Ссылка в шапке сайта
    When Клик Ссылка на ЭКГ на дому
    When Проверить ЭКГ Видимость Заголовка
    When Проверить ЭКГ на дому видимость баннера
    When Проверить ЭКГ видимость Блок рядом с баннером
    #When ЭКГ Ввод имени autotest
    #When ЭКГ Ввод телефона 9999999999
    #When ЭКГ Проверить видимость Кнопка Заказать звонок
    When Пролистать страницу вниз
    When Проверить ЭКГ видимость Блок с иконками анализы на дому
    When Проверить ЭКГ Блок Преимущества
    When Проверить ЭКГ Оформите заявку ЭКГ
    When Проверить ЭКГ Блок Стоимость выезда
    When Проверить ЭКГ Блок График оказания услуг