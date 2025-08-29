package loops;

import java.util.Scanner;

public class practice1 {
    /*
    Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

    Ödev
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
     3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //PRATİK
        System.out.println("Sayıyı giriniz : ");
        int sayi = scanner.nextInt();

        for (int i = 0; i < sayi; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        //ÖDEV
        int toplam = 0;
        int adet = 0;
        for (int i = 1; i < sayi; i++) {
            if(i % 3 == 0 || i % 4 == 0){
                toplam+=i;
                adet++;
            }
        }

        double ortalama = (double) toplam / adet;

        System.out.println("Sayıların ortalaması : " + ortalama);


    }
}
