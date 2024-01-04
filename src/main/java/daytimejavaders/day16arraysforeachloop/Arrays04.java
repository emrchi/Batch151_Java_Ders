package daytimejavaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {

    public static void main(String[] args) {

        //ornek 1 :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String sentence ="Java is easy. Learn Java earn money.";
        String words [] = sentence.split(" ");
        int result = words.length;
        System.out.println(Arrays.toString(words));
        System.out.println(result);

        // Size verilen bir cumlede kac harf oldugunu harflere ayirarak gosteren kodu yaziniz.

        String harf [] = sentence.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(harf));
        System.out.println(harf.length);


        // harfleri ayirmadan kac harf oldugunu bulmak icin
        //String harf1  = sentence.replaceAll("[^a-zA-Z]","");
        //System.out.println(harf1.length());




    }
}
