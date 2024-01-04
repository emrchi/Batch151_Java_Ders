package javaders.day08stringmanipulation;

import java.util.Scanner;

public class Co2_StringManupulation {


    public static void main(String[] args) {

        /*
        Kullanicidan email adresini girmesini isteyin,
        Asagidaki kurallara gore kullanicinin
        girdigi email adresini kontrol ediniz.
        i)mail adresi "gmail" icermeli
        ii)Space characteri mail'de olmamali
        iii)mail adresinde buyuk harf olmamali
        iv)En az bir tane noktalama isareti bulunmali
 */
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen mail adresinizi\n i)mail adresi \"gmail\" icermeli\n"+
                        "ii)Space characteri mail'de olmamali\n"+
                        "iii)mail adresinde buyuk harf olmamali\n"+
                        "iv)En az bir tane noktalama isareti bulunmali\n seklinde giriniz");


        String mail = input.nextLine();
        //i)mail adresi "gmail" icermeli
        boolean gmail = mail.contains("gmail");
        System.out.println("gmail icermeli = " + gmail);
        //ii)Space characteri mail'de olmamali
        boolean space = !mail.contains(" ");
        System.out.println("space olmamali = " + space);
        //iii)mail adresinde buyuk harf olmamali
        boolean buyuk = mail.replaceAll("[a-z0-9]","").replaceAll("[\\p{Punct}]", "").length() == 0;
        System.out.println("buyuk harf olmali= " + buyuk);
        //iv)En az bir tane noktalama isareti bulunmali
        boolean noktalama = mail.replaceAll("[A-Za-z0-9]]","").replace(" ", "").length() > 0;
        System.out.println("noktalama isareti olmali = " + noktalama);
        //yada boolean noktalama1 = mail.replaceAll("[^\\p{Punct}]" , "").length()>0;    [\\p{Punct}] ==> tum semboller demek
        System.out.println("noktalama isareti olmali = " + noktalama);
        //yada boolean noktalama2 = mail.replaceAll("[\\P{P}]" , "").length()>0;       [\\P{P}] ==> tum semboller haric demek
        System.out.println("noktalama isareti olmali = " + noktalama);


        if (gmail&&space&&buyuk&&noktalama) System.out.println("Gecerli email");
        else System.out.println("Gecersiz email");





    }
}