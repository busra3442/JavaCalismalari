import java.util.Scanner;
public class vucutKitleEndeksi{
public static void main(String[] args) {
        int boy = 0;
        double kilo = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("*****KİTLE ENDEKS PROGRAMINA HOŞGELDİNİZ!*****");
        System.out.println("Lütfen boyunuzu santim cinsinden giriniz:");
        boy = scn.nextInt();
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz:");
        kilo = scn.nextDouble();
        // kilo(kg) /((boy(cm))/100) karesi)
        double vke = 0;
        double cmToMetre = (double) boy / 100;
        double boyunKaresi = Math.pow(cmToMetre, 2);
        vke = kilo / boyunKaresi;
        System.out.println("Bulunan vücut kitle edneksi: " + vke);
        if (vke < 15)
        {
        System.out.println("Çok ciddi derecede düşük kilolu");
        } else if (vke > 15 && vke < 16)
        {
        System.out.println("Ciddi derecede düşük kilolu");
        } else if (vke > 16 && vke < 18.5)
        {
        System.out.println("Düşük kilolu");
        } else if (vke > 16 && vke < 25)
        {
        System.out.println("Normal(sağlıklı)kilolu");
        } else if (vke > 25 && vke < 30)
        {
        System.out.println("Fazla kilolu");
        } else if (vke > 30 && vke < 35)
        {
        System.out.println("Birinci dereceden hafif obez");
        } else if (vke > 35 && vke < 40)
        {
        System.out.println("2. dereceden (ciddi) obez ");
        } else if (vke > 40)
        {
        System.out.println("3. dereceden (çok ciddi) obez ");

        }
        }
        }
