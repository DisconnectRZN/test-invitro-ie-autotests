# new feature
# Tags: optional
    
Feature: Проверка страницы Направительные бланки
    
Scenario: Проверка страницы Направительные бланки
    Given Открыть главную страницу сайта
    When Кликнуть Врачам в шапке
    When Кликнуть Бланки
    When Проверить Видимость Заголовка
    When Проверить Блок описания и направительных бланков
    When Проверить видимость Иконки направительных бланков