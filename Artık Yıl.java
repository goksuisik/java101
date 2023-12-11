import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args) {

        int year;

        Scanner inp = new Scanner(System.in);
        System.out.println("Yıl giriniz :");
        year = inp.nextInt();

        if (year % 4 == 0 ){
            System.out.println(year + " " + "bir artık yıldır !");
        }else {
            System.out.println(year + " " + "bir artık yıl değildir !");
        }

    }
}

