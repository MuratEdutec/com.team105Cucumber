Feature: US1009_ Yanlis kullanici adi ve password listesi ile negatif login testi

  Scenario Outline: TC14 yanlis kullanici listesi ile giris yapilamamli



    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna manuel  "<yanlisUsername>" yazar
    And password kutusuna manuel "<yanlisPassword>" yazar
    And 2 saniye bekler
    And cookies accept yapar
    And login butonuna basar
    And giris yapilamadigini test eder
    Then sayfayi kapatir




    Examples:
    |yanlisUsername | yanlisPassword  |
    |ilker          | ilker@a.com     |
    |mehmet         | mehmet@b.com    |
    |yasar          | yasar@c.com     |
    |adem           | adem@d.com      |
    |ozgur          | ozgur@e.com     |
