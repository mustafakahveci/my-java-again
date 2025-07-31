package temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class practice2 {

    public static void main(String[] args) {

        /*
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        (Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;
         */

        double deger;
        Scanner scanner = new Scanner(System.in);

        System.out.println("KDV'siz değeri giriniz : ");
        deger = scanner.nextDouble();

        double kdvliDeger = deger = deger + (deger * (0.18));
        System.out.println("KDV'li tutar = " + kdvliDeger);


    }
}
