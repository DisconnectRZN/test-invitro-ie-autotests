# new feature
# Tags: optional
    
Feature: Проверка страницы Электронная форма кассового чека

Scenario: Проверить Страницу Электронная форма кассового чека
    Given Открыть главную страницу сайта
    When Открыть меню выбора города
    When Кликнуть на выбрать другой
    When Выбрать город Москва
    When Клик Ссылка на Юридическую информацию
    When Клик Ссылка Электронная форма кассового чека
    When Проверить Видимость Электронная форма кассового чека Заголовка
    When Проверить Видимость Электронная форма кассового чека Сайт-бар слева
    When Проверить Видимость Электронная форма кассового чека Центральный информационный блок




