package testpackage.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import testpackage.help.Help_Methods;


@DefaultUrl("https://client-login.sandbox.gboteam.ru/")

public class LoyaltyProgram extends PageObject {
    private static final Help_Methods help = Help_Methods.getInstance();

    private final By OpenMainMenu = By.xpath("//button[@class='header-menu__btn ripple']");// Открытие меню бургер
    private final By LoyaltyProgramLink = By.xpath("//*[@class='header-menu__link header-menu__link--title'][contains(text(),'Программа «ИНВИТРО Здоровый плюс»')]"); // Ссылка на Программу лояльности
    private final By HeaderLoyaltyProgram = By.xpath("//div[contains(@class,'title-block')]"); // Заголовок Программа лояльности ИНВИТРО
    private final By BannerLoyaltyProgram = By.xpath("//*[@class='service-home-banner__image']"); // Баннер на странице Программы лояльности
    private final By TitleBonusesOrDiscounts = By.xpath("//div[@class='service-home-about']"); // Блок рядом с баннером

    private final By BannerText = By.xpath("//*[contains(text(),' - это компл')]"); // Текст «ИНВИТРО Здоровый плюс» - это комплексная программа поощрения
    private final By BannerText2 = By.xpath("//*[contains(text(),'«ИНВИТРО Здоровый плюс» – это')]"); // Текст Вы сами решаете, что Вам удобнее: скидки или бонусы
    private final By Attention128LoyaltyProgram = By.xpath("//div[@class = 'loyalty__attention-title']"); //Блок Внимание
    private final By SimultaneousLoyaltyProgram = By.xpath("//div[@class = 'loyalty__attention-text']"); //Блок текста Одновременное участие в двух программах
    private final By Rules1LoyaltyProgram = By.xpath("//div[@class = 'loyalty__attention']/a"); // 1 Полные правила программы

    //--------------------География программы

    private final By HeadingGeography = By.xpath("//*[@class='investors__map-block-title']"); // Заголовок География программы лояльности
    private final By GeographyTextLoyalityProgram = By.xpath("//*[contains(text(),'Программа «ИНВИТРО Здоровый плюс» дей')]"); // Текст в блоке география программы
    private final By BannerGeography = By.xpath("//*[@class='loyalty__planet']"); // Баннер Географии программы лояльности

    private final By HeaderBonusProgram = By.xpath("//span[contains(text(),'Бонусная программа «ИНВИТРО')]"); //Заголовок Бонусная программа «ИНВИТРО Здоровый плюс»
    private final By HeaderDiscountProgram = By.xpath("//span[contains(text(),'Дисконтная программа «ИНВИТРО')]"); //Заголовок Дисконтная программа «ИНВИТРО Здоровый плюс»
    private final By BonusProgram1 = By.xpath("//*[contains(text(),'Это накопительная про')]"); // Текст Бонусная программа
    private final By DiscountProgram = By.xpath("//*[contains(text(),'Это программ')]"); // Текст Дисконтная программа
    private final By Rules2LoyaltyProgram = By.xpath("//div[@class='service-home-answer']//div[@class = 'result-item__tags']/a"); // 2 Полные правила программы

    //--------Преимущества бонусной программы

    private final By HeadingBP = By.xpath("//h2[contains(text(),'Бонусная программа')]"); // Заголовок Бонусная программа
    private final By BenefitsBP = By.xpath("//*[contains(text(),'Преимущества бонусной программы')]"); // Преимущества бонусной программы
    private final By Text123BP = By.xpath("//*[contains(text(),'Участвуйте в бонусной')]"); // Текст Участвуйте в бонусной программе и оплачивайте заказы

    //--------Иконки
    private final By Label01BP = By.xpath("//*[contains(@class,'show-block--active')][1]/div[1]/img"); // 1-ая иконка ББ
    private final By Label02BP = By.xpath("//*[contains(@class,'show-block--active')][1]/div[2]/img"); // 2-ая иконка ББ
    private final By Label03BP = By.xpath("//*[contains(@class,'show-block--active')][1]/div[3]/img"); // 3-я иконка ББ
    private final By Label04BP = By.xpath("//*[contains(@class,'show-block--active')][2]/div[1]/img"); // 4-ая иконка ББ
    private final By Label05BP = By.xpath("//*[contains(@class,'show-block--active')][2]/div[2]/img"); // 5-ая иконка ББ

    //--------------Текст под иконками
    private final By Text01BP = By.xpath("//*[contains(@class,'show-block--active')][1]/div[1]/div/p"); // 1-ый текст ББ
    private final By Text02BP = By.xpath("//*[contains(@class,'show-block--active')][1]/div[2]/div/p"); // 2-ой текст ББ
    private final By Text03BP = By.xpath("//*[contains(@class,'show-block--active')][1]/div[3]/div/p"); // 3-ий текст ББ
    private final By Text04BP = By.xpath("//*[contains(@class,'show-block--active')][2]/div[1]/div/p"); // 4-ый текст ББ
    private final By Text05BP = By.xpath("//*[contains(@class,'show-block--active')][2]/div[2]/div/p"); // 5-ый текст ББ

    //-------Как стать участником бонусной программы
    private final By HeaderAsBPLoyalityProgram = By.xpath("//h2[contains(text(),'Как стать участником бонусной')]"); // заголовок Как стать участником бонусной программы?
    private final By TextBPLoyalityProgram = By.xpath("//div[contains(text(),'чтобы стать участником бонусной ')]"); // Текст Для того, чтобы стать участником бонусной программы «ИНВИТРО Здоровый плюс» необходимо:
    private final By Text2BPLoyalityProgram = By.xpath("//div[contains(@class,'directions show-block directions--three directions--jcfs show-block--active')]/div[1]/span[2]"); // Текст Оформить и оплатить заказ в ИНВИТРО
    private final By Text3BPLoyalityProgram = By.xpath("//div[contains(@class,'directions show-block directions--three directions--jcfs show-block--active')]/div[2]/span[2]"); // Текст Подписать согласие на участие в программе

    //------Статусы участников бонусной программы
    private final By HeadingStatus = By.xpath("//*[contains(text(),'участников бонусной программы')]"); // Заголовок Статусы участников
    private final By Label5BP = By.xpath("//div[contains(text(),'5%')]"); // Иконка 5% БП
    private final By Label7BP = By.xpath("//div[contains(text(),'7%')]"); // Иконка 7% БП
    private final By LabelTest10BP = By.xpath("//*[@class='features__item-icon'][contains(text(),'10%')]"); // Иконка 10% БП
    private final By Label30BP1 = By.xpath("//div[contains(text(),'30%')]"); // Иконка 30% БП
    private final By TextBPStandart = By.xpath("//*[contains(text(),'«Стандарт»')]"); // Текст Статус участника «Стандарт»
    private final By TextBPSilver = By.xpath("//*[contains(text(),'«Серебряный»')]"); // Текст Статус участника «Серебряный»
    private final By TextBPGolden = By.xpath("//*[contains(text(),'«Золотой»')]"); // Текст Статус участника «Золотой»
    private final By TextBPSocial = By.xpath("//*[contains(text(),'участника «Социальный»')]"); // Текст Статус участника «Социальный»
    private final By TextBPVeteran = By.xpath("//*[contains(text(),'участника «Ветеран»')]"); // Текст Статус участника «Ветеран»
    private final By TextBPStandart999 = By.xpath("//*[contains(text(),' 9 999 рублей.')]"); // Текст Общая сумма 9999
    private final By TextBPSilver1999 = By.xpath("//*[contains(text(),'19 999 рублей.')]"); // Текст Общая сумма 19999
    private final By TextBPGolden20000 = By.xpath("//*[contains(text(),'20 000 рублей.')]"); // Текст Общая сумма 20000
    private final By TextBPSocialSoc = By.xpath("//*[contains(text(),'Предоставляется')]"); // Текст Предоставляется гражданам следующих категорий: пенсионеры, инвалиды I
    private final By TextBPVeteranVet = By.xpath("//*[contains(text(),'Граждане')]"); // Текст Граждане, являющиеся ветеранами ВОВ, ветеранами локальных войн,

