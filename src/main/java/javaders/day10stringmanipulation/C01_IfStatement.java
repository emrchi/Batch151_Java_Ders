package javaders.day10stringmanipulation;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        //if it rains: Iwill cancel the picnic.

        if (true) {
            System.out.println("I will cancel the picnic.");
        }
            // Verilen bir karakteri buyuk harf ise "Buyuk harf" yazdiran kodu yaziniz.

            Scanner Scanner = new Scanner(System.in);
            System.out.println("Lutfen bir harf giriniz....");
            String harf = Scanner.nextLine();
            char ch = harf.charAt(0);

            if (ch >= 'A' && ch <= 'Z') {   // Burada char karakterinin ascii degerlerini karsilastiriyoruz A= 65 Z=90 yani
                                           // 65 ve 90 arasinda butun buyuk harflerin ascii degerleri  vardir.
                System.out.println("Buyuk harf");
            }

            // Verilen sayi cift sayi ise ekrana cift sayi yazdiran kodu yazdiriniz.

            System.out.println("Lutfen bir rakam giriniz...");
            int rakam = Integer.parseInt(Scanner.nextLine());
            if (rakam %2 == 0) {       //%2 ==>  datanin ikiye bolumunden kalani demek..
                System.out.println("Rakam cift sayidir");
            }
            else {
                System.out.println("Rakam tek sayidir");
            }


            //Verilen bir sayi 300'den kucuk veya 1200' den buyuk ise "Harika sayi" yazdiran kodu yaziniz.

            System.out.println("Lutfen bir sayi giriniz....");
            int sayi = Integer.parseInt(Scanner.nextLine());
            if(sayi<300 || sayi>.1200){
                System.out.println("Harika Sayi");
            }

            //Kullanicidan alinan datanin tek mi cift mi oldugunu yazdiran kodu yaziniz

            System.out.println("Lutfen bir sayi giriniz...");
            int number = Integer.parseInt(Scanner.nextLine());

            //1. yol bagimsiz If Statement.

            if(number %2==0){
                System.out.println("sayimiz cift sayidir");
            }
            if(number %2!=0){
                System.out.println("sayimiz tek sayidir");
            }

            //2. yol If Else

            if(number %2==0){
                System.out.println("sayimiz cift sayidir");
            }
            else {
                System.out.println("sayimiz tek sayidir");
            }

            // Verilen bir sayinin pozitif mi negatif mi notr mu oldugunu yazan kodu yaziniz.



            if(number>0){
                System.out.println("Sayi pozitiftir");
            }
            else if(number==0) {
                System.out.println("Sayi notrdur");
            }
            else {
                System.out.println("Sayi negatiftir");
            }
















    }




}
