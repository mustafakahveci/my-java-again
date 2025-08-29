package loops;

import java.util.Scanner;

public class practice3 {
    /*
    Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

    Ödev
    Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayıyı giriniz : ");
        int sayi = scanner.nextInt();

        for (int i = 0; i < sayi; i++) {
            System.out.println(Math.pow(2,i));
        }
        System.out.println("-----------------------------------------");
        for (int i = 0; i < sayi; i++) {
            System.out.println(Math.pow(4,i));
        }
        System.out.println("-----------------------------------------");
        for (int i = 0; i < sayi; i++) {
            System.out.println(Math.pow(5,i));
        }
    }
}
