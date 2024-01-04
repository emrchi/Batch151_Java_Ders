package b151practices.day_02practice;

import java.util.Scanner;

public class C03_ifElse {

    public static void main(String[] args) {

        /*
        Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
        Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola " 3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
        Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Uc Karakterden Daha Uzun Bir Kelime Sisteme Giriniz.");
        String kelime = input.next();

        if(kelime.length()<=3){
            System.out.println(" 3 Karakterden Daha Uzun Bir Kelime Girmelisiniz ");
        }else{

            String sonUcHarf = kelime.substring(kelime.length()-3);
            System.out.println(sonUcHarf +kelime +sonUcHarf);

        }
    }
}
