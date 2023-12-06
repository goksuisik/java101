import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {

        double tutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = inp.nextDouble();

        double kdvOrani = (tutar > 1000) ? 0.08 : 0.18;

        double kdvTutari = tutar * kdvOrani;
        double  kdvliTutar = tutar + kdvTutari;

        System.out.println("KDV Oranı :" + kdvTutari);
        System.out.println("Toplam Tutarınız :" + kdvliTutar);


    }
}
