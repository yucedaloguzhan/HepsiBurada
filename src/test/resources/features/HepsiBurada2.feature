Feature:Login and
  As a user
  I want to login the application
  So that I can check if the application works or not

  @HB2
  Scenario:Hepsi Burada login ve urun ekleme kontrol
    Given Anasayfada Super Fiyat, Super Teklife tiklanir
    When Super Fiyat Super Teklif sayfasindan bir urune gidilir
    Then Urun detayda urunun gorseline tiklanir ve yana dogru scroll edilir
    Then Gorsel ekrani kapatilir
    And Urun detaydan favori butonuna basilir
    Then Acılan login sayfasından login olunur ve login olundugu kontrol edilir
    And Begendiklerim sayfasina gidilip urunun begendiklerime eklendi gorulur



