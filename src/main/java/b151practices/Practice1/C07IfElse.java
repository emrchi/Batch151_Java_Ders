package b151practices.Practice1;

import java.util.Scanner;

public class C07IfElse {

    public static void main(String[] args) {


        //Kullanicidan ayri ayri iki sayi isteyiniz.
        //Ilk sayinin ikinci sayidan buyuk olup olmadigini yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter a second number: ");
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(secondNumber + " is greater than " + firstNumber);
        }else{
            System.out.println("Both numbers are equal");
        }




    }
}
