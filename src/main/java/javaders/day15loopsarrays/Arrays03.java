package javaders.day15loopsarrays;

import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {

        //Kullanicinin coklu datayi bir array'e yerlestirebilmesi icin gereken kodu yaziniz.
        //mesela bir ogretmenden ogrenci ismi ve soyismi isteyecek ve her girdiginde tekrar isteyecek
        //taki biz girmek istemiyorsaniz q yaziniz diyecek ve aplication duracak...

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ogrenci ismini ve soy ismini giriniz: ");
        String[] name = new String[]{input.nextLine()};

        for (String w:name) {
            if (w.equals(new String[]{"Q"})) {
                System.out.println("Tesekkurler");

            }

        }

    }
}
