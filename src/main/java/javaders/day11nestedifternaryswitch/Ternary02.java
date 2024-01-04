package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {

    /*
    Kullanicidan bir sayi aliniz, o sayi pozitif ise ekrana "Pozitif" yzadirin, degilse
    "Pozitif degil" yazdirin.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = input.nextInt();

        // 1. yol if else
        if (sayi > 0) {
            System.out.println("Pozitif");
        } else {
            System.out.println("Pozitif degil");
        }

        // 2. yol ternary
        String sonuc = sayi > 0 ?   "Pozitif" : "Pozitif degil" ;
        System.out.println(sonuc);

    }




}
