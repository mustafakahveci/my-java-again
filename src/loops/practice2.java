package loops;

import java.util.Scanner;

public class practice2 {
    /*
    Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
    girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

    Ödev
    Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
    girilen değerlerden 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //pratik
        int sum = 0;
        while (true){
            System.out.println("Sayı giriniz : ");
            int sayi = scanner.nextInt();
            if(sayi < 0 ){
                break;
            }
            if(sayi % 2 == 1){
                sum+=sayi;
            }
        }
        System.out.println("Girilen değerlerin toplamı = " + sum);


        //ÖDEV
        int sum2 = 0;
        while (true){
            System.out.println("Sayı giriniz :");
            int sayi2 = scanner.nextInt();
            if( sayi2 % 2 == 1){
                break;
            }
            if( sayi2 % 4 == 0){
                sum2+=sayi2;
            }
        }
        System.out.println("Girilen sayılardan 4'ün katı olanları toplamı = "+ sum2);

    }

}
