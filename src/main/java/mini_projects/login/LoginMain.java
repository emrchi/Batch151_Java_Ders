package mini_projects.login;

import mini_projects.UserSevice;

import java.util.Scanner;

public class LoginMain {

    public static void main(String[] args) {

        start();

    }

    public static void start(){
        Scanner scanner = new Scanner(System.in);
        UserSevice userSevice = new UserSevice();
        int select = 0;
        do{
            userSevice.showMenu();
            scanner.nextInt();
            switch(select){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Iyi Gunler Dileriz");
                    break;
                default:
                    System.out.println("Hatali Giris Yaptiniz. Yeniden deneyiniz.");
            }
        }while (select!=3);

    }


}
