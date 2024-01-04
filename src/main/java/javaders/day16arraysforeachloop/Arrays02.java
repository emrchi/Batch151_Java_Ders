package javaders.day16arraysforeachloop;

import java.util.Scanner;

public class Arrays02 {

    public static void main(String[] args) {

        // +,-,*,/,% islemlerini yapabilen bir hesap makinesi yapiniz.
        // Kullanici "q" ya basmadigi surece islem secip yapabilsin.
        /*
            1)Kullanicidan data almak icin Scanner object olustur
            2)Kullanicidan yapacagi islemi almaliyiz
            3)Kullanicidan iki tane sayi almaliyiz
            4)Tekrar tekrar islem yapabilmek icin loop kullanmaliyiz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("To stop calculation please enter 'q'");

        char opr = ' '; // bunu scope u genisletmek icin kullandik. bu adimda "char opt" konteyniri olusturduk bundan dolayi do scopundan sonra tekrar char opt yazamayiz
                        //java kabul etmez ondan dolayi     opr = input.next().toLowerCase().charAt(0)   yazdik        char opr = input.next().toLowerCase().charAt(0) yazmadik

        do {
            System.out.println("Please enter the operation among +, -, *, /, % ");
            opr = input.next().toLowerCase().charAt(0);

            if (opr == 'q') {
                System.out.println("See you again");
                break;
            }
            boolean r = opr== '+'|| opr== '-' || opr== '*' || opr=='/' || opr== '%';
            if (!r){
                System.out.println("Undefined operation");
                break;
            }

            System.out.println("Enter the first number");
            int n1 = input.nextInt();

            System.out.println("Enter the second number");
            int n2 = input.nextInt();


            switch (opr) {

                case '+':
                    System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
                    break;
                case '-':
                    System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
                    break;
                case '*':
                    System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
                    break;
                case '/':
                    System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
                    break;
                case '%':
                    System.out.println(n1 + "%" + n2 + "=" + (n1 * n2) / 100);
                    break;

            }


        } while (true);


    }
}

