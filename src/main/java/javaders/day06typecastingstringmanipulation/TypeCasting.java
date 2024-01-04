package javaders.day06typecastingstringmanipulation;

public class TypeCasting {
    public static void main(String[] args) {

        // ************* Explicit Narrowing **************

        /*
        Explicit Narrowing yaparken dikkat edilmeli. cunku cok ciddi data kaybi hatta datanin degismesine neden olabilir.
        Eger sayimizdonusturmeye calistigimiz variable'in sinirlari disinda ise Java sayiyi mod islemine alir
        ve kalani yazdirir.
        Kalan bolenin yarisindan fazla ise kalan sayiyo Java kucultmek ister ve bolumu bir buyulterek kalani - isaretli
        olacak sekilde yazdirir.
        */

        //short data type'inda bir variable olusturup byte data type'ina ceviren kodu yaziniz.
        short num = 260;
        byte num1 = (byte) num;
        System.out.println("num1 = " + num1); //4  byte 127 den -128 arasinda degerler alabilir yani 127+128+1=256.
                                              // Java boyle bu durumda 260/256 yapip kalan 4 u aliyor.

        short num2 = 1023;
        byte num3 = (byte) num2;
        System.out.println("num3 = " + num3);// -1 1023/256=3 tam 255 255-256= -1

        short num4 = 1000;
        byte num5 = (byte) num4;
        System.out.println("num5 = " + num5);// -24 1000/256=3 tam 232 232-256= -24

        int sayi = 8880;
        short shortSayi = (short) sayi;//short -32768 ile 32768 araliginda
        System.out.println("shortSayi = " + shortSayi);// 8880


    }
}
