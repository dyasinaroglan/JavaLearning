package day3;

public class _04MethodsExample {

    public static void main(String[] args) { //Intellij de psvm yazdığımızda main metodunu bize yazar

        /*
        Bir mağazada ürün satışı yapılıyor. Mağaza çalışanları, satış yapacakları ürünleri stoktan çıkarırken aşağıdaki kurallara göre iskonto uygulamaktadır:
        100 adetten az ürün alımlarında hiçbir indirim yapılmaz.
        100 ile 500 adet arasında ürün alımlarında %10 indirim yapılır.
        500 ile 1000 adet arasında ürün alımlarında %20 indirim yapılır.
        1000 adetten fazla ürün alımlarında %30 indirim yapılır.
        Bu kurallara göre, girilen ürün adeti ve ürünün birim fiyatını alarak toplam fiyatı hesaplayan bir Java metodu yazınız.
         */

        toplamFiyat(10, 650);

        System.out.println("Bilet fiyatı : " + biletFiyatlandirma(5));
        System.out.println("Bilet fiyatı : " + biletFiyatlandirma(15));
    }

    public static void toplamFiyat(double birimFiyat, int urunMiktar) {

        double toplamFiyat = urunMiktar * birimFiyat;

        double indirimliFiyat;

        if (urunMiktar < 100) {
            indirimliFiyat = toplamFiyat;
        } else if (urunMiktar < 500) {
            indirimliFiyat = toplamFiyat * 0.9;
        } else if (urunMiktar < 1000) {
            indirimliFiyat = toplamFiyat * 0.8;
        } else {
            indirimliFiyat = toplamFiyat * 0.7;
        }
        System.out.println("İndirimli fiyat : " + indirimliFiyat);
    }
    /*
    Bir sinema salonunda, bilet fiyatları yaşa göre belirlenmektedir. Bilet fiyatını hesaplayan bir metot yazınız.

    Bilet fiyatlandırma şu şekildedir:

    0-5 yaş arası: Ücretsiz
    6-12 yaş arası: 10 TL
    13-18 yaş arası: 15 TL
    19 yaş ve üzeri: 25 TL        Yazacağınız metot, yaş bilgisini parametre olarak alacak ve ilgili bilet fiyatını geri döndürecek.
     */

    public static int biletFiyatlandirma (int yas){  //zaten bize int döndüren bir metod dolayısıyla return yazıp değeri yazabiliriz.

        if(yas >= 0 && yas <= 5){
            return 0;
        }else if(yas >= 6 && yas <= 12){
            return  10;
        }else if(yas >= 13 && yas <= 18){
            return  15;
        }else {
            return  25;
        }

    }
    // TODO: 4.10.2023 Return : bir yöntemden bir değeri geri döndürmektir.Hiç bir şey döndürmeyen bir yöntemde, dönüş türü olarak void olarak bildirilen bir yöntemde, return değimi gerekli değildir. 
    // TODO: 4.10.2023 ancak veri döndüren bir yöntemde 'return' gereklidir.


}
