import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args) {

        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz :");
        heat = input.nextInt();

        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat >= 5 && heat < 15) {
            System.out.println("Sinemaya Gidebilirsin.");
        } else if (heat == 15) {
            System.out.println("Sinemaya ya da pikniğe gidebilirsin.");
        }
        else if (heat> 15 && heat < 25) {
            System.out.println("Pikniğe Gidebilirsin.");
        }
        else if (heat == 25) {
            System.out.println("Pikniğe ya da yüzmeye gidebilirsin.");
        }
        else if (heat>25){
            System.out.println("Yüzmeye Gidebilirsin.");
        }


    }
}

