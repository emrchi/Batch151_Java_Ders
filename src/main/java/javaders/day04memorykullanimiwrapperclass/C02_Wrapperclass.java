package javaders.day04memorykullanimiwrapperclass;

public class C02_Wrapperclass {


    /* Java Oracle firmasinin bir urunudur. Developerlar sadece data barindiran primitive type larin
    non-primitive ler gibi method da barindirmasini istemislerdir.
    Bunun uzerine Java primitive data type larina method ekleyerek ozel bir Class olusturmustur.
    una da wrapper Class denir.

    Primitive            Non-Primitive(wrapper class)
    byte          ==>       Byte
    short                   Short
    int                     Integer
    long                    Long
    float                   Float
    double                  Double
    boolean                 Boolean
    char                    Character

     */
    public static void main(String[] args) {

        byte primitivebyte = 12;
        Byte wrapperByte = 12;

        //primitivebyte.//method vermiyor.
        //wrapperByte.//method veriyor.

        // byte data type inin en buyuk ve en kucuk degerini ekrana yazdirin.
        System.out.println(Byte.MIN_VALUE);// Byte. yapinca MIN_VALUE methodunu cagirdi        _
        System.out.println(Byte.MAX_VALUE);// Byte. yapinca MAX_VALUE methodunu cagirdi

        //int data type'inin maximum deferi  ile byte data type'inin minimum degerinin thoplamini hesaplayan methodu olusturunuz

        int intMax = Integer.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.println("byteMin + intMax = " +(intMax+ byteMin));
        //yada direk olarak integer dan sout ile cagirabiliriz.
        System.out.println((Integer.MAX_VALUE + Byte.MIN_VALUE));

        //**********Primitive data type'larini Wrapper Class'lara nasil ceviririz. **********

        float primitiveFloat = 12.33f;
        Float wrapperFloat = primitiveFloat; // buna Aoutoboxing denir. Java bunu otomatik olarak yapar.
                                            //Kucuk kutuyu buyuk kutuya yerlestirir.

        //************ Wrapper Class'lari Primitive data type'larina nasil ceviririz.********

        Character wrapperChar = 'a';
        char primitiveChar = wrapperChar; // buna Unboxing denir. Java bunu da otomatik yapar.
                                         //Kucuk kutuyu buyuk kutudan cikarir.

        //*******CONCATINATION********

        //Verilen iki String  datanin toplamini veren kodu yaziniz.

        String str1 = "12345";
        String str2 = "678";
        System.out.println(str1+str2);// 12345678 seklinde aldik buna concatination denir
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2)); //13023 toplam degeri elde ettik.
                                                                           // valueOf() metodu String bir datayi Integer'a donusturur.

        /*
        Javada "+" sembolu iki int icin atematikteki gibi toplama islemi yapar
        iki String data arasinda ya da bir String bir int arasinda ise yanyana yazdirir
        Buna "Concatination" denir
        Java metematik bilir islem onceligine gore calisir
          i)Uslu Sayilar
          ii)Parantez ici
          iii)carpma/bolme
          iv) toplama/cikarma

         */

        String a = "K";
        int b=3, c=5, d=2;
        System.out.println(a+b*c/d); //K7



    }

}
