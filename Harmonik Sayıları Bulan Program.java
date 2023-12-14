import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args) {

        double n;

        Scanner inp = new Scanner(System.in);
        System.out.print("N DEĞERİNİ GİRİNİZ : ");
        n = inp.nextDouble();

        double result = 0;

        for (double i =1; i <= n; i++){
            result += 1/i;
        }

        System.out.println(result);

    }
}

