# new feature
# Tags: optional
    
Feature: Проверка страницы Политика в отношении персональных данных

Scenario: Проверить Страницу Политика в отношении персональных данных
    Given Открыть главную страницу сайта
    When Открыть меню выбора города
    When Кликнуть на выбрать другой
    When Выбрать город Москва
    When Клик 1Ссылка Политика в отношении персональных данных
    When Проверить 1Видимость Заголовка Политика в отношении персональных данных
    When Проверить 1 Видимость Сайт-бар слева Политика в отношении персональных данныха
    When Проверить 1 Видимость Центральный информационный блок Политика в отношении персональных данных




