
  Feature: US1006 Kullanici configuration dosyasindaki bilgilerle login olabilmeli

    Scenario: TC09 Gecerli kullanici adi ve sifre ile Pozitif Login Testi


      Given kullanici "qdUrl" anasayfaya gider
      Then  ilk sayfa login linkini click yapar
      And   kullanici kutusuna "qdGecerliUsername" yazar
      And   password kutusuna "qdGecerliPassword" yazar
      And   cookies accept yapar
      And   3 saniye bekler
      Then  login butonuna basar
      And   basarili giris yapildigini test eder
      Then  sayfayi kapatir
