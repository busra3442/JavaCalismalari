import java.util.Scanner;

public class haftaninHangiGunu {
    public static void main(String[] args) {
        //haftanın günlerini switch case ile bulma uygulaması
        Scanner scn = new Scanner (System.in);
        System.out.println("****HAFTANIN GÜNLERİNİ BULMA PROGRAMINA HOŞGELDİNİZ****");
        System.out.println("Lütfen bulmak istediğiniz günün sayısını giriniz: ");
        int gun = scn.nextInt();
        switch(gun)
        {
            case 1:
                System.out.println("Pazartesi");break;
            case 2:
                System.out.println("Salı");break;
            case 3:
                System.out.println("Çarşamba");break;
            case 4:
                System.out.println("Perşembe");break;
            case 5:
                System.out.println("Cuma");break;
            case 6:
                System.out.println("Cumartesi");break;
            case 7:
                System.out.println("Pazar");break;
            default:
                System.out.println("Haftanın gününe uygun bir sayı girmediniz!");
        }
    }
}
