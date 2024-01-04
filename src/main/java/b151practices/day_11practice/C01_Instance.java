package b151practices.day_11practice;

public class C01_Instance {

    int sayi;
    String isim;
    boolean ogrenciMi;


    public static void main(String[] args) {
         /*
    sayi, isim, ogrenciMi seklinde dort uc instance variable olusturalım.
    Bu instance variable'lerin default degerlerini main icerisinde yazdıralım

    Note: Instance variable lara object olusturarak ulasabiliriz
    Instance variable'lar Object'e baglidir.
    hangi object uzeriniden degisiklik yapildiysa yapilan bu degisiklik sadece o object'i baglar.
        */

        C01_Instance obj1 = new C01_Instance();

        System.out.println(obj1.sayi); //0
        System.out.println(obj1.isim); //null
        System.out.println(obj1.ogrenciMi);  //false

        C01_Instance obj2 = new C01_Instance();

        obj1.isim = "Hasan";
        obj2.isim = "Huseyin";

        System.out.println(obj1.isim); //Hasan

        obj1.sayi=20;
        obj2.sayi=25;

        System.out.println(obj2.sayi); //25
        System.out.println(obj1.sayi); //20








    }
}
