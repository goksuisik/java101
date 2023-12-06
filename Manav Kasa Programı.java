package Giris;

import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican,total;
        double armutPrice = 2.14, elmaPrice = 3.67, domatesPrice = 1.11, muzPrice = 0.95,
                patlicanPrice = 5.00;

        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç kilo armut aldınız ? :");
        armut = inp.nextDouble();

        System.out.println("Kaç kilo elma aldınız ? :");
        elma = inp.nextDouble();

        System.out.println("Kaç kilo domates aldınız ? :");
        domates = inp.nextDouble();

        System.out.println("Kaç kilo muz aldınız ? :");
        muz = inp.nextDouble();

        System.out.println("Kaç kilo patlıcan aldınız ? :");
        patlican = inp.nextDouble();

        total = (armutPrice*armut)+(elmaPrice*elma)+(domatesPrice*domates)+(muzPrice*muz)+(patlicanPrice*patlican);
        System.out.println("Ödenecek Toplam Tutarınız : " + total);


    }
}
