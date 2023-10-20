package day7;

public class _02KahveFiyatlandırmaOverLoadMethod {

    /*
    Bir kahve dükkanı için bir uygulama yazıyorsunuz. Müşterilere farklı boyutlarda kahve sunuyorsunuz ve her boyut için fiyat hesaplamanız gerekiyor.
    İki metoda ihtiyacınız var ve her iki metodun adı da kahveFiyatiHesapla olacak.

    İlk metod:
    Parametre olarak bardakBoyutu alacak. (bardakBoyutu string türünde olacak: "küçük", "orta" veya "büyük")
    Bu bardakBoyutu için belirlenmiş fiyatı ondalıklı sayı olarak döndürecek.

    İkinci metod:
    İki parametre alacak: bardakBoyutu ve ekstraShot. (bardakBoyutu string türünde, ekstraShot tam sayı türünde olacak.)
    ekstraShot için ek ücret ekleyerek toplam fiyatı hesaplayacak ve ondalıklı sayı olarak döndürecek.

    Fiyatlandırma:
    Küçük kahve: 10.50 TL
    Orta kahve: 12.75 TL
    Büyük kahve: 15.00 TL
    Ekstra shot (her biri için): 2.00 TL
     */

    public static double kahveFiyatiHesapla(String bardakBoyutu) {

        switch (bardakBoyutu.toLowerCase()) { //String içerisindeki tüm karakterleri küçük harfe dönüştürür.
            case "küçük":
                return 10.50;
            case "orta":
                return 12.75;
            case "büyük":
                return 15.00;
            default:
                return 0; // geçersiz boyut için 0 tl döndürüldü

        }

    }
    public static double kahveFiyatiHesapla(String bardakBoyutu, int ekstraShot) {

        double temelFiyat = kahveFiyatiHesapla(bardakBoyutu);
        double ekstraFiyat = 2.0 * ekstraShot;
        return temelFiyat + ekstraFiyat;
    }

    public static void main(String[] args) {

        System.out.println(kahveFiyatiHesapla("orta", 1));
        System.out.println(kahveFiyatiHesapla("küçük"));
    }
}
