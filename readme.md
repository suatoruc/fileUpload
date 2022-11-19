
# Selenium 4.6 versiyonu ile gelen **WebDriver Manager** kullanımı,

>- Driver class'ında yazdığımız kod sayısını azaltacak ve bu nedenle aldıgımız hataları 
azaltacak bir entegrasyon olan webdriver manager uygulaması ile ilgili örnek küçük bir uygulama yazıldı
>- Çalıştıgımız class yapısında bu özelligi kullanabilmek için pom.xml yapısı içinde küçük bir modifikasyon satırı 
eklememiz gerekli arkadaşlar
   
     <properties>
        <java.version>8</java.version>
        <maven.compiler.target>${java.version}</maven.compiler.target>
        <project.encoding>UTF-8</project.encoding>
     </properties>
pom.xml içinde properties kısmını yukarıdaki kod yapısına göre düzenlememiz yeterli arkadaşlar

>- Bilindigi gibi Selenium 4.6 versiyonunda webdriver manager'ın beta versiyonu yayınlandı ve 
bu beta sürümü yanlız java 8 sürümü ile çalışıyor. bu nedenle pom.xml de versiyon kısmına
yukarıdaki kodda görüldügü gibi java 8 yazmamız gerekiyor.

>- Umarım faydalı bir paylaşım olur.
  
    