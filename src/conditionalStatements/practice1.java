package conditionalStatements;

import java.util.Scanner;

public class practice1 {
    /*
    switch-case kullanarak basit hesap makinesi
     */

    public static void main(String[] args) {
        int sayi1,sayi2;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz :");
        sayi1 = sc.nextInt();
        System.out.println("2. sayıyı giriniz : ");
        sayi2 = sc.nextInt();

        int islem;
        System.out.println("Yapacağınız işlemi seçiniz...\n" +
                "1- toplama\n" +
                "2- çıkarma\n" +
                "3- çarpma\n" +
                "4- bölme\n");
        islem = sc.nextInt();

        switch (islem){
            case 1:
                System.out.println("Sonuç : " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Sonuç : " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Sonuç : " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Sonuç : " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız...");
        }

    }
}
