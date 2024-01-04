package javaders.day05typecastingasciivaluestringmanipulations;

public class C01_MatematikselIslemler {


    public static void main(String[] args) {

      /*
      -Java'da farkli data type'lari arasin da islem yapiliyorsa sonuc buyuk
       olan data type'inin turun de olur.
      -Karsilastirma operatorlerin de sonuc hep boolean doner.
      <  >  ==  !=  <=  >=  &&  ||  sonuc: boolean
      */

        System.out.println(4*(5+2)/3);//9
        System.out.println(6*16/8);//12
        System.out.println(4*(2+5)/3);//9
        double sonuc = 4*(2+5)/3;
        System.out.println("sonuc = " + sonuc);// sonuc = 9.0
        double sonuc2 = 4.0*(2+5)/3;
        System.out.println("sonuc2 = " + sonuc2);//9.3333333334
        double sonuc3 = 4*(1+5)/3;
        System.out.println("sonuc3 = " + sonuc3);//8
        int sayi1 = 5;
        int sayi2 = 2;
        double sayi3 = 2;

        System.out.println(sayi1/sayi2);//2
        System.out.println(sayi1/sayi3);//2.5
        System.out.println(sayi1+sayi3/sayi2);//6.0
        boolean first = 2<4;
        boolean second = 2+6 != 8;
        boolean third = 2+3*5 <20;
        System.out.println("first = " + first);//t
        System.out.println("second = " + second);//f
        System.out.println("third = " + third);//t

        System.out.println(first && second);//f
        System.out.println(first || second || third);//t








    }//main

}//class
