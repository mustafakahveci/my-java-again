package temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class practice1 {

    /*
    Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
     kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

     Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının
      ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
    */

    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        double ortalama;

        Scanner sc = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = sc.nextInt();

        System.out.println("Fizik notunuz : ");
        fizik = sc.nextInt();

        System.out.println("Kimya notunuz : ");
        kimya = sc.nextInt();

        System.out.println("Türkçe notunuz : ");
        turkce = sc.nextInt();

        System.out.println("Tarih notunuz : ");
        tarih = sc.nextInt();

        System.out.println("Müzik notunuz : ");
        muzik = sc.nextInt();

        ortalama = (mat+fizik+kimya+turkce+tarih+muzik) / 6.0;
        System.out.println("Ortalamanız = "+ ortalama);



    }









}
