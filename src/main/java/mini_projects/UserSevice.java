package mini_projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserSevice {
    List<String> usernameList = new ArrayList<>();
    List<String> emailList = new ArrayList<>();
    List<String> passwordList = new ArrayList<>();

    public void showMenu(){
        System.out.println("===Welcome to Techproeducation===");
        System.out.println("1-Uye Ol");
        System.out.println("2-Giris Yap");
        System.out.println("3-Cikis");
        System.out.println("Seciminiz : ");
    }

    public void register(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad-Soyad : ");
        String name = scanner.nextLine();

        String username;
        boolean existUsername;
            do {
                System.out.println("Username : ");
                username = scanner.nextLine();
                existUsername = usernameList.contains(username);
                if (existUsername) {
                    System.out.println("Bu username kullanilmistir. Yeni bir username deneyiniz. ");
                }
            }while (existUsername);

        String email;
        boolean isValid;
        boolean existEmail;
        do {
            System.out.println("Email : ");
            email = scanner.nextLine().trim();
            existEmail = emailList.contains(username);
            if (existEmail) {
                isValid= false;
                System.out.println("Bu email kullanilmistir. Yeni bir email deneyiniz. ");
            }

        }while (existEmail);


        System.out.println("email : ");
// String email = scanner.nextLine();
        emailList.add(email);
        System.out.println("Password : ");
        String password = scanner.nextLine();
        passwordList.add(password);
    }

    public static boolean validateEmail(String email){
        boolean isValid = true;
        boolean space = email.contains(" ");
        boolean isContainAt = email.contains("@");

        if(space){
            System.out.println("Email bosluk iceremez");
            isValid=false;
        }else if(!isContainAt){
            System.out.println("Email '@' icermelidir");
            isValid=false;
        }else {
            String firstPart = email.split(("@"))[0];
            String secondPart = email.split(("@"))[1];

            boolean checkStart = firstPart.replaceAll("[a-zA-Z0-9_.-]","").length()==0;
            boolean checkEnd = secondPart.equals("gmail.com")||secondPart.equals("hotmail.com")||secondPart.equals("yahoo.com");

        }return isValid;

    }




}
