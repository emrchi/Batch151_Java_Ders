package b151practices.day_16practice;

public class Corsa extends Opel{

    protected String hiz = "Corsa max. 200 km hiz yapar.";
    protected String yakit = "Corsa benzinli veya elektriklidir.";
    protected String model = "Corsa";

    protected void motor(){
        System.out.println("CORSA ARABALAR CEVRECI MOTOR KULLANIR.");
    }

    protected void yakitTuketimi(){
        System.out.println("CORSA 5.6 LT YAKIT TUKETIR");
    }

    protected void vitesSayisi(){
        System.out.println("CORSA 5 VITESLIDIR.");
    }

    public static void main(String[] args) {

        /* inheritance variable;

         Olusturdugumuz objenin data turu hangi class'a aitse oradan baslayarak bakar.
         Yoksa parent'ına gider.
         ilk buldugu yerden alır
         */


        /*
        inheritance method;

        Olusturdugumuz objenin data turu hangi class'a aitse oradan baslayarak bakar.
        Yoksa parent'ına gider.
        Buldugu yerden hemen almaz. Override edilmismi diye kontrol eder.
        (Constructor class'ına kadar aynı isimde method var mı diye kontrol eder)
        Override edileni alır.

         */

        //Class ve Constructor isimleri ayni oldugunda:
        Corsa arb1 = new Corsa();

        System.out.println(arb1.haraket); //Arabalar Teker ile haraket eder.  Variable lari buldugu ilk class'da alip gelir.
        System.out.println(arb1.hiz); //Corsa max. 200 km hiz yapar.
        System.out.println(arb1.yakit); //Corsa benzinli veya elektriklidir.
        System.out.println(arb1.marka); //Opel
        System.out.println(arb1.sirketMerkezi); //Almanya
        System.out.println(arb1.model); //Corsa

        arb1.motor(); //CORSA ARABALAR CEVRECI MOTOR KULLANIR.

        // Class ve constructor isimleri farkli oldugunda:

        Opel arb2 = new Corsa(); // Variable lar icin once class a gider yani opel class'ina buldugu gibi alir gelir.

        System.out.println(arb2.haraket); //Arabalar Teker ile haraket eder.
        System.out.println(arb2.hiz); //Opel arabalar max. 220 km hiz yapar.    Corsa class'indakini yazdirmadi
                                      // cunku object Opel class'indan uretildi ve ilk o class'a gidip bakti.
        System.out.println(arb2.yakit); // Arabalar farkli yakitlar kullanabilir. Bu class da yani opel class'da yakit
                                        // variable'i olmasina ragmen buradakini almadi cunku obje opel class'indan uretildi
                                        // ve opel class'inda yakit variable olmadigi icin parent class'i olan Arabalar class'indan aldi.
        System.out.println(arb2.marka); //Opel
        System.out.println(arb2.sirketMerkezi); //Almanya
        //System.out.println(arb2.model);  model variable'i cagiramiyoruz cunku opel class'i ve parent'i araba clasinda yok.
                                           //Corsa class'inda olmasina ragmen cagiramiyoruz cunku geri vitesi yok.

        arb2.motor(); // CORSA ARABALAR CEVRECI MOTOR KULLANIR.
                      // methodlar icin override kontrol edilmelidir variable lar gibi buldugu gibi almiyor override edilmis methodu cagirir.

        arb2.garanti(); // OPEL ARABALAR 2 YIL GARANTILIDIR.  Corsa Class'inda override edilmedigi icin Opel class'indaki method cagirildi.
        arb2.yakitTuketimi(); // CORSA 5.6 LT YAKIT TUKETIR  override edilen corsa classindaki methodu cagirdi.
        //arb2.vitesSayisi(); Hem Opel hem parent araba class'inda bu method olmadigi icin cagiramiyoruz.

        Araba arb3 = new Corsa();

        System.out.println(arb3.haraket); //Arabalar Teker ile haraket eder.
        System.out.println(arb3.hiz);  //Arabalar motor gucune gore hiz yapar.
        System.out.println(arb3.yakit); //Arabalar farkli yakitlar kullanabilir.
        System.out.println(arb3.marka); //Arabalar uretildikleri markaya sahiptir.
        //System.out.println(arb3.sirketMerkezi); Bulamadigi icin cte verir cagiramaz..
        //System.out.println(arb3.model); Bulamadigi icin cte verir cagiramaz..

        arb3.yakitTuketimi(); //CORSA 5.6 LT YAKIT TUKETIR" Opel class'inda override edilmedigi icin corsa clasina gider
                              // Corsa Class'inda override edildigi icin onu cagirdi. Enson ki override edildigi classdan alir
        arb3.motor(); //CORSA ARABALAR CEVRECI MOTOR KULLANIR.
        // arb3.garanti(); CTE method oldugu icin ilk Araba Class'ina gidiyor orada olmadigi ve override edilmedigi icin cagiramadi.
        //arb3.vitesSayisi();  CTE



    }


}
