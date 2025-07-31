package temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class homework1 {
    /*
    Vücut Kitle İndeksi Hesaplama

    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
    Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Formül
    Kilo (kg) / Boy(m) * Boy(m)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kg;
        double bmi,boy;
        System.out.println("Boyunuzu giriniz (m) : ");
        boy = sc.nextDouble();
        System.out.println("Kilonuzu giriniz (kg) : ");
        kg = sc.nextInt();
        bmi = (double) kg / (boy*boy);
        System.out.println("Vücut kitle indeksiniz : " + bmi);
        
    }
}
