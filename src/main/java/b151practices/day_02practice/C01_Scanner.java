package b151practices.day_02practice;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        // Kullanıcından adını, ikinci adını ve soyadını arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // adının ilk karakterini, ikinci adının ilk karakterini ve soyadının ilk karakterini BUYUK harfle yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Adinizi, Ikinci Adinizi ve Soyadinizi Aralarinda Bosluk olacak Sekilde Giriniz.");
        String str = input.nextLine().toUpperCase().trim();

        char adIlkKarakter = str.charAt(0);

        char ikinciAdIlkKarakter = str.charAt(str.indexOf(" ")+1);

        char soyAdiIlkKarakter = str.charAt(str.lastIndexOf(" ")+1);

        System.out.println("" + adIlkKarakter + " " + ikinciAdIlkKarakter + " " + soyAdiIlkKarakter);

    }
}
