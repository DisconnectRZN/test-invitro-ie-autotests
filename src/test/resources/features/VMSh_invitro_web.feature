# new feature
# Tags: optional
    
Feature: Проверка страницы Высшая медицинская школа

Scenario: Блочная проверка страницы ВМШ
     Given Открыть главную страницу сайта
     When Переход в раздел Врачам
     When Переход в подраздел Высшая мед.школа
     When Проверяем наличие хлебных крошек на странице ВМШ
     When Проверяем наличие заголовка на странице ВМШ
     When Проверка отображения блока меню
     When Проверка видимости блока 'шахматы'
     When Проверка блока со списком курсов
     When Проверка видимости кнопки Показать еще
     When Проверка блока с дополнительной информацией
     When Проверка наличия карты

    Scenario: Проверка меню слева в разделе ВМШ
     Given Открыть главную страницу сайта
     When Переход в раздел Врачам
     When Переход в подраздел Высшая мед.школа
     When Проверка меню курсов для врачей на их наличие
     When Проверка меню курсов для мед.сестер на их наличие
     When Проверка меню курсов по лабораторной диагностике на их наличие
     When Проверка наличия курсов по организации здравоохранения

    Scenario: Проверка формы записи на курсы
     Given Открыть главную страницу сайта
     When Переход в раздел Врачам
     When Переход в подраздел Высшая мед.школа
     When Нажатие на кнопку Записаться на форме для записи на курсы
     When Проверка заполнения обязательности полей на форме для записи на курсы
     When Проверка отображения формы для записи на курсы
     When Проверка отображения заголовка на форме записи на курсы
     When Заполнение ФИО на форме записи на курсы
     When Заполнение Телефона на форме записи на курсы
     When Заполнение емэйл на форме записи на курсы
     When Заполнение названия курса на форме записи на курсы
     When Заполнение комментария на форме записи на курсы
     When Наличие кнопки для загрузки файла
     When Проверка отображения кнопки Записаться на форме

     Scenario: Проверка детальной страницы курса
     Given Открыть главную страницу сайта
     When Переход в раздел Врачам
     When Переход в подраздел Высшая мед.школа
     When Кликаем на кнопку Показать еще пока она присутствует
     When Проверка блока с врачами на главной странице ВМШ
     When Выбираем рандомный курс для проверки детальной страницы
     When Проверяем наличие заголовка на детальной странице курса
     When Проверка блока с основной информацией по курсу
     When Проверка наличия блока слева с телефонами и кнопкой Записаться
     When Проверка наличия первого номера телефона в блоке справа
     When Проверка наличия второго номера телефона в блоке справа