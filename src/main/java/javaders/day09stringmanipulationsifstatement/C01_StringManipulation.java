package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulation {
    public static void main(String[] args) {

        //*************** isEmpty() **************
        /*
        isEmty methodu bos mu dolu mu diye bakar.
        sadece hiclikte true dondurur.
         */

        // Ex: Bir String'in hic karakter icermedigini gosteren kodu yaziniz.

        String str = "";

        // 1. yol
        boolean bosmu = str.length()==0; // 2 is yaptirildi lenght() + == karsilastirma operatoru kullanildi
        System.out.println("bosmu = " + bosmu); // true
        //2. yol
        boolean bosmu1 = str.isEmpty(); // 1 is yaptirildi isEmty() makbul olani budur.
        System.out.println("bosmu1 = " + bosmu1);// true

        //Ex: Bir String'in bosluk (space) haric hicbir karakter icermedigini kontrol eden kodu yaziniz.

        String str2 = "  ";
        // 1. yol
        boolean result = str2.replaceAll(" ", "").length()==0;
        System.out.println("result = " + result); // true
        //2. yol
        boolean result2 = str2.replace(" ","").isEmpty();
        System.out.println("result2 = " + result2); //true

        //Ex: Bir String'in "*" haric hicbir karakter icermedigini kontrol eden kodu yaziniz.

        String str3 = "*";
        boolean result3 = str3.replace("*", "").isEmpty();
        System.out.println("result3 = " + result3); //true

        
        //*************** isBlank() ****************
        
        /*
        isBlank methodu String bir data da bos mu dolu mu diye bakar, space + hiclik icin true dondurur. 
        isEmpty den farki variable' da sadece space varsa bosmu dolumu soruldugunda 
        isBlank ==> bos der
        isEmty ==> bos degil der
       */

        //String str2 = "  ";

        //3. yol

        boolean result4 = str2.isBlank();
        System.out.println("result4 = " + result4);// true
        boolean result5 = str2.isEmpty();
        System.out.println("result5 = " + result5);//false

        //*********************** indexOf () ****************************
        /*
        IndexOf() methodu verilen karakter veya karakterlerin ilk gorunumunun index'ini verr.
        Tekli karakter icinde coklu karakter icin de kullanilir.
        Coklu datalar da string ifadenin ilk gorunumunun ilk karakterinin indexini dondurur.
        Olmayan bir datanin kacinci index de oldugunu sorgulatirsak bize -1 dondurur.
       */

        // Ex: Bir String de a, i, e karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.

        String r = "Java is easy To learn";
        int indexToplam = r.indexOf('a')+r.indexOf('i')+r.indexOf('e');
        System.out.println("indexToplam = " + indexToplam);//18

        //Ex: Bir String de Java kelimesinin ilk olarak kacinci index de kullanildigini gosteren kodu yaziniz.

        String u ="Ah Java Vah Java Sen Ne Guzel Seysin";
        int idxJava = u.indexOf("Java");
        System.out.println("idxJava = " + idxJava);// 3 ==> Java kelimesini bulup ilk harf olan j jarfinin indexini veriyor

        int idxPyton = u.indexOf("Pyhton");
        System.out.println("idxPyton = " + idxPyton);//-1


        //*********************** lastIndexOf() ****************************

        /*
        lastIndexOf() methodu verilen bir datada karakter yada karakterlerin son gorunumunun indexlerini verir.
        Olmayan bir datanin kacinci index de oldugunu sorgulatirsak bize -1 dondurur.
        */

        // Ex: Bir String de a, i, e karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.

        String v = "Java is easy to learn";
        int indexToplam2 = v.lastIndexOf('a');
        System.out.println("indexToplam2 = " + indexToplam2);
        int indexToplam3 = v.lastIndexOf('i');
        System.out.println("indexToplam3 = " + indexToplam3);
        int indexToplam4 = v.lastIndexOf('e');
        System.out.println("indexToplam4 = " + indexToplam4);

        System.out.println("indexlerToplami = " +(indexToplam2+indexToplam3+indexToplam4));//40







    }
}
