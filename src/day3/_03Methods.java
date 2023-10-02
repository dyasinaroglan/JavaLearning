package day3;

public class _03Methods {

    public static void main(String[] args) { //main metodu

        /*
        Metodlar;
        -Kod tekrarını azaltır.
        -Metoda argümanlar şeklinde veri aktararak potansiyel olarak farklı sonuçlarla bir çok kez çalıştırılır.
         */



        boolean gameOver = true;
        int score = 10000;

        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        calculatorName(10000, true, 200, 8);

    }
    public static void methodName(){

        /*
        hiç bir parametre almaz
        hiç bir veri döndürmez (void)
        public olduğu için dış dünya tarafından erişilebilir
        dogrudan sınıf adı kullanılarak çağrılabilir
         */

        // TODO: 2.10.2023 yeni bir metod yazmak için kodumuzu başka bir yöntemin dışında başlatmamız gerekir. burada main metodunun dışında başlattık
    }
    public static void calculatorName(int score, boolean gameOver, int bonus, int levelCompleted){ //sarı olarak metod adı göründüğünde bu metodun kullanıldığı anlamına gelir

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score : " + finalScore);
        }
    }
}
