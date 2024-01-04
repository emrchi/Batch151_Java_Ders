package b151practices.day_14practise;

public class Parent {

    // Parent class'da isim, soyisim adında static variable olusturalım,
    // method1 ve method2 adında static methodlar olusturalım
    // yas adında instance variable olusturalım
    // method3 ve method4 adında instance methodlar olusturalım
    // olusturdugumuz variable ve methodları Child class'dan extends(inharitance) ederek cagıralım

    protected static String isim = "Emre";
    protected static String soyIsim = "Yilmaz";

    protected static void method1(){
        System.out.println("Parent static method1");
    }

    protected static void method2(){
        System.out.println("Parent static method2");
    }

    protected int yas = 44;

    protected void method3(){
        System.out.println("Parent instance method3");
    }

    protected void method4(){
        System.out.println("Parent instance method4");
    }



}
