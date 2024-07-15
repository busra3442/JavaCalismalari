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

    }
}