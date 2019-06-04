package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.LoyaltyProgram;


public class LoyaltyProgramSteps {

    LoyaltyProgram page;

    @When("Кликнуть Ссылка на Программу лояльности" )
    public void clickLoyaltyProgramLink() { page.clickLoyaltyProgramLink();}
    @When ("Проверка Программы лояльности заголовка страницы")
    public void verifyHeaderLoyaltyProgram() {page.verifyHeaderLoyaltyProgram();}
    @When("Проверить видимость Баннер на странице Программы лояльности" )
    public void visibleBannerLoyaltyProgram() { page.visibleBannerLoyaltyProgram();}
    @When("Проверить Текст Бонусы или скидки Решать вам" )
    public void verifyTitleBonusesOrDiscounts() { page.verifyTitleBonusesOrDiscounts(); }
    @When("Проверить Текст Становитесь участником дисконтной или бонусной программы ИНВИТРО" )
    public void verifyBannerText() { page.verifyBannerText(); }
    @When("Проверить Заголовок страницы Программа лояльности ИНВИТРО" )
    public void verifyBannerText2() { page.verifyBannerText2(); }
    @When("^Блок Внимание$" )
    public void visibleTest221LoyaProgram() { page.visibleTest221LoyaltyProgram(); }
    @When("^Проверить Заголовок Программа лояльности ИНВИТРО$" )
    public void verifySimultaneousLoyaltyProgram() { page.verifySimultaneousLoyaltyProgram(); }
    @When("^Проверить 1 Полные правила программы$" )
    public void visibleRules1LoyaltyProgram() { page.visibleRules1LoyaltyProgram(); }

//--------------------География программы
    @When("Проверить Заголовок География программы лояльности" )
    public void verifyHeadingGeography() { page.verifyHeadingGeography(); }
    @When("^Проверить Текст в блоке география программы$" )
    public void verifyGeographyTextLoyalityProgram() { page.verifyGeographyTextLoyalityProgram(); }
    @When("Проверить видимость Баннер Географии программы лояльности" )
    public void visibleBannerGeography() { page.visibleBannerGeography(); }
    @When("^Проверить Бонусная программа «ИНВИТРО Здоровый плюс»$" )
    public void verifyHeaderBonusProgram() { page.verifyHeaderBonusProgram(); }
    @When("^Проверить Дисконтная программа «ИНВИТРО Здоровый плюс»$" )
    public void verifyHeaderDiscountProgram() { page.verifyHeaderDiscountProgram(); }
    @When("Проверить new Текст Бонусная программа" )
    public void verifyBonusProgram1() { page.verifyBonusProgram1(); }
    @When("Проверить Текст Дисконтная программа" )
    public void verifyDiscountProgram() { page.verifyDiscountProgram(); }
    @When("^Проверить 2 Полные правила программы$" )
    public void visibleRules2LoyaltyProgram() { page.visibleRules2LoyaltyProgram(); }

//--------Преимущества бонусной программы
    @When("Проверить Заголовок Бонусная программа" )
    public void verifyHeadingBP() { page.verifyHeadingBP(); }
    @When("^Проверить Преимущества бонусной программы$" )
    public void verifyBenefitsBP() { page.verifyBenefitsBP(); }
    @When("^Проверить Участвуйте в бонусной программе и оплачивайте заказы$" )
    public void verifyText123BP() { page.verifyText123BP(); }

//------------Иконки
    @When("^Проверить видимость 1-ая иконка ББ$" )
    public void visibleLabel01BP() { page.visibleLabel01BP(); }
    @When("Проверить видимость 2-ая иконка ББ" )
    public void visibleLabel02BP() { page.visibleLabel02BP(); }
    @When("Проверить видимость 3-ая иконка ББ" )
    public void visibleLabel03BP() { page.visibleLabel03BP(); }
    @When("^Проверить видимость 4-ая иконка ББ$" )
    public void visibleLabel04BP() { page.visibleLabel04BP(); }
    @When("^Проверить видимость 5-ая иконка ББ$" )
    public void visibleLabel05BP() { page.visibleLabel05BP(); }

//--------------Текст под иконками
    @When("^Проверить 1-ый текст ББ$" )
    public void verifyText01BP() { page.verifyText01BP(); }
    @When("^Проверить 2-ой текст ББ$" )
    public void verifyText02BP() { page.verifyText02BP(); }
    @When("^Проверить 3-ий текст ББ$" )
    public void verifyText03BP() { page.verifyText03BP(); }
    @When("^Проверить 4-ый текст ББ$" )
    public void verifyText04BP() { page.verifyText04BP(); }
    @When("^Проверить 5-ый текст ББ$" )
    public void verifyText05BP() { page.verifyText05BP(); }

//-------Как стать участником бонусной программы
    @When("^Проверить Как стать участником бонусной программы$" )
    public void verifyHeaderAsBPLoyalityProgram() { page.verifyHeaderAsBPLoyalityProgram(); }
    @When("^Проверить Для того, чтобы стать участником бонусной программы «ИНВИТРО Здоровый плюс» необходимо:$" )
    public void verifyTextBPLoyalityProgram() { page.verifyTextBPLoyalityProgram(); }
    @When("^Проверить Оформить и оплатить заказ в ИНВИТРО$" )
    public void verifyText2BPLoyalityProgram() { page.verifyText2BPLoyalityProgram(); }
    @When("^Проверить Подписать согласие на участие в программе$" )
    public void verifyText123BPLoyalityProgram() { page.verifyText123BPLoyalityProgram(); }

//------Статусы участников бонусной программы
    @When("^Проверить Статусы участников бонусной программы$" )
    public void visibleHeadingStatus() { page.visibleHeadingStatus(); }
    @When("^Проверить видимость Иконка 5% БП$" )
    public void visibleLabel5BP() { page.visibleLabel5BP(); }
    @When("^Проверить видимость Иконка 7% БП$" )
    public void visibleLabel7BP() { page.visibleLabel7BP(); }
    @When("^Проверить видимость Иконка 10% БП$" )
    public void visibleLabelTest0BP() { page.visibleLabelTest0BP(); }
    @When("^Проверить 1 видимость Иконка 30% БП$" )
    public void visibleLabel30BP1() { page.visibleLabel30BP1(); }
    @When("Проверить Текст Статус участника «Стандарт»" )
    public void verifyTextBPStandart() { page.verifyTextBPStandart(); }
    @When("Проверить Текст Статус участника «Серебряный»" )
    public void verifyTextBPSilver() { page.verifyTextBPSilver(); }
    @When("Проверить Текст Статус участника «Золотой»" )
    public void verifyTextBPGolden() { page.verifyTextBPGolden(); }
    @When("Проверить Текст Статус участника «Социальный»" )
    public void verifyTextBPSocial() { page.verifyTextBPSocial(); }
    @When("Проверить Текст Статус участника «Ветеран»" )
    public void verifyTextBPVeteran() { page.verifyTextBPVeteran(); }
    @When("Проверить Текст Общая сумма 9999" )
    public void verifyTextBPStandart999() { page.verifyTextBPStandart999(); }
    @When("Проверить Текст Общая сумма 19999" )
    public void verifyTextBPSilver1999() { page.visibleTextBPSilver1999(); }
    @When("Проверить Текст Общая сумма 20000" )
    public void verifyTextBPGolden20000() { page.verifyTextBPGolden20000(); }
    @When("Проверить Текст Предоставляется гражданам")
    public void verifyTextBPSocialSoc() { page.verifyTextBPSocialSoc(); }
    @When("Проверить Текст Граждане являющиеся ветеранами" )
    public void verifyTextBPVeteranVet() { page.verifyTextBPVeteranVet(); }

//--------Как копить?
    @When("Проверить Заголовок Как копить" )
    public void verifyHeadingHow() { page.verifyHeadingHow(); }
    @When("Проверить видимость Иконка Бонусные баллы" )
    public void visibleLabelBB() { page.visibleLabelBB(); }
    @When("Проверить видимость Иконка Приветственный бонус" )
    public void visibleLabelHiB() { page.visibleLabelHiB(); }
    @When("Проверить видимость Иконка Бонусы в день рождения" )
    public void visibleLabelBirthday() { page.visibleLabelBirthday(); }
    @When("Проверить видимость Иконка 30% БП" )
    public void visibleLabelAdditional1() { page.visibleLabelAdditional1(); }
    @When("Проверить 1 Текст Бонусные баллы" )
    public void verifyTextBonusBalls() { page.verifyTextBonusBalls(); }
    @When("Проверить Текст Приветственный бонус" )
    public void verifyTextWelcomeBonus() { page.verifyTextWelcomeBonus(); }
    @When("Проверить Текст Бонусы в день рождения" )
    public void verifyTextBirthdayBonuses1() { page.verifyTextBirthdayBonuses1(); }
    @When("Дополнительные бонусы" )
    public void verifyTextAdditionalBonuses() { page.verifyTextAdditionalBonuses(); }
    @When("Проверить Текст Бонусные баллы начисляются" )
    public void verifyTextBonusBallsAccrue() { page.verifyTextBonusBallsAccrue(); }
    @When("Проверить Текст Всем пациентам, заказавшим услуги" )
    public void verifyTextBonusBallsEverybody() { page.verifyTextBonusBallsEverybody(); }
    @When("Проверить Текст Всем участникам программы в день рождения ИНВИТРО дарит 500 бонусов" )
    public void verifyTextBirthdayBonuses500() { page.verifyTextBirthdayBonuses500(); }
    @When("^Проверить Текст Бонусы, начисляемые в зависимости от суммы заказа$" )
    public void verifyTextAdditionalBonuses1() { page.verifyTextAdditionalBonuses1(); }
    @When("Проверить Блок 1Как копить" )
    public void verifyTextAdditionalBonuses2() { page.verifyTextAdditionalBonuses2(); }
    @When("Проверить Блок 2Как копить" )
    public void verifyTextAdditionalBonuses3() { page.verifyTextAdditionalBonuses3(); }


//-------Как использовать бонусные баллы?
    @When("Проверить Видимость Блока Как использовать бонусные баллы" )
    public void checkWhoisp() { page.checkWhoisp(); }
    @When("^Проверить Как использовать бонусные баллы$" )
    public void verifyHeadingHowToUse() { page.verifyHeadingHowToUse(); }
    @When("^Проверить 1. Накопленными бонусами можно оплатить до 50%$" )
    public void verifyText1HowToUse() { page.verifyText1HowToUse(); }
    @When("^Проверить 2. Бонусные баллы доступны к списанию$" )
    public void verifyText2HowToUse() { page.verifyText2HowToUse(); }
    @When("^Проверить 3. Бонусы, начисленные первыми$" )
    public void verifyText3HowToUse() { page.verifyText3HowToUse(); }
    @When("^Проверить 4. Лимит по 1 карте за 1 день$" )
    public void verifyText4HowToUse() { page.verifyText4HowToUse(); }

//------Срок действия бонусных баллов
    @When("Проверить Видимость Блока Срок действия бонусных баллов" )
    public void checkSrokDeistv() { page.checkSrokDeistv(); }
    @When("^Проверить Срок действия бонусных баллов;$" )
    public void verifyHeadingSrokDeistv() { page.verifyHeadingSrokDeistv(); }
    @When("^Проверить 1. Приветственные бонусы – срок действия 1 год$" )
    public void verifyText1SrokDeistv() { page.verifyText1SrokDeistv(); }
    @When("^Проверить 2. Бонусные баллы доступны к списанию через$" )
    public void verifyText2SrokDeistv() { page.verifyText2SrokDeistv(); }
    @When("^Проверить По 1 бонусному счету за 1 день – не более 3-х$" )
    public void verifyText3SrokDeistv() { page.verifyText3SrokDeistv(); }
    @When("^Проверить 4. Лимит по 1 карте за 1 день - 3 заказа$" )
    public void verifyText4SrokDeistv() { page.verifyText4SrokDeistv(); }

//----Переход на дисконтную программу
    @When("Проверить Заголовок Переход на дисконтную программу" )
    public void verifyHeadingTransition() { page.verifyHeadingTransition(); }
    @When("Проверить видимость Иконка Отключиться от бонусной программы" )
    public void visibleLabelDisconnectBP() { page.visibleLabelDisconnectBP(); }
    @When("Проверить видимость Иконка Написать заявление" )
    public void visibleLabelToWrite() { page.visibleLabelToWrite(); }
    @When("Проверить видимость Иконка Получить ДК" )
    public void visibleLabelReceive() { page.visibleLabelReceive(); }
    @When("Проверить Текст Отключиться от бонусной программы в любом медицинском офисе" )
    public void verifyTextDisconnectBP() { page.verifyTextDisconnectBP(); }
    @When("Проверить Текст Написать заявление на выдачу дисконтной карты" )
    public void verifyTextToWrite() { page.verifyTextToWrite(); }
    @When("Текст Получить дисконтную карту" )
    public void verifyTextReceive() { page.verifyTextReceive(); }
    @When("^Проверить видимость Иконка бонус 5%$" )
    public void visibleLabelBonus5() { page.visibleLabelBonus5(); }
    @When("^Проверить видимость Иконка ДК 5%$" )
    public void visibleLabel11DK5pr() { page.visibleLabel11DK5pr(); }
    @When("^Проверить видимость Иконка Бонус 7% или 10%$" )
    public void visibleLabelBonus7or10() { page.visibleLabelBonus7or10(); }
    @When("^Проверить видимость Иконка ДК 10%$" )
    public void visibleLabelDK10pr() { page.visibleLabelDK10pr(); }

//---Дисконтная программа «ИНВИТРО Здоровый плюс»
    @When("^Проверить Заголовок Дисконтная программа$" )
    public void verifyHeadingDP() { page.verifyHeadingDP(); }

//---О программе
    @When("^Проверить Текст О программе$" )
    public void verifyTextAboutThePprogram() { page.verifyTextAboutThePprogram(); }
    @When("^Проверить Текст Получайте скидку по дисконтной карте, привязанной к карте Вашего$" )
    public void verifyTextDP() { page.verifyTextDP(); }


//---Преимущества дисконтной программы
     @When("^Проверить Заголовок Преимущества дисконтной программы$" )
     public void verifyHeadingPreimDP() { page.verifyHeadingPreimDP(); }
     @When("^Проверить Номер дисконтной карты привязывается к карте контакта$" )
     public void verifyText1PreimDP() { page.verifyText1PreimDP(); }
     @When("^Проверить Дисконтную карту ИНВИТРО можно передавать близким и друзьям$" )
     public void verifyText2PreimDP() { page.verifyText2PreimDP(); }
     @When("^Проверить Копите всей семьей, получайте скиду всей семьей$" )
     public void verifyText3PreimDP() { page.verifyText3PreimDP(); }

//---Как стать участником дисконтной программы?
        @When("^Проверить Заголовок Как стать участником дисконтной программы$" )
        public void verifyHeadingHowBecome() { page.verifyHeadingHowBecome(); }
        @When("^Проверить Для того, чтобы получить дисконтную карту ИНВИТРО необходимо:$" )
        public void verifyText1HowBecome() { page.verifyText1HowBecome(); }
        @When("^Проверить Оформить и оплатить заказ в ИНВИТРО на сумму, достаточную для выдачи дисконтной карты,$" )
        public void verifyText2HowBecome() { page.verifyText2HowBecome(); }
        @When("^Проверить Блок Подписать согласие на участие в программе$" )
        public void verifyTexta321HowBecome() { page.verifyTexta321HowBecome(); }

//---Как воспользоваться дисконтной программой?
        @When("^Проверить Заголовок Как воспользоваться дисконтной программой$" )
        public void verifyHeadingHowTake() { page.verifyHeadingHowTake(); }
        @When("^Проверить Номер дисконтной карты «ИНВИТРО Здоровый плюс»$" )
        public void verifyText1HowTake() { page.verifyText1HowTake(); }
        @When("^Проверить Дисконтные карты, выданные ранее дисконтные карты старого$" )
        public void verifyText2HowTake() { page.verifyText2HowTake(); }
        @When("^Проверить Номер дисконтной карты старого образца также может$" )
        public void verifyText3HowTake() { page.verifyText3HowTake(); }
        @When("^Проверить Дисконтную карту старого образца можно обменять$" )
        public void verifyText4HowTake() { page.verifyText4HowTake(); }

//---Типы дисконтных карт
        @When("Проверить new Текст Виды дисконтных карт" )
        public void verifyTextKindsPL() { page.verifyTextKindsPL(); }
        @When("^Проверить видимость Иконка Дисконтная карта номиналом 5%$" )
        public void visibleLabelDiscountDK5() { page.visibleLabelDiscountDK5(); }
        @When("Проверить new Текст Дисконтная карта номиналом" )
        public void verifyTextDiscountDK5() { page.verifyTextDiscountDK5(); }
        @When("Проверить new Текст Сумма единовременного заказа от 4 500 рублей" )
        public void verifyTextIssuedInCases5() { page.verifyTextIssuedInCases5(); }
        @When("^Проверить Проверить Текст Сумма всех заказов суммарно, накопительным итогом – от 4 500 рублей$" )
        public void verifyTextIssuedInCases15() { page.verifyTextIssuedInCases15(); }

