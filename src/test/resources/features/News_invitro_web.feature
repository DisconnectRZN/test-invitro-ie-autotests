Feature: Проверка раздела Новости

Scenario: Проверка страницы Новости
  Given Открыть главную страницу сайта
  When Кликнуть Открыть бургер меню
  When Кликнуть Новости в бургер меню
  When Проверка отображения заголовка 'Новости'
  When Проверка отображения блока фильтра
  When Проверка отображения всех 'Новостей' на выбранной странице
  When Проверка отображения блока 'Контакты'
  When Проверка отображения номера телефона в блоке 'Контакты'
  When Проверка отображения Email для СМИ в блоке 'Контакты'
  When Проверка отображения Email для Комерческих предложений в блоке 'Контакты'
  When Проверка отображения блока 'Мероприятия' - содержащую кнопку 'Все мероприятия'
  When Проверка отображения кнопки 'Все мероприятия'
  When Проверка отображения блока 'Мероприятия'
  When Кликнуть по кнопке 'Показать еще'
  When Кликнуть по кнопке '2018'
  When Проверка отображения всех 'Новостей' на выбранной странице
  When Кликнуть по кнопке 'Показать еще'
  When Кликнуть по кнопке '2017'
  When Проверка отображения всех 'Новостей' на выбранной странице
  When Кликнуть по кнопке 'Показать еще'
  When Кликнуть по кнопке '2016'
  When Проверка отображения всех 'Новостей' на выбранной странице
  When Кликнуть по кнопке 'Показать еще'
