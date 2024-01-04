package javaders.day027interface;

    /*
        ******************Interface'deki Methodlar ********************************

    1)"Interface" icine 'concrete method" konulamaz.
    2)"Interface" icinde ki metodlarin abstract oldugunu java bilir.
        bu nedenle interface icindeki abstract metodlarda abstract keyword kullanmaya gerek yoktur.
    3)"Interface" icinde ki abstract metodlarin tamami "public'dir.
        bu yuzden "Interface" icinde abstract metod olustururken "access modifier"i
        yazmaya gerek yoktur.
    4)Bir "Interface" i bir 'class"in parent'i yapmak istediginiz de "extend" keyword
        yerine "implements" keyword kullanilir.
    5)"Concrete Child Class"lar parent Interface'deki abstract method'lari Override etmek zorundadirlar.

    6)"Interface" ler bir applicationda "Concrete Child Class" larin yapmak zorunda olduklari
        fonksiyonlari barindirirlar. Bu yuzden "interface"lere "to-do list" de denir.
    7)Birden fazla "Parent Interface" lerde ayni isimli abstract metodlar  kullanilabilir fakat tavsiye edilmez.
        abstract metodlarin body'si olmadigi icin child class'lar ayni isimli method'lardan herhangi birini
        Override ederek kullanabilirler.
     8)Birden fazla "Parent Interface" lerde YNI ISIMLI METHODLAR KULLANIRSAK RETURN TYPE'LARI AYNI OLMALI.
     9)Normalde "interface" icine "concrete" method konulamaz ama bazi ozel durumlarda "concrete" method
        koymamiz gerekirse "default" veya "static"  keyword'unu kullanmaliyiz.
     10)"default" veya "static" keyword kullanarak olusturdugunuz "concrete" method'larin concrete child class'lar
         tarafindan kullanilma zorunlugu yoktur.
     11)"default" keywor'unu kullanarak olusturdugunuz "concrete" methodlara 'object' olusturarak ulasilabilir.
        "static" keyword'unu kullanarak olusturgunuz "concrete method"lara ulasmak icin "object"
         olusturmaya gerke yoktur, "interface" ismi yeterlidir.
     12)"interface"lerden object olusturulamaz. "interface"lerin Constructer'i yoktur.



     */

public interface Engine {

    void start();                 //aslinda bu bir abstract method.
                                  // java zaten bildigi icin abstract key word ve access modifier kullanmadik.

    void payment();

    default void eco() {               //Burada interface icinde body si olan "concrete" bir method kullanabildik cunku default keywordu kullandik.
        System.out.println("Uses gas less...");
    }

    static void stop (){
        System.out.println("Stops securely...");
    }




}
