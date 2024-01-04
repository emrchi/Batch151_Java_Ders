package javaders.day07stringmanipulations;

import java.util.Scanner;

public class Co3_StringManipulations {
    public static void main(String[] args) {



     /*
Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz

        i) En az 8 karakterden olussun
        ii)Password space icermesin
        iii)En az 1 tane buyuk harf olsun
        iv) En az 1 tane kucuk harf olsun
        v) En az 1 tane sembol olsun
        vi) En az 1 tanede rakam olsun
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu i) En az 8 karakterden olussun\n" +
                "        ii)Password space icermesin\n" +
                "        iii)En az 1 tane buyuk harf olsun\n" +
                "        iv) En az 1 tane kucuk harf olsun\n" +
                "        v) En az 1 tane sembol olsun\n" +
                "        vi) En az 1 tanede rakam olsun \n");

        String password = input.nextLine();

        //i) En az 8 karakterden olussun
        //boolean first = password.length()>=8;
        boolean first = password.length()>7;
        //ii)Password space icermesin
        boolean second = !password.contains(" ");
        //iii)En az 1 tane buyuk harf olsun
        boolean third = password.replaceAll("[^A-Z]"," ").length()>0;//Methodlari yan yana ayni satirda yazmaya Method Chain denir.
        //iv) En az 1 tane kucuk harf olsun
        boolean fourth = password.replaceAll("[^a-z]"," ").length()>0;
        //v) En az 1 tane sembol olsun
        boolean fifth = password.replaceAll("[^a-zA-Z0-9]"," ").length()>0;
        //vi) En az 1 tanede rakam olsun
        boolean sixth = password.replaceAll("[^0-9]"," ").length()>0;

        if(first && second && third && fourth && fifth && sixth) {
            System.out.println("Tesekkurler");
        }else {
            System.out.println("Lutfen Password'unuzu degistiriniz.");
        }




    }

}