    //--------Как копить?
    private final By HeadingHow = By.xpath("//*[contains(text(),'Как копить?')]"); // Заголовок Как копить?
    private final By LabelBB = By.xpath("//*[@src='/local/templates/invitro_main/src/image/icons/save.svg']"); // Иконка Бонусные баллы
    private final By LabelHiB = By.xpath("//*[@src='/local/templates/invitro_main/src/image/icons/save-200.svg']"); // Иконка Приветственный бонус
    private final By LabelBirthday = By.xpath("//*[@src='/local/templates/invitro_main/src/image/icons/save-500.svg']"); // Иконка Бонусы в день рождения
    private final By LabelAdditional1 = By.xpath("//*[@src='/local/templates/invitro_main/src/image/icons/save-plus.svg']"); // Иконка Дополнительные бонусы
    private final By TextBonusBalls = By.xpath("//*[contains(@class,'service-home__title')][contains(text(),'Бонусные баллы')]"); // Текст Бонусные баллы
    private final By TextWelcomeBonus = By.xpath("//*[contains(text(),'Приветственный бонус')]"); // Текст Приветственный бонус
    private final By TextBirthdayBonuses1 = By.xpath("//*[contains(text(),'Бонусы в день рождения')]"); // Текст Бонусы в день рождения
    private final By TextAdditionalBonuses = By.xpath("//span[contains(text(),'Дополнительные бонусы')]"); // Текст Дополнительные бонусы

    private final By TextBonusBallsAccrue = By.xpath("//p[contains(text(),'Бонусные баллы')]"); // Текст Бонусные баллы начисляются согласно статусу участника
    private final By TextBonusBallsEverybody = By.xpath("//*[contains(text(),'Всем пациентам')]"); // Текст Всем пациентам, заказавшим услуги
    private final By TextBirthdayBonuses500 = By.xpath("//*[contains(text(),'Всем участникам')]"); // Текст Всем участникам программы в день рождения ИНВИТРО дарит 500 бонусов
    private final By TextAdditionalBonuses1 = By.xpath("//*[contains(text(),'Бонусы, начисляемые')]"); // Текст Бонусы, начисляемые в зависимости от суммы заказа:
    private final By TextAdditionalBonuses2 = By.xpath("//li[contains(text(),'При единовременной покупке услуг')][1]"); // Блок При единовременной покупке услуг на сумму свыше 10 000 рублей – дополнительно 400 бонусов;
    private final By TextAdditionalBonuses3 = By.xpath("//li[contains(text(),'При единовременной покупке услуг')][2]"); // Блок При единовременной покупке услуг на сумму свыше 20 000 рублей – дополнительно 1 000 бонусов.

    //-------Как использовать бонусные баллы?
    private final By Whoisp = By.xpath("//*[@class='service-home-row use_bonus']"); // Блок Как использовать бонусные баллы?
    private final By HeadingHowToUse = By.xpath("//h2[contains(text(),'Как использовать')]"); // Заголовок Как использовать бонусные баллы?
    private final By Text1HowToUse = By.xpath("//li[contains(text(),'Накопленными бонусами можно оплатить')]"); // Текст 1. Накопленными бонусами можно оплатить до 50% от суммы заказа из расчета 1 бонус = 1 рубль, но не более 30 000 бонусов за заказ;
    private final By Text2HowToUse = By.xpath("//li[contains(text(),'Бонусные баллы доступны к списанию')]"); // Текст 2. Бонусные баллы доступны к списанию через 24 часа после их начисления;
    private final By Text3HowToUse = By.xpath("//li[contains(text(),'Бонусы, начисленные первыми')]"); // Текст 3. Бонусы, начисленные первыми, списываются в первую очередь;
    private final By Text4HowToUse = By.xpath("//li[contains(text(),'Лимит по 1 карте')]"); // Текст 4. Лимит по 1 карте за 1 день - 3 заказа на медицинские услуги.

    //------Срок действия бонусных баллов
    private final By SrokDeistv = By.xpath("//*[@class='service-home-row'][3]"); // Блок Срок действия бонусных баллов
    private final By HeadingSrokDeistv = By.xpath("//h2[contains(text(),'Срок действия бонусных ')]"); // Заголовок Срок действия бонусных баллов;
    private final By Text1SrokDeistv = By.xpath("//li[contains(text(),'Приветственные бонусы')]"); // Текст 1. Приветственные бонусы – срок действия 1 год;
    private final By Text2SrokDeistv = By.xpath("//li[contains(text(),'Бонусные баллы согласно')]"); // Текст 2. Бонусные баллы доступны к списанию через 24 часа после их начисления;
    private final By Text3SrokDeistv = By.xpath("//li[contains(text(),'Дополнительные бонусы')]"); // Текст 3. Бонусы, начисленные первыми, списываются в первую очередь;
    private final By Text4SrokDeistv = By.xpath("//li[contains(text(),'Подарочные бонусы')]"); // Текст 4. Лимит по 1 карте за 1 день - 3 заказа на медицинские услуги.

    //----Переход на дисконтную программу
    private final By HeadingTransition = By.xpath("//*[contains(text(),'Переход на дисконтную программу')]"); // Заголовок Переход на дисконтную программу
    private final By LabelDisconnectBP = By.xpath("//*[@src='/local/templates/invitro_main/src/image/content/directions/loyalty-1.svg']"); // Иконка Отключиться от бонусной программы
    private final By LabelToWrite = By.xpath("//*[@src='/local/templates/invitro_main/src/image/content/directions/loyalty-2.svg']"); // Иконка Написать заявление
    private final By LabelReceive = By.xpath("//*[@src='/local/templates/invitro_main/src/image/content/directions/loyalty-3.svg']"); // Иконка Получить ДК
    private final By TextDisconnectBP = By.xpath("//*[contains(text(),'Отключиться от бонусной')]"); // Текст Отключиться от бонусной программы в любом медицинском офисе, подписав отказ от участия в бонусной программе
    private final By TextToWrite = By.xpath("//*[contains(text(),'Написать заявление на выдачу дисконтной карты')]"); // Текст Написать заявление на выдачу дисконтной карты
    private final By TextReceive = By.xpath("//*[contains(text(),'Получить дисконтную карту')]"); // Текст Получить дисконтную карту
    private final By LabelBonus5 = By.xpath("//*[@src='/local/templates/invitro_main/src/image/icons/circle-5.svg']"); // Иконка бонус 5%
    private final By LabelDK5pr = By.xpath("//div[@class='service-home-row on_discont']//img[@src='/local/templates/invitro_main/src/image/icons/5.svg']"); // Иконка ДК 5%
    private final By LabelBonus7or10 = By.xpath("//img[@src='/local/templates/invitro_main/src/image/icons/circle-7-10.svg']"); // Иконка Бонус 7% или 10%
    private final By LabelDK10pr = By.xpath("//div[@class='service-home-row on_discont']//img[@src='/local/templates/invitro_main/src/image/icons/10.svg']"); // Иконка ДК 10%

    //---Дисконтная программа «ИНВИТРО Здоровый плюс»
    private final By HeadingDP = By.xpath("//h2[contains(text(),'Дисконтная программа «ИНВИТРО Здоровый плюс»')]"); // Заголовок Дисконтная программа

    //---О программе
    private final By TextAboutThePprogram = By.xpath("//*[contains(text(),'О программе')]"); // Текст О программе
    private final By TextDP = By.xpath("//div[contains(text(),'Получайте скидку по')]"); // Текст Получайте скидку по дисконтной карте, привязанной к карте Вашего контакта, или предъявляйте пластиковую дисконтную карту.

    //---Преимущества дисконтной программы
    private final By HeadingPreimDP = By.xpath("//h2[contains(text(),'Преимущества дис')]"); // Заголовок Преимущества дисконтной программы
    private final By Text1PreimDP = By.xpath("//li[contains(text(),'Номер дисконтной карты привязывается')]"); // Текст Номер дисконтной карты привязывается к карте контакта Пациента, не нужно носить с собой.
    private final By Text2PreimDP = By.xpath("//li[contains(text(),'Дисконтную карту ИНВИТРО')]");// Текст Дисконтную карту ИНВИТРО можно передавать близким и друзьям. Скидка действует на предъявителя дисконтной карты.
    private final By Text3PreimDP = By.xpath("//li[contains(text(),'Копите всей ')]"); //Текст Копите всей семьей, получайте скиду всей семьей.

