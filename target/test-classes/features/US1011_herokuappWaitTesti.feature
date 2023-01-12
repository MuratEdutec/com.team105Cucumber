@wip

Feature: US1011 Kullanici herokuapp sayfasinda butonlarin gorunur oldugunuz test eder


  Scenario: TC06 kullanici bekleyerek butonlarin gorunur olmasini saglar

    Given kullanici "herokuappUrl" gider
    Then  Add Element butonuna basar
    And   Delete butonu gorunur oluncaya kadar bekler
    And   Delete butonunun gorunur oldugunu test eder
    Then  Delete butonuna basarak butonu siler
    And   Delete butonunun gorunmedigini test eder