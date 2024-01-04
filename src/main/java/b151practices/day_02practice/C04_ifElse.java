package b151practices.day_02practice;

import java.util.Scanner;

public class C04_ifElse {

    public static void main(String[] args) {

        /*
        Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
        Eger İlk kelimenin karakter sayısı çift ise, ikinci kelimeyi birinci kelimenin ortasına koyun.
        İlk kelimenin karakter sayısı tek ise, konsola "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
        */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Ilk Kelimeyi Giriniz");
        String kelime1 = input.next();
        System.out.println("Lutfen Ikinci Kelime Giriniz");
        String kelime2 = input.next();

        if(kelime1.length()%2==0){
            String kelime1IlkYarisi = kelime1.substring(0,kelime1.length()/2);
            String kelime2SonYarisi = kelime1.substring(kelime1.length()/2);
            System.out.println(kelime1IlkYarisi+kelime2+kelime2SonYarisi);

        }else{
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");
        }
    }
}
