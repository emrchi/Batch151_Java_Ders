package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary03 {

    //*********************** Nested Ternary ***********************

    /*
    Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
   1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
   2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        //1. Way Nested Ternary


        String result = year %100==0 ? (year %400==0 ? "Leap year" : "Not Leap year") : (year %4==0 ? "Leap year" : "Not Leap year");
        System.out.println(result);

        //2. Way Nested If
        if(year %100==0) {
            if(year %400==0) {
                result = "Leap year";
            } else {
                result = "Not Leap year";
            }
        } else {
            if(year %4==0) {
                result = "Leap year";
            } else {
                result = "Not Leap year";
            }
        }

        System.out.println(result);

    }
}
