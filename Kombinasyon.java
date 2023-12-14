import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args) {

        int islem1 =1, islem2=1, islem3=1;
        int sonuc;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir n değeri girin: ");
        int n = scanner.nextInt();

        System.out.print("Bir r değeri girin: ");
        int r = scanner.nextInt();


        System.out.println("girdiğiniz değerlerin kombinasyonu:");
        for (int a = 1; a <= n; a++) {
            islem1*=a;

        }
        for (int b = 1; b <= r; b++) {
           islem2*=b;
        }
        for (int c = 1; c<= n-r; c++ ){
            islem3*=c;
        }


        sonuc = islem1 / (islem2*islem3);
        System.out.println(sonuc);

    }
}

