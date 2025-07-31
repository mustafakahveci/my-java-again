package temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class practice5 {
    /*
    Dairenin Alanını ve Çevresini Hesaplayan Program

    Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
    Alan Formülü : π * r * r;
    Çevre Formülü : 2 * π * r;

    Ödev
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
    𝜋 sayısını = 3.14 alınız.
    Formül : (𝜋 * (r*r) * 𝛼) / 360
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double yaricap,alan,cevre, pi = 3.14;
        System.out.println("Dairenin yarıçapını giriniz : ");
        yaricap = sc.nextDouble();
        cevre = 2 * yaricap * pi;
        alan = pi * yaricap * yaricap;
        System.out.println("Dairenin alanı = " + alan);
        System.out.println("Dairenin çevresi = " + cevre);

        int merkezAci;
        System.out.println("Daire diliminin merkez açısını giriniz : ");
        merkezAci = sc.nextInt();
        double daireDilimiAlani;
        daireDilimiAlani = (pi * yaricap * yaricap * merkezAci) / 360;
        System.out.println("Daire diliminin alanı : " + daireDilimiAlani);

    }
}
