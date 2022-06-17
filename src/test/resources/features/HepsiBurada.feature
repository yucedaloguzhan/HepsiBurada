Feature:Konum Kontrol
  As a user
  I want to check the application
  So that I can check if the application locations works or not

  @HB
  Scenario: HepsiBurada konum kontrol
    Given Anasayfada konum alanina tiklanir.
    When il, ilce ve mahalle secilir ve kaydet butonuna tiklanir.
    Then Konumunuz kaydedildi popup kontrol edilir.
    Then Tab bar uzerinden kategoriler tabina tiklanir.
    Then Herhangi bir kategori secilip listeleme sayfasina yonlenilir.
    And Listeleme sayfasinda Yarin Kapinda alaninda gelen il bilgisi ile anasayfada secilen il bilgisinin ayni oldugu kontrol edilir.




