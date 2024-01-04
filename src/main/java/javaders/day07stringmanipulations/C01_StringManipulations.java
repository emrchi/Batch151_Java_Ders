package javaders.day07stringmanipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {

        String s="Learn Java earn money";

        // ***************** endsWith ***********************
        /*  endsWith () Metnin belirli bir datayla bitip bitmedigini bize verir
                  True yada false seklinde boolean bir deger dondurur.
                  Icerisine tek karakterde coklu karakterde koyabilirsiniz
        */

        //s String'inin "money" ile bitip bitmedigini kontrol ediniz.

        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd);//true

        // ***************** replace() ***********************\\

        // s String'indeki "money" kelimesini "dollar" kelimesiyle yer degistirelim

        String news = s.replace("money", "dollar");
        System.out.println("news = " + news);//news = Learn Java earn dollar

        // s String'indeki "earn" kelimesini "win" kelimesiyle yer degistirelim.

        String news1 =  s.replace("earn", "win");
        System.out.println("newNews = " + news1);//newNews = Lwin Java win money

        // s String'indeki "a" harfini "*" ile degistirelim.
        System.out.println("s.replace(\"a\", \"*\") = " + s.replace("a", "*"));
        //s.replace("a", "*") = Le*rn J*v* e*rn money
        System.out.println("s.replace('a', '*') = " + s.replace('a', '*'));
        //s.replace('a', '*') = Le*rn J*v* e*rn money

        // s String'indeki "l" harfini "***" ile degistirelim.
        String news2 = s.replace("L", "***");
        System.out.println("news2 = " + news2);//news2 = ***earn Java earn money

        // s String'indeki "e" harflerini siliniz.
        String news3=s.replace("e", "");
        System.out.println("news3 = " + news3);//news3 = Larn Java arn mony
        String news4=s.replace('e',' ' );
        System.out.println("news4 = " + news4);//news4 = L arn Java  arn mon y

        //s String'indeki "earn" kelimelerini siliniz.
        String news5 = s.replace("earn", "");
        System.out.println("news5 = " + news5);//news5 = L Java  money

        String t = "Dolma Kalem";
        // t string'indeki "Kalem" kelimesi yerine "Biber" yerlestiriniz.
        String t1 = t.replace("Kalem","Biber");
        System.out.println("t1 = " + t1);//t1 = Dolma Biber







    }
}
