
Feature: Проверка страницы спикеры

Scenario: Проверка страницы Спикеры
  Given Открыть главную страницу сайта
  When Кликнуть Открыть бургер меню
  When Кликнуть Спикеры в бургер меню
  When Проверка отображения заголовка 'Спикеры'
  When Проверка отображения блока 'Островского Александра Юрьевича'
  When Проверка отображения блока 'Левашовой Виталины Владимировны'
  When Проверка отображения блока 'Антона Владимировича Буланова'
  When Проверка отображения блока 'Елены Анатольевны Кондрашевой'
  When Проверка отображения фото 'Островского Александра Юрьевича'
  When Проверка отображения фото 'Левашовой Виталины Владимировны'
  When Проверка отображения фото 'Антона Владимировича Буланова'
  When Проверка отображения фото 'Елены Анатольевны Кондрашевой'