package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {

    /*
    Kullanicidan alinan iki sayidan kucuk olanini ekrana yazdiriniz.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter  two integers... ");
        int first = input.nextInt();
        int second = input.nextInt();

        // 1. yol: Use if else
        if (first<second){System.out.println(first);} else {System.out.println(second);}

        // 2. yol: Use Ternary
        int result = first<second ? first : second;
        System.out.println(result);



    }

}