    //---Как стать участником дисконтной программы?
    private final By HeadingHowBecome = By.xpath("//h2[contains(text(),'Как стать участником дисконтной')]");//Как стать участником дисконтной программы?
    private final By Text1HowBecome = By.xpath("//div[contains(text(),'Для того, чтобы получить')]");// Текст Для того, чтобы получить дисконтную карту ИНВИТРО необходимо:
    private final By Text2HowBecome = By.xpath("//li[contains(text(),'Оформить и оплатить заказ ')]");// Текст Оформить и оплатить заказ в ИНВИТРО на сумму, достаточную для выдачи дисконтной карты,
    private final By Text3HowBecome = By.xpath("//li[contains(text(),'Подписать согласие')]");// Текст Подписать согласие на участие в программе.

    //---Как воспользоваться дисконтной программой?
    private final By HeadingHowTake = By.xpath("//h2[contains(text(),'Как воспользоваться ')]");// Заголовок Как воспользоваться дисконтной программой?
    private final By Text1HowTake = By.xpath("//li[contains(text(),'Номер дисконтной карты «ИНВИТРО')]");// Текст Номер дисконтной карты «ИНВИТРО Здоровый плюс» (дисконтная карта нового образца) прикрепляется к Вашей карточке клиента, что позволяет Вам при повторном обращении в медицинский офис ИНВИТРО получить привилегию без предъявления пластиковой карты.
    private final By Text2HowTake = By.xpath("//li[contains(text(),'Дисконтные карты, выданные ранее')]");// Текст Дисконтные карты, выданные ранее (дисконтные карты старого образца), также действуют в медицинских офисах ИНВИТРО, согласно правилам программы.
    private final By Text3HowTake = By.xpath("//li[contains(text(),'Номер дисконтной карты старого')]");// Текст Номер дисконтной карты старого образца также может быть прикреплен к Вашей карточке контакта, что позволит Вам получать привилегию без предъявления пластиковой карты.
    private final By Text4HowTake = By.xpath("//li[contains(text(),'Дисконтную карту старого образц')]");// Текст Дисконтную карту старого образца можно обменять на дисконтную карту нового образца.

    //---Типы дисконтных карт
    private final By TextKindsPL = By.xpath("//*[contains(text(),'Типы дисконтных карт')]"); // Заголовок Виды дисконтных карт
    private final By LabelDiscountDK5 = By.xpath("//*[@src='/upload/iblock/62c/62c21751338f1378c11771763c36545c.png']"); // Иконка Дисконтная карта номиналом 5%
    private final By TextDiscountDK5 = By.xpath("//*[contains(text(),'Дисконтная карта номиналом 5%')]"); // Текст Дисконтная карта номиналом 5%
    //private By TextIssuedInCases115 = By.xpath("//div[1]/span[contains(text(),'Дисконтная карта')]/following-sibling::div"); // Полный текст блока
    private final By TextIssuedInCases5 = By.xpath("//div[@class='description_discount']//*[contains(text(),'от 4 500 рублей')][1]"); // Текст Сумма единовременного заказа - от 4 500 рублей;
    private final By TextIssuedInCases15 = By.xpath("//div[@class='description_discount']//*[contains(text(),'от 4 500 рублей')][2]"); // Текст Сумма всех заказов (суммарно, накопительным итогом) – от 4 500 рублей.

    private final By NewLabelDiscountDK10 = By.xpath("//*[@class='loyalty__cart'][@src='/upload/iblock/aae/aae9a109b25caf7d63eeff4a4119ada1.png']"); // Иконка Дисконтная карта номиналом 10%
    private final By TextDiscountDK10 = By.xpath("//*[contains(text(),'Дисконтная карта номиналом 10%')]"); // Текст Дисконтная карта номиналом 10%
    //private By TextIssuedInCases115 = By.xpath("//div[2]/span[contains(text(),'Дисконтная карта')]/following-sibling::div"); // Полный текст блока
    private final By TextAbaDiscountDK1010 = By.xpath("//*[contains(text(),'от 15 000 рублей')][1]"); // Текст Сумма единовременного заказа - от 15 000 рублей;
    private final By TextAbaDiscountDK210010 = By.xpath("//*[contains(text(),'от 15 000 рублей')][2]"); // Текст Сумма всех заказов (суммарно, накопительным итогом) – от 15 000 рублей;
    private final By TextAbaDiscountDK310010 = By.xpath("//*[contains(text(),'превышает 10 000')]"); // Текст Если у вас есть дисконтная карта 5% и сумма дополнительных покупок превышает 10 000 рублей, вы можете получить карту номиналом 10% (карта 5% изымается).

    private final By LabelDiscountDK13 = By.xpath("//*[@class='loyalty__cart'][@src='/upload/iblock/f88/f88b4ed6922691c35684771489c161c8.png']"); // Иконка Дисконтная карта номиналом 13%
    private final By TextDiscountDK13 = By.xpath("//*[contains(text(),'Дисконтная карта номиналом 13%')]"); // Текст Дисконтная карта номиналом 13%
    private final By TextIssuedInCases13 = By.xpath("//*[contains(text(),'Выдается бесплатно в')]"); // Текст Выдается бесплатно в медицинском офисе в индивидуальном порядке по решению компании.

    //---Также в медицинских офисах ИНВИТРО принимаются карты следующих образцов
    private final By HeadingTakGe = By.xpath("//*[contains(text(),'Также в медицинских офисах')]"); // Текст Также в медицинских офисах ИНВИТРО принимаются карты следующих образцов
    private final By LabelDiscountDKnom5 = By.xpath("//*[@src='/upload/iblock/d3f/d3f102be73eab63f93547a8922507311.png']"); //Иконка Дисконтная карта номиналом 5%
    private final By LabelDiscountDKnom10 = By.xpath("//*[@src='/upload/iblock/763/76374112e888b47218c97b00cedcdfb5.png']"); //Иконка Дисконтная карта номиналом 10%
    private final By LabelDK5p = By.xpath("//*[@src='/upload/iblock/70b/70b202ed665adae29113fb0101dc58b0.png']"); // Иконка Дисконтная карта номиналом 5% старого образца
    private final By LabelDK10p = By.xpath("//*[@src='/upload/iblock/385/38553dc3ef07b95bb6703fd990f2a827.png']"); // Иконка Дисконтная карта номиналом 10% старого образца
    private final By LabelDiscountDKnom13 = By.xpath("//*[@class='loyalty__cart'][@src='/upload/iblock/dbc/dbceedd789c102468de60a6232d63ad2.png']"); // Иконка Дисконтная карта номиналом 13%
    private final By LabelDKKidzania = By.xpath("//*[@src='/upload/iblock/ada/ada716e89ad2dec9857ae6ea6e2a8876.png']"); // Иконка Дисконтная карта Кидзания

    private final By TextDK5p = By.xpath("//div[@class = 'service-home-main__items'][1]/div[1]/span[contains(text(),'Дисконтная карта')]"); // Текст Дисконтная карта номиналом 5%
    private final By TextDK10p = By.xpath("//div[@class = 'service-home-main__items'][1]/div[2]/span[contains(text(),'Дисконтная карта')]"); // Текст Дисконтная карта номиналом 10%
    private final By TextDKold5p = By.xpath("//div[@class = 'service-home-main__items'][2]/div[1]/span[contains(text(),'Дисконтная карта')]"); // Текст Дисконтная карта номиналом 5% старого образца
    private final By TextDKold10p = By.xpath("//div[@class = 'service-home-main__items'][2]/div[2]/span[contains(text(),'Дисконтная карта')]"); // Текст Дисконтная карта номиналом 10% старого образца
    private final By TextDiscountDKnom13 = By.xpath("//div[@class = 'service-home-main__items'][3]/div[1]/span[contains(text(),'Дисконтная карта')]"); // Текст Дисконтная карта номиналом 13%
    private final By TextDKKidzania = By.xpath("//*[contains(text(),'Кидзания')]"); // Текст Кидзания

