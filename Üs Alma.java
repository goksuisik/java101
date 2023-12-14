import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args) {

        int n,k;

        Scanner inp = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz: ");
        n = inp.nextInt();

        System.out.println("Üs alınacak sayıyı giriniz");
        k = inp.nextInt();

        int total = 1;

        for (int i =1; i <= k; i++){
            total *= n;
        }

        System.out.println(total);

    }
}

