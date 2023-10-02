package day3;

public class _01MainChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            //finalScore = finalScore + (levelCompleted * bonus); üstteki kısaltması
            System.out.println("Your final score was " + finalScore);
        }
    }
}

