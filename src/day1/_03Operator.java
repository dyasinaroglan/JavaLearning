package day1;

public class _03Operator {
    public static void main(String[] args) {

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("you got the high score!");
        }
        int secondScore = 81;
        if ((topScore > secondScore) && (topScore < 100)) {  // ve
            System.out.println("Greater than second top score and less than 100");
            // TODO: 29.09.2023 topscore secondScore'dan büyük mü ve topScore 100'den küçük mü diyor. && her iki koşulunda doğru olmasını ister
            // TODO: 29.09.2023 "&&" ve ------------ "||" veya

            // TODO: 29.09.2023 "and ve or" operatörleri "&& ve "||" boolean döndürür. true-false

        }
        if (topScore > 90 || secondScore <= 90){  // TODO: 29.09.2023 biri true olduğu için çıktı alabileceğiz.  // veya
            System.out.println("Either or both of the conditions are true");
        }
        boolean isCar = false;
        if (isCar = true){
            System.out.println("This is not supposed to happen"); // TODO: 29.09.2023  ikisi de boolean olduğu için
        }
        boolean isTruck = false;
        if(!isTruck){ // TODO: 29.09.2023 isTruck değişkeninin true değerini test etmiş oluruz 
            System.out.println("This is not supposed to happen, Truck"); // TODO: 29.09.2023 ya da if(!isTruck) şeklinde kullanabiliriz
        }
    }
}
