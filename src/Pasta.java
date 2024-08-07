public class Pasta extends YemekTarifi implements ITatliTarifi {

    private String tatliTur;
    private String malzemeler;

    public Pasta(String yemekAdi, int pisirmeSuresi, int kisiSayisi, String tatliTur, String malzemeler) {
        super(yemekAdi, pisirmeSuresi, kisiSayisi);
        this.tatliTur = tatliTur;
        this.malzemeler = malzemeler;
    }

    public String getTatliTur() {
        return tatliTur;
    }

    public String getMalzemeler() {
        return malzemeler;
    }

    @Override
    public void cirpma() {
        System.out.println("Pasta cirpiliyor...");

    }

    @Override
    public void hazirla() {
        System.out.println("Pata hazirlaniyor...");

    }

    @Override
    public void pisir() {
        System.out.println("Pasta pisiriliyor...");

    }

    @Override
    public void servisYap() {
        System.out.println("Pasta servis ediliyor...");

    }
}
