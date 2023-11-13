import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;

        System.out.print("Kullanıcı adı giriniz: ");
        username = input.nextLine();

        System.out.print("Şifre giriniz: ");
        password = input.nextLine();
        if (username.equals("patika")){
            if (password.equals("java123")){
                System.out.println("Sisteme hoşgeldiniz.");
            }else{
                System.out.println("Şifreniz hatalı. yeni bir şifre belirlemek ister misiniz? \n Evet = 1 , Hayır = 0 ");
                int karar;
                karar = input.nextInt();
                input.nextLine();
                if (karar == 1){
                    System.out.println("Yeni Şifre:");
                    password = input.nextLine();
                    System.out.println("Yeni Şifreniz: " + password);
                } else if(karar == 0){
                    System.out.println("İyi günler");
                }else{
                    System.out.println("Tanımsız bir karakter girildi.");
                }
            }
        }else{
            System.out.println("Kullanıcı adınız yanlış.");
        }


    }
}