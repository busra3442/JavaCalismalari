import java.util.Scanner;

public class vizeFinal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen vize notunuzu giriniz: ");
        int vizeNotu = scn.nextInt();
        System.out.println("Lütfen final notunu giriniz: ");
        int finalNotu = scn.nextInt();
        double durum = ((vizeNotu * 0.4) + (finalNotu * 0.6));
        System.out.println("Dersinizin ortalaması: " + durum);
        if (durum > 50) {
            System.out.println("Tebrikler dersten geçtiniz");
        } else if ((durum < 50) || (finalNotu < 50)) {
            System.out.println("Maalesef dersten kaldınız");
        }
    }
}