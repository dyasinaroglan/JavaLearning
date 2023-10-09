package day6;

public class _03OverLoadingMethod {

    // TODO: 9.10.2023 aynı isimde birden fazla metod tanımlama yeteneğidir. ancak bu metodların parametreleri farklı olmalıdır.
    // TODO: 9.10.2023 Parametrelerin sayısı, sırası ve türü farklı olabilir 
    // TODO: 9.10.2023 bir class'ın aynı isimle birden fazla farklı işleve sahip metodlara sahip olmasını sağlar.


    /*Düşünün ki bir kafede çalışıyorsunuz ve müşterilere kahve yapma göreviniz var.
    Bazı müşteriler sadece siyah kahve isterken, bazıları sütlü, bazıları ise şekerli ister.

     */
    public static void main(String[] args) {

        _03OverLoadingMethod overLoadingMethod = new _03OverLoadingMethod(); // metod static olmadığı için

        overLoadingMethod.yapKahve();
        overLoadingMethod.yapKahve("süt");

        System.out.println("New score is " +  calculatorScore("YASİN", 500));
        System.out.println("New score is " + calculatorScore(500));
    }

    // Sade kahve için
    public void yapKahve() {
        System.out.println("Siyah kahve hazır!");  // TODO: 9.10.2023 overLoad metod -- metod isimleri aynı, parametreler farklı, metodların dönüş türleri aynı olabilir veya olmayabilir
    }

    // Sütlü kahve için
    public void yapKahve(String malzeme) {
        if (malzeme.equals("süt")) {
            System.out.println("Sütlü kahve hazır!");
        }
    }

    // Şekerli ve sütlü kahve için
    public void yapKahve(String malzeme1, String malzeme2) {
        if (malzeme1.equals("süt") && malzeme2.equals("şeker")) {
            System.out.println("Şekerli ve sütlü kahve hazır!");
        }
    }

    public static int calculatorScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculatorScore(int score) {
        return calculatorScore("Anonymous", score);
    }
    public static int calculatorScore() {
        System.out.println("No player name, no player score");
        return 0;

    }
}

// parametre sayıları birbirinden farklı olmalıdır metodların yoksa derleyici hatasına neden olur.
