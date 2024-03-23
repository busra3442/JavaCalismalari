import java.util.Scanner;

public class piyango {
    public class calisma13 {
        //Küçük bir piyango oyunu tasarlayınız. Sistem iki basamaklı bir sayı üretmeli.
        //Kullanıcıdan da bu sayıyı tahmin etmesini istemelisiniz.
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int sansliSayi = (int) (Math.random()*99+1);
            System.out.println("Lütfen tahmininizi girin:");
            int tahminEdilenSayi = scn.nextInt();
            int sansliSayiBirinciBasamak = sansliSayi / 10;
            int sansliSayiİkinciBasamak = sansliSayi % 10;

            int tahminEdilenSayiBirinciBasamak = tahminEdilenSayi/ 10;
            int tahminEdilenSayiİkinciBasamak = tahminEdilenSayi % 10;

            if(sansliSayi == tahminEdilenSayi)
            {
                System.out.println("Tebrikler 10000 TL kazandınız: " + " şanslı sayı " + sansliSayi + " tahmin edilen sayı " + tahminEdilenSayi);
            }
            else if (sansliSayiBirinciBasamak==tahminEdilenSayiİkinciBasamak && sansliSayiİkinciBasamak==tahminEdilenSayiBirinciBasamak)
            {
                System.out.println("Tebrikler 5000 TL kazandınız: " + " şanslı sayı " + sansliSayi + " tahmin edilen sayı " + tahminEdilenSayi);
            } else if (sansliSayiBirinciBasamak == tahminEdilenSayiBirinciBasamak || sansliSayiBirinciBasamak == tahminEdilenSayiİkinciBasamak
                    || sansliSayiİkinciBasamak == tahminEdilenSayiBirinciBasamak || sansliSayiİkinciBasamak == tahminEdilenSayiİkinciBasamak)
            {
                System.out.println("Tebrikler 1000 TL kazandınız:  " + " şanslı sayı " + sansliSayi + " tahmin edilen sayı " + tahminEdilenSayi);
            }
            else
            {
                System.out.println("Maalesef ödül kazanamadınız: " + " şanslı sayı " + sansliSayi + " tahmin edilen sayı " + tahminEdilenSayi);
            }
        }
    }
}