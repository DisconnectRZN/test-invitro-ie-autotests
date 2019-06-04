# new feature
# Tags: optional

Feature: Проверка раздела Об Инвитро

  Scenario: Проверка страницы О Компании
    Given Открыть главную страницу сайта
    When Кликнуть Открыть бургер меню
    When Кликнуть Об Инвитро в бургер меню
    When Проверка отображения заголовка 'О компании'
    When Проверка отображения левого меню Страницы 'Об ИНИВТРО'
    When Проверка блока 'О компании'
    When Фото блока 'О компании'
    When Пролистать страницу вниз
    When Проверить все блоки 'БОЛЕЕ' на странице
    When Проверить второй блок 'БОЛЕЕ'
    When Проверка блока с фото Александра Юрьевича Островского
    When Проверка отображения Фото Александра Юрьевича Островского
    When Проверка отображения Фото Портрет среднестатического сотрудника
    When Проверка блока Портрет среднестатического сотрудника
    When Проверка отображения иконки блока 'Пациентов в год'
    When Проверка отображения иконки блока 'Количество МО'
    When Проверка отображения иконки блока 'Количество лабораторий'
    When Проверка отображения иконки блока 'Количество тестов'
    When Проверка отображения иконки блока 'Пробег Московского автопарка'
    When Проверка отображения иконки 'Количество принятых звонков'
    When Проверка отображения иконки 'Количество Медицинских услуг'
    When Проверка отображения иконки 'Количество профессиональных наград'
    When Проверка отображения иконки 'Количество Учебных программ'
    When Проверка блока 'Руководство'
    When Проверка блока 'Пресс-релизы'
    When Проверка блока 'Фото и Видео'

  Scenario: Проверка страницы История
    Given Открыть главную страницу сайта
    When Кликнуть Открыть бургер меню
    When Кликнуть Об Инвитро в бургер меню
    When Кликнуть по кнопке История
    When Проверить отображение блока 'История компании'
    When Проверить года истории компании
      | 2018 |
      | 2017 |
      | 2016 |
      | 2015 |
      | 2014 |
      | 2013 |
      | 2012 |
      | 2011 |
      | 2010 |
      | 2009 |
      | 2008 |
      | 2007 |
      | 2006 |
      | 2005 |
      | 2001 |
      | 2000 |
      | 1998 |
      | 1995 |
    When Проверить отображение левого блока 'История компании'
    When Проверить отображение правого блока 'История компании'

  Scenario: Проверка страницы Руководство
    Given Открыть главную страницу сайта
    When Кликнуть Открыть бургер меню
    When Кликнуть Об Инвитро в бургер меню
    When Кликнуть по кнопке Руководство
    When Проверка отображения заголовка Руководство
    When Проверка всего блока 'Руководство'
    When Проверка отображения Фото 'Островского Александра Юрьевича'
    When Проверка отображения Фото 'Левашовой Виталины Владимировны'
    When Проверка отображения Фото 'Натальи Ивановны Барановой'
    When Проверка отображения Фото 'Елены Анатольевны Кондрашевой'
    When Проверка отображения Фото 'Антона Владимировича Буланова'
    When Проверка отображения Фото 'Евгения Васильевича Печковского'
    When Проверка отображения Фото 'Андрея Николаевича Тарасова'
    When Проверка отображения Фото 'Александра Сергеевича Хамидулина'
    When Проверка отображения Фото 'Елены Леонидовны Чернер'
    When Проверка отображения Фото 'Андрея Андреевича Логвина'

  Scenario: Проверка страницы Группа компаний Инвитро
    Given Открыть главную страницу сайта
    When Кликнуть Открыть бургер меню
    When Кликнуть Об Инвитро в бургер меню
    When Кликнуть по кнопке Группа компаний Инвитро
    When Пролистать страницу вниз
    When Проверка отображения заголовка Группа компаний Инвитро
    When Проверка текста 'Инвитро бренд'
    When Проверка всех блоков страницы Группа компаний Инвитро
      | Высшая медицинская школа - комплексные услуги организациям сферы здравоохранения в области обучения и развития сотрудников.                                                     |
      | «Доктор рядом» – сеть многопрофильных медицинских клиник в Москве.                                                                                                              |
      | «Доктор 24» - инновационный сервис по вызову врачей широкого профиля на дом через сайт или мобильное приложение.                                                                |
      | Медицинский профессиональный интернет-телеканал Med2Med, адресованный практикующим врачам, студентам медицинских вузов и медицинским сестрам.                                   |
      | Медицинская кадровая служба UNICUM - современные технологии и методы поиска персонала для медицинских компаний.                                                                 |
      | 3D Bioprinting Solutions – лаборатория биотехнологических исследований, специализирующаяся на разработке и производстве биопринтеров и материалов области трехмерной биопечати. |
      | Архмедстрой - комплексное проектирование объектов здравоохранения: от небольших медицинских кабинетов до крупных лабораторных комплексов.                                       |
      | Vet Union – лабораторная диагностика и клинические исследования в ветеринарии.                                                                                                  |
      | «Лечу» - одна из крупнейших федеральных сетей медицинских центров в России с более чем 10-летним опытом успешной работы.                                                        |
    When Проверка отображения иконки блока 'Высшая медицинская школа'
    When Проверка отображения иконки блока 'Доктор рядом'
    When Проверка отображения иконки блока 'Доктор 24'
    When Проверка отображения иконки блока 'MED2MED'
    When Проверка отображения иконки блока 'UNICUM'
    When Проверка отображения иконки блока '3dBIO'
    When Проверка отображения иконки блока 'Архмедстрой'
    When Проверка отображения иконки блока 'VetUnion'
    When Проверка отображения иконки блока 'ЛечуRU'

  Scenario: Проверка страницы Качество
    Given Открыть главную страницу сайта
    When Кликнуть Открыть бургер меню
    When Кликнуть Об Инвитро в бургер меню
    When Кликнуть по кнопке Качество
    When Проверка отображения заголовка 'Качество'
    When Проверка отображения блока 'Инвитро - Лауриат премии'
    When Проверка отображения фото кубка блока 'Инвитро - Лауриат премии'
    When Проверка отображения иконки блока 'Инвитро - Лауриат премии'
    When Проверка отображения блока 'О вручении премии Правительства РФ в области качества'
    When Проверка отображения блока 'Фото и видео'
    When Проверка отображения блока 'Политика в области качества'
    When Проверка отображения блока с флагами РФ, UK, USA
    When Проверка отображения блока 'ИНВИТРО обеспечивает максимальную точность'
    When Проверка отображения блока 'Шесть сигм'
    When Проверка отображения блока 'ИНВИТРО развивает партнерские отношения'
    When Проверка отображения видео 'Росскачество подтвердило успех компании'
    When Проверка отображения блока 'Лаборатория ИНВИТРО и Видео'
    When Проверка отображения блока 'История успеха'
    When Проверка отображения иконки Флага 'РФ'
    When Проверка отображения иконки Флага 'UK'
    When Проверка отображения иконки Флага 'USA'
    When Проверка отображения иконки блока 'Шесть сигм'
    When Проверка отображения первой картинки 'Оборудование и реагенты'
    When Проверка отображения второй картинки 'Оборудование и реагенты'
    When Проверка отображения иконки кубок блока 'История успеха'
    When Проверка отображения иконки медаль блока 'История успеха'

  Scenario: Проверка страницы Особая этика
    Given Открыть главную страницу сайта
    When Кликнуть Открыть бургер меню
    When Кликнуть Об Инвитро в бургер меню
    When Кликнуть по кнопке Особая этика
    When Проверка отображения заголовка 'Особая этика'
    When Проверка отображения всего текста страницы 'Особая этика'

  Scenario: Проверка страницы Инновационная политика
    Given Открыть главную страницу сайта
    When Кликнуть Открыть бургер меню
    When Кликнуть Об Инвитро в бургер меню
    When Кликнуть по кнопке Инновационная политика
    When Проверка отображения заголовка 'Инновационная политика'
    When Проверка отображения всего текста страницы 'Инновационная политика'

  Scenario: Проверка страницы Социальная ответственность
    Given Открыть главную страницу сайта
    When Кликнуть Открыть бургер меню
    When Кликнуть Об Инвитро в бургер меню
    When Кликнуть по кнопке Социальная ответственность
    When Проверка отображения заголовка 'Социальная ответственность'
    When Проверка отображения всего текста страницы 'Социальная ответственность'

  Scenario: Проверка страницы Технологическая политика
    Given Открыть главную страницу сайта
    When Кликнуть Открыть бургер меню
    When Кликнуть Об Инвитро в бургер меню
    When Кликнуть по кнопке Технологическая политика
    When Проверить наличия раскрываемого списка Оборудование
    When Проверить наличия раскрываемого списка Путшествие пробирки
    When Проверить наличие хлебных крошек на Тех. политике
    When Проверить наличие хэдера для Тех. политики
    When Проверить наличие сайд-бар меню для Тех. политики
    When Проверить наличие текста для Тех. политики
    When Переход на Оборудовние из сайд-бар меню
    When Проверка наличия хлебных крошек на Оборудовании
    When Проверка наличия хэдера на Оборудовании
    When Проверка наличия сайд-бар меню на Оборудовании
    When Проверка наличия элементов для Оборудования
    When Выбор одного случаянного элемента для оборудования
    When Переход на страницу Путешествие пробирки
    When Проверка наличия хлебных крошек на Путешествии пробирки
    When Проверка наличия хэдера на Путешествии пробирки
    When Проверка наличия сайд-бар меню на Путешествии пробирки
    When Проверка наличия блоков с текстом на Путешествии пробирки

  Scenario: Проверка страницы Работа в ИНВИТРО
    Given Открыть главную страницу сайта
    When Кликнуть Открыть бургер меню
    When Кликнуть Об Инвитро в бургер меню
    When Кликнуть по кнопке Работа в ИНВИТРО
    When Проверка отображения заголовка 'Работа в ИНВИТРО'
    When Проверка отображения блока о работе в компании 'ИНВИТРО'
    When Проверка отображения Фото блока о работе в компании 'ИНВИТРО'
    When Проверка отображения блоков 'Постоянное развитие персонала' и 'ИНВИТРО - лауреат премий в области HR'
    When Проверка отображения кнопки 'Все вакансии' в блоке 'Актуальные вакансии для врачей'

  Scenario: Проверка страницы интервью с Виталиной Левашовой
    Given Открыть главную страницу сайта
    When Кликнуть Открыть бургер меню
    When Кликнуть Об Инвитро в бургер меню
    When Кликнуть по кнопке Работа в ИНВИТРО
    When Проверка отображения блока интервью с 'Виталиной Левашовой'
    When Кликнуть по кнопке 'Читать полностью' в блоке интервью с 'Виталиной Левашовой'
    When Проверка отображения заголовка 'Сотрудник - это наш внутренний клиент'
    When Проверка главного блока интервью с 'Виталиной Левашовой'
    When Проверка блока вопросов, заданных 'Виталине Левашовой'
    When Проверка блока ответы, данные 'Виталиной Левашовой'

  Scenario: Проверка страницы Обратная связь
    Given Открыть главную страницу сайта
    When Кликнуть Открыть бургер меню
    When Кликнуть Об Инвитро в бургер меню
    When Кликнуть по кнопке Обратная связь
    When Проверка отображения заголовка 'Обратная связь'
    When Проверка отображения блока текста на странице 'Обратная связь'
    When Проверка ввода текста в поле 'Имя'
    When Проверка ввода почты в поле 'Email'
    When Проверка ввода сообщения в поле 'Message'
    When Проверка отображения поля ввода капчи на странице 'Обратная связь'
    When Проверка отображения картинки капчи на странице 'Обратная связь'
    When Проверка отображения кнопки 'Отправить' на странице 'Обратная связь'

  Scenario: Проверка страницы Журнал Лабораторная работа
    Given Открыть главную страницу сайта
    When Кликнуть Открыть бургер меню
    When Кликнуть Об Инвитро в бургер меню
    When Кликнуть по кнопке 'Журнал «Лабораторная работа»'
    When Проверка отображения заголовка 'Журнал «Лабораторная работа»'
    When Проверка отображения заголовка для блока текста на странице 'Журнал «Лабораторная работа»'
    When Проверка отображения блока текста на странице 'Журнал «Лабораторная работа»'
    When Кликнуть по кнопке 'Читать полностью' на странице 'Журнал «Лабораторная работа»'
    When Проверка отображения фото 'Островского Александра Юрьевича' на странице 'Журнал «Лабораторная работа»'
    When Проверка всех доступных журналов

  Scenario: Проверка страницы Контакты
    Given Открыть главную страницу сайта
    When Кликнуть Открыть бургер меню
    When Кликнуть Об Инвитро в бургер меню
    When Кликнуть по кнопке Контакты
    When Проверка Заголовок Контакты
    When Проверка Заголовок 'Как добраться'
    When Проверка Блок текста, страницы Контакты
    When Проверка Контакты Блок меню слева
    When Проверка Контакты Карта маршрута

