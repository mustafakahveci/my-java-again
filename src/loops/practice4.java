package loops;

import java.util.Scanner;

public class practice4 {
    /*
    Java ile faktöriyel hesaplayan program yazıyoruz.

    Ödev
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı
    farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
     N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

    Java ile kombinasyon hesaplayan program yazınız.

    Kombinasyon formülü
    C(n,r) = n! / (r! * (n-r)!)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //pratik
        System.out.println("Faktöriyeli hesaplanacak sayıyı giriniz : ");
        int sayi = scanner.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        System.out.println("Girdiğiniz sayının faktöriyeli : " + sonuc);

        //ödev
        

    }
}
