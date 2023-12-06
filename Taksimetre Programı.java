package Giris;

import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {

        double km, total, kmPrice = 2.20, startPrice = 10;

        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç KM Yol Gittiniz ? :");
        km = inp.nextDouble();

        total = startPrice + (km*kmPrice);
        total = (total < 20 ? 20 : total);
        System.out.println("Toplam Tutar :" + total);



    }
}
