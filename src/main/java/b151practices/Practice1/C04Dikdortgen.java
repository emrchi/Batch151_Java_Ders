package b151practices.Practice1;

import java.util.Scanner;

public class C04Dikdortgen {

    public static void main(String[] args) {

        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.print(" Lutfen Dikdortgenin a kenar uzunlugunu giriniz... ");
        int a = input.nextInt();
        System.out.println(" Lutfen Dikdortgenin b kenar uzunlugunu giriniz... ");
        int b = input.nextInt();
        System.out.println(" Dikdortgenin cevresi: " + (2*(a+b)));


    }




}
