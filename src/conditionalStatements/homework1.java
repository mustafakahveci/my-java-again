package conditionalStatements;

import java.util.Scanner;

public class homework1 {
    /*
    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
    Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
    Mesafe başına ücret 0,10 TL / km olarak alın.
    İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre
    müşteriye aşağıdaki indirimleri uygulayın ;

    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
    yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !"
    şeklinde bir uyarı verilmelidir.

    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int km, yas ,yolculukTipi;
        double tutar;

        System.out.println("Kaç kilometre yol gideceksiniz ? ");
        km = scanner.nextInt();
        while (km <= 0){
            System.out.println("Kilometre değeri 0'dan büyük olmalıdır.");
            km = scanner.nextInt();
        }

        System.out.println("Kaç yaşındasınız ? ");
        yas = scanner.nextInt();
        while (yas <= 0 ){
            System.out.println("Yaş değeri 0'dan büyük olmalıdır.");
            yas = scanner.nextInt();
        }

        System.out.println("Yolculuk tipini giriniz : (1 => Tek yön , 2 => Gidiş-Dönüş)");
        yolculukTipi = scanner.nextInt();
        while (yolculukTipi != 1 && yolculukTipi != 2){
            System.out.println("Yolculuk tipi için hatalı değer girdiniz. Tekrar giriniz. ( 1 veya2 )");
            yolculukTipi = scanner.nextInt();
        }

        tutar = km * 0.1;

        if(yas < 12 ){
            tutar = tutar / 2;
        }else if (yas < 25){
            tutar = tutar * 0.9;
        }else if( yas > 65){
            tutar = tutar * 0.7;
        }

        if(yolculukTipi == 2 ){
            tutar = tutar * 0.8 * 2 ;
        }


        System.out.println("Ödemeniz gereken tutar : " + tutar);



    }
}
