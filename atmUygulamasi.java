import java.util.Scanner;
public class atmUygulamasi {
    public static void main(String[] args) {
        //Enes Ak İBAN : TR1234 000 567 985 345 6572 23 45(1.hesap)
        //Bilal Çevik İBAN : TR1265 0780 127 985 345 7572 13 89(2.hesap)
        //enesin kullanıcı adı ve şifresi : enes55  ve 456
        //bilalin kullanıcı adı ve şifresi : bilal12 ve 123
        /*
         *Bakiye görüntülemek için --> 1
         *Para çekmek için --> 2
         *Farklı hesaba para yatırmak için ---> 3
         *Uygulamadan çıkmak için --> 4 tuşuna basınız...
         */
        double enesBakiye = 1250;
        String enesIban = "TR1234 000 567 985 345 6572 23 45";
        String enesKullanici = "enes55";
        String enesSifre = "456";

        double bilalBakiye = 500;
        String bilalIban = "TR1265 0780 127 985 345 7572 13 89";
        String bilalKullanici = "bilal12";
        String bilalSifre = "123";

        String islemSecenekleri = "İŞLEMLER \n BAKİYE GÖRÜNTÜLEME-->1 \t\t\t PARA ÇEKME-->2 \n BAŞKA HESABA PARA YATIRMA-->3 \t\t\t ÇIK-->4 ";

        Scanner scn = new Scanner(System.in);
        System.out.println("***ATM UYGULAMSINA HOŞGELDİNİZ***");
        System.out.println("***************************");
        System.out.println("Lütfen işlem yapmak istediğiniz hesabın kullanıcı adını ve şifresini giriniz: ");
        System.out.print("Kullanıcı adı: ");
        String kullaniciAdi = scn.nextLine();
        System.out.print("Kullanıcı şifresi: ");
        String kullaniciSifre = scn.nextLine();
        if (kullaniciAdi.equals("enes55") && kullaniciSifre.equals("456")) {
            System.out.println("Enes Ak hesabına giriş yapıldı!");
            System.out.println("Lütfen yapmak istediğiniz işlemi seçin");
            System.out.println(islemSecenekleri);
            String secim = scn.nextLine();

            switch (secim) {
                case "1":
                    System.out.println("Bakiyeniz: " + enesBakiye);
                    break;
                case "2":
                    System.out.println("Çekmek istediğiniz para tutarını giriniz: ");
                    int cekilecekTutar = scn.nextInt();
                    if (enesBakiye >= cekilecekTutar)
                    {
                        enesBakiye -= cekilecekTutar;
                        System.out.println("Bakiyenizde kalan: " + enesBakiye);
                    } else
                        System.out.println("Bakiyenizden fazla para çekemezsiniz!");
                    break;
                case "3":
                    System.out.println("Ne kadar para yatırmak istiyorsunuz: ");
                    int yatirilacakTutar = scn.nextInt();
                    if (yatirilacakTutar <= enesBakiye) {
                        System.out.print("İBAN giriniz: ");
                        scn.nextLine();
                        String yatirilacakIban = scn.nextLine();
                        if (yatirilacakIban.equals(bilalIban)) {
                            System.out.println("Para Bilal Çevik adlı kişiye yatırılıyor...");
                            enesBakiye -= yatirilacakTutar;
                            bilalBakiye += yatirilacakTutar;
                            System.out.print("Kalan bakiyeniz: " + enesBakiye);
                        }
                    }
                    break;
                case "4" :
                    System.out.println("UYGULAMADAN ÇIKILDI!");break;


            }

        }
        else if (kullaniciAdi.equals("bilal12") && kullaniciSifre.equals("123"))
        {
            System.out.println("Bilal Çevik hesabına giriş yapıldı!");
            System.out.println(islemSecenekleri);
            System.out.println("Lütfen yapmak istediğiniz işlemi seçin");
            String secim = scn.nextLine();

            switch (secim) {
                case "1":
                    System.out.print("Bakiyeniz: " + bilalBakiye);
                    break;
                case "2":
                    System.out.print("Çekmek istediğiniz para tutarını giriniz: ");
                    int cekilecekTutar = scn.nextInt();
                    if (bilalBakiye >= cekilecekTutar)
                    {
                        bilalBakiye -= cekilecekTutar;
                        System.out.print("Bakiyenizde kalan: " + bilalBakiye);
                    } else
                        System.out.println("Bakiyenizden fazla para çekemezsiniz!");
                    break;
                case "3":
                    System.out.println("Ne kadar para yatırmak istiyorsunuz: ");
                    int yatirilacakTutar = scn.nextInt();
                    if (yatirilacakTutar <= bilalBakiye)
                    {
                        System.out.print("İBAN giriniz: ");
                        scn.nextLine();
                        String yatirilacakIban = scn.nextLine();
                        if (yatirilacakIban.equals(enesIban))
                        {
                            System.out.println("Para Enes Ak adlı kişiye yatırılıyor...");
                            bilalBakiye -= yatirilacakTutar;
                            enesBakiye += yatirilacakTutar;
                            System.out.print("Kalan bakiyeniz: " + bilalBakiye);
                        }
                        break;
                    }
            }
        }
        else
        {
            System.out.println("KULLANICI ADINIZ VEYA ŞİFRENİZ HATALI!!!");
        }


    }

}