    //---Переход на бонусную программу
    private final By LabelGoToTheBonus = By.xpath("//h2[contains(text(),'Переход на бонусную программу')]"); // Заголовок Переход на бонусную программу
    private final By TextWe = By.xpath("//*[contains(text(),'Вы можете стать уча')]"); // Текст Вы можете стать участником бонусной программы
    private final By LabelDK5pp = By.xpath("//*[@class = 'service-home-row']//img[@src='/local/templates/invitro_main/src/image/icons/5.svg']"); // Иконка Дисконтная карта номиналом 5% в блоке перехода
    private final By LabelBonus7 = By.xpath("//*[@class = 'service-home-row']//img[@src='/local/templates/invitro_main/src/image/icons/circle-7.svg']"); // Иконка Бонус 7%
    private final By LabelaDK10pp = By.xpath("//*[@class = 'service-home-row']//img[@src='/local/templates/invitro_main/src/image/icons/10.svg']"); // Иконка Дисконтная карта номиналом 10% в блоке перехода
    private final By NewLabelBonus10 = By.xpath("//*[@class = 'service-home-row']//img[@src='/local/templates/invitro_main/src/image/icons/circle-10.svg']"); // Иконка Бонус 10%
    private final By NewLabelDK13pp = By.xpath("//*[@class = 'service-home-row']//img[@src='/local/templates/invitro_main/src/image/icons/13.svg']"); // Иконка Дисконтная карта номиналом 13% в блоке перехода
    private final By NewLabelBonus13 = By.xpath("//*[@class = 'service-home-row']//img[@src='/local/templates/invitro_main/src/image/icons/circle-13.svg']"); // Иконка Бонус 13%

    private final By TextBonus5Kards = By.xpath("//body//div[@class='container-content show']//div[@class='container loyalty']//section[@class='content loyalty']//div[@class='service-home-row']//div[@class='service-home-column-main']//div[@class='service-home-column-main-wrap']//div[@class='service-home-column-main-wrap']/div[1]//div[1]//div[1]//span[1]"); //Дисконтная карта
    private final By TextBonus7Kards = By.xpath("//body//div[@class='container-content show']//div[@class='container loyalty']//section[@class='content loyalty']//div[@class='service-home-row']//div[@class='service-home-column-main']//div[@class='service-home-column-main-wrap']//div[@class='service-home-column-main-wrap']/div[1]//div[1]//div[2]//span[1]"); // Текст Бонус 7%
    private final By TextBonus10Kards = By.xpath("//body//div[@class='container-content show']//div[@class='container loyalty']//section[@class='content loyalty']//div[@class='service-home-row']//div[@class='service-home-column-main']//div[@class='service-home-column-main-wrap']//div[@class='service-home-column-main-wrap']/div[2]//div[1]//div[1]//span[1]"); //Дисконтная карта
    private final By TextBonus10 = By.xpath("//body//div[@class='container-content show']//div[@class='container loyalty']//section[@class='content loyalty']//div[@class='service-home-row']//div[@class='service-home-column-main']//div[@class='service-home-column-main-wrap']//div[@class='service-home-column-main-wrap']/div[2]//div[1]//div[2]//span[1]"); // Текст Бонус 10%
    private final By TextBonus13Kards = By.xpath("//body//div[@class='container-content show']//div[@class='container loyalty']//section[@class='content loyalty']//div[@class='service-home-row']//div[@class='service-home-column-main']//div[@class='service-home-column-main-wrap']//div[@class='service-home-column-main-wrap']/div[3]//div[1]//div[1]//span[1]"); //Дисконтная карта
    private final By TextBonus13 = By.xpath("//body//div[@class='container-content show']//div[@class='container loyalty']//section[@class='content loyalty']//div[@class='service-home-row']//div[@class='service-home-column-main']//div[@class='service-home-column-main-wrap']//div[@class='service-home-column-main-wrap']/div[3]//div[1]//div[2]//span[1]"); // Текст Бонус 13%

    private final By TextChange = By.xpath("//*[contains(text(),'Передумали?')]"); // Текст Передумали? В любой момент восстановите

    //---Правила программы
    private final By HeadingRules = By.xpath("//*[contains(text(),'Правила')]"); // Заголовок Правила программы
    private final By Rules3LoyaltyProgram = By.xpath("//*[@class = 'service-home-column-side']/following-sibling::div//*[contains(text(),'Полные правила программы')]"); // 3 Полные правила программы

//----------------------------------------------------------------------------------Тело------------------------------------------------------------------------------------------------------------//

    public void сlickOpenMainMenu() { //Кликнуть, Открыть бургер меню
        find(OpenMainMenu).waitUntilClickable().click();
    }

    public void clickLoyaltyProgramLink() { //Кликнуть Ссылка на Программу лояльности
        find(LoyaltyProgramLink).waitUntilClickable().click();
    }

    public void verifyHeaderLoyaltyProgram() { // Проверить Заголовок Программа лояльности ИНВИТРО
        find(HeaderLoyaltyProgram).isVisible();
    }

    public void visibleBannerLoyaltyProgram() { //Проверить видимость Баннер на странице Программы лояльности
        find(BannerLoyaltyProgram).isVisible();
    }

    public void verifyTitleBonusesOrDiscounts() { //Проверить Блок текста справа от баннера
        find(TitleBonusesOrDiscounts).isVisible();
    }

    public void verifyBannerText() { // Проверить Текст Становитесь участником дисконтной или бонусной программы ИНВИТРО
        Assertions.assertThat(find(BannerText).getText()).isEqualTo("«ИНВИТРО Здоровый плюс» - это комплексная программа поощрения постоянных клиентов, включающая в себя бонусную и дисконтную механики.");
    }

    public void verifyBannerText2() { // Проверить Заголовок Программа лояльности ИНВИТРО
        Assertions.assertThat(find(BannerText2).getText()).isEqualTo("Вы сами решаете, что Вам удобнее: скидки или бонусы. «ИНВИТРО Здоровый плюс» – это всегда выгодно. Что бы Вы ни выбрали, Вы всегда остаетесь в плюсе!");
    }

    public void visibleTest221LoyaltyProgram() { //Проверить Блок Внимание
        find(Attention128LoyaltyProgram).isVisible();
    }

    public void verifySimultaneousLoyaltyProgram() { // Проверить Заголовок Программа лояльности ИНВИТРО
        Assertions.assertThat(find(SimultaneousLoyaltyProgram).getText().trim()).isEqualTo("Одновременное участие в двух программах, дисконтной и бонусной, невозможно." + "\n" + "При оформлении одного заказа вы можете воспользоваться или бонусными баллами, или скидкой по дисконтной карте.");
    }

    public void visibleRules1LoyaltyProgram() { //1 Полные правила программы
        find(Rules1LoyaltyProgram).isVisible();
    }

    //--------------------География программы
    public void verifyHeadingGeography() { // Проверить Заголовок География программы лояльности
        Assertions.assertThat(find(HeadingGeography).getText()).isEqualTo("География программы");
    }

    public void verifyGeographyTextLoyalityProgram() { // Проверить Текст в блоке география программы
        Assertions.assertThat(find(GeographyTextLoyalityProgram).getText()).isEqualTo("Программа «ИНВИТРО Здоровый плюс» действует на всей территории Российской Федерации");
    }

    public void visibleBannerGeography() { //Проверить видимость Баннер Географии программы лояльности
        find(BannerGeography).isVisible();
    }

    public void verifyHeaderBonusProgram() { // Проверить Заголовок Программа лояльности ИНВИТРО
        Assertions.assertThat(find(HeaderBonusProgram).getText()).isEqualTo("Бонусная программа «ИНВИТРО Здоровый плюс»");
    }

    public void verifyHeaderDiscountProgram() { // Проверить Заголовок Программа лояльности ИНВИТРО
        Assertions.assertThat(find(HeaderDiscountProgram).getText()).isEqualTo("Дисконтная программа «ИНВИТРО Здоровый плюс»");
    }

    public void verifyBonusProgram1() { // Проверить Текст Бонусная программа
        Assertions.assertThat(find(BonusProgram1).getText()).isEqualTo("Это накопительная программа, участвуя в которой Вы сможете получать бонусные баллы (бонусы) при оплате услуг лабораторной диагностики и услуг взятия биоматериала в медицинских офисах, диагностических центрах и при оформлении заказа через службу выезда на дом на территории Российской Федерации. Бонусами в дальнейшем можно оплатить до 50% от суммы заказа.");
    }

