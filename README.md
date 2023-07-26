# Taksimetre Projesi

Bu proje, kullanıcıdan alınan kilometre bilgisine göre bir taksimetre hesaplama işlemi gerçekleştiren basit bir Java programıdır. Kullanıcı, başlangıçta taksi ücretinin hesaplanabilmesi için kat ettiği mesafeyi girmelidir. Program, girilen kilometreye göre bir ücret hesaplayacak ve minimum ücretin altında bir sonuç çıkması durumunda asgari ücreti uygulayacaktır.

## Nasıl Çalışır?

Program kullanıcıdan `Km Bilgisi Giriniz:` şeklinde bir mesaj ile kilometre bilgisini alır.
Girilen kilometreye göre taksi ücretini hesaplamak için belirli bir başlangıç ücreti (10 TL) ve kilometre başına maliyet (2.20 TL) kullanılır.
Hesaplanan ücret, minimum ücret olan 20 TL'den düşükse, sonuç 20 TL olarak düzeltilir.
Son olarak, program hesaplanan ücreti ekrana yazdırır.
