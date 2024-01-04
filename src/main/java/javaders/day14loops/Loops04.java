package javaders.day14loops;

import java.util.Scanner;

public class Loops04 {

    public static void main(String[] args) {

        //Kullanici usurname ve password'u girsin.
        //3 kereden fazla yanlis girerse "Your account was blocked" mesaji alsin
        //3 kereye kadar  yanlis girerse "Invalid username or password, try again" mesaji alsin
        //Dogru girerse "Welcome to your account" mesaji alsin


        Scanner input = new Scanner(System.in);
        int counter = 0;
        String validUsername = "techpro123";
        String validPassword = "Education12?";

        do {
            if (counter == 3) {
                System.out.println("Your account was blocked");
                break;
            }

            System.out.println("Please enter your usurname");
            String usurname = input.next();

            System.out.println("Please enter your password");
            String password = input.next();

            counter++;
            if (usurname.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Welcome to your account");
                break;

            } else {
                System.out.println("Invalid username or password, try again");
                System.out.println((3 - counter) + " right left");

            }
        }while (true) ;


        }


    }

