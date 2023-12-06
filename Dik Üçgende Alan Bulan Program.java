import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {

        int a,b,c;

        Scanner inp =  new Scanner(System.in);
        System.out.println("1.Kenarın değerini giriniz : ");
        a = inp.nextInt();

        System.out.println("2.Kenarın değerini giriniz : ");
        b = inp.nextInt();

        System.out.println("3.Kenarın değerini giriniz :");
        c = inp.nextInt();

        double ucgeninCevresiBolu2 = ( a + b + c ) / 2;
        double alan = Math.sqrt(ucgeninCevresiBolu2*( ucgeninCevresiBolu2 - a )*(ucgeninCevresiBolu2-b)*(ucgeninCevresiBolu2-c));
        System.out.println("Üçgenin Alanı : " + alan);



    }
}
