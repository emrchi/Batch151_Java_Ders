package b151practices.Practice1;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        System.out.println("Hesap Makinesine Hosgeldiniz");

        System.out.println("toplama() = " + toplama());
        System.out.println("cikarma() = " + cikarma());
        System.out.println("bolme() = " + bolme());
        System.out.println("carpma() = " + carpma());    }
    public static double toplama(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen toplamak istediniz iki sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        //System.out.println(sayi1 + sayi2);
        return sayi1 + sayi2;
    }
    public static double cikarma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cikarmak istediniz iki sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        //System.out.println(sayi1 - sayi2);
        return sayi1 - sayi2;
    }
    public static double bolme() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bolmek istediniz iki sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        return sayi1 / sayi2;
    }
    public static double carpma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen carpmak istediniz iki sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        //System.out.println(sayi1 - sayi2);
        return sayi1 * sayi2;
    }

}
