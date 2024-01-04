package daytimejavaders.day26polymorhphism;

public class Animal {
    /*
    1) Parent Class'daki method() u Child class icinde ozellestirerek kullanmaya overriding denir.
    2)Overriding'de methodun parantezine ve method'un ismine dokunulmaz.(==> method signature)
    3) Private method'lar override edilemez.
    4)Child class'daki method'un access modifieri parent dan daha dar olamaz.


     */

    public void eat(){
        System.out.println("Animals eat");
    }
    public void drink(){
        System.out.println("Animals drink");
    }

}
