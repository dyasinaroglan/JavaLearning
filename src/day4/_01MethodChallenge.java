package day4;

public class _01MethodChallenge {

    public static void main(String[] args) {

        /*

        Bu meydan okumada iki yöntem oluşturacağız:
        İlk yöntemin adı displayHighScorePosition olmalıdır.
        Bu yöntemin iki parametresi olmalıdır, biri oyuncunun adı için, diğeri bir oyuncunun yüksek puan listesindeki konumu için.
        Bu yöntem "Tim yüksek puan listesinde 2. pozisyona girmeyi başardı" gibi bir mesaj yazdırmalıdır.

        Metod Challenge
        İkinci yöntemin adı calculateHighScorePosition olmalıdır.

      Bu yöntemin sadece bir parametresi olmalıdır, oyuncunun puanı.
      Bu yöntem, bu tabloda gösterilen puan değerlerine göre 1 ile 4 arasında bir numara döndürmelidir.
      Puan   	Sonuç
      1000'e eşit veya daha büyük puan	1
      500'e eşit veya daha büyük ama 1000'den küçük puan	2
      100'e eşit veya daha büyük ama 500'den küçük puan	3
      Diğer tüm puanlar	4

           Sonunda, her iki yöntemi de çağıracağız ve şu puanlar için sonuçları göstereceğiz: 1500, 1000, 500, 100 ve 25.

         */

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Yasin", highScorePosition);


    }
    public static void displayHighScorePosition(String name, int position){

        System.out.println(name + " yüksek puan listesinde " + position + ". pozisyona girdi.");
    }
    public static int calculateHighScorePosition(int playerPoint){


        if(playerPoint >= 1000){
            return 1;
        }else if(playerPoint >= 500){
            return 2;
        }else if(playerPoint >= 100){
            return 3;
        }
        return 4;
    }
}