        @When("^Проверить 1 видимость Иконка Дисконтная карта номиналом 10%$" )
        public void visibleNewLabelDiscountDK10() { page.visibleNewLabelDiscountDK10(); }
        @When("Проверить new Заголовок Программа лояльности ИНВИТРО" )
        public void verifyTextDiscountDK10() { page.verifyTextDiscountDK10(); }
        @When("Проверить new Текст Сумма единовременного заказа от 7 000 рублей" )
        public void verifyTextAbaDiscountDK1010() { page.verifyTextAbaDiscountDK1010(); }
        @When("^Проверить Сумма всех заказов суммарно, накопительным итогом – от 15 000 рублей;$" )
        public void verifyTextAbaDiscountDK210010() { page.verifyTextAbaDiscountDK210010(); }
        @When("^Проверить Текст Сумма единовременного заказа - от 15 000 рублей;$" )
        public void verifyTextAbaDiscountDK310010() { page.verifyTextAbaDiscountDK310010(); }
        @When("^Проверить видимость Иконка Дисконтная карта номиналом 13%$" )
        public void visibleLabelDiscountDK13() { page.visibleLabelDiscountDK13(); }
        @When("Проверить Текст Дисконтная карта номиналом 13" )
        public void verifyTextDiscountDK13() { page.verifyTextDiscountDK13(); }
        @When("Текст new Выдается бесплатно в медицинском офисе в индивидуальном порядке по решению компани" )
        public void verifyTextIssuedInCases13() { page.verifyTextIssuedInCases13(); }

//---Также в медицинских офисах ИНВИТРО принимаются карты следующих образцов
        @When("^Проверить Текст В медицинских офисах ИНВИТРО принимаются карты следующего образца:$" )
        public void verifyHeadingTakGe() { page.verifyHeadingTakGe(); }
        @When("^Проверить видимость Иконка Дисконтная карта номиналом 5% старого образца$" )
        public void visibleLabelDiscountDKnom5() { page.visibleLabelDiscountDKnom5(); }
        @When("^Проверить 1 видимость Иконка Дисконтная карта номиналом 10% старого образца$" )
        public void visibleLabelDiscountDKnom10() { page.visibleLabelDiscountDKnom10(); }
        @When("Проверить видимость Иконка Дисконтная карта номиналом 5 старого образца" )
        public void visibleLabelDK5p() { page.visibleLabelDK5p(); }
        @When("Проверить new видимость Иконка Дисконтная карта номиналом 10 старого образца" )
        public void visibleLabelDK10p() { page.visibleLabelDK10p(); }
        @When("^Проверить видимость Иконка Дисконтная карта Кидзания$" )
        public void visibleLabelDiscountDKnom13() { page.visibleLabelDiscountDKnom13(); }
        @When("Проверить new видимость Иконка Дисконтная карта Кидзания" )
        public void visibleLabelDKKidzania() { page.visibleLabelDKKidzania();}

