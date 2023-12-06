package Giris;

import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        // değişkenleri oluştur:
        int matematik,fizik,kimya,turkce,tarih,muzik;

        // scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam =  (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0 ;
        System.out.println("Ortalamanız : " + sonuc);

        System.out.println(sonuc < 60 ? "Sınıfta Kaldı" : "Sınıfı Geçti");

    }
}
