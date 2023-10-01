package day2;

public class _01TernaryOperator {

    public static void main(String[] args) {

        /*
        üçlü operatör

        operand1 ? operand2 : operand3
        bunun yaptığı şey operand1'in doğru olup olmadağını test etmek ve doğruysa operand2 döndürür değilse operand3
        boolean testidir
         */

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true; // bir değişkene iki değerden birini atama, if-else'ın kısayolu
        // ifademiz doğru dolayısıyla bize false değeri döndürür

        if (isDomestic) {
            System.out.println("ifade doğrudur");
        }
        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "Over eighteen" : "Still a kid";
        /*
        ageText değişkeni string bir değişken dolayısyla değer1 ve değer2 de string olmak zorundadır, String olmazsa derleme hatası alırız
         */
        System.out.println("Our client is : " + ageText);


        String s = (isDomestic) ? "This car is domestic" : "This car is not demestic";
        System.out.println(s);


        /* Challenge
        Adım 1: 20.00 değerinde bir double değişken oluşturun.
        Adım 2: 80.00 değerinde ikinci bir double değişken oluşturun.
        Adım 3: Her iki sayıyı toplayın, ardından 100.00 ile çarpın.
        Adım 4: Kalan operatörünü kullanarak, adım üçteki işlemin sonucunun ve 40.00'ün kalanının ne olacağını öğrenin.
        Adım 5: Adım dörtteki kalan 0.00 ise değeri doğru (true) olan, 0.00 değilse yanlış (false) olan bir boolean değişken oluşturun.
        Adım 6: Sonucun ne olduğunu görmek için boolean değişkenini yazdırın.
        Adım 7: Eğer beşinci adımdaki boolean doğru değilse, 'biraz kalan var' mesajını gösteren bir if-then ifadesi yazın.
         */

        double value1 = 20.00d;
        double value2 = 80.00d;

        double process = (value1 + value2) * 100.00d;
        System.out.println("Process : " + process);
        double result = process % 40.00d;
        System.out.println("Result : " + result);

        boolean isRealResult = (result == 0) ? true : false;

        System.out.println("isRealResult " + isRealResult);

        if(!isRealResult){
            System.out.println("Got some remainder");
        }

    }
}
