package b151practices.day_03practice;

import java.util.Scanner;

public class C03_IfElse {

    public static void main(String[] args) {

        /*
        Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
        Eger İlk kelimenin karakter sayısı çift ise, ikinci kelimeyi birinci kelimenin ortasına koyun.
        İlk kelimenin karakter sayısı tek ise, konsola "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Iki adet Kelime Giriniz.");
        String ilkKelime = input.next();
        String sonKelime = input.next();

        if(ilkKelime.length()%2==0){
            String yeni = ilkKelime.substring(0,ilkKelime.length()/2);
            String yeni2 = ilkKelime.substring(ilkKelime.length()/2);

            System.out.println(yeni+sonKelime+yeni2);
        }else{
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");
        }



    }
}
