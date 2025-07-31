package temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class practice3 {

    /*
            Dik Üçgende Hipotenüs Bulan Program

            Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

            Ödev
            Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
         */

    public static void main(String[] args) {

        int kenar1,kenar2;
        double hipotenus;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. dik kenar uzunluğunu giriniz : ");
        kenar1 = sc.nextInt();

        System.out.println("2. dik kenar uzunluğunu giriniz : ");
        kenar2 = sc.nextInt();

        //karekök içinde kenar1 karesi+ kenar2 karesi
        hipotenus = Math.sqrt((Math.pow(kenar1,2) + Math.pow(kenar2,2)));

        System.out.println("hipotenüsün uzunluğu = "+ hipotenus);


    }
}
