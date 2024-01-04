package javaders.day09stringmanipulationsifstatement;

import java.util.Scanner;

public class Co2_IfStatement {
    public static void main(String[] args) {

        //INTERWIEW QESTIONS USA QA
        // Bir String'deki tekrarsiz karakterleri ekrana yazdiriniz.
        //String y = "abbccdc";

        String y = "aac";
        char first = y.charAt(0);
        if (y.indexOf(first) == y.lastIndexOf(first)) {
            System.out.println(first);
        }
        char second = y.charAt(1);
        if (y.indexOf(second) == y.lastIndexOf(second)) {
            System.out.println(second);
        }
        char third = y.charAt(2);
        if (y.indexOf(third) == y.lastIndexOf(third)) {
            System.out.println(third);
        }

        String z = "abbccdc";
        if (z.indexOf(z.charAt(0)) == z.lastIndexOf(z.charAt(0))) {
            System.out.println(z.charAt(0));
        }
        if (z.indexOf(z.charAt(1)) == z.lastIndexOf(z.charAt(1))) {
            System.out.println(z.charAt(1));
        }
        if (z.indexOf(z.charAt(2)) == z.lastIndexOf(z.charAt(2))) {
            System.out.println(z.charAt(2));
        }
        if (z.indexOf(z.charAt(3)) == z.lastIndexOf(z.charAt(3))) {
            System.out.println(z.charAt(3));
        }
        if (z.indexOf(z.charAt(4)) == z.lastIndexOf(z.charAt(4))) {
            System.out.println(z.charAt(4));
        }
        if (z.indexOf(z.charAt(5)) == z.lastIndexOf(z.charAt(5))) {
            System.out.println(z.charAt(5));
        }
        if (z.indexOf(z.charAt(6)) == z.lastIndexOf(z.charAt(6))) {
            System.out.println(z.charAt(6));
        }


        // Ex : Verilen sayi pozitif ise ekrana "Sayi Pozitif " yazdiran kodu yaziniz
        int num = 65;
        if (num > 0) {
            System.out.println("Sayi Pozitif");
        }
        if (num <= 0) {
            System.out.println("Sayi Negatif");
        }

        //Sayi -1 ile 10 arasin da ise ekrana "verilen data rakamdir" yazdiran kodu yazdirin.

        int rakam = 0;
        if (rakam < 10 && rakam > -1) {
            System.out.println("Verilen data rakamdir");
        }
        else {
            System.out.println("Verilen data rakam degildir");
        }

        //Sayi 3 basamakli ise ekrana "verilen data 3 basamaklidir " yazdiran kodu yazdiriniz

        int sayi = 899;
        sayi = Math.abs(sayi);

        // burada ki math classinin abs methodu sayinin mutlak degerini alir
        // negatif sayilari pozitif sayiya cevirir.Nedeni  -999<sayi<1000 almaliyiz fakat mesela -33 de bu arada
        //fakat 3 basamakli degildir bu nedenle negatif sayilari pozitif sayilara cevirip araligi 3 basamaklilar icin aliriz.

        if (sayi>99 && sayi<1000){
            System.out.println("Verilen Data 3 Basamaklidir");

        }

        //Yada

        if (sayi > 99 && sayi < 1000 || sayi < -99 && sayi > -1000) {
            System.out.println("Verilen Data 3 Basamaklidir");
        }
    }

}
