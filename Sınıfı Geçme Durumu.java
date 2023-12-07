package Giris;

import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz :");
        mat = inp.nextInt();
        
        System.out.println("Fizik notunuzu giriniz :");
        fizik = inp.nextInt();

        System.out.println("Türkçe notunuzu giriniz :");
        turkce = inp.nextInt();

        System.out.println("Kimya notunuzu giriniz :");
        kimya = inp.nextInt();

        System.out.println("Müzik notunuzu giriniz :");
        muzik = inp.nextInt();
        
        double avarage = (mat+fizik+turkce+kimya+muzik)/5 ;
        
        if (avarage >= 55 ){
            System.out.println("Sınıfı geçtiniz. Tebrik ederiz! Ortalamanız :" + avarage);
        }else {
            System.out.println("Sınıfta kaldınız. Ortalamanız :" + avarage);
        }
    }
}

