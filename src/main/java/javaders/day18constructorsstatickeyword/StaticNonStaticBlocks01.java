package javaders.day18constructorsstatickeyword;

import java.time.LocalDate;

/*
                **************Static-Blocks******************
    1) "static block"lar "static variable"lara ilk degerlerini atamak (initialize) icin kullanilir.
    2) "static" bir variable'a deger atamak icin kod yazmamiz gerekirse "static block" kullanmaliyiz.
    3) "static" bir variable'a deger atamak icin yazilmasi gereken kod main method'un icine de yazilabilir ama
        "static block" icine yazilan kod " main method" icine yazilan kod'dan java tarafindan once calistirilir.
    4) Bir class'da birden fazla static block varsa ustteki once calistirilir.
     */
public class StaticNonStaticBlocks01 {

    //static variable'lar "static block" kullanilmadan da "initialize" edilebilirler.
    public static double pi = 3.14;

    //static variable'lar "static block" kullanilarak da "initialize" edilebilirler.
    public static double e;

    static {
        e = 2.71;
    }

    //Asagida ki gibi "static" bir variable'a deger atamak icin kod yazmamiz gerekirse "static block" kullanmaliyiz.

    public static double price;

    public static void main(String[] args) {
        System.out.println("Hey I am a main method");
    }

    static {
        System.out.println("Hey I am a static block 2");
    }

    static {
        System.out.println("Hey I am a static block 1");
        LocalDate date = LocalDate.now();
        if(date.getMonthValue()==3){
            price = 1000;
        }else{
            price = 1200;
        }
    }
}
