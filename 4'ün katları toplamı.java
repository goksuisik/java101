package Giris;

import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args) {


        int k;
        int total = 0;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Sayı giriniz : ");
            k = inp.nextInt();
            if (k % 4 == 0) {
                total += k;
            }

        }while (k % 2 != 1);
        System.out.println("Sayıların toplamı :" + total);

    }
}

