package temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class homework2 {
    /*
    Manav Kasa Programı

    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine
     göre toplam tutarını ekrana yazdıran programı yazın.

    Meyveler ve KG Fiyatları
    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
     */

    public static void main(String[] args) {
        double armutPrice = 2.14 , armutKg;
        double elmaPrice = 3.67 , elmaKg;
        double domatesPrice = 1.11 , domatesKg;
        double muzPrice = 0.95 , muzKg;
        double patlicanPrice = 5.0 , patlicanKg;
        double tutar;

        Scanner sc = new Scanner(System.in);

        System.out.println("Kaç kg armut aldınız ? ");
        armutKg = sc.nextDouble();

        System.out.println("Kaç kg elma aldınız ? ");
        elmaKg = sc.nextDouble();

        System.out.println("Kaç kg domates aldınız ? ");
        domatesKg = sc.nextDouble();

        System.out.println("Kaç kg muz aldınız ? ");
        muzKg = sc.nextDouble();

        System.out.println("Kaç kg patlıcan aldınız ? ");
        patlicanKg = sc.nextDouble();

        tutar = (armutPrice * armutKg) + (muzPrice * muzKg) + (elmaPrice * elmaKg) +
                (domatesPrice * domatesKg) + (patlicanPrice * patlicanKg);

        System.out.println("Ödemeniz gereken tutar : " + tutar);

    }
}