    public void verifyDiscountProgram() { // Проверить Текст Дисконтная программа
        Assertions.assertThat(find(DiscountProgram).getText()).isEqualTo("Это программа, позволяющая Вам получать фиксированную скидку на услуги лабораторной диагностики и услуги взятия биоматериала в медицинских офисах, диагностических центрах и при оформлении заказа через службу выезда на дом на территории Российской Федерации.");
    }

    public void visibleRules2LoyaltyProgram() { //2 Полные правила программы
        find(Rules2LoyaltyProgram).isVisible();
    }

    //--------Преимущества бонусной программы
    public void verifyHeadingBP() { // Проверить Заголовок Бонусная программа
        Assertions.assertThat(find(HeadingBP).getText()).isEqualTo("Бонусная программа «ИНВИТРО Здоровый плюс»");
    }

    public void verifyBenefitsBP() { // Проверить Текст Преимущества бонусной программы
        Assertions.assertThat(find(BenefitsBP).getText()).isEqualTo("Преимущества бонусной программы");
    }

    public void verifyText123BP() { // Проверить Текст Преимущества бонусной программы
        Assertions.assertThat(find(Text123BP).getText()).isEqualTo("Участвуйте в бонусной программе и оплачивайте заказы, накапливая бонусы за каждую покупку. Бонусные баллы начисляются согласно статусу участника программы, списываются согласно эквиваленту: 1 бонусный балл = 1 рубль. Бонусные баллы нельзя обменять на наличные деньги.");
    }

    //------------Иконки
    public void visibleLabel01BP() { //Проверить видимость 1-ая иконка ББ
        find(Label01BP).isVisible();
    }

    public void visibleLabel02BP() { //Проверить видимость 2-ая иконка ББ
        find(Label02BP).isVisible();
    }

    public void visibleLabel03BP() { //Проверить видимость 3-ая иконка ББ
        find(Label03BP).isVisible();
    }

    public void visibleLabel04BP() { //Проверить видимость 4-ая иконка ББ
        find(Label04BP).isVisible();
    }

    public void visibleLabel05BP() { //Проверить видимость 5-ая иконка ББ
        find(Label05BP).isVisible();
    }

    //--------------Текст под иконками
    public void verifyText01BP() { // Проверить 1-ый текст ББ
        Assertions.assertThat(find(Text01BP).getText()).isEqualTo("Оплачивайте баллами до 50% суммы заказа (на оставшуюся часть начисляются баллы согласно статусу участия);");
    }

    public void verifyText02BP() { // Проверить 2-ый текст ББ
        Assertions.assertThat(find(Text02BP).getText()).isEqualTo("Оплачивайте баллами заказы родных и близких;");
    }

    public void verifyText03BP() { // Проверить 3-ый текст ББ
        Assertions.assertThat(find(Text03BP).getText()).isEqualTo("Бонусный баланс доступен в Личном кабинете (история начислений и списания бонусов);");
    }

    public void verifyText04BP() { // Проверить 4-ый текст ББ
        Assertions.assertThat(find(Text04BP).getText()).isEqualTo("Получайте подарки от компании:" + "\n" +
                "— 200 приветственных бонусов при вступлении в программу" + "\n" +
                "— 500 бонусов в день рождения");
    }

    public void verifyText05BP() { // Проверить 5-ый текст ББ
        Assertions.assertThat(find(Text05BP).getText()).isEqualTo("Получайте дополнительные бонусы: за сумму заказа, за участие в опросах и пр.");
    }

    //-------Как стать участником бонусной программы
    public void verifyHeaderAsBPLoyalityProgram() { // Проверить Текст Общая сумма 9999
        Assertions.assertThat(find(HeaderAsBPLoyalityProgram).getText()).isEqualTo("Как стать участником бонусной программы?");
    }

    public void verifyTextBPLoyalityProgram() { // Проверить Текст Общая сумма 9999
        Assertions.assertThat(find(TextBPLoyalityProgram).getText()).isEqualTo("Для того, чтобы стать участником бонусной программы «ИНВИТРО Здоровый плюс» необходимо:");
    }

    public void verifyText2BPLoyalityProgram() { // Проверить Текст Общая сумма 9999
        Assertions.assertThat(find(Text2BPLoyalityProgram).getText()).isEqualTo("Оформить и оплатить заказ в ИНВИТРО");
    }

    public void verifyText123BPLoyalityProgram() { // Проверить Текст Общая сумма 9999
        Assertions.assertThat(find(Text3BPLoyalityProgram).getText()).isEqualTo("Подписать согласие на участие в программе");
    }

    //------Статусы участников бонусной программы
    public void visibleHeadingStatus() { // Проверить Текст Общая сумма 19999
        Assertions.assertThat(find(HeadingStatus).getText()).isEqualTo("Статусы участников бонусной программы");
    }

    public void visibleLabel5BP() { //Проверить видимость Иконка 5% БП
        find(Label5BP).isVisible();
    }

    public void visibleLabel7BP() { //Проверить видимость Иконка 7% БП
        find(Label7BP).isVisible();
    }

    public void visibleLabelTest0BP() { //Проверить видимость Иконка 10% БП
        find(LabelTest10BP).isVisible();
    }

    public void visibleLabel30BP1() { //Проверить видимость Иконка 30% БП
        find(Label30BP1).isVisible();
    }

    public void verifyTextBPStandart() { // Проверить Текст Бонусные баллы
        Assertions.assertThat(find(TextBPStandart).getText()).isEqualTo("Статус участника «Стандарт»");
    }

    public void verifyTextBPSilver() { // Проверить Текст Статус участника «Серебряный»
        Assertions.assertThat(find(TextBPSilver).getText()).isEqualTo("Статус участника «Серебряный»");
    }

    public void verifyTextBPGolden() { // Проверить Текст Статус участника «Золотой»
        Assertions.assertThat(find(TextBPGolden).getText()).isEqualTo("Статус участника «Золотой»");
    }

    public void verifyTextBPSocial() { // Проверить Текст Статус участника «Социальный»
        Assertions.assertThat(find(TextBPSocial).getText()).isEqualTo("Статус участника «Социальный»");
    }

    public void verifyTextBPVeteran() { // Проверить Текст Статус участника «Ветеран»
        Assertions.assertThat(find(TextBPVeteran).getText()).isEqualTo("Статус участника «Ветеран»");
    }

    public void verifyTextBPStandart999() { // Проверить Текст Общая сумма 9999
        Assertions.assertThat(find(TextBPStandart999).getText().trim()).isEqualTo("Общая сумма покупок не превышает 9 999 рублей.");
    }

    public void visibleTextBPSilver1999() { //Проверить Текст Общая сумма покупок не превышает 19 999 рублей.
        //System.out.println(find(TextBPSilver1999).getText().trim());}
        Assertions.assertThat(find(TextBPSilver1999).getText().trim()).isEqualTo("Общая сумма покупок не превышает 19 999 рублей.");
    }

    public void verifyTextBPGolden20000() { // Проверить Текст Общая сумма покупок превышает 20 000 рублей.
        Assertions.assertThat(find(TextBPGolden20000).getText().trim()).isEqualTo("Общая сумма покупок превышает 20 000 рублей.");
    }

    public void verifyTextBPSocialSoc() { // Проверить Текст Общая сумма 9999
        //System.out.println(find(TextBPSocialSoc).getText().trim());}
        Assertions.assertThat(find(TextBPSocialSoc).getText().trim()).isEqualTo("Предоставляется гражданам следующих категорий: пенсионеры, инвалиды I и II группы, дети-инвалиды, члены многодетных семей, матери- и отцы-одиночки. Для подключения к Программе со статусом «Социальный» в медицинском офисе необходимо предъявить соответствующий документ. Участники с данным статусом имеют возможность получить дополнительные бонусные баллы.");
    }

