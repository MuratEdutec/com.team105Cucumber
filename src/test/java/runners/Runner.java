package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //plugin      ={"html:target/cucumber-reports.html"},
        // plugin      ={"html:target/cucumber-reports_US06.html"},

        plugin={"html:target/cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"
        },


        features    = "src/test/resources/features",
        glue        = "stepdefinitions",
        tags        = "@wip",
        dryRun      = false

)

public class Runner {

    /*
    Cucumber'da runner class'i bos bir class'tir
    Runner Class'ini diger class'lardan farkli kilan
    ve TestNG'deki xml dosyalari gibi calismasini saglayan
    2 adet notasyon mevcuttur.

     @Runwith notasyonu projemize cucumber junit dependency eklememizin sebebidir
     bu sayede runner class'larimiz cucumber ile calisir


     @CucumberOptions notasyonu ile istedigimiz ozellikleri Runner class'ina ekleyebiliriz
     Raporlama gibi extra option'larida ileride ekleyecegiz

     Ancak
     oncelikli gorevi features dosyalari ile stepdefinitions'da bulunan
     Java method'larini ilisiklendirmektir.

     tag : features klasoru icersinde yazilan tag(lari) aratip
     buldugu tum feature veya scenario'lari calistirir

     dryRun : Iki deger alabilir
     -->> true : secilirse, verilen tag ile isaretli olan Feature veya Scenario'daki
        eksik stepdefinitions'lari bulup
        ilgili methodlari olusturur
        hicbir sekilde testimizi calistirmaz
        eksik adim yoksa test passed olarak isaretler

     -->> false : secilirse,



     */
}
