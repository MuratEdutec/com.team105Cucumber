
  Feature: US1004 Kullanici bastaki ortak adimlar icin Background kullanir


    Background: Tum scenario'lar icin ortak ilk adim
      Given kullanici amazon anasayfaya gider




    Scenario: TC03 Kullanici Parametreli Method ile Nutella aratir

      Then  amazon arama kutusuna "Nutella" yazip aratir
      And   arama sonuclarinin "Nutella" icerdigini test eder
      Then  sayfayi kapatir


    Scenario: TC04 Kullanici Parametreli Method ile Nutella aratir

      Then  amazon arama kutusuna "Java" yazip aratir
      And   arama sonuclarinin "Java" icerdigini test eder
      And   3 saniye bekler
      Then  sayfayi kapatir


    Scenario: TC04 Kullanici Parametreli Method ile Nutella aratir

      Then  amazon arama kutusuna "Samsung" yazip aratir
      And   arama sonuclarinin "Samsung" icerdigini test eder
      Then  sayfayi kapatir