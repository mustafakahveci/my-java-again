package conditionalStatements;

import java.util.Objects;
import java.util.Scanner;

public class practice2 {
    /*
    Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
     eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre ile
      aynı olmaması gerektiğini kontrol edip, şifreler aynı ise ekrana "Şifre oluşturulamadı,
       lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
     */
    public static void main(String[] args) {
        final String kayitliKullanici = "Mustafa";
        String kayitliSifre = "123456"; // kayıtlı (doğru) şifre

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        String kullaniciAdi = scanner.next();

        System.out.print("Şifrenizi giriniz: ");
        String girilenSifre = scanner.next();

        if (kullaniciAdi.equals(kayitliKullanici) && girilenSifre.equals(kayitliSifre)) {
            System.out.println("Başarıyla giriş yaptınız.");
        } else {
            System.out.println("Hatalı kullanıcı adı veya şifre...");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (Y/y): ");
            String cevap = scanner.next();

            if (cevap.equalsIgnoreCase("y")) {
                System.out.print("Yeni şifreyi giriniz: ");
                String yeniSifre = scanner.next();

                // Kritikteki düzeltme: yeni şifre kayıtlı şifreyle aynı olamaz
                if (yeniSifre.equals(kayitliSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    kayitliSifre = yeniSifre; // (örnek için) şifreyi güncelledik
                    System.out.println("Şifre oluşturuldu. Yeni şifre = " + kayitliSifre);
                }
            } else {
                System.out.println("Program sonlandırıldı.");
            }
        }
    }
}
