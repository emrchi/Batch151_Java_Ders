package javaders.day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {


    public static void main(String[] args) {

        /*
        Java da char data type'ini matamatiksel islemler de kullanirsaniz
        Ascii table' daki sayisal degerleri alir.
        Javada char data type'ina int degerde atanabilir Sembol Harf vs de atanabilir
        Cunku char data type'inin Ascii 'den gelen bir  sayisal == numeric bir degeri birde
        resim karakteri vardir
         */
        /*
        Javada "+" sembolu iki int icin matematikteki gibi toplama islemi yapar
        iki String data arasinda ya da bir String bir int arasinda ise yanyana yazdirir
        Buna "Concatination" denir
        Java metematik bilir islem onceligine gore calisir
        i)Uslu Sayilar
        ii)Parantez ici
        iii)carpma/bolme
        iv) toplama/cikarma

        */
        
        //A karakterinin Ascii degerini hesaplatan kodu yaziniz.
        
        int asciiA = 'A';
        System.out.println("asciiA = " + asciiA);//65
        System.out.println('A');
        int asciia = 'a';
        System.out.println("asciia = " + asciia);//97
        int asciiunlem = '!';
        System.out.println("asciiunlem = " + asciiunlem);//33
        int asciiSpace = ' ';
        System.out.println("asciiSpace = " + asciiSpace);//32
        int asciiSembol = '*';
        System.out.println("asciiSembol = " + asciiSembol);//42
        String isim = "Zeki";
        char cgh = 'z';
        char sembol = '*';
        char isaret ='?';
        char rakam = '9';
        //char sayi ='50';// java 50 yi kabul etmedi cunku iki karakter var 5 ve 0

        int deger = 20;
        char smbl = '$';
        System.out.println(deger+smbl);//56 $ ==> Ascii table daki degeri 36
        System.out.println(deger+"$");//20$

        int deger2 = 0;
        char smbl2 = '+';
        System.out.println(deger2+smbl2);//43
        System.out.println("deger2+smbl2 = "+ deger2+ smbl2);//deger2+smbl2 = 0+   cunku: string + int==>string string+char ==> string yani resimmm
        System.out.println("deger2+smbl2 = "+ (deger2+ smbl2));//deger2+smbl2 =43 burada ise parantez icine aldigimiz icin matamatiksel olarak ilk parantez icini toplar int+char==>int dir
        //String => Strong
        //String güçlü olduğu için neyin önüne gelirse kendine çevirir parantez koyarak işlem yaptırabilir stringe çevirmesine engel olabiliriz.
        String name = "100";
        int number = 45;
        System.out.println(name+number);//10045 Concatination

        int asciiG = 'g';
        System.out.println(asciiG);//71
        String str1 = "Java";
        char ch3 = 'G';
        int sayi1 = 5;
        System.out.println(str1+ch3+sayi1);//JavaG5
        System.out.println(str1+(ch3+sayi1));//Java76
        System.out.println(ch3+sayi1+str1);//76Java islem onceligi olmadigi icin Java soldan saga toplamaya baslar
        // char+int==>int verir int+String ==> String verir'

        char rakam1 = '1';
        System.out.println("rakam1 = " + rakam1);//1
        char rakam2 = '2';
        System.out.println("rakam2 = " + rakam2);//2
        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);//3
        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);//4

        System.out.println("rakam1+rakam2+rakam3+rakam4 = " +rakam1+rakam2+rakam3+ rakam4);//rakam1+rakam2+rakam3+rakam4 = 1234
        System.out.println("rakam1+rakam2+rakam3+rakam4 = " +(rakam1+rakam2+rakam3+ rakam4));//rakam1+rakam2+rakam3+rakam4 =202

        byte b = 5;
        char ch2 ='h';
        int asciih = 'h';
        System.out.println("asciih = " + asciih);//104
        int ascii5 = '5';
        System.out.println("ascii5 = " + ascii5);//53  // bunu kullanmiyoruz cunku 5 zaten bir sayi

        System.out.println("b > ch2 = " + (b>ch2));//b > ch2 = false 5>104 == false

        long l =542215245521L;
        System.out.println("ch2>l : "+(ch2>l));//false

        int sayiInt3 = 9;
        char sayiChar = '9';
        int ascii9 = '9';
        System.out.println(ascii9);//57
        System.out.println("sayiInt3>=sayiChar  "+(sayiInt3>=sayiChar));//false



    }
}