    public void verifyTextBPVeteranVet() { //Проверить Текст Общая сумма покупок не превышает 19 999 рублей.
        Assertions.assertThat(find(TextBPVeteranVet).getText()).isEqualTo("Граждане, являющиеся ветеранами ВОВ, ветеранами локальных войн, ветеранами труда, а также ветеранами иных категорий в соответствии с Федеральным законом от 12.01.1995 N 5- ФЗ «О ветеранах» и имеющие соответствующее удостоверение). Для подключения к Программе со статусом «Ветеран» в медицинском офисе необходимо предъявить ветеранское удостоверение. Участники с данным статусом НЕ имеют возможности получить дополнительные бонусные баллы. Размер данной привилегии максимальный.");
    }

    //System.out.println(find(TextBPVeteranVet).getText().trim());}
//--------Как копить?
    public void verifyHeadingHow() { // Проверить Заголовок Как копить?
        Assertions.assertThat(find(HeadingHow).getText()).isEqualTo("Как копить?");
    }

    public void visibleLabelBB() { //Проверить видимость Иконка Бонусные баллы
        find(LabelBB).isVisible();
    }

    public void visibleLabelHiB() { //Проверить видимость Иконка Приветственный бонус
        find(LabelHiB).isVisible();
    }

    public void visibleLabelBirthday() { //Проверить видимость Иконка Бонусы в день рождения
        find(LabelBirthday).isVisible();
    }

    public void visibleLabelAdditional1() { //Проверить видимость Иконка 30% БП
        find(LabelAdditional1).isVisible();
    }

    public void verifyTextBonusBalls() { // Проверить Текст Бонусные баллы
        Assertions.assertThat(find(TextBonusBalls).getText()).isEqualTo("Бонусные баллы");
    }

    public void verifyTextWelcomeBonus() { // Проверить Текст Приветственный бонус
        Assertions.assertThat(find(TextWelcomeBonus).getText()).isEqualTo("Приветственный бонус");
    }

    public void verifyTextBirthdayBonuses1() { // Проверить Текст Бонусы в день рождения
        Assertions.assertThat(find(TextBirthdayBonuses1).getText()).isEqualTo("Бонусы в день рождения");
    }

    public void verifyTextAdditionalBonuses() { // Проверить Текст Дополнительные бонусы
        Assertions.assertThat(find(TextAdditionalBonuses).getText()).isEqualTo("Дополнительные бонусы");
    }

    public void verifyTextBonusBallsAccrue() { //Проверить Текст Бонусные баллы начисляются согласно статусу участника программы за каждую покупку в соответствии с действующими правилами программы.
        Assertions.assertThat(find(TextBonusBallsAccrue).getText()).isEqualTo("Бонусные баллы начисляются согласно статусу участника программы за каждую покупку в соответствии с действующими правилами программы.");
    }

    public void verifyTextBonusBallsEverybody() { //Проверить Текст Всем пациентам, заказавшим услуги
        Assertions.assertThat(find(TextBonusBallsEverybody).getText()).isEqualTo("Всем пациентам, заказавшим услуги лабораторной диагностики и присоединившимся к бонусной программе, ИНВИТРО дарит 200 бонусов.");
    }

    public void verifyTextBirthdayBonuses500() { // Проверить Текст Всем участникам программы в день рождения ИНВИТРО дарит 500 бонусов
        Assertions.assertThat(find(TextBirthdayBonuses500).getText()).isEqualTo("Всем участникам программы в день рождения ИНВИТРО дарит 500 бонусов.");
    }

    public void verifyTextAdditionalBonuses1() { // Проверить Текст Бонусы, начисляемые в зависимости от суммы заказа
        Assertions.assertThat(find(TextAdditionalBonuses1).getText()).isEqualTo("Бонусы, начисляемые в зависимости от суммы заказа:");
    }

    public void verifyTextAdditionalBonuses2() { // Проверить Блок  При единовременной покупке услуг на сумму свыше 10 000 рублей – дополнительно 400 бонусов;;
        //System.out.println(find(TextAdditionalBonuses2).getText().trim());}
        Assertions.assertThat(find(TextAdditionalBonuses2).getText()).isEqualTo("При единовременной покупке услуг на сумму свыше 10 000 рублей – дополнительно 400 бонусов;");
    }

    public void verifyTextAdditionalBonuses3() { // Проверить Блок  При единовременной покупке услуг на сумму свыше 20 000 рублей – дополнительно 1 000 бонусов.;
        //System.out.println(find(TextAdditionalBonuses3).getText().trim());}
        Assertions.assertThat(find(TextAdditionalBonuses3).getText()).isEqualTo("При единовременной покупке услуг на сумму свыше 20 000 рублей – дополнительно 1 000 бонусов.");
    }

    //-------Как использовать бонусные баллы?
    public void checkWhoisp() { // Проверить Видимость Блока Как использовать бонусные баллы?
        help.Check_Enabled_Element(Whoisp);
    }

    public void verifyHeadingHowToUse() { // Проверить Как использовать бонусные баллы?
        Assertions.assertThat(find(HeadingHowToUse).getText()).isEqualTo("Как использовать бонусные баллы?");
    }

    public void verifyText1HowToUse() { // Проверить Текст
        Assertions.assertThat(find(Text1HowToUse).getText()).contains("Накопленными бонусами можно оплатить до 50% от суммы заказа из расчета 1 бонус = 1 рубль, но не более 30 000 бонусов за заказ;");
    }

    public void verifyText2HowToUse() { // Проверить Текст С
        Assertions.assertThat(find(Text2HowToUse).getText()).contains("Бонусные баллы доступны к списанию через 24 часа после их начисления;");
        //String checkText = "Бонусные баллы доступны к списанию через 24 часа после их начисления;";
        //String webText = find(Text2HowToUse).getText();
        //if(webText.contains(checkText)) {
        //  System.out.println("Текст, который был найден на сайте: " + webText + " Соответствует тексту, который должен быть: " + checkText);
        //} else {
        //  System.out.println(webText);
        //Assertions.assertThat(webText)
        //      .as("Текст, который был найден на сайте: " + webText + " Не соответствует тексту, который должен быть: " + checkText)
        //    .contains(checkText);
    }

    public void verifyText3HowToUse() { // Проверить Текст
        Assertions.assertThat(find(Text3HowToUse).getText()).contains("Бонусы, начисленные первыми, списываются в первую очередь;");
    }

    public void verifyText4HowToUse() { // Проверить Текст 4. Лимит по 1 карте за 1 день - 3 заказа на медицинские услуги.
        Assertions.assertThat(find(Text4HowToUse).getText()).contains("Лимит по 1 карте за 1 день - 3 заказа на медицинские услуги.");
    }

    //------Срок действия бонусных баллов
    public void checkSrokDeistv() { // Проверить Блок Срок действия бонусных баллов
        help.Check_Enabled_Element(SrokDeistv);
    }

    public void verifyHeadingSrokDeistv() { // Проверить Заголовок Как использовать бонусные баллы?
        Assertions.assertThat(find(HeadingSrokDeistv).getText()).isEqualTo("Срок действия бонусных баллов");
    }

    public void verifyText1SrokDeistv() { // Текст Бонусные баллы доступны к списанию через 24 часа
        Assertions.assertThat(find(Text1SrokDeistv).getText()).contains("Приветственные бонусы – срок действия 1 год;");
    }

    public void verifyText2SrokDeistv() { // Текст Бонусы, начисленные первыми, списываются в первую очередь
        Assertions.assertThat(find(Text2SrokDeistv).getText()).contains("Бонусные баллы согласно статусу участника – срок действия 2 года;");
    }

    public void verifyText3SrokDeistv() { // Текст По 1 бонусному счету за 1 день – не более 3-х заказов на медицинские услуги.
        Assertions.assertThat(find(Text3SrokDeistv).getText()).contains("Дополнительные бонусы, начисляемые в зависимости от единовременной суммы заказа – срок действия 2 года;");
    }

    public void verifyText4SrokDeistv() { // Текст По 1 бонусному счету за 1 день – не более 3-х заказов на медицинские услуги.
        Assertions.assertThat(find(Text4SrokDeistv).getText()).contains("Подарочные бонусы в день рождения – срок действия 30 дней.");
    }

    //----Переход на дисконтную программу
    public void verifyHeadingTransition() { // Проверить Заголовок Переход на дисконтную программу
        Assertions.assertThat(find(HeadingTransition).getText()).isEqualTo("Переход на дисконтную программу");
    }

