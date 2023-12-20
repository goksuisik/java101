import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        for (int i = sayi; i > 0; i /= 10) {
            toplam += i % 10;
        }

        System.out.println("Girilen sayının basamak sayılarının toplamı: " + toplam);

    }
}

