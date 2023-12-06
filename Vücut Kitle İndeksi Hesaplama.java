import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {

        double boy, kg;

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = inp.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        kg = inp.nextDouble();

        double indeks = kg/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz :" +indeks);


    }
}
