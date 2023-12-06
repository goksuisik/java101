package Giris;

import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {

        int r;
        double a;

        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin Yarı Çapını Giriniz :");
        r = inp.nextInt();

        System.out.println("Merkez Açı Ölçüsünü Giriniz :");
        a = inp.nextDouble();

        double daireDilimAlani = (Math.PI*(r*r)*a);
        System.out.println("Daire Dilim Alanı :" + daireDilimAlani);






    }
}
