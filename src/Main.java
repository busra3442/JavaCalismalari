<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
     Pasta pastaTarifi = new Pasta("Cikolatali Pasta",60,8,"Kek",
             "Un,Yumurta,Şeker,Vanilya,Süt,Kakao,Kabartma Tozu,Yağ,Çikolata");
        System.out.println("Pasta Tarifi: ");
        System.out.println("Yemek Adi: " + pastaTarifi.getYemekAdi());
        System.out.println("Tatli Turu: " + pastaTarifi.getTatliTur());
        System.out.println("Malzemeler: " + pastaTarifi.getMalzemeler());
        System.out.println("Pisirme Suresi: " + pastaTarifi.getPisirmeSuresi());
        System.out.println("Kisi Sayisi: " + pastaTarifi.getKisiSayisi());

        pastaTarifi.hazirla();
        pastaTarifi.cirpma();
        pastaTarifi.pisir();
        pastaTarifi.servisYap();

        System.out.println();

        Kebap kebapTarifi = new Kebap("Adana Kebap",30,4,"Kuzu Eti",
                "Biber,Domates,Maydanoz");
        System.out.println("Kebap Tarifi: ");
        System.out.println("Yemek Adi: " + kebapTarifi.getYemekAdi());
        System.out.println("Et Turu: " +kebapTarifi.getEtTur() );
        System.out.println("Sebze Turu: " + kebapTarifi.getSebzeTur());
        System.out.println("Pisirme Suresi: " + kebapTarifi.getPisirmeSuresi());
        System.out.println("Kisi Sayisi: " + kebapTarifi.getKisiSayisi());

        kebapTarifi.dogra();
        kebapTarifi.hazirla();
        kebapTarifi.pisir();
        kebapTarifi.servisYap();

=======
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen hava sıcaklığını giriniz!");
        int sicaklik = scn.nextInt();

        if (sicaklik < 5) {
            System.out.println("Hava kayak yapmak için çok uygun:)");
        } else if (sicaklik < 15) {
            System.out.println("Hava tiyatroya gitmek için çok uygun:)");
        } else if (sicaklik < 25) {
            System.out.println("Hava mangal yakmak için çok uygun:)");
        } else {
            System.out.println("Hava yüzmek için çok uygun:)");
        }
>>>>>>> 7498852 (ilk)
    }
}