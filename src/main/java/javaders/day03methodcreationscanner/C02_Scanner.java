package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {


        // Kullanicidan alacaginiz 4 basamakli sayinin ilk ve sonrakaminin toplamini
        //ekrana yazdiran programi yaziniz

        //Not: % ==> modulus operatoru sayinin bolumunden kalan sayiyi verir

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz...");
        int sayi = input.nextInt();
        //int sonRakam = sayi%10;
        //int ilkRakam = sayi/1000;
        int toplam = sayi%10+ sayi/1000;
        System.out.println("toplam = " + toplam);




    }
}
