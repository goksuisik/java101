import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args) {

        String userName, password, newPassword;

        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanıcı Adınızı Giriniz:");
        userName = inp.nextLine();

        System.out.println("Şifrenizi Giriniz:");
        password = inp.nextLine();

        if (userName.equals("Patika") && password.equals("java123")) {
            System.out.println("Sisteme giriş yaptınız !");
        } else if (userName.equals("Patika") && !(password.equals("java123"))) {
            System.out.println("Şifreniz yanlıştır ! Şifrenizi sıfırlamak ister misiniz ? \n Seçiminiz : Evet/Hayır");
            String select = inp.nextLine();

            if (select.equals("Evet")) {
                System.out.println("Yeni şifreniz hatalı girdiğiniz ve unuttuğu şifre ile aynı olmamalı! Yeni şifrenizi giriniz:");
                newPassword = inp.nextLine();

                if (!newPassword.equals(password)) {
                    if (!newPassword.equals("java123")) {
                        System.out.println("Yeni şifre başarıyla oluşturulmuştur.");
                    } else {
                        System.out.println("Yeni şifreniz eski şifreniz ile aynı olamaz!");
                    }
                } else {
                    System.out.println("Yeni şifreniz, eski şifrenizle aynı olamaz!");
                }

            } else if (select.equals("Hayır")) {
                System.out.println("Giriş yapılamamıştır.");
            }
        }
    }
}

