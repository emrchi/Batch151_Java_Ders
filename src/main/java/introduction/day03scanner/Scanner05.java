package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {

    //kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
    //1) Alanini hesaplayiniz
    //2) Cevresini hesaplayiniz
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin iki kenaruzunlugunu giriniz...");
        byte kisaKenarUzunlugu = input.nextByte();
        byte uzunKenarUzunlugu = input.nextByte();
        byte Dikdortgenin_Alani = (byte) (kisaKenarUzunlugu * uzunKenarUzunlugu);
        byte Dikdortgenin_Cevresi = (byte) (2*kisaKenarUzunlugu + 2*uzunKenarUzunlugu);
        System.out.println("Dikdortgenin_Alani = " + Dikdortgenin_Alani);
        System.out.println("Dikdortgenin_Cevresi = " + Dikdortgenin_Cevresi);


    }


}
