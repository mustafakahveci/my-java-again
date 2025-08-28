package conditionalStatements;

import java.util.Scanner;

public class practice3 {

    /*
    Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

    Geçme Notu : 55

    Ödev
    Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
    */

    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, muzik;
        int toplamNot = 0, toplamDers = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = scanner.nextInt();
        if(  mat >= 0 && mat <= 100){
            toplamNot = toplamNot + mat;
            toplamDers++;
        }

        System.out.println("Fizik notunuz : ");
        fizik = scanner.nextInt();
        if(  fizik >= 0 && fizik <= 100){
            toplamNot = toplamNot + fizik;
            toplamDers++;
        }

        System.out.println("Kimya notunuz : ");
        kimya = scanner.nextInt();
        if(  kimya >= 0 && kimya <= 100){
            toplamNot = toplamNot + kimya;
            toplamDers++;
        }

        System.out.println("Türkçe notunuz : ");
        turkce = scanner.nextInt();
        if(  turkce >= 0 && turkce <= 100){
            toplamNot = toplamNot + turkce;
            toplamDers++;
        }

        System.out.println("Müzik notunuz : ");
        muzik = scanner.nextInt();
        if(  muzik >= 0 && muzik <= 100){
            toplamNot = toplamNot + muzik;
            toplamDers++;
        }

        double ort =  (double) toplamNot / toplamDers;

        if( ort <= 55){
            System.out.println("Sınıfta kaldınız.");
        }else{
            System.out.println("Sınıfı geçtiniz.");
        }
        System.out.println("Ortalama = " + ort);




    }
}
