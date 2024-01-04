package javaders.day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

    public static void main(String[] args) {

        // Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s = "Java is easy. Learn Java earn money.";

        //Bir String'i kestiginiz de Java bu datalari Array e koyar.

        String words[] = s.split(" "); // burada regex'i bosluk aldik cunku her boslukta cumleyi bolmek istedik.
        System.out.println(Arrays.toString(words)); //[Java is easy. Learn Java earn money.]
        System.out.println(words.length); // 7


        // Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz.

        String letters[] = s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);

        //yada

        /*
        String letters = s.replaceAll("[^a-zA-Z]","");

        char ch[] = letters.toCharArray();

        System.out.println(Arrays.toString(ch));
        System.out.println(ch.length);
        */



    }
}
