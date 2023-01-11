

  Feature: US1005 Kullanici configuration.properties'de yazilan datalarin parametre olarak kullanilir

    # 3 Scenario olusturup, amazon, wisequarter ve walmart anasayfalarina gidin
    # ve o ana sayfalara gittigimizi test edin


    Scenario: TC06 Kullanici amazon sitesine gidisi test eder
      Given kullanici "amazonUrl" anasayfaya gider
      Then url de "amazon" oldugunu test eder
      And sayfayi kapatir




    Scenario: TC07 Kullanici amazon sitesine gidisi test eder
      Given kullanici "wqUrl" anasayfaya gider
      Then url de "wisequarter" oldugunu test eder
      And sayfayi kapatir




    Scenario: TC08 Kullanici amazon sitesine gidisi test eder
      Given kullanici "wmUrl" anasayfaya gider
      Then url de "walmart" oldugunu test eder
      And sayfayi kapatir
