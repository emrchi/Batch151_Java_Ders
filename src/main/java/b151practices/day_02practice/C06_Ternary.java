package b151practices.day_02practice;

import java.util.Scanner;

public class C06_Ternary {

    public static void main(String[] args) {

        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayıyı ekrana yazdırın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk Tam sayiyi Giriniz");
        int ilkSayi = input.nextInt();
        System.out.println("Lutfen ikinci Tam sayiyi Giriniz");
        int ikinciSayi = input.nextInt();




        System.out.println(ilkSayi == ikinciSayi ? "Sayilar Birbirine Esit" : ( ilkSayi > ikinciSayi ? ("Buyuk Sayi : " + ilkSayi) : ("Buyuk Sayi : " + ikinciSayi )) );



    }
}
