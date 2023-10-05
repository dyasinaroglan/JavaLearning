package day5;

public class _03MegaBytesConverter {

    /*
    Bir bilgisayar depolama birimi olan gigabayt (GB) ve megabayt (MB) arasında dönüşüm yapacak iki metod yazmanız gerekmektedir.

   toGigaBytes adında bir metod yazın.
   Bu metod, megabayt (MB) cinsinden bir değeri almalı (int türünde) ve bu değeri gigabayt cinsine dönüştürüp geri döndürmelidir.
   Eğer girdi değeri negatifse, bu geçersiz bir değerdir ve metot -1 döndürmelidir.

   printGigaBytesAndMegaBytes adında bir başka metod daha yazın. Bu metod, megabayt (MB) cinsinden bir değeri almalı (int türünde) ve bu değeri gigabayt (GB) ve kalan megabayt (MB) cinsine dönüştürmelidir.
   Ardından şu formatla bir çıktı üretmelidir: "XX MB = YY GB ve ZZ MB". Eğer girdi değeri negatifse, "Geçersiz Değer" mesajını yazdırmalıdır.

   İPUCU: 1 GB = 1024 MB

   ÖRNEKLER:

   printGigaBytesAndMegaBytes(3072); → "3072 MB = 3 GB ve 0 MB" yazdırmalıdır.
   printGigaBytesAndMegaBytes(5000); → "5000 MB = 4 GB ve 872 MB" yazdırmalıdır.
   printGigaBytesAndMegaBytes(-200); → "Geçersiz Değer" yazdırmalıdır.

     */

    public static void main(String[] args) {

        printGigaBytesAndMegaBytes(3072);
        printGigaBytesAndMegaBytes(6000);


    }
    public static int toGigaBytes(int megabayt){
        if(megabayt < 0){
            return -1;
        }
        return megabayt / 1024; //megabaytı gigabyte'a dönüştürüyoruz.
    }
    public static void printGigaBytesAndMegaBytes(int megabayt){

        if(megabayt < 0){
            System.out.println("Geçersiz değer");
            return;
        }
        int gigaBytes = toGigaBytes(megabayt); // megabytes'ı gigabytes'a dönüştürüyoruz
        int remainingMegaBytes = megabayt % 1024; // kalan megabyte değerini hesaplamak için
        System.out.println(megabayt + " MB = " + gigaBytes + " GB ve " + remainingMegaBytes + " MB");
    }
}
