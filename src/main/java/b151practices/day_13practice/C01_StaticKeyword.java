package b151practices.day_13practice;

import b151practices.day_12practice.C01;

public class C01_StaticKeyword {

    //Bir tane static variable, bir tane intance variable olusturalim ve main method'da kullanimlarini gosterelim.
    //static variable'lar class seviyesinde olusturulur.

    static int sayi1;

    int sayi2;

    public static void main(String[] args) {

        C01_StaticKeyword obj1 = new C01_StaticKeyword();
        C01_StaticKeyword obj2 = new C01_StaticKeyword();

        System.out.println(sayi1); //0
        System.out.println(obj1.sayi2);//0
        sayi1++;
        obj1.sayi2++;

        System.out.println(sayi1); //1
        System.out.println(obj1.sayi2); //1
        System.out.println(obj2.sayi2); //0
        System.out.println(obj1.sayi1); //1
        System.out.println(obj2.sayi1); //1

        obj2.sayi1++;
        obj2.sayi2++;

        System.out.println(obj2.sayi2); //1
        System.out.println(obj2.sayi1); //2
        System.out.println(obj1.sayi2); //1
        System.out.println(obj1.sayi1); //2

        obj1.sayi1++;
        obj1.sayi2++;

        System.out.println(obj1.sayi2); //2
        System.out.println(obj1.sayi1); //3
        System.out.println(obj2.sayi2); //1
        System.out.println(obj2.sayi1); //3


    }

}
