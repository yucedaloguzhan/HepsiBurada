package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HepsiBuradaPage extends BasePage{

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/search_camera")
    public WebElement popUp;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/textViewTitle")
    public WebElement konum;

    @AndroidFindBy(className = "_inspector-toolbar_619e8")
    public WebElement bosluk;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[1]/android.view.ViewGroup\n")
    public WebElement sehirBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")
    public WebElement adana;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"İlçe seçin\"]")
    public WebElement ilce;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")
    public WebElement ceyhan;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Mahalle seçin\"]")
    public WebElement mahalle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView")
    public WebElement agacpinarMahalle;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/button")
    public WebElement kaydetButton;

   @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Kategorilerim\"]/android.widget.FrameLayout/android.widget.ImageView")
    public WebElement kategorilerButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.widget.ImageView")
    public WebElement sporGiyim;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/textViewLocation")
    public WebElement yarınKapındaAnaSayfaKonumBilgisi;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/textViewLocation")
    public WebElement yarınKapındaGiyimSayfaKonumBilgisi;



    //2.Senaryo
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/all")
    public WebElement tumu;


    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/tv_product_list_item_name")
    public WebElement urunTv;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/productImage")
    public WebElement urunTvResmi;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/product_detail_favourites")
    public WebElement favoritesButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText")
    public WebElement ePostaBox ;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.widget.Button")
    public WebElement ePostaBoxGirisButton ;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.EditText")
    public WebElement sifreBox;

    @AndroidFindBy(xpath = "    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.Button")
    public WebElement ePostaBoxSifreGirisButton ;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement popUpTamamButton;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Listelerim\"]/android.widget.FrameLayout/android.widget.ImageView")
    public WebElement listelerimButton ;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"predifined-box Beğendiklerim 0 ürün\"]")
    public WebElement favoriBox ;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"123\"]/android.view.View/android.view.View/android.view.View/android.view.View[1]")
    public WebElement favoriUrunum ;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement sepetButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[10]")
    public WebElement favoriUrunumEkran ;



    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Anasayfam\"]/android.widget.FrameLayout/android.widget.ImageView")
    public WebElement anaSayfaButton ;

























}
