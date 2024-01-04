package javaders.day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {

    public static void main(String[] args) {

        /*
        Numeric data type'larinin birbirine donusturulmesine type casting denir.
        Kucuk data type'larinin Buyuk data type'larina donusturulmesine
        Auto Widening denir. ==> kucuk kutunun buyuk kutu icine yerlestirilmesi

        Buyuk kutunun Kucuk kutuya donusturulmesinde Java sorumluluk kabul etmez.
        Data kaybi olabilicegi icin Code'u yazanlara birakir.
        Buna "Explicit Narrowing" (Aciktan Daraltma) denir.

         */

        byte age=13;
        int ageint=age;// Auto Widening

        long population=25658252L;
        short newPopulation= (short) population;// Explicit Narrowing
        byte nextPopulation= (byte) population;

        int boy= 170;
        float boyfloat=boy;// Auto Widening

        short nmbrshrt=115;
        byte nmbrbyt= (byte) nmbrshrt;







    }
}
