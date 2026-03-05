
Eczane Satış Yönetim Sistemi (Pharmacy Sales Management System)
Bu proje, Java Swing kullanılarak geliştirilmiş, MySQL veritabanı entegrasyonuna sahip kapsamlı bir masaüstü Eczane Satış Yönetim Sistemi'dir. Sistem; ilaç envanter takibi, reçete kontrolü, müşteri bazlı satış kısıtlamaları ve işlem geçmişi dökümantasyonu gibi kritik iş süreçlerini yönetmektedir.

Temel Özellikler

Kullanıcı Yetkilendirme: Sistem rollerine göre giriş paneli ve güvenli erişim.


Gelişmiş Satış Paneli: İlaç seçimi, gerçek zamanlı sepet hesaplama ve reçete uyumluluk denetimi.


Envanter Yönetimi (CRUD): İlaç ekleme, güncelleme ve silme işlemleri.


İşlem Kaydı ve Raporlama: Tamamlanan satışların hem MySQL veritabanına hem de yerel dosya sistemine (sales.txt) eşzamanlı kaydedilmesi.


Gelir Takibi: Toplam satış hasılatının ve geçmiş işlemlerin filtreleme seçenekleriyle izlenmesi.

Teknik Mimari ve Kurallar
Proje, veri bütünlüğünü korumak adına belirli iş kuralları içermektedir:


Tekil Satış Kuralı: Bir müşteri (T.C. Kimlik No ile) gün içinde yalnızca bir kez alışveriş yapabilir.


Reçete Uyumluluk Kontrolü: Kırmızı veya Yeşil reçeteli ilaçların satışı, beyan edilen reçete tipiyle eşleşmek zorundadır.


Stok Limitleri: Stok güvenliği için her ilaçtan tek seferde maksimum 3 adet satılabilir.


Veri Doğrulama: Kimlik numarası ve isim alanları için gerekli karakter ve hane kontrolleri.

Veritabanı Yapısı
Sistem, toplam 5 ilişkisel tablo üzerinden yönetilmektedir:


medicine: İlaç bilgileri ve stok durumları.


customer: Müşteri kimlik ve iletişim verileri.


sale & sale_detail: Satış özetleri ve satılan ilaçların detaylı dökümü.


users: Sistem operatörü giriş bilgileri.

Kullanılan Teknolojiler

Dil: Java 


Arayüz: Java Swing (Desktop UI) 


Veritabanı: MySQL 


Dosya İşlemleri: Java File API (FileWriter, BufferedReader vb.)
