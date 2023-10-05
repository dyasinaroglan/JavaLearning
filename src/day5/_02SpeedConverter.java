package day5;

public class _02SpeedConverter {

    public static void main(String[] args) {

        /*
        KilometersPerHour adında double tipinde 1 parametresi olan toMilesPerHour adında bir metod yazın. Bu metod, hesaplamanın yuvarlanmış değerini long türünde geri döndürmelidir.
        Eğer kilometersPerHour parametresi 0'dan küçükse, toMilesPerHour metodu geçersiz bir değeri belirtmek için -1 döndürmelidir.

        Aksi takdirde, eğer pozitifse, saatteki mil değerini hesaplayın, onu yuvarlayın ve geri döndürün. Dönüştürme ve yuvarlama için aşağıdaki notlara göz atın.

                                                Giriş/çıkış örnekleri:
                                     toMilesPerHour(1.5); → 1 değerini döndürmelidir.
                                     toMilesPerHour(10.25); → 6 değerini döndürmelidir.
                                     toMilesPerHour(-5.6); → -1 değerini döndürmelidir.
                                     toMilesPerHour(25.42); → 16 değerini döndürmelidir.
                                     toMilesPerHour(75.114); → 47 değerini döndürmelidir.

       KilometersPerHour adında double tipinde 1 parametresi olan printConversion adında başka bir metod yazın.
       Bu metodun herhangi bir şey döndürmemesi gerekir (void) ve kilometersPerHour parametresinden milesPerHour'u hesaplaması gerekmektedir.

       Ardından "XX km/h = YY mi/h" formatında bir mesaj yazdırmalıdır.

       XX, orijinal kilometersPerHour değerini temsil eder.
       YY, kilometersPerHour parametresinden alınan yuvarlanmış milesPerHour değerini temsil eder.

       Eğer kilometersPerHour parametresi 0'dan küçükse, "Geçersiz Değer" metnini yazdırın.

                                               Giriş/çıkış örnekleri:

                                    printConversion(1.5); → şu metni yazdırmalıdır (konsola - System.out): 1.5 km/h = 1 mi/h
                                    printConversion(10.25); → şu metni yazdırmalıdır (konsola - System.out): 10.25 km/h = 6 mi/h
                                    printConversion(-5.6); → şu metni yazdırmalıdır (konsola - System.out): Geçersiz Değer
                                    printConversion(25.42); → şu metni yazdırmalıdır (konsola - System.out): 25.42 km/h = 16 mi/h
                                    printConversion(75.114); → şu metni yazdırmalıdır (konsola - System.out): 75.114 km/h = 47 mi/h

       Mil/saat değerini (double) yuvarlamak için Math.round metodunu kullanın. Round metodu long döndürür.

       NOT: Tüm metodlar, kurs boyunca yaptığımız gibi public static olarak tanımlanmalıdır.
       NOT: 1 mil/saat, 1.609 kilometre/saat'tir.

         */

        printConversion(25.42);
        printConversion(-5.4);


    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);  // TODO: 5.10.2023 Math.round metodu verilen ondalıklı sayıyı en yakın tam sayı değerine yuvarlar.
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Geçersiz Değer");
            return;   // TODO: 5.10.2023 return; kullanmamızın sebebi kilometersPerHour değeri 0'dan küçükse 'Geçersiz Değer' mesajını yazdıracak ve hemen fonksiyonu sonlandırılacak
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h"); // TODO: 5.10.2023 return; kullanmasaydık hem geçersiz değeri yazdıracak hem de bu satır yazdırılmış olacaktı.
    }
}
