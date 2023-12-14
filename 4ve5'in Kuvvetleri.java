package Giris;

import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args) {


        int n;
        int total = 0;

        Scanner inp = new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz :");
        n = inp.nextInt();

        for (int i = 1; i<=n; i*=4){
            System.out.println(i);
        }
        for (int i = 1; i<=n; i*=5){
            System.out.println(i);
        }

    }
}

