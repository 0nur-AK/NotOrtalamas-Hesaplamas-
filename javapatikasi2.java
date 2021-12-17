
import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class javapatikasi2 {
    public static void main(String[] args) {
        //Degiskenleri olustur.
        int mat , fizik , kimya , tarih , muzik, turkce ;

        //Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        int toplam = (mat + fizik + kimya + tarih + muzik + turkce);
        double ortalama = toplam / 6.0 ;
        System.out.println("Ortalamanız : " + ortalama);

        String sonuc = (ortalama >= 60 ) ? "Geçtiniz" : "Kaldınız";
        System.out.println(sonuc);







    }
}
