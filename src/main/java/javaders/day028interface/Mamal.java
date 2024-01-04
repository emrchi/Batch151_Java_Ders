package javaders.day028interface;

    /*
       Child    Parent
    1)Class ==> Class : extends
      interface ==> interface : extends
      Class ==> interface : implements
      interface ==> Class : Olamaz...
      interface i Class'in child'i yapamayiz.
     */
    /*

    **************Abstract class ile interface arasindaki farklar:***************

    1)SAbstract Class'lar hem abstract hemde concrete method'lar icerebilir
      fakat Interface'ler sadece abstract method icerir. Ama Interface'lerde istersek default ve static keyword'lerini
      kullanarak "concrete" methot uretebiliriz.
    2)Abstract class'lar multple inheritance'i desteklemez ama Interface'ler destekler.
    3)Abstract class'lar icinde her turlu Variable olusturulabilir, Interface'ler icindeki Variable'lar
      public, static ve final olmak zorundadir.
    4)Interface, bir Class'in child'i olamaz ama "abstract class" class'in child'i olabilir.
    5)abstract class'larda constructer vardir ama object uretemez. Interface'lerde constructer olmaz bu yuzden
      object uretemez.

     */

      // Burada eat() abstract method'unu override etmedik cunku Mamal Class'i  Concrete Class degil.
public interface Mamal extends Animal{

    String feedBaby = "Milk";
    int age =6;

}
