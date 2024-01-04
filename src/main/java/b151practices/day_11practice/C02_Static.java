package b151practices.day_11practice;

public class C02_Static {
     /*
    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım
    */

    static String okulIsmi = "Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {

    //static variable'lara, class icerisindeki tum methodlardan (main method dahil) direk ulasabiliriz.
    //static variable'lara farkli class'lardan class isimleri ile ulasabiliriz.
    //static variable'lar gokdeki ay gibidir,
    //static variable'lar class'a baglidir.
    // static variable'larin degeri bir kisi tarafindan degistirilirse,
    //herkes icin degisiklige ugrar.

        System.out.println(okulIsmi); //Yildiz Koleji
        System.out.println(okulNo); //0
        System.out.println(okulAcikMi); //false

        okulNo = 102;
        System.out.println(okulNo); //102

        staticMethod();

        System.out.println(okulNo);//200

    }//main method

    private static void staticMethod() {

        okulNo = 200;
        System.out.println(okulNo);//200
    }

}