    public void visibleLabelDisconnectBP() { //Проверить видимость Иконка Отключиться от бонусной программы
        find(LabelDisconnectBP).isVisible();
    }

    public void visibleLabelToWrite() { //Проверить видимость Иконка Написать заявление
        find(LabelToWrite).isVisible();
    }

    public void visibleLabelReceive() { //Проверить видимость Иконка Получить ДК
        find(LabelReceive).isVisible();
    }

    public void verifyTextDisconnectBP() { // Проверить Текст Отключиться от бонусной программы в любом медицинском офисе
        Assertions.assertThat(find(TextDisconnectBP).getText()).isEqualTo("Отключиться от бонусной программы в любом медицинском офисе, подписав отказ от участия в бонусной программе");
    }

    public void verifyTextToWrite() { // Проверить Текст Написать заявление на выдачу дисконтной карты
        Assertions.assertThat(find(TextToWrite).getText()).isEqualTo("Написать заявление на выдачу дисконтной карты");
    }

    public void verifyTextReceive() { // Текст Получить дисконтную карту
        Assertions.assertThat(find(TextReceive).getText()).isEqualTo("Получить дисконтную карту");
    }

    public void visibleLabelBonus5() { //Проверить видимость Иконка бонус 5%
        find(LabelBonus5).isVisible();
    }

    public void visibleLabel11DK5pr() { //Проверить видимость Иконка ДК 5%
        find(LabelDK5pr).isVisible();
    }

    public void visibleLabelBonus7or10() { //Проверить видимость Иконка Бонус 7% или 10%
        find(LabelBonus7or10).isVisible();
    }

    public void visibleLabelDK10pr() { //Проверить видимость Иконка ДК 10%
        find(LabelDK10pr).isVisible();
    }

    //---Дисконтная программа «ИНВИТРО Здоровый плюс»
    public void verifyHeadingDP() { // Проверить Заголовок Дисконтная программа
        Assertions.assertThat(find(HeadingDP).getText()).isEqualTo("Дисконтная программа «ИНВИТРО Здоровый плюс»");
    }

    //---О программе
    public void verifyTextAboutThePprogram() { // Проверить Текст О программе
        Assertions.assertThat(find(TextAboutThePprogram).getText()).isEqualTo("О программе");
    }

    public void verifyTextDP() { // Проверить Текст Получайте скидку по дисконтной карте, привязанной к карте Вашего контакта, или предъявляйте пластиковую дисконтную карту.
        Assertions.assertThat(find(TextDP).getText()).isEqualTo("Получайте скидку по дисконтной карте, привязанной к карте Вашего контакта, или предъявляйте пластиковую дисконтную карту.");
    }

    //---Преимущества дисконтной программы
    public void verifyHeadingPreimDP() { // Заголовок
        Assertions.assertThat(find(HeadingPreimDP).getText()).isEqualTo("Преимущества дисконтной программы");
    }

    public void verifyText1PreimDP() { // Текст Номер дисконтной карты привязывается к карте контакта Пациента, не нужно носить с собой.
        Assertions.assertThat(find(Text1PreimDP).getText()).isEqualTo("Номер дисконтной карты привязывается к карте контакта Пациента, не нужно носить с собой.");
    }

    public void verifyText2PreimDP() { // Текст
        Assertions.assertThat(find(Text2PreimDP).getText()).isEqualTo("Дисконтную карту ИНВИТРО можно передавать близким и друзьям. Скидка действует на предъявителя дисконтной карты.");
    }

    public void verifyText3PreimDP() { // Текст Копите всей семьей, получайте скиду всей семьей.
        Assertions.assertThat(find(Text3PreimDP).getText()).isEqualTo("Копите всей семьей, получайте скиду всей семьей.");
    }

    //---Как стать участником дисконтной программы?
    public void verifyHeadingHowBecome() { // Заголовок
        Assertions.assertThat(find(HeadingHowBecome).getText()).isEqualTo("Как стать участником дисконтной программы?");
    }

    public void verifyText1HowBecome() { // Текст Для того, чтобы получить дисконтную карту ИНВИТРО необходимо:
        Assertions.assertThat(find(Text1HowBecome).getText()).isEqualTo("Для того, чтобы получить дисконтную карту ИНВИТРО необходимо:");
    }

    public void verifyText2HowBecome() { // Текст Оформить и оплатить заказ в ИНВИТРО на сумму, достаточную для выдачи дисконтной карты,
        Assertions.assertThat(find(Text2HowBecome).getText()).isEqualTo("Оформить и оплатить заказ в ИНВИТРО на сумму, достаточную для выдачи дисконтной карты,");
    }

    public void verifyTexta321HowBecome() { // Текст Подписать согласие на участие в программе.
        Assertions.assertThat(find(Text3HowBecome).getText()).isEqualTo("Подписать согласие на участие в программе.");
    }

    //---Как воспользоваться дисконтной программой?
    public void verifyHeadingHowTake() { // Заголовок Как воспользоваться дисконтной программой?
        Assertions.assertThat(find(HeadingHowTake).getText()).isEqualTo("Как воспользоваться дисконтной программой?");
    }

    public void verifyText1HowTake() { // Текст
        Assertions.assertThat(find(Text1HowTake).getText()).isEqualTo("Номер дисконтной карты «ИНВИТРО Здоровый плюс» (дисконтная карта нового образца) прикрепляется к Вашей карточке клиента, что позволяет Вам при повторном обращении в медицинский офис ИНВИТРО получить привилегию без предъявления пластиковой карты.");
    }

    public void verifyText2HowTake() { // Текст
        Assertions.assertThat(find(Text2HowTake).getText()).isEqualTo("Дисконтные карты, выданные ранее (дисконтные карты старого образца), также действуют в медицинских офисах ИНВИТРО, согласно правилам программы.");
    }

    public void verifyText3HowTake() { // Текст
        Assertions.assertThat(find(Text3HowTake).getText()).isEqualTo("Номер дисконтной карты старого образца также может быть прикреплен к Вашей карточке контакта, что позволит Вам получать привилегию без предъявления пластиковой карты.");
    }

    public void verifyText4HowTake() { // Текст Копите всей семьей, получайте скиду всей семьей.
        Assertions.assertThat(find(Text4HowTake).getText()).isEqualTo("Дисконтную карту старого образца можно обменять на дисконтную карту нового образца.");
    }

    //---Типы дисконтных карт
    public void verifyTextKindsPL() { // Проверить Текст Типы дисконтных карт
        Assertions.assertThat(find(TextKindsPL).getText()).isEqualTo("Типы дисконтных карт");
    }

    public void visibleLabelDiscountDK5() { //Проверить видимость Иконка Дисконтная карта номиналом 5%
        find(LabelDiscountDK5).isVisible();
    }

    public void verifyTextDiscountDK5() { // Проверить Текст Дисконтная карта номиналом 5%
        Assertions.assertThat(find(TextDiscountDK5).getText()).isEqualTo("Дисконтная карта номиналом 5%");
    }

    public void verifyTextIssuedInCases5() { // Проверить Текст Сумма единовременного заказа - от 4 500 рублей;
        //System.out.println(find(TextBPSilver1999).getText().trim());}
        Assertions.assertThat(find(TextIssuedInCases5).getText()).isEqualTo("Сумма единовременного заказа - от 4 500 рублей;");
    }

    public void verifyTextIssuedInCases15() { // Проверить Текст Сумма всех заказов (суммарно, накопительным итогом) – от 4 500 рублей.
        //System.out.println(find(TextBPSilver1999).getText().trim());}
        Assertions.assertThat(find(TextIssuedInCases15).getText()).isEqualTo("Сумма всех заказов (суммарно, накопительным итогом) – от 4 500 рублей.");
    }

    public void visibleNewLabelDiscountDK10() { //Проверить видимость Иконка Дисконтная карта номиналом 10%
        help.Check_Enabled_Element(NewLabelDiscountDK10);
    }

    public void verifyTextDiscountDK10() { // Проверить Заголовок Программа лояльности ИНВИТРО
        Assertions.assertThat(find(TextDiscountDK10).getText()).isEqualTo("Дисконтная карта номиналом 10%");
    }

