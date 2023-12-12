import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args) {


        int k;
        int toplam = 0;
        int sayac = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı giriniz : ");
        k = inp.nextInt();

        for (int i = 0; i<= k; i++){
            if (i % 3 == 0 && i % 4 == 0){
                toplam+= i;
                sayac++;
                System.out.println(i);
            }
        }
        double ortalama = (double )toplam / sayac;
        System.out.println("Sayıların ortalaması :" + ortalama);



    }
}


