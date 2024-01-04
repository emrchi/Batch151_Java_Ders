package introduction.day03scanner;

import java.util.Scanner;

public class Scanner04 {

    //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yazin.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz...");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double toplam = firstNumber+secondNumber;
        System.out.println("toplam = " + toplam);
        double fark = firstNumber-secondNumber;
        System.out.println("fark = " + fark);
        double carpim = firstNumber*secondNumber;
        System.out.println("carpim = " + carpim);
        double bolme = firstNumber/secondNumber;
        System.out.println("bolme = " + bolme);
    }
}