    public void verifyTextAbaDiscountDK1010() { // Проверить Текст Сумма единовременного заказа - от 15 000 рублей;
        //System.out.println(find(TextAbaDiscountDK1010).getText().trim());}
        Assertions.assertThat(find(TextAbaDiscountDK1010).getText()).isEqualTo("Сумма единовременного заказа - от 15 000 рублей;");
    }

    public void verifyTextAbaDiscountDK210010() { // Проверить Текст
        //System.out.println(find(TextAbaDiscountDK210010).getText().trim());}
        Assertions.assertThat(find(TextAbaDiscountDK210010).getText()).isEqualTo("Сумма всех заказов (суммарно, накопительным итогом) – от 15 000 рублей;");
    }

    public void verifyTextAbaDiscountDK310010() { // Проверить Текст Сумма единовременного заказа - от 15 000 рублей;
        Assertions.assertThat(find(TextAbaDiscountDK310010).getText()).isEqualTo("Если у вас есть дисконтная карта 5% и сумма дополнительных покупок превышает 10 000 рублей, вы можете получить карту номиналом 10% (карта 5% изымается).");
    }

    public void visibleLabelDiscountDK13() { //Проверить видимость Иконка Дисконтная карта номиналом 13%
        find(LabelDiscountDK13).isVisible();
    }

    public void verifyTextDiscountDK13() { // Проверить Текст Дисконтная карта номиналом 13%
        Assertions.assertThat(find(TextDiscountDK13).getText()).isEqualTo("Дисконтная карта номиналом 13%");
    }

    public void verifyTextIssuedInCases13() { // Текст Выдается бесплатно в медицинском офисе в индивидуальном порядке по решению компании.
        Assertions.assertThat(find(TextIssuedInCases13).getText()).isEqualTo("Выдается бесплатно в медицинском офисе в индивидуальном порядке по решению компании.");
    }

    //---Также в медицинских офисах ИНВИТРО принимаются карты следующих образцов
    public void verifyHeadingTakGe() { // Проверить Текст В медицинских офисах ИНВИТРО принимаются карты следующего образца:
        Assertions.assertThat(find(HeadingTakGe).getText()).isEqualTo("Также в медицинских офисах ИНВИТРО принимаются карты следующих образцов");
    }

    public void visibleLabelDiscountDKnom5() { //Проверить видимость Иконка Дисконтная карта номиналом 5% старого образца
        find(LabelDiscountDKnom5).isVisible();
    }

    public void visibleLabelDiscountDKnom10() { //Проверить видимость Иконка Дисконтная карта номиналом 10% старого образца
        find(LabelDiscountDKnom10).isVisible();
    }

    public void visibleLabelDK5p() { //Проверить видимость Иконка Дисконтная карта номиналом 5% старого образца
        find(LabelDK5p).isVisible();
    }

    public void visibleLabelDK10p() { //Проверить видимость Иконка Дисконтная карта номиналом 10% старого образца
        find(LabelDK10p).isVisible();
    }

    public void visibleLabelDiscountDKnom13() { //Проверить видимость Иконка Дисконтная карта Кидзания
        find(LabelDiscountDKnom13).isVisible();
    }

    public void visibleLabelDKKidzania() { //Проверить видимость Иконка Дисконтная карта Кидзания
        find(LabelDKKidzania).isVisible();
    }

    public void verifyTextDK5p() { // Проверить Текст Дисконтная карта номиналом 5% старого образца
        Assertions.assertThat(find(TextDK5p).getText()).isEqualTo("Дисконтная карта номиналом 5%");
    }

    public void verifyTextDK10p() { // Проверить Текст Дисконтная карта номиналом 10% старого образца
        Assertions.assertThat(find(TextDK10p).getText()).isEqualTo("Дисконтная карта номиналом 10%");
    }

    public void verifyTextDKold5p() { // Проверить Текст Дисконтная карта номиналом 5% старого образца
        Assertions.assertThat(find(TextDKold5p).getText()).isEqualTo("Дисконтная карта номиналом 5%");
    }

    public void verifyTextDKold10p() { // Проверить Текст Дисконтная карта номиналом 10% старого образца
        Assertions.assertThat(find(TextDKold10p).getText()).isEqualTo("Дисконтная карта номиналом 10%");
    }

    public void verifyTextDiscountDKnom13() { // Проверить Текст Дисконтная карта номиналом 5% старого образца
        Assertions.assertThat(find(TextDiscountDKnom13).getText()).isEqualTo("Дисконтная карта номиналом 13%");
    }

    public void verifyTextDKKidzania() { // Проверить Текст Кидзания
        Assertions.assertThat(find(TextDKKidzania).getText()).isEqualTo("Кидзания");
    }

//---Переход на бонусную программу

    public void verifyLabelGoToTheBonus() { // Проверить Текст Переход на бонусную программу
        Assertions.assertThat(find(LabelGoToTheBonus).getText()).isEqualTo("Переход на бонусную программу");
    }

    public void verifyTextWe() { // Проверить Текст Вы можете стать участником бонусной программы
        Assertions.assertThat(find(TextWe).getText()).isEqualTo("Вы можете стать участником бонусной программы в любое удобное для вас время, обменяв дисконтную карту ИНВИТРО на повышенный статус в бонусной программе:");
    }

    public void visibleLabelDK5pp() { //Проверить видимость Иконка Дисконтная карта номиналом 5% в блоке перехода
        help.Check_Enabled_Element(LabelDK5pp);
    }

    public void visibleLabelBonus7() { //Проверить видимость Иконка Бонус 7%
        help.Check_Enabled_Element(LabelBonus7);
    }

    public void visibleLabelaDK10pp() { //Проверить видимость Иконка Дисконтная карта номиналом 10% в блоке перехода
        help.Check_Enabled_Element(LabelaDK10pp);
    }

    public void newvisibleLabelBonus10() { //Проверить видимость Иконка Бонус 10%
        help.Check_Enabled_Element(NewLabelBonus10);
    }

    public void newvisibleLabelDK13pp() { //Проверить видимость Иконка Дисконтная карта номиналом 13% в блоке перехода
        help.Check_Enabled_Element(NewLabelDK13pp);
    }

    public void newvisibleLabelBonus13() { //Проверить видимость Иконка Бонус 13%
        help.Check_Enabled_Element(NewLabelBonus13);
    }

    public void verifyTextBonus5Kards() { // Проверить Текст Бонус 7%
        Assertions.assertThat(find(TextBonus5Kards).getText()).isEqualTo("Дисконтная карта");
    }

    public void verifyTextBonus7Kards() { // Проверить Текст Бонус 10%
        Assertions.assertThat(find(TextBonus7Kards).getText()).isEqualTo("Бонус 7%");
    }

    public void verifyTextBonus10Kards() { // Проверить Текст 200 Бонусов
        Assertions.assertThat(find(TextBonus10Kards).getText()).isEqualTo("Дисконтная карта");
    }

    public void verifyTextBonus10() { // Проверить Текст Дисконтная карта Бонус 10%
        Assertions.assertThat(find(TextBonus10).getText()).isEqualTo("Бонус 10%");
    }

    public void verifyTextBonus13Kards() { // Проверить Текст Бонус 13%
        Assertions.assertThat(find(TextBonus13Kards).getText()).isEqualTo("Дисконтная карта");
    }

    public void verifyTextBonus13() { // Проверить Текст 300 бонусов
        Assertions.assertThat(find(TextBonus13).getText()).isEqualTo("Бонус 13%");
    }


    public void verifyTextChange() { // Проверить Текст Передумали? В любой момент восстановите
        Assertions.assertThat(find(TextChange).getText()).isEqualTo("Передумали? В любой момент восстановите или получите свою первую дисконтную карту ИНИВТРО, отказавшись от участия в бонусной программе.");
    }

    //---Правила программы
    public void verifyHeadingRules() { // Проверить Правила программ
        Assertions.assertThat(find(HeadingRules).getText()).isEqualTo("Правила" +
                "\n" + "программы");
    }

    public void verifyRules3LoyaltyProgram() { // Проверить 3 Полные правила программы
        help.Check_Enabled_Element(Rules3LoyaltyProgram);
    }


}
