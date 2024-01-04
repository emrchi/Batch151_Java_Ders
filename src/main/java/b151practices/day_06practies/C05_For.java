package b151practices.day_06practies;

import java.util.Scanner;

public class C05_For {

    public static void main(String[] args) {


        /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz

      */

        Scanner input = new Scanner(System.in);

        int toplam = 0;

        for(int i = 0; i <5; i++) {

            System.out.println("Lutfen bir sayi giriniz...");
            int sayi = input.nextInt();

            if(sayi>=5 && sayi<=10) {
                System.out.println("Son girdiginiz sayi 5 ile 10 Arasinda oldugundan Isleme Alinmayacaktir");
            }else{
                toplam = toplam+sayi;
            }
        }
        System.out.println("Toplam = " + toplam);




    }

}
