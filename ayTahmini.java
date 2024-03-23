import java.util.Scanner;

public class ayTahmini{
    public static void main(String[] args) {
        // Kullanıcıdan hangi ayda olduğunu bilgisini alıp ilgili ay değerini
        // yazdırın. Ay adlarını bir dizide saklayın
        String[] aylar=
                {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Ay değerini rakamla yazınız: ");
        int ay = scn.nextInt();
        System.out.println("Seçtiğiniz ay :" + aylar[ay - 1]);
    }
}
