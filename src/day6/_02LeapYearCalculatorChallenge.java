package day6;

public class _02LeapYearCalculatorChallenge {

    /*
    Artık Yıl Hesaplayıcı

    isLeapYear adında bir metot yazın. Bu metot, year adında int tipinde bir parametre almalıdır.
    Bu parametre 1'e eşit veya 1'den büyük ve 9999'a eşit veya 9999'dan küçük olmalıdır.
    Eğer parametre bu aralıkta değilse, false dönmelidir.
    Eğer parametre geçerli bir aralıkta ise, bu yılın artık yıl olup olmadığını hesaplayın. Eğer artık yıl ise true, değilse false dönmelidir.

    Bir yılın artık yıl olup olmadığını belirlemek için şu adımları takip edin:
    Eğer yıl 4'e tam bölünebiliyorsa, 2. adıma gidin. Aksi halde, 5. adıma gidin.
    Eğer yıl 100'e tam bölünebiliyorsa, 3. adıma gidin. Aksi halde, 4. adıma gidin.
    Eğer yıl 400'e tam bölünebiliyorsa, 4. adıma gidin. Aksi halde, 5. adıma gidin.
    Yıl bir artık yıldır (366 günü vardır). isLeapYear metodu true dönmelidir.
    Yıl bir artık yıl değildir (365 günü vardır). isLeapYear metodu false dönmelidir.

    Örnek girdi/çıktı:
    isLeapYear(-1600); → Parametre 1-9999 aralığında olmadığı için false dönmelidir.
    isLeapYear(1600); → 1600 bir artık yıl olduğu için true dönmelidir.
    isLeapYear(2017); → 2017 bir artık yıl olmadığı için false dönmelidir.
    isLeapYear(2000); → 2000 bir artık yıl olduğu için true dönmelidir.
     */

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(4400));
        System.out.println(isLeapYear(3384));

    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
