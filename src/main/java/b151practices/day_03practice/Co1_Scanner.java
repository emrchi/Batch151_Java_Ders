package b151practices.day_03practice;

import java.util.Scanner;

public class Co1_Scanner {

    public static void main(String[] args) {

        //Ex : Kullanicidan aldiginiz bir sekil ile asagidaki sekli olusturan kodu yaziniz.

        /*
             A
            A A
           A A A
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz.");
        char sekil = input.next().charAt(0);

        System.out.println("  " + sekil + "  ");
        System.out.println(" " + sekil + " " + sekil + " ");
        System.out.println("" + sekil + " " + sekil + " " + sekil + "");

        //Ex: Kullanicidan iki sayi alip dort islem yapan ve
        // islemlerin sonuclarini ekrana yazdiran basit bir hesap makinesi kodunu yaziniz.

        System.out.println("Lutfen iki sayi veriniz.");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        System.out.println("toplam =" + (sayi1+sayi2));
        System.out.println("cikartma =" + (sayi1-sayi2));
        System.out.println("cartma =" + (sayi1*sayi2));
        System.out.println("bolme =" + (sayi1/sayi2));


        // Ex: Kullanicidan alacaginiz 5 basamakli bir sayinin
        // ilk iki ve son iki rakamlari toplamini bulan kodu yaziniz.

        //1. Way

        System.out.println("Lutfen bes basamakli bir sayi giriniz,");
        int sayi =  input.nextInt();
        System.out.println((sayi/1000)%10 + (sayi/1000)/10 + (sayi%100)/10 + (sayi%100)%10);

        //2. Way

        int first = sayi % 10;
        int second = sayi / 10 % 10;
        int third = sayi / 100 % 10;
        int fourth = sayi / 1000 % 10;
        int fifth = sayi / 10000 ;
        int top=(first+second+fourth+ fifth);
        System.out.println(top);







    }
}
