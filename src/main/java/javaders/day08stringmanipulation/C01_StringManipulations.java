package javaders.day08stringmanipulation;

public class C01_StringManipulations {

    public static void main(String[] args) {

        //****************replaceFirsth*******************

        /*
        replaceFirst() : replace ile ayni isi yapmak ile birlikte ilk gordugu datayi degistir.
         */

        String str = "Bizimle Java Ogrenmek Cok Kolay";

        //ex: str String'indeki ilk gordugu 'i' harflerinin yerine 'e' harfi yerlestiriniz.

        String str1 = str.replaceFirst("i","e");
        System.out.println("str1 = " + str1);//str1 = Bezimle Java Ogrenmek Cok Kolay

        String str2 = str.replace("i", "e");
        System.out.println("str2 = " + str2);//str2 = Bezemle Java Ogrenmek Cok Kolay


        //**************** trim () ***********************
         /*

        trim ()  Bir String'de bastaki ve
        sondaki space karakterlerini siler .
        Ortadaki space karakterlerine dokunmaz
         */

        String isim = "   Mehmet Fatih Yildirim  ";
        // EX : isim String'indeki varsa basindaki ve sonundaki space'leri siliniz

        System.out.print("********************");
        System.out.print(isim);
        System.out.println("********************");
        String trimIsim = isim.trim();
        System.out.print("trimIsim =" + trimIsim);
        System.out.println("********************");

        // Ex: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        // String tv = "599.99$";   String laptop = "299.99T$";
        String tv = "599.99$";
        String laptop = "299.99$";
        String tv1 = tv.replace("$","");//"599.99"
        String laptop1 = laptop.replace("$","");//"299.99"
        double tv2 = Double.parseDouble(tv1);
        double laptop2 = Double.parseDouble(laptop1);
        System.out.println("Toplam fiyat = "+ (tv2+laptop2)+"$");//Toplam fiyat = 899.98$
        //yada

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice);//totalPrice = 899.98

        /*
        valueof() bize String olan bir datayi sayisal bir degere
        yani islem yapabilecegimiz sayisal bir degere cevirir.
         */

        //******************** split **********************

        String tamIsim = "mehmet fatih";
        // Verilen tamIsim String'inin icindeki ilk ismin ilk harfi ile
        // son ismin ilk harfini Buyuk harf olarak yan yana yazdiriniz.

        tamIsim.trim();
        String ilk = tamIsim.toUpperCase();

        System.out.println("firstletter+secondletter  = " + ilk.charAt(0) + ilk.charAt(7));//firstletter+secondletter  = MF
        //yada
        char first = tamIsim.trim().toUpperCase().charAt(0);
        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("firstletter+secondletter = " + first + second);//firstletter+secondletter  = MF



    }

}
