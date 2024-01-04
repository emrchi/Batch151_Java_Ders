package javaders.day06typecastingstringmanipulation;

public class Co1_StringManipulation {

    public static void main(String[] args) {

        String a = "Tek Rakibim Dunku Ben";

        //******* toUpperCase() **********

        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);//aUpper = TEK RAKIBIM DUNKU BEN .

        //******* toLowerCase() **********

        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);//aLower = tek rakibim dunku ben .

        //******* charAt() **********

        char ilk_karakter = a.charAt(0);
        System.out.println("ilk_karakter = " + ilk_karakter);//ilk_karakter = T
        //yada
        System.out.println("ilk_karakter =" + (a.charAt(0)));//ilk_karakter =T
        System.out.println("onuncu karakter : "+ (a.charAt(10)));//onuncu karakter : m

        //a String'indeki bastan 2. ve sondan 2. karakteri aliniz ve yan ayana yazdiriniz.
       char firstsecondChar = a.charAt(1);
       char lastsecondChar = a.charAt(20);
        System.out.println("firstsecondChar+lastsecondChar = " + firstsecondChar+lastsecondChar);
        //firstsecondChar+lastsecondChar = en

        //************** length() ************
        //a String'inde bulunan karakter sayisini bulunuz.
        System.out.println("karakter sayisi = " + a.length());//karakter sayisi = 21

        //************** substring() ************
        //a String'indeki ilk 4 datayi aliniz.

        //a.substring(0, 6); [0,6) yani 0. karakter dahil 6. karakter haric.

        System.out.println("ilk alti karakter = " + a.substring(0, 6));//ilk alti karakter = Tek Ra
        System.out.println("a.substring(5) = " + a.substring(5));//a.substring(5) = akibim Dunku Ben

        //a String'indeki 4. index dahil 7. index haric yazdiriniz.
        System.out.println("a.substring(4,7) = " + a.substring(4, 7));//a.substring(4,7) = Rak
        System.out.println(a.substring(1,1));// nothing is printed

        //a String'indeki Rakip kelimesini aliniz.
        System.out.println(a.substring(4,9));//Rakib

        //a String'indeki 10. indexden sonraki 10. index dahil indexleri yazdiriniz
        System.out.println(a.substring(10));//m Dunku Ben

        //************** contains() ************

        // a String'inde "bim" kelimesinin olup olmadigini kontrol ediniz.
        boolean bimVarmi = a.contains("bim");
        System.out.println("bimVarmi = " + bimVarmi);//bimVarmi = true

        //************** startsWith() ************

        //a String'inin "T" harfi ile baslayip baslamadigini kontrol ediniz.
        boolean tIleBasladimi = a.startsWith("T");
        System.out.println("tIleBasladimi = " + tIleBasladimi);//tIleBasladimi = true

        //a String'inde ilk 4 karakterden sonra Rakibim kelimesi ile baslayip baslamadigini kontrol ediniz.
        System.out.println("a.startsWith(\"Rakibim\",6) = " + a.startsWith("Rakibim", 6));
        //a.startsWith("Rakibim",6) = false


        // Universite numaralari yil + bolum kodu + o bolume kacinci sirada girdigi olarak duzenlenen
        //bir okulda ogrenci Umran'in hukuk fakultesinde okuyup okumadigini gosteren bir kod yaziniz.
        /*
        sinif 22 hukuk 33 bilgisayar 44 eczacilik 55 maliye 66 muhendislik 77 olsun
         */
        String str ="20105501";
        System.out.println("hukuk fakultesinden mi? " + str.startsWith("33", 4));//hukuk fakultesinden mi? false
        String str1 ="20103301";
        System.out.println("hukuk fakultesinden mi? " + str1.startsWith("33", 4));//hukuk fakultesinden mi? true

    }
}
