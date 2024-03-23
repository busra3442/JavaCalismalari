import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        System.out.println("***BASİT HESAP MAKİNESİ PROGRAMINA HOŞGELDİNİZ***");
        Scanner scn = new Scanner(System.in);
        int sayi1,sayi2,secim;
        System.out.println("Lütfen işlem yapmak istediğiniz sayılardan ilkini giriniz: ");
        sayi1 = scn.nextInt();
        System.out.println("Lütfen işlem yapmak istediğiniz sayılardan ikincisini giriniz:");
        sayi2 = scn.nextInt();
        System.out.println("Lütfen menüden yapmak istediğiniz işlemi saçiniz:");
        System.out.println(" 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        secim = scn.nextInt();
        if(secim==1)

            System.out.println("Toplama işleminin sonucu: " + (sayi1+sayi2));

        else if(secim==2)

            System.out.println("Çıkarma işleminin sonucu: " + (sayi1-sayi2));

        else if (secim==3)

            System.out.println("Çarpma işleminin sonucu: " + (sayi1*sayi2));

        else if(secim==4)
            System.out.println("Bölme işleminin sonucu: " + (sayi1/sayi2));
        else
            System.out.println("Geçersiz bir işlem girdiniz");
    }
}