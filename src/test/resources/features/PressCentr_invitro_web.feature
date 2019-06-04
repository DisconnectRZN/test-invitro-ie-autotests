Feature: Проверка раздела Пресс центр

Scenario: Проверка страницы Пресс центр
  Given Открыть главную страницу сайта
  When Кликнуть на Да, верно
  When Кликнуть Открыть бургер меню
  When Кликнуть Пресс-центр в бургер меню
  When Проверка отображения заголовка 'Пресс-релизы'
  When Проверка отображения блока фильтра
  When Проверка отображения всех 'Пресс-релизов' на выбранной странице
  When Проверка отображения блока 'Контакты'
  When Проверка отображения номера телефона в блоке 'Контакты'
  When Проверка отображения Email для СМИ в блоке 'Контакты'
  When Проверка отображения Email для Комерческих предложений в блоке 'Контакты'
  When Проверка отображения блока 'Мероприятия' - содержащую кнопку 'Все мероприятия'
  When Проверка отображения кнопки 'Все мероприятия'
  When Проверка отображения блока 'Мероприятия'
  When Кликнуть по кнопке 'Показать еще'
  When Кликнуть по кнопке '2016'
  When Проверка отображения всех 'Пресс-релизов' на выбранной странице
  When Кликнуть по кнопке 'Показать еще'
  When Кликнуть по кнопке '2017'
  When Проверка отображения всех 'Пресс-релизов' на выбранной странице
  When Кликнуть по кнопке 'Показать еще'
  When Кликнуть по кнопке '2018'
  When Проверка отображения всех 'Пресс-релизов' на выбранной странице

