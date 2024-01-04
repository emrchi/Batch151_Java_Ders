package javaders.day11nestedifternaryswitch;

import java.util.Objects;
import java.util.Scanner;

public class Ternary04 {
    /*
    Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz.
    tek ise "Bu sayi ikiye bolunmez" yazdiriniz.
     */

    /*
    1) Ternary' de true ve false durumlari icin size verilen data tipleri farkli ise
       container'in data type'ini "Object" yapmaliyiz
    2)"Object" Java da bir class'dir.
       "Object" Java'daki butun classlarin "Parent" ' idir. Yani babasidir, Hz. Adem gibi.
       "Object" Class'in "Parent" i yoktur.
       Java da parent'i olmayan tek Class "Object" Class'dir.
     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an Integer.... ");
        int number = input.nextInt();

        Object result = number %2 == 0 ?  number/2 : "Bu sayi ikiye bolunmez"; // number/2 =>> int "Bu sayi..."==> String data type
        System.out.println(result);

    }
}
