package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class QualitydemyStepdefinitions {
    QualitydemyPage qualitydemyPage= new QualitydemyPage();

    @Then("ilk sayfa login linkini click yapar")
    public void ilkSayfaLoginLinkiniClickYapar() {
        qualitydemyPage.ilkLoginLinki.click();
    }



    @Then("ilk sayfa login linkine click yapar")
    public void ilkSayfaLoginLinkineClickYapar() {
        qualitydemyPage.ilkLoginLinki.click();

    }














    @Then("kullanici kutusuna {string} yazar")
    public void kullanicikutusunayazar(String istenenUsername) {

        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty(istenenUsername));

    }


    @And("password kutusuna {string} yazar")
    public void passwordKutusunaYazar(String istenenPassword) {
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(istenenPassword));
    }




    @Then("login butonuna basar")
    public void loginButonunaBasar() {
        qualitydemyPage.loginButonu.click();
    }



    @And("basarili giris yapildigini test eder")
    public void basariliGirisYapildiginiTestEder() {
        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());
    }

    @And("cookies accept yapar")
    public void cookiesAcceptYapar() {
        WebElement cookieKabul = Driver.getDriver().findElement(By.xpath("//*[text()='Accept']"));
        cookieKabul.click();
    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
    }


    @And("kullanici kutusuna manuel  {string} yazar")
    public void kullaniciKutusunaManuelYazar(String username) {
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(username);
    }

    @And("password kutusuna manuel {string} yazar")
    public void passwordKutusunaManuelYazar(String password) {
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(password);
    }
}
