package introduction.day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {

        //primitive         : char   -    boolean  -byte  -shorth    -int    -long-  float-  double
        //Wrapper Class     : Character - Boolean - Byte - Shorth - Integer - Long - Float - Double
        //Wrapper Class'lar non-primitive'dir. O yuzden memory de cok yer kaplarlar.
        //O nedenle sart degilse Wrapper class kullanmayi tercih etmeyiz.

        //"n" yazip "." ya basarsaniz hic methot goremezsiniz cunku primitivler method icermez.
        int n = 12;
        //"m" yazip "." ya basaarsaniz bircok methot goruruz' cunku Wrapper Claslar method icerir.
        Integer m = 12;


        byte p = 13;
        Byte r = 13;
        
        //Ornek 1: short data type'inin minimum ve maximum degerlerini kod yazarak bulunuz.
        
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);
        
        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

        //Ornek 2: int data tyep'inin minimim degeri ile byte data type'inin max. degerleri toplamini bulunuz.
        int minInt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minInt+maxByte);

        //Ornek 3: i) Primitive int'i Wrapper Integer'a ceviriniz.
        //Autoboxing

        int num = 13;     // primitive int
        Integer wrapperNum = num;    //nonprimitive



                //ii) Wrapper Byte'i primitive byte ceviriniz.
                //Unboxing

        Byte k = 33;
        //k.
        byte primitiveK = k;
        //primitiveK.

        //Wrapper bir sepet icin de bazi methodlarla birlikte bulunan degeri alarak
        // primitive yani method bulunmayan bir kutuya atama yaparsak bu isleme Unboxing denir.
        //tersi de Autoboxing dir.

        //Ornek4: i)Primitive char'i Wrapper Character'e ceviriniz.

        char initial = 'T';
        Character wrappereInitial = initial;    //Autoboxing

                //ii)Wrapper Boolean'i primiteve boolean'a ceviriniz.
        Boolean isOld = true;
        boolean isOldpr = isOld;    //Unboxing

















    }
}
