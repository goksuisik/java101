package Giris;

import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args) {

        double mesafe, fiyat;
        int yolculukTipi, yas;

        Scanner inp = new Scanner(System.in);
        System.out.println("KM Cinsinden mesafenizi giriniz :");
        mesafe = inp.nextDouble();

        System.out.println("Yaşınızı giriniz :");
        yas =inp.nextInt();

        System.out.println("Yolculuk tipinizi giriniz : 1.Tek Yön / 2.Gidiş-Dönüş ");
        yolculukTipi = inp.nextInt();

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            fiyat = 0.10 * mesafe;
            if (yas < 12) {
                fiyat *= 0.5;
            } else if (yas < 25) {
                fiyat *= 0.9;
            } else if (yas > 65) {
                fiyat *= 0.7;
            }
            if(yolculukTipi == 2){
                fiyat *= 0.8;
                fiyat *= 2;
            }
            System.out.println("Total Price: " + fiyat + " TL");
        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }



    }
}

