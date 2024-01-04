package javaders.day07stringmanipulations;

public class Co2_StringManipulations {

    public static void main(String[] args) {

        //**************** replaceAll() *****************
        /*
        replaceAll("") Bir grup datayi degistirmek icin kullanilir.
                       Bir grup data= Regular expression (Regex) kullanilir.

         En Cok kullanilan Regexler:
         1) Tum Rakamlar ==> [0-9]
         2) Tum Kucuk Harfler ==> [a-z]
         3) Tum Buyuk Harfler ==> [A-Z]
         4) Tum Harfler ==> [a-zA-Z]
         5)Tum Harfler ve Rakamlar ==> [a-zA-Z0-9]
         6)Tum Sesli harfler ==> [aeiouAEIOU]
         7)Tum Noktalama Isaretleri ==>[\\p{Punct}]

         ^ ==> den farkli , haricinde
         1) Tum Rakamlar haricinde ==> [^0-9]
         2) Tum Kucuk Harfler haricinde ==> [^a-z]
         3) Tum Buyuk Harfler haricinde ==> [^A-Z]
         4) Tum Harfler haricinde ==> [^a-zA-Z]
         5)Tum Harfler ve Rakamlar haricinde ==> [^a-zA-Z0-9]
         6)Tum Sesli harfler haricinde ==> [^aeiouAEIOU]
         7)Tum Noktalama Isaretleri haricinde ==>[^\\p{Punct}]  yada [\\P{P}]           **** ornek ile gosterilecek
         */


        String s = "Mehmet bey 20 yasinda QA_developer kursunda $ dolar  kazanmistir...";

        //s String'indeki tum rakamlari "*" 'e ceviriniz.
       String s1 = s.replaceAll("[0-9]","*");
        System.out.println("s1 = " + s1);//s1 = Mehmet Fatih bey ** yasinda QA_developer kursunda $ dolarla maas kazanmistir...

        //s String'indeki tum harfleri rakamlari "@" 'e ceviriniz.
        String s2 = s.replaceAll("[a-zA-z0-9]","@");
        System.out.println("s2 = " + s2);//s2 = @@@@@@ @@@ @@ @@@@@@@ @@@@@@@@@@@@ @@@@@@@@ $ @@@@@  @@@@@@@@@@@...

        // s String'indeki tum spaceler disindaki karakterleri "+" ceviriniz
        String s3 = s.replaceAll("[^ ]","+");
        System.out.println("s3 = " + s3);//s3 = ++++++ +++ ++ +++++++ ++++++++++++ ++++++++ + +++++  ++++++++++++++
        String s4 = s.replaceAll("[^e]", "#");
        System.out.println("s4 = " + s4);

        //s String'indeki tum kucuk harfler disindaki karakterleri  "*" 'e ceviriniz.

        String s5 = s.replaceAll("[^a-z]","*");
        System.out.println("s5 = " + s5);//s5 = *ehmet*bey****yasinda****developer*kursunda***dolar**kazanmistir***

        //s String'indeki tum sesli harfler disindaki karakterleri  "&" 'e ceviriniz.
        String s6 = s.replaceAll("[^aeiuoAEIUO]","&");
        System.out.println("s6 = " + s6);//&e&&e&&&e&&&&&&a&i&&a&&A&&e&e&o&e&&&u&&u&&a&&&&o&a&&&&a&a&&i&&i&&&&





    }
}
