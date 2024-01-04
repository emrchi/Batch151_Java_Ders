package javaders.day02printmethodcreation;

import java.util.Scanner;

public class PrintlnPrint {

    public static void main(String[] args) {
        // "TECHPRO EDUCATION" yazisini yukaridan asagiya her
        // bir harf  bir alt satirda olacak sekilde yazdiriniz

        /*
        \n ==> her bir characteri bir alt satirda yazdirir
        \t ==> 1 tab bosluk birakir
        \" ==> consolda " yazdirmayi saglar
         */



        //1. YOL
        //System.out.println("T");CTRL+D ye basicaz kac tane gerekiyor ise
        System.out.println("........1.yol........");

        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println("");
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");

        //2.yol
        //
        // "TECHPRO EDUCATION" yazisini yukaridan asagiya her
        // bir harf  bir alt satira gelecek sekilde tek bir sout ile yazdiriniz

        System.out.println("........2.yol........");

        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");


        // JAVA ILE GUZEL DUNYA ifadesinin her bir kelimesini alt satira
        // yazdiran kodu tek bir sout ile yazdiriniz

        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");

        // JAVA ILE GUZEL DUNYA ifadesinin her bir kelime arasinda 1 tab bosluk birakan
        //  kodu yaziniz
        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");

        // "Techpro " ile java cok ' kolay '
        // tek bir sout ile yazdiran kodu yaziniz

        System.out.println("\"Techpro\" ile java cok ' kolay '");

        //" MAHARET" hic 'DUSMEMEK' degil;



            //  "Her dustugunde kalkabilmektir"

        //seklinde noktali virgulden sonra
        //3 satir alttan paragraf basi yaparak
        //bir tab bosluk yapacak kodu yaziniz

        System.out.println("\" MAHARET\" hic 'DUSMEMEK' degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");

        //Print ile Println arasindaki farklar
        //

        System.out.println("********* 1 *********");
        System.out.print("Ali");
        System.out.println("Can");
        //AliCan yazdirir
        System.out.println("********* 2 *********");
        System.out.println("Ali");
        System.out.print("Can");
        //Ali
        //Can yazdirir

        System.out.println("********* 3 *********");
        System.out.print("Ali");
        System.out.println("Can");

        // Soru4)  Kullanicidan aldiginiz
        // sekille asagidaki gibi bir gorunum olusturun
        /*
          A
         A A
        A A A
        */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir karakter veriniz");
        char ch =input.next().charAt(0);//Ali Hakki
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(""+ch+" "+ch+" "+ch);
        System.out.println("  "+ch+"  "+"\n "+ch+" "+ch+" "+"\n"+ch+" "+ch+" "+ch);

    }

}
