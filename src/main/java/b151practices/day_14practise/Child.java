package b151practices.day_14practise;

public class Child extends  Parent{

    /*
        static variable'lari ve static methodlari farkli bir class'dan
        cagırabilmek icin class ismi kullanılır.
        Fakat bu iki class arasında parent child iliskisi varsa direk kullanılabilir
     */

    public static void main(String[] args) {

        System.out.println(Parent.isim); //Emre
        System.out.println(Parent.soyIsim); //Yilmaz

        isim = "Velik";
        System.out.println(isim); //Veli
        soyIsim = "Tan";
        System.out.println(soyIsim); //Tan

        method1(); //Parent static method1
        method2(); // Parent static method2

        Child obj1 = new Child();

        System.out.println(obj1.yas); //44

        obj1.method3(); //Parent instance method3
        obj1.method4(); //Parent instance method4







    }




}
