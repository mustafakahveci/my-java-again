package temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class practice4 {
    /*
    Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.
     */

    public static void main(String[] args) {
        double perKmPrice = 2.20, km,price;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç km gittiniz? : ");
        km = scanner.nextDouble();

        price = 10 + (perKmPrice * km);

        if(price > 20){
            System.out.println("Ödenecek tutar : " + price);
        }
        else{
            System.out.println("Ödenecek tutar : "+ 20);
        }

    }

}
