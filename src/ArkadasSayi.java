 public class ArkadasSayi {
        public static void main(String[] args) {
            //220-284
            //1 den başlayıp 220 ye kadar 220 yi bölen tüm pozitif tam sayıların toplamı 284 ü verecek
            //aynı şey 284 için de geçerli ise bu sayılara arkadaş sayılar denir
            int number1 = 220;
            int number2 = 284;
            int total1 = 0;
            int total2 = 0;

            for(int i = 1; i<number1; i++){
                if(number1 % i == 0 ){
                    total1 = total1 + i;
                }
            }
            for(int i = 1; i<number1; i++){
                if(number2 % i == 0 ){
                    total2 = total2 + i;
                }
            }
            if(number1 == total2 && number2 == total1){
                System.out.println("Arkadaş sayılar");
            }
            else{
                System.out.println("Arkadaş sayı değiller");
            }

        }
    }

