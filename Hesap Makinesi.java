package Giris;

import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args) {

        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz");
        n1 = input.nextInt();

        System.out.println("İkinci Sayıyı Giriniz");
        n2 = input.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.println("Seçiminizi yazınız :");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama :" + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma :" + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma :" + (n1*n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Bir sayı 0'a bölünemez!");
                    break;
                }
                System.out.println("Bölme: " + (n1/n2));
                break;
            default:
                System.out.println("Yapmak istediğiniz işlem yanlıştır. Lütfen tekrar deneyiniz.");
        }
        System.out.println("Program bitmiştir.");
    }
}
