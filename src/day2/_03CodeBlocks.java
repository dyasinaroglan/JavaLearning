package day2;

public class _03CodeBlocks {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        if (score == 5000) {  // bu koşul doğruysa başka hiçbir koşula bakılmayacaktır.
            System.out.println("Your score was 5000");
        } else if (score < 5000) {  //2. koşul doğruysa bu kod bloğu çalışır, değilse else kod bloğu çalışır
            System.out.println("aaaaaaaaa");
        } else {
            System.out.println("Your score was not 5000"); //Eğer if içerisinde yer alan koşul false ise(yani score < 5000) else kod bloğuna girer.
        }
    }
}
