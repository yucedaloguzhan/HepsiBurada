package stepdefinition;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HepsiBuradaPage;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;
import static java.time.Duration.ofSeconds;

public class MyStepdefs {
    HepsiBuradaPage hepsiBuradaPage = new HepsiBuradaPage();


    //Senaryo 1

    @Given("Anasayfada konum alanina tiklanir.")
    public void anasayfada_konum_alanina_tiklanir() throws InterruptedException {
        Thread.sleep(5000);
        hepsiBuradaPage.konum.click();

    }

    @When("il, ilce ve mahalle secilir ve kaydet butonuna tiklanir.")
    public void il_ilce_ve_mahalle_secilir_ve_kaydet_butonuna_tiklanir() {

        hepsiBuradaPage.sehirBox.click();
        hepsiBuradaPage.adana.click();
        hepsiBuradaPage.ilce.click();
        hepsiBuradaPage.ceyhan.click();
        hepsiBuradaPage.mahalle.click();
        hepsiBuradaPage.agacpinarMahalle.click();
        hepsiBuradaPage.kaydetButton.click();
    }

    @Then("Konumunuz kaydedildi popup kontrol edilir.")
    public void konumunuz_kaydedildi_popup_kontrol_edilir() throws IOException, InterruptedException {
        Thread.sleep(1000);
        ReusableMethods.getScreenshot("locationCheck");

    }

    @Then("Tab bar uzerinden kategoriler tabina tiklanir.")
    public void tab_bar_uzerinden_kategoriler_tabina_tiklanir() {
        hepsiBuradaPage.kategorilerButton.click();
        hepsiBuradaPage.kategorilerButton.click();

    }

    @Then("Herhangi bir kategori secilip listeleme sayfasina yonlenilir.")
    public void herhangi_bir_kategori_secilip_listeleme_sayfasina_yonlenilir() {

        hepsiBuradaPage.sporGiyim.click();
    }

    @Then("Listeleme sayfasinda Yarin Kapinda alaninda gelen il bilgisi ile anasayfada secilen il bilgisinin ayni oldugu kontrol edilir.")
    public void listeleme_sayfasinda_yarin_kapinda_alaninda_gelen_il_bilgisi_ile_anasayfada_secilen_il_bilgisinin_ayni_oldugu_kontrol_edilir() {

        String giyimKonum = hepsiBuradaPage.yarınKapındaGiyimSayfaKonumBilgisi.getText();
        String anaSyfKonum=hepsiBuradaPage.yarınKapındaAnaSayfaKonumBilgisi.getText();
        Assert.assertEquals(anaSyfKonum ,giyimKonum);

    }

    //Senaryo 2

    @Given("Anasayfada Super Fiyat, Super Teklife tiklanir")
    public void anasayfadaSuperFiyatSuperTeklifeTiklanir() throws InterruptedException {

        //Thread.sleep(15000);
        hepsiBuradaPage.kategorilerButton.click();
        hepsiBuradaPage.anaSayfaButton.click();

        try {
            new TouchAction(Driver.get()).press(PointOption.point(538, 1241)).waitAction(WaitOptions.waitOptions(ofSeconds(1)))
                    .moveTo(PointOption.point(542, 337)).release().perform();
        } catch (Exception e) {
            System.out.println("unable to swipe");
        }

    }

    @When("Super Fiyat Super Teklif sayfasindan bir urune gidilir")
    public void superFiyatSuperTeklifSayfasindanBirUruneGidilir() throws InterruptedException {

        //hepsiBuradaPage.kategorilerButton.click();
        hepsiBuradaPage.tumu.click();
        Thread.sleep(8000);

        hepsiBuradaPage.urunTv.click();
    }

    @Then("Urun detayda urunun gorseline tiklanir ve yana dogru scroll edilir")
    public void urunDetaydaUrununGorselineTiklanirVeYanaDogruScrollEdilir() throws InterruptedException {
        hepsiBuradaPage.urunTvResmi.click();
        Thread.sleep(11000);
        try {
            new TouchAction(Driver.get()).press(PointOption.point(988, 693)).waitAction(WaitOptions.waitOptions(ofSeconds(1)))
                    .moveTo(PointOption.point(58, 693)).release().perform();
        } catch (Exception e) {
            System.out.println("unable to swipe");
        }

    }

    @Then("Gorsel ekrani kapatilir")
    public void gorselEkraniKapatilir() {

        Driver.get().navigate().back();
    }

    @And("Urun detaydan favori butonuna basilir")
    public void urunDetaydanFavoriButonunaBasilir() {
        hepsiBuradaPage.favoritesButton.click();

    }

    @Then("Acılan login sayfasından login olunur ve login olundugu kontrol edilir")
    public void acılanLoginSayfasındanLoginOlunurVeLoginOlunduguKontrolEdilir() throws InterruptedException {
        Thread.sleep(30000);
        hepsiBuradaPage.ePostaBox.click();
        hepsiBuradaPage.ePostaBox.sendKeys("yucedalogz@gmail.com");
        hepsiBuradaPage.ePostaBoxGirisButton.click();
        hepsiBuradaPage.sifreBox.click();
        hepsiBuradaPage.sifreBox.sendKeys("f+;e.5.)NCa^Yt");
        hepsiBuradaPage.ePostaBoxSifreGirisButton.click();
        hepsiBuradaPage.popUpTamamButton.click();

    }
    @And("Begendiklerim sayfasina gidilip urunun begendiklerime eklendi gorulur")
    public void begendiklerimSayfasinaGidilipUrununBegendiklerimeEklendiGorulur() throws IOException, InterruptedException {
        Thread.sleep(3000);
        Driver.get().navigate().back();
        hepsiBuradaPage.listelerimButton.click();
        Thread.sleep(2000);
        ReusableMethods.getScreenshot("favoriUrunumEkran");


    }}



