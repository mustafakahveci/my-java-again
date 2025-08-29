package conditionalStatements;

import java.util.Scanner;

public class homework2 {
    /*
    Ödev - Çin Zodyağı Hesaplama
    Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

    Çin Zodyağı nedir?
    4000 bin yıldır kullanılan bir astroloji çeşididir.
     Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
      Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde)
       sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

    Çin Zodyağı nasıl hesaplanır?
    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

    Doğum Tarihi %12 = 0 ➜ Maymun
    Doğum Tarihi %12 = 1 ➜ Horoz
    Doğum Tarihi %12 = 2 ➜ Köpek
    Doğum Tarihi %12 = 3 ➜ Domuz
    Doğum Tarihi %12 = 4 ➜ Fare
    Doğum Tarihi %12 = 5 ➜ Öküz
    Doğum Tarihi %12 = 6 ➜ Kaplan
    Doğum Tarihi %12 = 7 ➜ Tavşan
    Doğum Tarihi %12 = 8 ➜ Ejderha
    Doğum Tarihi %12 = 9 ➜ Yılan
    Doğum Tarihi %12 = 10 ➜ At
    Doğum Tarihi %12 = 11 ➜ Koyun
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogumYili;
        System.out.println("Doğum yılınızı giriniz : ");
        dogumYili = scanner.nextInt();

        int kalan = dogumYili % 12;

        switch (kalan){
            case 0 :
                System.out.println("Zodyak burcunuz: Maymun");
                break;
            case 1 :
                System.out.println("Zodyak burcunuz: Horoz");
                break;
            case 2 :
                System.out.println("Zodyak burcunuz: Köpek");
                break;
            case 3 :
                System.out.println("Zodyak burcunuz: Domuz");
                break;
            case 4 :
                System.out.println("Zodyak burcunuz: Fare");
                break;
            case 5 :
                System.out.println("Zodyak burcunuz: Öküz");
                break;
            case 6 :
                System.out.println("Zodyak burcunuz: Kaplan");
                break;
            case 7 :
                System.out.println("Zodyak burcunuz: Tavşan");
                break;
            case 8 :
                System.out.println("Zodyak burcunuz: Ejderha");
                break;
            case 9 :
                System.out.println("Zodyak burcunuz: Yılan");
                break;
            case 10 :
                System.out.println("Zodyak burcunuz: At");
                break;
            case 11 :
                System.out.println("Zodyak burcunuz: Koyun");
                break;

        }

    }
}
