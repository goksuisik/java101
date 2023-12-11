import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args) {

        int month,day;

        Scanner inp = new Scanner(System.in);
        System.out.println("Doğduğunuz ayı yazınız :");
        month = inp.nextInt();

        System.out.println("Doğduğunuz günü yazınız :");
        day = inp.nextInt();


                if ( month == 1 && (day >= 1 && day <= 31)){
                    if (day<22){
                        System.out.println("Oğlak Burcu");
                    }else {
                        System.out.println("Kova Burcu");
                    }
                }
                
                else if ( month == 2 && (day>=1   && day <=29 )){
                    if (day<20){
                        System.out.println("Kova Burcu");
                    }else {
                        System.out.println("Balık Burcu");
                    }
                }
                
                else if ( month == 3 && (day>=1   && day <=21)){
                    if (day<21){
                        System.out.println("Balık Burcu");
                    }else {
                        System.out.println("Koç Burcu");
                    }
                }

                else if ( month == 4 &&(day>=1   && day <=30 )){
                    if (day<21){
                        System.out.println("Koç Burcu");
                    }else {
                        System.out.println("Boğa Burcu");
                    }
                }
                
                else if ( month == 5 &&(day>=1   && day <=31 )){
                    if (day<22){
                        System.out.println("Boğa Burcu");
                    }else {
                        System.out.println("İkizler Burcu");
                    }
                }

                else if ( month == 6 &&(day>=1   && day <=30 )){
                    if (day<23){
                        System.out.println("İkizler Burcu");
                    }else {
                        System.out.println("Yengeç Burcu");
                    }
                }

                else if ( month == 7 &&(day>=1   && day <=31 )){
                    if (day<23){
                        System.out.println("Yengeç Burcu");
                    }else {
                        System.out.println("Aslan Burcu");
                    }
                }

                else if ( month == 8 &&(day>=1   && day <=31 )){
                    if (day<23){
                        System.out.println("Aslan Burcu");
                    }else {
                        System.out.println("Başak Burcu");
                    }
                }
                
                else if ( month == 9 &&(day>=1   && day <=30 )){
                    if (day<23){
                        System.out.println("Başak Burcu");
                    }else {
                        System.out.println("Terazi Burcu");
                    }
                }
                
                else if ( month == 10 &&(day>=1   && day <=31 )){
                    if (day<23){
                        System.out.println("Terazi Burcu");
                    }else {
                        System.out.println("Akrep Burcu");
                    }
                }
                
                else if ( month == 11 &&(day>=1   && day <=30 )){
                    if (day<22){
                        System.out.println("Akrep Burcu");
                    }else {
                        System.out.println("Yay Burcu");
                    }
                }

                else if ( month == 12 &&(day>=1   && day <=31 )){
                    if (day<22){
                        System.out.println("Yay Burcu");
                    }else {
                        System.out.println("Oğlak Burcu");
                    }
                }

                else {
                    System.out.println("Geçersiz bir gün girişi yaptınız.");
                }

    }
}

