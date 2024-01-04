package javaders.day22stringbuilder;

public class Student {

    //Bu Student Class'i StudentRunner Class ile calistiriyoruz.

    //Access Modifier'i "default" olan ile "public" olan class member'lar ayni package icinde
    //kullanildiklarinda ayni ozellikleri gosterirler.
    //Fakat farkli package'a gectiginizde, "public" olanlara ulasilabilir, "default" olanlara ulasilmaz.
    //Access Modifier'i "private" olan Class Member'lar sadece olusturulduklari class
    //icinden gorulebilirler.
    //Olusturulduklari class'in disina ciktigimizda gorunmez, ulasilmaz olurlar.
    //Access Modifier'i "protected" olan Class Member'lar ayni package icinde iken "public" gibi davranirlar.
    //Farkli package'a gectiginizde "protected" olanlar sadece child class'lardan gorulebilir

    //stdName public oldugu icin diger butun projeden  ulasilabilir.
    public String stdName = "Ali Can";

    //age default oldugu icin ayni package'deki diger Class'lardan ulasilabilir,
    //fakat farkli package daki Class'lardan ulasilamaz.
    int age = 23;

    //healthCondition private oldugu icin diger Class'lardan ulasilamaz.
    private String healthCondition = "Strong";

    //salary protected oldugu icin ayni package'deki diger Class'lardan ulasilabilir,
    //fakat farkli package daki sadece child Class'lardan ulasilabilir.
    protected int salary = 3000;

    //Class'lar public ve default olabilir fakat private ve protected olamazlar.



}
