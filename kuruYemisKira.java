public class kuruYemisKira {
    public static void main(String[] args) {
        /*Bir kuru yemişçi toptancıdan;
        12 kilo leblebiyi kilosunu 3.5 TL den
        25 kilo fındığı kilosunu 15.7 TL den
        40 kilo bademi kilosunu 22 TL den almıştır
        bu ürünleri satarken
        --->leblebinin kilosunu %50 fazlasına
        --->fındığı %40 fazlasına
        --->bademi %60 fazlasına satmıştır
        kuru yemişçi o günkü kazandığı para ile dükkanın kirasını ödemek istemektedir
        kira tutarı = 500TL
        kazandığı para kirasından yüksekse kirayı ödeyebilsin değilse ödeyemesin
        */
        //fiyatlar
        double leblebi = 3.5;
        double finduk = 15.7;
        double badem = 22;
        double maliyetTutar = (leblebi*12) + (finduk*15.7) + (badem*22);
        double satisTutar = ((leblebi*1.5))*12 + ((finduk*1.4))*25 + ((badem*1.6))*40;
        double kazanc = satisTutar-maliyetTutar;
        System.out.println("Kazanç: " + kazanc);
        int kira = 500;
        if(kazanc>kira)
        {
            System.out.println("Faturayı ödeyebilir");
        }
        else if(kazanc<kira)
        {
            System.out.println("Faturayı ödeyemez");
        }


    }
}