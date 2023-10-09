package day6;

public class _01BarkingDogChallenge {

    /*
    Bir köpeğimiz var ve bu köpek havlamayı seviyor. Eğer köpek gece havlarsa uyanmamız gerekiyor!

    shouldWakeUp adında bir metot yazın. Bu metot 2 parametre almalıdır.

    Parametre boolean tipinde olmalı ve adı barking olmalıdır. Bu parametre köpeğimizin şu anda havlayıp havlamadığını belirtir.
    İkinci parametre günün saati için int tipinde olmalı ve adı hourOfDay olmalıdır. Bu parametre 0-23 arasında geçerli bir değere sahip olmalıdır.
    Eğer köpek 8'den önce veya 22'den sonra havlarsa uyanmamız gerekiyor, bu durumda true dönmeli.

    Diğer tüm durumlarda false dönmelidir.

    Eğer hourOfDay parametresi 0'dan küçük veya 23'ten büyükse false dönmelidir.
    ----------------------------------------------------------------------------------
    Örnek girdi/çıktı:
    shouldWakeUp (true, 1); → true dönmelidir.
    shouldWakeUp (false, 2); → köpek havlamıyor olduğu için false dönmelidir.
    shouldWakeUp (true, 8); → 8'den önce olmadığı için false dönmelidir.
    shouldWakeUp (true, -1); → hourOfDay parametresi 0-23 aralığında olmadığı için false dönmelidir.

    İPUCU: Birden fazla koşulla if else ifadesini kullanın.
    NOT: shouldWakeUp metodu public static olarak tanımlanmalıdır.
    NOT: Çözüm koduna ana bir metot eklemeyin.
     */

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) { // hourOfDay değeri 0 dan küçük 23'ten büyükse hemen false döndürür.
            return false;
        }

        if (barking && (hourOfDay < 8 || hourOfDay > 22)) { // köpek havlıyorsa ve saat değeri 8'den küçük veya 22'den büyükse metot true döndürür
            return true;
        }
        return false;

    }
}
