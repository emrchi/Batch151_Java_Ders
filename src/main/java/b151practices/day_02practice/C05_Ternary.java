package b151practices.day_02practice;

import java.util.Scanner;

public class C05_Ternary {

        /*
            Kullanıcıdan bir tam sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */

    public static void main(String[] args) {

        Scanner input   = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz.");
        int sayi = input.nextInt();

        System.out.println(sayi%2==0 ? "Cift Sayi" : sayi+3);

    }
}
