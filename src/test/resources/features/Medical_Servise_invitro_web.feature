# new feature
# Tags: optional

Feature: Проверка страницы Медицинские услуги

  Scenario: Проверка наличия всех эелементов на странице Мед. услуги
    Given Открыть главную страницу сайта
    When Проверка, что кнопка Мед услуги присутствует
    When Клик на кнопку Мед услуги
    When Проверка, что кнопка Хлебные крошки присутствуют
    When Проверка наличия хэдера на Мед услугах
    When Проверка наличия списка кнопок Мед услуг
    When Проверка наличия списка под кнопками Мед услуг
    When Проверка наличия картинки для подсказки
    When Проверка наличия отображения элемента подсказки под списком
    When Проверка наличия соответствия текста подсказки
    When Проверка наличия кнопки Показать ещё
    When Проверка наличия ссылки Наверх
    When Проверка наличия Слайдера
    When Проверка наличия Шахматки
    When Проверка наличия списка Мед услуг

  Scenario: Проверка наличия всех элементов на странице Мед. услуги для Москвы
    Given Открыть главную страницу сайта
    When Клик на кнопку Мед услуги
    When Проверка заголовка Медицинские услуги в Москве
    When Проверка наличия хотя бы одной услуги в каждом разделе


  Scenario: Проверка наличия всех элементов на странице Мед. услуги для Нальчика
    Given Открыть главную страницу сайта
    When Клик на кнопку Мед услуги
    When Открыть меню выбора города
    When Кликнуть на выбрать другой
    When Нажатие на букву Н на форме выбора города
    When Выбор города Нальчик из списка
    When Проверка заголовка Медицинские услуги в Нальчике
    When Проверка наличия хотя бы одной услуги в каждом разделе

  Scenario: Проверка наличия наличия надписи В данном городе услуга не предоставляется
    Given Открыть главную страницу сайта
    When Клик на кнопку Мед услуги
    When Выбор услуги Денситометрия
    When Открыть меню выбора города
    When Кликнуть на выбрать другой
    When Нажатие на букву Н на форме выбора города
    When Выбор города Нальчик из списка
    When Проверка наличия надписи о непредоставлении услуги в данном городе