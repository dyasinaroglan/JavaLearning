package day1;

public class _02SecondClass {

    public static void main(String[] args) {

        // ******************************Logical and Operator**********************************

        System.out.print("Hello, Tim");
        System.out.print("Hello World");

        // TODO: 29.09.2023 print olarak yazdırdığımızda aynı satıra yazar

        System.out.println("Hello, Tim"); // TODO: 29.09.2023 "ln" metni yazdırdıktan sonra boş bir satır ekliyor

        boolean isAlien = true; // TODO: 29.09.2023 "=" tek eşittir atama operatörüdür, atama değişkeni bir ifadenin değerini işlecin solundaki değişkene atar. isALien değişkendir ve false değerine atanmıştır
        if (isAlien == false) {// TODO: 29.09.2023 if else de noktalı virgül yoktur.
            System.out.println("it is not an alien");
            System.out.println("And I am scared of aliens");


            // TODO: 29.09.2023 Equality Operator ---> "==" iki işlenenin eşit kabul edilip edilmediğini kontrol eder ve boolean döndürür ve sol taraf ile sağ taraf eşit mi durumunu kontrol eder

            // TODO: 29.09.2023  if(isAlien == false); noktalı virgül koyarsak bu satırı kapamış oluyoruz ve bunu  if(isAlien == true) olarak değiştirdiğimizde bize false döndürecek fakat çıktı olarak "it is not an alien" ifadesini bize verecek artık bağımsız
            // TODO: 29.09.2023 if satırına noktalı virgül koymak hiçbir şey yapmayan bir if bloğu koymak demektir

            // TODO: 29.09.2023  burada kod bloğu olmadığı için "{}" System.out.println("And I am scared of aliens"); ifadesi çıktı olarak yazılacaktır. kod bloğu olsaydı hiç bir çıktı alamayacaktık çünkü artık "System.out.println("And I am scared of aliens");" ifadeside kod bloğunun içinde yer almış aolacaktı
        }

        int topScore = 100;
        if (topScore == 100) { // TODO: 29.09.2023 equals operatörünün topScore'u 100 gerçek değeri ile karşılaştırdığını görebiliriz.
            System.out.println("You got the hihg score!");
        }
        if (topScore != 100){
            System.out.println("You got the hihg score!");
        }

    }


}