            @When("Проверить Текст Дисконтная карта номиналом 5 старого образца" )
            public void verifyTextDK5p() { page.verifyTextDK5p(); }
            @When("Проверить Текст Дисконтная карта номиналом 10 старого образца" )
            public void verifyTextDK10p() { page.verifyTextDK10p(); }
            @When("^Проверить 1 Дисконтная карта номиналом 5% старого образца$" )
            public void verifyTextDKold5p() { page.verifyTextDKold5p(); }
            @When("^Проверить 1 Дисконтная карта номиналом 10% старого образца$" )
            public void verifyTextDKold10p() { page.verifyTextDKold10p(); }
            @When("^Проверить 1 Дисконтная карта номиналом 13%$" )
            public void verifyTextDiscountDKnom13() { page.verifyTextDiscountDKnom13(); }
            @When("Проверить new Текст Кидзания" )
            public void verifyTextDKKidzania() { page.verifyTextDKKidzania(); }

//---Переход на бонусную программу
            @When("Проверить new Текст Переход на бонусную программу" )
            public void verifyLabelGoToTheBonus() { page.verifyLabelGoToTheBonus(); }
            @When("Проверить new Текст Вы можете стать участником бонусной программы" )
            public void verifyTextWe() { page.verifyTextWe(); }
            @When("Проверить видимость Иконка Дисконтная карта номиналом 5 в блоке перехода" )
            public void visibleLabelDK5pp() { page.visibleLabelDK5pp(); }
            @When("Проверить new видимость Иконка Бонус 7" )
            public void visibleLabelBonus7() { page.visibleLabelBonus7(); }
            @When("Проверить видимость Иконка Дисконтная карта номиналом 10" )
            public void visibleLabelaDK10pp() { page.visibleLabelaDK10pp(); }
            @When("Проверить видимость Иконка Бонус 10" )
            public void visibleLabelBonus10() { page.newvisibleLabelBonus10(); }
            @When("Проверить видимость Иконка Дисконтная карта номиналом 13 в блоке перехода" )
            public void visibleLabelDK13pp() { page.newvisibleLabelDK13pp(); }
            @When("Проверить видимость Иконка Бонус 13" )
            public void visibleLabelBonus13() { page.newvisibleLabelBonus13(); }

            @When("Проверить Дисконтная карта" )
            public void verifyTextBonus5Kards() { page.verifyTextBonus5Kards(); }
            @When("Проверить Текст Бонус 7%" )
            public void verifyTextBonus7Kards() { page.verifyTextBonus7Kards(); }
            @When("Проверить old Текст Дисконтная карта" )
            public void verifyTextBonus10Kards() { page.verifyTextBonus10Kards(); }
            @When("^Проверить Текст Бонус 10%$" )
            public void verifyTextBonus10() { page.verifyTextBonus10(); }
            @When("^Проверить Текст Дисконтная карта$" )
            public void verifyTextBonus13Kards() { page.verifyTextBonus13Kards(); }
            @When("Проверить Текст Бонус 13%" )
            public void verifyTextBonus13() { page.verifyTextBonus13(); }

            @When("Проверить Текст Передумали В любой момент восстановите" )
            public void verifyTextChange() { page.verifyTextChange(); }

            //---Правила программы
            @When("Проверить Заголовок Правила программ" )
            public void verifyHeadingRules() { page.verifyHeadingRules(); }
            @When("^Проверить 3 Полные правила программы$" )
            public void verifyRules3LoyaltyProgram() { page.verifyRules3LoyaltyProgram(); }




}
