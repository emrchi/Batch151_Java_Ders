package b151practices.Practice1;

import java.util.Scanner;

public class C063Scanner {

    public static void main(String[] args) {

        // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Isminizi ve soyisminizi giriniz");
        String isimSoyisim = input.nextLine().toUpperCase();
        char isimiIlkKarakter = isimSoyisim.charAt(0);
        char soyisimIlkkarakter = isimSoyisim.charAt(isimSoyisim.indexOf(' ') + 1);
        System.out.println(""+isimiIlkKarakter+soyisimIlkkarakter);








    }

}
