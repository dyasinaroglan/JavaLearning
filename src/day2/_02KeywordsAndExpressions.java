package day2;

public class _02KeywordsAndExpressions {

    public static void main(String[] args) {

        /*
        intellij anahtar sözcükleri turuncu reklendirme ile bize gösteriyor. Toplam 51 tane
        public
        static
        void
        class
        import

        int int = 5; yazamayız çünkü int bir veri türüdür.
         */

        int int2 = 5; //dolayısıyla javada değişken adlarını ayrılmış bir anahtar kelime olarak kullanamayız.

        /*
        Anahtar kelimelerden olmasada true, false ve null da değişken adı olarak kullanılamaz.
         */

        double kilometers = (100 * 1.609344);   // *, = --> operatör   veriable --> kilometers  value --> 100
        //sonunda noktalı virgülle bitirerek bir java deyimi oluşturuyoruz.


        /*
        Aşağıdaki ifadede kaç tane ifade(expression) vardır
         */

        int health = 100;   //  1. health = 100;   2.highScore = 1500;
        int highScore = 1500;
        if ((health < 25) && (highScore > 1000)) { // 3.(health < 25)  4.highScore > 1000;  5. &&
            highScore = highScore - 1000;  // 6.highscore =  7. highscore - 1000;
            // toplam 7 tane ifade var.
        }

        highScore++;
        highScore--; // noktalı virgül bunlarıda ifade yapar


        int anotherVeriable = 43; System.out.println("bu da ifade"); anotherVeriable++; // bu da java da geçerli fakat kafa karıştırıcı  Code'a basıp Reformat Code a tıkladığımızda bunu intellij düzenleyecektir. CTRL+ALT+L

        int anotherVeriable2 = 43;
        System.out.println("bu da ifade");   // ----> beyaz boşluk (WhiteSpace)
        anotherVeriable++;

    }
}
