# Macera Oyunu

Java ile metin tabanlı bir macera oyunu yapıyoruz.

## Oyun Yapısı ve Amacı

Oyuna ilk başlayan kişi karakterler arasından kendisine bir karakter seçecek. Oyuncunun seçeceği karaktere göre çeşitli hasar, sağlık ve para değerleri olacak. Para ile oyunda oluşturulmuş bir markette zırh veya silah gibi şeyler alabilecek. Bu oyuncu, oyuna ilk başta güvenli evde başlıyor ve daha sonra diğer mekanlardaki canavarları öldürerek adadan veya tehlikeli bu bölgeden kaçmaya çalışıyor ve bu sırada tabi ki hayatta kalmaya çalışması da gerekiyor.

## Savaş Yapısı

Oyunda canavarlar ile bir savaş sistemi var ve bu konsol tabanlı oyunda savaşlarda ilk önce biz vuruyoruz daha sonra canavar vuruyor (sıra tabanlı). Bu sırada karşımıza çıkan canavarı yenemeyeceğimizi düşünüp kaçmak istersek de sürekli böyle bir seçeneğimiz de var. Örneğin bir okçu ile bir vampir savaşıyor, burada önce okçu 7 hasar vurur ve vampirin 7 canı kalır, daha sonra vampir vurur ve okçunun 14 canı kalır, sonra tekrar okçu vurur ve vampir öldüğü için bu vampirin parası okçu tarafından ele geçirilir.

Not: Oyunda bir mekandaki canavar sayısı rastgele olarak belirlenir

## Eşyalar

Oyun mağazasında çeşitli satın alınabilir eşyalar mevcut. Bu eşyalardan örneğin bir tabanca almak istiyoruz, bunun için öncelikle 25 para ödememiz gerekiyor, ödeme işleminden sonra bu tabanca ile hasarımız 2 artıyor. Benzer bir olay zırhlarda da geçerlidir. Örneğin hafif zırh satın aldığımızda önce parasını veririz ardından da canavarlardan aldığımız hasar 1 azalır.

Not: Aynı anda iki adet silah veya zırh kullanılamaz. Yani örneğin tabancamız varken kılıç alırsak artık tabancamız olmayacaktır. Aynı şekilde hafif zırhımız varken de orta zırh alırsak artık yalnızca orta zırhımız olur.

## KARAKTERLER

![karakterler](https://github.com/seyitkilic/PatikaDevJava/blob/main/Java102/adv-game/images/karakterler.png "karakterler")

## CANAVARLAR

![canavarlar](https://github.com/seyitkilic/PatikaDevJava/blob/main/Java102/adv-game/images/canavarlar.png "canavarlar")

NOT : Yılanlar Şansa bağlı olarak değişik eşyalar veya paralar verebilir veya hiçbir şey vermeyedebilir. Buradaki olasılıklar şu şekildedir:

* Silah olasılığı: 15%
  * Tüfek Olasılığı: 20%
  * Kılıç Olasılığı: 30%
  * Tabanca Olasılığı: 50%
* Zırh Olasılığı: 15%
  * Ağır Zırh Olasılığı: 20%
  * Orta Zırh Olasılığı: 30%
  * Hafif Zırh Olasılığı: 50%
* Para Kazanma Olasılığı: 25%
  * 10 Para Kazanma: 20%
  * 5 Para Kazanma: 30%
  * 1 Para Kazanma: 50%
* Hiçbir şey kazanmama olasılığı: %45

## SİLAHLAR

![silahlar](https://github.com/seyitkilic/PatikaDevJava/blob/main/Java102/adv-game/images/silahlar.png "silahlar")

## ZIRHLAR

![zırhlar](https://github.com/seyitkilic/PatikaDevJava/blob/main/Java102/adv-game/images/zirhlar.png "zırhlar")

## MEKANLAR

### Güvenli Ev

* Özellik : Can Yenileniyor

### Mağara

* Canavar : Zombi (1-3 Adet)
* Özellik : Savaş + Ganimet
* Eşya : Yemek (Food)

### Orman

* Canavar : Vampir (1-3 Adet)
* Özellik : Savaş + Ganimet
* Eşya : Odun (Firewood)

### Nehir

* Canavar : Ayı (1-3 Adet)
* Özellik : Savaş + Ganimet
* Eşya : Su (Water)

### Maden

* Canavar : Yılan (1-5 Adet)
* Özellik : Savaş + Ganimet
* Eşya : null

### Mağaza

* Özellik : Destekleyici Eşyalar Satın Almak
* Silah : Tabanca,Kılıç,Tüfek
* Zırh : Hafif,Orta,Ağır

## Sınıf Diyagramı

![sınıf diyagramı](https://github.com/seyitkilic/PatikaDevJava/blob/main/Java102/adv-game/images/class-diagram.jpg "sınıf diyagramı")
