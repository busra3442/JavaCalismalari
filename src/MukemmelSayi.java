public class MukemmelSayi {
        public static void main(String[] args) {
            //kendinden başka pozitif bölenlerinin toplamı kendine eşit olan sayıya mükemmel sayı denir
            //6:1,2,3
            //28:1,2,4,7,14
            int number = 28;
            int total = 0;

            for(int i = 1; i<number; i++){
                if(number % i == 0){
                    total = total + i;
                }
            }
            if(total == number){
                System.out.println("Mükemmel sayı");
            }
            else{
                System.out.println("Mükemmel sayı değil!");
            }
        }
    }


