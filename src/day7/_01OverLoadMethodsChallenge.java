package day7;

public class _01OverLoadMethodsChallenge {

    /*
    Aynı isimde iki metod oluşturun: convertToCentimeters
    İlk metodun türü int olan tek bir parametresi bulunmaktadır, bu parametre tüm boyu inç cinsinden temsil eder.
    Bu metotta inçleri santimetreye dönüştüreceksiniz ve sonucu double türünde döndüreceksiniz.
    İkinci metodun türü int olan iki parametresi bulunmaktadır, biri boyu feet (ayak) cinsinden, diğeri kalan boyu inç cinsinden temsil eder.
    Örneğin, bir kişi 5 ayak 8 inç ise, bu metoda 5 feet ve 8 inç değerleri iletilir.
    Bu metod önce feet ve inçleri sadece inç cinsinden bir değere dönüştürecek, ardından ilk metodu çağırarak santimetre cinsinden değeri alacak ve bu değeri double türünde döndürecektir.
    Her iki metod da toplam boyu santimetre cinsinden ondalıklı bir değer olarak döndürmelidir.
    Her iki metodu da çağırın ve sonuçları yazdırın.

                                      Inçten santimetreye dönüşüm formülü şudur: 1 inç = 2.54 cm.
                                      Ayrıca, unutmayın ki bir ayak = 12 inçtir.
     */

    public static double convertToCentimeters(int inc){
        return inc * 2.54;
    }
    public static double convertToCentimeters(int feet, int inc){

        //return convertToCentimeters((feet * 12) + inc);

        int feetToInches = feet * 12;
        int totalInches = feetToInches + inc;
        double result = convertToCentimeters(totalInches);
        return result;
    }

    public static void main(String[] args) {

        System.out.println(convertToCentimeters(5,8));
        System.out.println(convertToCentimeters(6,9));
    }
}
