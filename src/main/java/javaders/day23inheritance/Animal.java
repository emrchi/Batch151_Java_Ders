package javaders.day23inheritance;

import java.security.PublicKey;

public class Animal {
    /*
        iNHERITANCE PREVENTS FOLLOWING ISSUES:
        1)Repetition
        2)Difficulty in updating codes
        3)Difficulty in fixing codes
        4)Prevents atomic structer.

    1)eat() methodu gibi bircok class'in kullanilmasi gereken method'lari her class'a ayri ayri yazarsak:
        i)Tekrar yapmis oluruz, tekrar ideal code' da olmamalidir.
        ii)Ayni method'u tekrar tekrar yazmak zaman kaybidir.
        iii)Tekrar tekrar yazilan method'un tamiri cok zaman alir.
        iv)Tekrar tekrar yazilan method'un gelistirilmesi cok zaman alir.
        v)Her class'in icine method'u tekrar tekrar yazmak "atomic yapi"ya terstir.
        Hocanin yaptigi cizime bak.....!!! (inheritance animal slide)
    2)private class member'lar child class'lar tarafindan kullanilamazlar. Can't be inheritance.
      Public class member'lar child class'lar tarafindan kullanilabilir.
      Default class member'lar ayni package'de child class'lar tarafindan kullanilabilirler.
      Protected Class member'lar farkli package'de de olsalar child class'lar tarafindan kullanilabilirler.
    3)Java'da bir Class'in sadece 1 tane parent'i olabilir.
      Coklu Parent'a "Multiple Inharitance" derler, tekli Parent'a "Single Inheritance" derler.
      Java "Multiple Inharitance" i desteklenmez, Java "Single Inheritance" kullanir.
    4)Apartman seklindeki inheritance yapisina "Multilevel Inheritance" denir. Dede baba cocuk gibi.
      Java "Multilevel Inheritance" i destekler.

      PARENT_CLASS ==> SUPER CLASS
      CHILD_CLASS ==> SUB CLASS

     */


    public void eat(){
        System.out.println("Animal eat...");
    }

    public void drink(){
        System.out.println("Animal drink...");
    }





}
